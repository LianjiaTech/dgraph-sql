// Generated from /Users/zhaoxiang/Documents/code/IdeaProjects/graph-sql-parser/src/main/antlr/GraphSQL.g4 by ANTLR 4.8
package com.ke.search.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphSQLParser}.
 */
public interface GraphSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(GraphSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(GraphSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(GraphSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(GraphSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(GraphSQLParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(GraphSQLParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(GraphSQLParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(GraphSQLParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(GraphSQLParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(GraphSQLParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(GraphSQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(GraphSQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(GraphSQLParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(GraphSQLParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFunc}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringFunc(GraphSQLParser.StringFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFunc}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringFunc(GraphSQLParser.StringFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notNull}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotNull(GraphSQLParser.NotNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notNull}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotNull(GraphSQLParser.NotNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(GraphSQLParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(GraphSQLParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparision(GraphSQLParser.ComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparision(GraphSQLParser.ComparisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(GraphSQLParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(GraphSQLParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(GraphSQLParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(GraphSQLParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void enterGroupBy(GraphSQLParser.GroupByContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#groupBy}.
	 * @param ctx the parse tree
	 */
	void exitGroupBy(GraphSQLParser.GroupByContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(GraphSQLParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(GraphSQLParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectCommon}
	 * labeled alternative in {@link GraphSQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectCommon(GraphSQLParser.SelectCommonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectCommon}
	 * labeled alternative in {@link GraphSQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectCommon(GraphSQLParser.SelectCommonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSpecial}
	 * labeled alternative in {@link GraphSQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecial(GraphSQLParser.SelectSpecialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSpecial}
	 * labeled alternative in {@link GraphSQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecial(GraphSQLParser.SelectSpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#shortestPath}.
	 * @param ctx the parse tree
	 */
	void enterShortestPath(GraphSQLParser.ShortestPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#shortestPath}.
	 * @param ctx the parse tree
	 */
	void exitShortestPath(GraphSQLParser.ShortestPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#ndegree}.
	 * @param ctx the parse tree
	 */
	void enterNdegree(GraphSQLParser.NdegreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#ndegree}.
	 * @param ctx the parse tree
	 */
	void exitNdegree(GraphSQLParser.NdegreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(GraphSQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(GraphSQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(GraphSQLParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(GraphSQLParser.OrderByContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderItem(GraphSQLParser.OrderItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderItem(GraphSQLParser.OrderItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(GraphSQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(GraphSQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#limitItem}.
	 * @param ctx the parse tree
	 */
	void enterLimitItem(GraphSQLParser.LimitItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#limitItem}.
	 * @param ctx the parse tree
	 */
	void exitLimitItem(GraphSQLParser.LimitItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(GraphSQLParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(GraphSQLParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#commonItem}.
	 * @param ctx the parse tree
	 */
	void enterCommonItem(GraphSQLParser.CommonItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#commonItem}.
	 * @param ctx the parse tree
	 */
	void exitCommonItem(GraphSQLParser.CommonItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#countFunc}.
	 * @param ctx the parse tree
	 */
	void enterCountFunc(GraphSQLParser.CountFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#countFunc}.
	 * @param ctx the parse tree
	 */
	void exitCountFunc(GraphSQLParser.CountFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#countItem}.
	 * @param ctx the parse tree
	 */
	void enterCountItem(GraphSQLParser.CountItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#countItem}.
	 * @param ctx the parse tree
	 */
	void exitCountItem(GraphSQLParser.CountItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#shortestOptions}.
	 * @param ctx the parse tree
	 */
	void enterShortestOptions(GraphSQLParser.ShortestOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#shortestOptions}.
	 * @param ctx the parse tree
	 */
	void exitShortestOptions(GraphSQLParser.ShortestOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#limitArgs}.
	 * @param ctx the parse tree
	 */
	void enterLimitArgs(GraphSQLParser.LimitArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#limitArgs}.
	 * @param ctx the parse tree
	 */
	void exitLimitArgs(GraphSQLParser.LimitArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(GraphSQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(GraphSQLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#depthArgs}.
	 * @param ctx the parse tree
	 */
	void enterDepthArgs(GraphSQLParser.DepthArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#depthArgs}.
	 * @param ctx the parse tree
	 */
	void exitDepthArgs(GraphSQLParser.DepthArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#numPaths}.
	 * @param ctx the parse tree
	 */
	void enterNumPaths(GraphSQLParser.NumPathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#numPaths}.
	 * @param ctx the parse tree
	 */
	void exitNumPaths(GraphSQLParser.NumPathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#first}.
	 * @param ctx the parse tree
	 */
	void enterFirst(GraphSQLParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#first}.
	 * @param ctx the parse tree
	 */
	void exitFirst(GraphSQLParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(GraphSQLParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(GraphSQLParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(GraphSQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(GraphSQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#namedAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNamedAttribute(GraphSQLParser.NamedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#namedAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNamedAttribute(GraphSQLParser.NamedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#edgeName}.
	 * @param ctx the parse tree
	 */
	void enterEdgeName(GraphSQLParser.EdgeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#edgeName}.
	 * @param ctx the parse tree
	 */
	void exitEdgeName(GraphSQLParser.EdgeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void enterNodeName(GraphSQLParser.NodeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#nodeName}.
	 * @param ctx the parse tree
	 */
	void exitNodeName(GraphSQLParser.NodeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GraphSQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GraphSQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#nodeLabel}.
	 * @param ctx the parse tree
	 */
	void enterNodeLabel(GraphSQLParser.NodeLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#nodeLabel}.
	 * @param ctx the parse tree
	 */
	void exitNodeLabel(GraphSQLParser.NodeLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#edgeType}.
	 * @param ctx the parse tree
	 */
	void enterEdgeType(GraphSQLParser.EdgeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#edgeType}.
	 * @param ctx the parse tree
	 */
	void exitEdgeType(GraphSQLParser.EdgeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(GraphSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(GraphSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GraphSQLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GraphSQLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(GraphSQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(GraphSQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(GraphSQLParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(GraphSQLParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(GraphSQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(GraphSQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphSQLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GraphSQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphSQLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GraphSQLParser.IdContext ctx);
}