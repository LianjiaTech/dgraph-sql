package com.ke.search.parser;
import com.ke.search.antlr.GraphSQLBaseVisitor;
import com.ke.search.antlr.GraphSQLParser;
import com.ke.search.exception.ParseException;

import java.util.*;
/**
 * @author zhaoxiang
 */
public class GraphqlBuilder extends GraphSQLBaseVisitor<Void> {
    private ParseState parseState;
    private QueryMode queryMode = QueryMode.COMMON;

    private SubQuery current;
    private List<SubQuery> query = new ArrayList<>();
    private Map<String, SubQuery> m = new HashMap<>();

    /** Check node and variable name conflicts */
    private Set<String> variables;
    private Set<String> nodes = new HashSet<>();

    private Stack<FilterTree> filterTree = new Stack<>();
    private Map<String, String> compare = new HashMap<>();

    private String name;
    private String attr;
    private String var;

    private Set<FilterTree> temp;
    private boolean opt;

    public GraphqlBuilder() {
        compare.put("=", "eq");
        compare.put(">", "gt");
        compare.put("<", "lt");
        compare.put(">=", "ge");
        compare.put("<=", "le");
    }
    /**
     * SQL statement processing order: from -> groupby -> where -> Select -> orderby -> limit
     */
    @Override
    public Void visitQuery(GraphSQLParser.QueryContext ctx) {
        visit(ctx.fromClause());
        if (ctx.groupBy() != null) {
            visit(ctx.groupBy());
        }
        if(ctx.selectClause().OPT() != null) {
            opt = true;
        }
        if (ctx.whereClause() != null) {
            visit(ctx.whereClause());
        }
        if(opt) {
            processFiltersOpt();
        } else {
            processFilters();
        }
        visit(ctx.selectClause());
        if (ctx.havingClause() != null) {
            visit(ctx.havingClause());
        }
        if (ctx.orderBy() != null) {
            visit(ctx.orderBy());
        }
        if (ctx.limitClause() != null) {
            visit(ctx.limitClause());
        }
        if (variables != null && queryMode == QueryMode.COMMON) {
            queryMode = QueryMode.VARIABLE;
        }
        return null;
    }
    @Override
    public Void visitEdge(GraphSQLParser.EdgeContext ctx) {
        SubQuery last = current;
        String name = null;
        current = new SubQuery();
        current.father = last;
        last.child = current;
        query.add(current);
        if(ctx.edgeType() != null) {
            name = current.edgeType = ctx.edgeType().getText();
        }
        if (ctx.edgeName() != null) {
            name = current.alias = ctx.edgeName().getText();
        }
        if(name != null){
            if (m.containsKey(name)) {
                throw new ParseException(ctx.edgeType().getStart(), "Edge %s already defined", name);
            }
            m.put(name, current);
        }
        return null;
    }
    @Override
    public Void visitNode(GraphSQLParser.NodeContext ctx) {
        String name;
        if(current == null){
            current = new SubQuery();
            query.add(current);
        }
        if(ctx.nodeName() != null) {
            name = ctx.nodeName().getText();
            if (m.containsKey(name)) {
                throw new ParseException(ctx.nodeName().getStart(), "Node %s already defined", name);
            }
            nodes.add(name);
            current.name = name;
            m.put(name, current);
        }
        if (ctx.nodeLabel() != null) {
            current.label = ctx.nodeLabel().getText();
        }
        return null;
    }
    @Override
    public Void visitName(GraphSQLParser.NameContext ctx) {
        name = var = ctx.getText();
        if (!m.containsKey(name)) {
            throw new ParseException(ctx.getStart(), "Node or Edge %s not defined", name);
        }
        if (nodes.contains(name)) {
            attr = "uid";
        } else {
            attr = m.get(name).edgeType;
        }
        return null;
    }
    @Override
    public Void visitEdgeName(GraphSQLParser.EdgeNameContext ctx) {
        visit(ctx.name());
        if (nodes.contains(name)) {
            throw new ParseException(ctx.getStart(), "Expect an Edge but get a Node %s", name);
        }
        return null;
    }

