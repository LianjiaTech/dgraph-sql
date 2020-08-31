// Generated from /Users/zhaoxiang/Documents/code/IdeaProjects/graph-sql-parser/src/main/antlr/GraphSQL.g4 by ANTLR 4.8
package com.ke.search.antlr;
import com.ke.search.antlr.GraphSQLParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(GraphSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(GraphSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(GraphSQLParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(GraphSQLParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(GraphSQLParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(GraphSQLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(GraphSQLParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFunc}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFunc(GraphSQLParser.StringFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notNull}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNull(GraphSQLParser.NotNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(GraphSQLParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparision(GraphSQLParser.ComparisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(GraphSQLParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link GraphSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(GraphSQLParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#groupBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy(GraphSQLParser.GroupByContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(GraphSQLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectCommon}
	 * labeled alternative in {@link GraphSQLParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCommon(GraphSQLParser.SelectCommonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSpecial}
	 * labeled alternative in {@link GraphSQLParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecial(GraphSQLParser.SelectSpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#shortestPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortestPath(GraphSQLParser.ShortestPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#ndegree}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNdegree(GraphSQLParser.NdegreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(GraphSQLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(GraphSQLParser.OrderByContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#orderItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderItem(GraphSQLParser.OrderItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(GraphSQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#limitItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitItem(GraphSQLParser.LimitItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(GraphSQLParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#commonItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonItem(GraphSQLParser.CommonItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#countFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountFunc(GraphSQLParser.CountFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#countItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountItem(GraphSQLParser.CountItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#shortestOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortestOptions(GraphSQLParser.ShortestOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#limitArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitArgs(GraphSQLParser.LimitArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(GraphSQLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#depthArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepthArgs(GraphSQLParser.DepthArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#numPaths}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPaths(GraphSQLParser.NumPathsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(GraphSQLParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(GraphSQLParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(GraphSQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#namedAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedAttribute(GraphSQLParser.NamedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#edgeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeName(GraphSQLParser.EdgeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#nodeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeName(GraphSQLParser.NodeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GraphSQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#nodeLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeLabel(GraphSQLParser.NodeLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#edgeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeType(GraphSQLParser.EdgeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(GraphSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GraphSQLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(GraphSQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(GraphSQLParser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(GraphSQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphSQLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GraphSQLParser.IdContext ctx);
}