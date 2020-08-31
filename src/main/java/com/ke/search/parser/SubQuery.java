package com.ke.search.parser;
import com.ke.search.exception.ParseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhaoxiang
 * @date 2020/04/26
 * SQL is parsed into several subqueries
 */
public class SubQuery {
    /** edge alias */
    String alias;
    String edgeType;
    /** node name */
    String name;
    /** node label */
    String label;
    /**
     * Currently only supports one group field
     */
    String groupByAttr;
    private List<String> orderAndPage;

    private List<String> attrs;
    private boolean expand;
    boolean hasSrcFunc;
    private List<FilterTree> filters;
    String varFunc;
    List<String> variables;
    private List<FilterTree> varFilters;
    /**
     * Edge attributes, variables, filtering, etc.
     */
    private List<String> facets;
    private List<String> facetVariables;
    private boolean facetExpand;
    private List<FilterTree> facetFilters;

    private Map<String, String> args;
    boolean empty;

    SubQuery child;
    SubQuery father;

    void addFilters(FilterTree ft) {
        if(filters == null){
            filters = new ArrayList<>();
        }
        filters.add(ft);
    }
    void addVarFilters(FilterTree ft) {
        if(varFilters == null){
            varFilters = new ArrayList<>();
        }
        varFilters.add(ft);
    }
    void addFacetFilters(FilterTree ft) {
        if(facetFilters == null){
            facetFilters = new ArrayList<>();
        }
        facetFilters.add(ft);
    }
    void addVariable(String var) {
        if(variables == null){
            variables = new ArrayList<>();
        }
        variables.add(var);
    }
    void addFacetVariable(String var) {
        if(facetVariables == null){
            facetVariables = new ArrayList<>();
        }
        facetVariables.add(var);
    }
    void addArgs(String name, String value) {
        if(args == null) {
            args = new HashMap<>();
        }
        args.put(name, value);
    }
    void addAttr(String attr) {
        if(attrs == null) {
            attrs = new ArrayList<>();
        }
        if("*".equals(attr)) {
            expand = true;
        } else {
            attrs.add(attr);
        }
    }
    void addFacet(String facet){
        if(facets == null) {
            facets = new ArrayList<>();
        }
        if("*".equals(facet)) {
            facetExpand = true;
        } else {
            facets.add(facet);
        }
    }
    void addOrderAndPage(String order) {
        if(orderAndPage == null){
            orderAndPage = new ArrayList<>();
        }
        orderAndPage.add(order);
    }

    SubQuery write(StringBuilder builder, String... args) {
        for(String s : args) {
            builder.append(s);
        }
        return this;
    }
    SubQuery writeSrcFunc(StringBuilder builder) {
        builder.append(getFunc(filters));
        return this;
    }
    SubQuery writeVarFunc(StringBuilder builder) {
        if(varFunc != null) {
            builder.append(String.format("func:%s", varFunc));
        } else {
            builder.append(getFunc(varFilters));
        }
        return this;
    }
    private String getFunc(List<FilterTree> filterTrees) {
        String func;
        if(filterTrees != null){
            for(FilterTree ft : filterTrees) {
                if(ft.op == FilterOp.NONE){
                    func = String.format("func:%s", ft.getFilterString());
                    filterTrees.remove(ft);
                    return func;
                }
            }
        }
        throw new ParseException("There must be a function on start node");
    }
    SubQuery writeFacetFilter(StringBuilder builder) {
        if(facetFilters != null && facetFilters.size() != 0) {
            builder.append(String.format("@facets(%s)", getFilter(facetFilters)));
        }
        return this;
    }
    SubQuery writeFilter(StringBuilder builder) {
        if(filters != null && filters.size() != 0) {
            builder.append(String.format("@filter(%s)", getFilter(filters)));
        }
        return this;
    }
    SubQuery writeVarFilter(StringBuilder builder) {
        if(varFilters != null && varFilters.size() != 0) {
            builder.append(String.format("@filter(%s)", getFilter(varFilters)));
        }
        return this;
    }
    String getFilter(List<FilterTree> fts){
        List<String> filter = new ArrayList<>();
        for(FilterTree ft : fts) {
            filter.add(ft.getFilterString());
        }
        return String.join(" AND ", filter);
    }
    SubQuery writeArgs(StringBuilder builder, String prefix, String name) {
        if(args != null && args.get(name) != null) {
            builder.append(prefix).append(args.get(name));
        }
        return this;
    }
    SubQuery writeAttrs(StringBuilder builder) {
        if(expand) {
            if(label == null) {
                builder.append("expand(_all_)");
            } else {
                builder.append("expand(").append(label).append(")");
            }
        } else if(attrs != null) {
            builder.append(String.join(" ", attrs));
        }
        return this;
    }
    SubQuery writeVariables(StringBuilder builder) {
        if(variables != null){
            builder.append(String.join(" ", variables));
        }
        return this;
    }
    SubQuery writeFacetVariables(StringBuilder builder) {
        if(facetVariables != null) {
            builder.append(String.join(" ", facetVariables));
        }
        return this;
    }
    SubQuery writeFacets(StringBuilder builder) {
        if(facetExpand) {
            builder.append("@facets");
        } else if(facets != null) {
            builder.append("@facets(").append(String.join(", ", facets)).append(")");
        }
        return this;
    }
    SubQuery writeEdge(StringBuilder builder) {
        if (edgeType == null) {
            if (father.label != null) {
                builder.append("expand(").append(father.label).append(")");
            } else {
                builder.append("expand(_all_)");
            }
        } else {
            if(alias != null) {
                builder.append(alias).append(":");
            }
            builder.append(edgeType);
        }
        return this;
    }
    boolean hasAttribute() {
        return expand || attrs != null;
    }
    SubQuery writeOrderAndPage(StringBuilder builder, String format){
        if (orderAndPage != null) {
            builder.append(String.format(format, String.join(", ", orderAndPage)));
        }
        return this;
    }
    SubQuery writeGroupBy(StringBuilder builder) {
        if (groupByAttr != null) {
            builder.append("@groupby(").append(groupByAttr).append(")");
        }
        return this;
    }
}