    @Override
    public Void visitNodeName(GraphSQLParser.NodeNameContext ctx) {
        visit(ctx.name());
        if (!nodes.contains(name)) {
            throw new ParseException(ctx.getStart(), "Expect a Node but get an Edge %s", name);
        }
        return null;
    }
    @Override
    public Void visitNamedAttribute(GraphSQLParser.NamedAttributeContext ctx) {
        visit(ctx.name());
        attr = ctx.attribute().getText();
        var = ctx.getText();
        return null;
    }
    @Override
    public Void visitGroupBy(GraphSQLParser.GroupByContext ctx) {
        parseState = ParseState.GROUPBY;
        visit(ctx.predicate());
        if (ctx.predicate().namedAttribute() != null && !nodes.contains(name)) {
            throw new ParseException(ctx.getStart(), "Can't group by Edge's attribute");
        }
        if (ctx.predicate().edgeName() != null) {
            queryMode = QueryMode.GROUPBYEDGE;
            m.get(name).father.groupByAttr = attr;
        } else {
            m.get(name).groupByAttr = attr;
        }
        return null;
    }
    @Override
    public Void visitWhereClause(GraphSQLParser.WhereClauseContext ctx) {
        parseState = ParseState.WHERE;
        visitChildren(ctx);
        return null;
    }
    @Override
    public Void visitNotNull(GraphSQLParser.NotNullContext ctx) {
        visit(ctx.predicate());
        filterTree.push(new FilterTree(String.format("has(%s)", attr), name));
        return null;
    }
    @Override
    public Void visitStringFunc(GraphSQLParser.StringFuncContext ctx) {
        visit(ctx.namedAttribute());
        String func;
        String funcName = ctx.funcName().getText();
        if (ctx.NUMERIC_LITERAL() != null) {
            func = String.format("%s(%s,%s,%s)", funcName, attr, ctx.STRING_LITERAL().getText(), ctx.NUMERIC_LITERAL().getText());
        } else {
            func = String.format("%s(%s,%s)", funcName, attr, ctx.STRING_LITERAL().getText());
        }
        if ("regexp".equals(funcName)) {
            func = func.replace("'", "/");
        }
        filterTree.push(new FilterTree(func, name));
        return null;
    }
    @Override
    public Void visitComparision(GraphSQLParser.ComparisionContext ctx) {
        visit(ctx.commonItem());
        String cmp = String.format("%s(%s,%s)", compare.get(ctx.op.getText()), attr, ctx.literal_value().getText());
        FilterTree ft = new FilterTree(cmp, name);
        filterTree.push(ft);
        if(nodes.contains(name) && ctx.commonItem().namedAttribute() != null) {
            String value = String.format("%s(val(%s),%s)", compare.get(ctx.op.getText()), var, ctx.literal_value().getText());
            ft.setTmp(value, var, attr);
            addTemp(ft);
        }
        return null;
    }
    private String getVarName(String... args) {
        return String.join(".", args);
    }
    private void addTemp(FilterTree filterTree) {
        if(temp == null) {
            temp = new HashSet<>();
        }
        temp.add(filterTree);
    }
    private void addVariable(String name, String varName, String attr) {
        if (variables == null) {
            variables = new HashSet<>();
        }
        SubQuery query = m.get(name);
        if (!variables.contains(varName)) {
            variables.add(varName);
            if(nodes.contains(name)) {
                if (query.groupByAttr != null && queryMode == QueryMode.GROUPBYEDGE){
                    if (query.varFunc == null) {
                        query.varFunc = String.format("uid(%s)", varName);
                    }
                }
                query.addVariable(String.format("%s as %s", varName, attr));
            } else {
                query.addFacetVariable(String.format("%s as %s", varName, attr));
            }
        }
    }

    @Override
    public Void visitLogicalAnd(GraphSQLParser.LogicalAndContext ctx) {
        visitChildren(ctx);
        filterTree.push(FilterTree.logicalAnd(filterTree.pop(), filterTree.pop()));
        return null;
    }

    @Override
    public Void visitLogicalOr(GraphSQLParser.LogicalOrContext ctx) {
        visitChildren(ctx);
        filterTree.push(FilterTree.logicalOr(filterTree.pop(), filterTree.pop()));
        if ("".equals(filterTree.peek().name)) {
            throw new ParseException(ctx.getStart(), "Can't connect two filters on different Nodes or Edges with logicalOr");
        }
        return null;
    }

    @Override
    public Void visitLogicalNot(GraphSQLParser.LogicalNotContext ctx) {
        visitChildren(ctx);
        if ("".equals(filterTree.peek().name)) {
            throw new ParseException(ctx.getStart(), "Can't connect filter on different Nodes or Edges with logicalNot");
        }
        filterTree.push(FilterTree.logicalNot(filterTree.pop()));
        return null;
    }

    private void addFilterTree(FilterTree ft) {
        if (nodes.contains(ft.name)) {
            m.get(ft.name).addFilters(ft);
        } else {
            m.get(ft.name).addFacetFilters(ft);
        }
    }
    private void removeTmp(FilterTree ft) {
        if(ft.children.size() != 0) {
            for(FilterTree c : ft.children) {
                removeTmp(c);
            }
        } else if(ft.compare) {
            temp.remove(ft);
        }
    }
    private void processFilters() {
        for(SubQuery sq : query) {
            if(sq.label != null) {
                if(filterTree.empty()) {
                    filterTree.push(new FilterTree(String.format("type(%s)", sq.label), sq.name));
                } else {
                    filterTree.push(FilterTree.logicalAnd(new FilterTree(String.format("type(%s)", sq.label), sq.name), filterTree.pop()));
                }
            }
        }
        FilterTree ft = filterTree.pop();
        switch (ft.op) {
            case NONE: case NOT: case OR:
                addFilterTree(ft);
                break;
            case AND:
                for (FilterTree c : ft.children) {
                    addFilterTree(c);
                }
                break;
            default:
        }
    }
    private void processFiltersOpt() {
        for(SubQuery sq : query) {
            if(sq.label != null) {
                FilterTree ft = new FilterTree(String.format("type(%s)", sq.label), sq.name);
                ft.setTmp(String.format("eq(val(%s),%s)", sq.name + ".dgraph.type", sq.label), sq.name + ".dgraph.type", "dgraph.type");
                addTemp(ft);
                if(filterTree.empty()) {
                    filterTree.push(ft);
                } else {
                    filterTree.push(FilterTree.logicalAnd(ft, filterTree.pop()));
                }
            }
        }
        FilterTree ft = filterTree.pop();
        SubQuery subQuery;
        switch (ft.op) {
            case NONE:
                if(ft.compare) {
                    removeTmp(ft);
                }
                addFilterTree(ft);
                break;
            case NOT: case OR:
                throw new ParseException("There must be a source function");
            case AND:
                for (FilterTree c : ft.children) {
                    subQuery = m.get(c.name);
                    if (c.compare && subQuery.hasSrcFunc) {
                        subQuery.addVarFilters(c);
                    } else {
                        if (c.compare && c.op == FilterOp.NONE) {
                            subQuery.hasSrcFunc = true;
                            removeTmp(c);
                        }
                        addFilterTree(c);
                    }
                }
                break;
            default:
        }
        if(temp != null) {
            for(FilterTree filterTree : temp){
                filterTree.value = filterTree.tmpValue;
                addVariable(filterTree.name, filterTree.tmpVarName, filterTree.tmpAttr);
            }
        }
    }
    @Override
    public Void visitShortestPath(GraphSQLParser.ShortestPathContext ctx) {
        query.get(0).addArgs("property", ctx.property().id().getText());
        List<String> shortest = new ArrayList<>();
        for (GraphSQLParser.ShortestOptionsContext args : ctx.shortestOptions()) {
            shortest.add(args.getText());
        }
        queryMode = QueryMode.SHORTEST;
        query.get(0).addArgs("shortest", String.join(", ", shortest));
        return null;
    }
    @Override
    public Void visitNdegree(GraphSQLParser.NdegreeContext ctx) {
        queryMode = QueryMode.NDEGREE;
        query.get(0).addArgs("depth", ctx.depthArgs().getText());
        return null;
    }
    @Override
    public Void visitSelectCommon(GraphSQLParser.SelectCommonContext ctx) {
        visit(ctx.commonItem());
        if(ctx.alias() != null) {
            attr = String.format("%s:%s", ctx.alias().getText(), attr);
        }
        if(nodes.contains(name)){
            m.get(name).addAttr(attr);
        } else {
            m.get(name).addFacet(attr);
        }
        return null;
    }
    @Override
    public Void visitCountFunc(GraphSQLParser.CountFuncContext ctx) {
        visit(ctx.countItem());
        if ("*".equals(attr)) {
            throw new ParseException(ctx.getStart(), "%s is illegal", ctx.getText());
        }
        var = getVarName("count", var);
        if(ctx.countItem().name() != null && !nodes.contains(name)) {
            name = m.get(name).father.name;
        }
        boolean hasVar = parseState == ParseState.HAVING || parseState == ParseState.ORDER || (m.get(name).groupByAttr != null && queryMode == QueryMode.GROUPBYEDGE);
        if(hasVar) {
            addVariable(name, var, String.format("count(%s)", attr));
            attr = String.format("val(%s)", var);
        } else {
            attr = String.format("count(%s)", attr);
        }
        return null;
    }
    @Override
    public Void visitAggregation(GraphSQLParser.AggregationContext ctx) {
        visit(ctx.commonItem());
        if(m.get(name).empty) {
            throw new ParseException(ctx.getStart(), "Too many nested aggregation");
        }
        if(m.get(name).groupByAttr == null) {
            addVariable(name, var, attr);
            attr = String.format("%s(val(%s))", ctx.aggr.getText(), var);
            var = getVarName(ctx.aggr.getText(), var);
            if(m.get(name).father == null) {
                queryMode = QueryMode.ROOT;
                m.get(name).empty = true;
            } else {
                addVariable(m.get(name).father.name, var, attr);
                attr = String.format("val(%s)", var);
                name = m.get(name).father.name;
            }
        } else {
            var = getVarName(ctx.aggr.getText(), var);
            attr = String.format("%s(%s)", ctx.aggr.getText(), attr);
            if(queryMode == QueryMode.GROUPBYEDGE) {
                addVariable(name, var, attr);
                attr = String.format("val(%s)", var);
            }
        }
        return null;
    }
    @Override
    public Void visitHavingClause(GraphSQLParser.HavingClauseContext ctx) {
        parseState = ParseState.HAVING;
        visitChildren(ctx);
        FilterTree ft = filterTree.pop();
        switch (ft.op) {
            case NONE:
            case NOT:
            case OR:
                m.get(ft.name).addVarFilters(ft);
                break;
            case AND:
                for (FilterTree c : ft.children) {
                    m.get(c.name).addVarFilters(c);
                }
                break;
            default:
        }
        return null;
    }
    @Override
    public Void visitOrderBy(GraphSQLParser.OrderByContext ctx) {
        parseState = ParseState.ORDER;
        return visitChildren(ctx);
    }
    @Override
    public Void visitOrderItem(GraphSQLParser.OrderItemContext ctx) {
        visit(ctx.commonItem());
        String order = String.format("order%s:%s", ctx.order.getText().toLowerCase(), attr);
        if (nodes.contains(name)) {
            m.get(name).addOrderAndPage(order);
        } else {
            m.get(name).addFacet(order);
        }
        return null;
    }
    @Override
    public Void visitLimitArgs(GraphSQLParser.LimitArgsContext ctx) {
        m.get(name).addOrderAndPage(ctx.getText());
        return null;
    }
    // Construct graphql+- query
    String translate() {
        int count, end;
        StringBuilder s = new StringBuilder();
        switch (queryMode) {
            case SHORTEST:
                query.get(0).write(s, "{ S as var(").writeSrcFunc(s).write(s, ")").writeFilter(s);
                query.get(1).write(s, " T as var(").writeSrcFunc(s).write(s, ")").writeFilter(s);
                query.get(0).write(s," path as shortest(from:uid(S), to:uid(T)").writeArgs(s, ", ", "shortest");
                query.get(1).write(s, "){ ").writeEdge(s).write(s, " }");
                query.get(0).write(s," path(func: uid(path)){ ").writeArgs(s, "","property").write(s," } }");
                break;
            case NDEGREE:
                query.get(0).write(s,"{ query(").writeSrcFunc(s).write(s, ")").writeFilter(s);
                query.get(0).write(s,"@recurse(").writeArgs(s, "","depth").write(s, ") { expand(_all_) } }");
                break;
            case COMMON:
                current = query.get(0);
                current.write(s, "{ query(").writeSrcFunc(s).writeOrderAndPage(s,", %s").write(s, ")");
                current.writeFilter(s).writeGroupBy(s).write(s, "{ ").writeAttrs(s);
                end = query.size()-1;
                while (end >= 0 && !query.get(end).hasAttribute()){
                    end--;
                }
                count = 1;
                while (count <= end){
                    current = query.get(count);
                    current.write(s, " ").writeEdge(s).writeFacetFilter(s).writeFacets(s);
                    current.writeFilter(s).writeGroupBy(s).writeOrderAndPage(s, "(%s)");
                    current.write(s, "{ ").writeAttrs(s);
                    count++;
                }
                for (int i = count + 1; i > 0; i--){
                    s.append(" }");
                }
                break;
            default:
                current = query.get(0);
                s.append("{ ");
                if(current.hasAttribute() && queryMode == QueryMode.VARIABLE){
                    s.append(current.name).append("_ as ");
                    current.addVarFilters(new FilterTree(String.format("uid(%s_)", current.name), current.name));
                }
                current.write(s, "var(").writeSrcFunc(s).write(s,")").writeFilter(s).writeGroupBy(s);
                current.write(s, "{ ").writeVariables(s);
                end = query.size()-1;
                while (end >= 0 && query.get(end).variables == null){
                    end--;
                }
                count = 1;
                while ( count <= end){
                    current = query.get(count);
                    s.append(" ");
                    if(current.hasAttribute() && queryMode == QueryMode.VARIABLE){
                        s.append(current.name).append("_ as ");
                        current.addVarFilters(new FilterTree(String.format("uid(%s_)", current.name), current.name));
                    }
                    current.writeEdge(s).writeFacetVariables(s);
                    current.writeGroupBy(s).writeFilter(s).write(s, "{ ").writeVariables(s);
                    count++;
                }
                for (int i = count; i > 0; i--){
                    s.append(" }");
                }
                switch (queryMode) {
                    case GROUPBYEDGE:
                        current.write(s, " query(").writeVarFunc(s).writeOrderAndPage(s, ", %s");
                        current.child.writeOrderAndPage(s, ", %s").write(s, ")");
                        current.writeVarFilter(s).write(s, "{ ").writeAttrs(s).write(s, " ");
                        current.child.writeAttrs(s).write(s, " } }");
                        break;
                    case ROOT:
                        query.get(0).write(s, " query(){ ").writeAttrs(s).write(s, " } }");
                        break;
                    case VARIABLE:
                        count = 0;
                        current = query.get(0);
                        while (!current.hasAttribute()){
                            count++;
                            current = query.get(count);
                        }
                        int lastCount = count;
                        current.write(s, " query(").writeVarFunc(s).writeGroupBy(s).writeOrderAndPage(s, ", %s").write(s, ")");
                        current.writeVarFilter(s).write(s, "{ ").writeAttrs(s);
                        count++;
                        end = query.size()-1;
                        while (end >= 0 && !query.get(end).hasAttribute()){
                            end--;
                        }
                        while (count <= end) {
                            current =query.get(count);
                            current.write(s, " ").writeEdge(s).writeFacetFilter(s).writeFacets(s);
                            current.writeVarFilter(s).writeGroupBy(s).writeOrderAndPage(s, "(%s)").write(s, "{ ").writeAttrs(s);
                            count++;
                        }
                        for (int i = count-lastCount+1; i > 0; i--){
                            s.append(" }");
                        }
                        break;
                    default:
                }
        }
        return s.toString().replace("'", "\"");
    }
}