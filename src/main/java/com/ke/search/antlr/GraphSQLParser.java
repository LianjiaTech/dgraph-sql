// Generated from /Users/zhaoxiang/Documents/code/IdeaProjects/graph-sql-parser/src/main/antlr/GraphSQL.g4 by ANTLR 4.8
package com.ke.search.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, SELECT=17, 
		FROM=18, WHERE=19, NOT=20, AND=21, OR=22, IS=23, NULL=24, GROUP=25, HAVING=26, 
		ORDER=27, BY=28, ASC=29, DESC=30, LIMIT=31, AS=32, OPT=33, COUNT=34, ANYOFTERMS=35, 
		ALLOFTERMS=36, ALLOFTEXT=37, ANYOFTEXT=38, REGEXP=39, MATCH=40, SHORTEST=41, 
		PROPERTY=42, NDEGREE=43, DEPTH=44, NUMPATHS=45, FIRST=46, OFFSET=47, MAX=48, 
		MIN=49, SUM=50, AVG=51, NUMERIC_LITERAL=52, STRING_LITERAL=53, ID=54, 
		WS=55;
	public static final int
		RULE_query = 0, RULE_fromClause = 1, RULE_path = 2, RULE_node = 3, RULE_edge = 4, 
		RULE_whereClause = 5, RULE_expr = 6, RULE_groupBy = 7, RULE_selectClause = 8, 
		RULE_selectItem = 9, RULE_shortestPath = 10, RULE_ndegree = 11, RULE_havingClause = 12, 
		RULE_orderBy = 13, RULE_orderItem = 14, RULE_limitClause = 15, RULE_limitItem = 16, 
		RULE_aggregation = 17, RULE_commonItem = 18, RULE_countFunc = 19, RULE_countItem = 20, 
		RULE_shortestOptions = 21, RULE_limitArgs = 22, RULE_property = 23, RULE_depthArgs = 24, 
		RULE_numPaths = 25, RULE_first = 26, RULE_offset = 27, RULE_predicate = 28, 
		RULE_namedAttribute = 29, RULE_edgeName = 30, RULE_nodeName = 31, RULE_name = 32, 
		RULE_nodeLabel = 33, RULE_edgeType = 34, RULE_alias = 35, RULE_attribute = 36, 
		RULE_literal_value = 37, RULE_funcName = 38, RULE_keyword = 39, RULE_id = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "fromClause", "path", "node", "edge", "whereClause", "expr", 
			"groupBy", "selectClause", "selectItem", "shortestPath", "ndegree", "havingClause", 
			"orderBy", "orderItem", "limitClause", "limitItem", "aggregation", "commonItem", 
			"countFunc", "countItem", "shortestOptions", "limitArgs", "property", 
			"depthArgs", "numPaths", "first", "offset", "predicate", "namedAttribute", 
			"edgeName", "nodeName", "name", "nodeLabel", "edgeType", "alias", "attribute", 
			"literal_value", "funcName", "keyword", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "':'", "')'", "'-'", "'['", "']'", "'->'", "','", 
			"'='", "'<'", "'<='", "'>'", "'>='", "'.'", "'*'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'count'", "'anyofterms'", "'allofterms'", "'alloftext'", 
			"'anyoftext'", "'regexp'", "'match'", "'shortest'", "'property'", "'ndegree'", 
			"'depth'", "'numpaths'", "'first'", "'offset'", "'max'", "'min'", "'sum'", 
			"'avg'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "SELECT", "FROM", "WHERE", "NOT", "AND", 
			"OR", "IS", "NULL", "GROUP", "HAVING", "ORDER", "BY", "ASC", "DESC", 
			"LIMIT", "AS", "OPT", "COUNT", "ANYOFTERMS", "ALLOFTERMS", "ALLOFTEXT", 
			"ANYOFTEXT", "REGEXP", "MATCH", "SHORTEST", "PROPERTY", "NDEGREE", "DEPTH", 
			"NUMPATHS", "FIRST", "OFFSET", "MAX", "MIN", "SUM", "AVG", "NUMERIC_LITERAL", 
			"STRING_LITERAL", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GraphSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener) ((GraphSQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor) return ((GraphSQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			selectClause();
			setState(83);
			fromClause();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(84);
				whereClause();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(87);
				groupBy();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(90);
				havingClause();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(93);
				orderBy();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(96);
				limitClause();
				}
			}

			setState(99);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(GraphSQLParser.FROM, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(FROM);
			setState(102);
			path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			node();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(105);
				edge();
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(106);
					path();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext {
		public NodeNameContext nodeName() {
			return getRuleContext(NodeNameContext.class,0);
		}
		public NodeLabelContext nodeLabel() {
			return getRuleContext(NodeLabelContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << WHERE) | (1L << NOT) | (1L << AND) | (1L << OR) | (1L << IS) | (1L << NULL) | (1L << GROUP) | (1L << HAVING) | (1L << ORDER) | (1L << BY) | (1L << ASC) | (1L << DESC) | (1L << LIMIT) | (1L << AS) | (1L << OPT) | (1L << COUNT) | (1L << ANYOFTERMS) | (1L << ALLOFTERMS) | (1L << ALLOFTEXT) | (1L << ANYOFTEXT) | (1L << REGEXP) | (1L << MATCH) | (1L << SHORTEST) | (1L << PROPERTY) | (1L << NDEGREE) | (1L << DEPTH) | (1L << NUMPATHS) | (1L << FIRST) | (1L << OFFSET) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << AVG) | (1L << ID))) != 0)) {
				{
				setState(112);
				nodeName();
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(115);
				match(T__2);
				setState(116);
				nodeLabel();
				}
			}

			setState(119);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeContext extends ParserRuleContext {
		public EdgeNameContext edgeName() {
			return getRuleContext(EdgeNameContext.class,0);
		}
		public EdgeTypeContext edgeType() {
			return getRuleContext(EdgeTypeContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__4);
			setState(122);
			match(T__5);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << WHERE) | (1L << NOT) | (1L << AND) | (1L << OR) | (1L << IS) | (1L << NULL) | (1L << GROUP) | (1L << HAVING) | (1L << ORDER) | (1L << BY) | (1L << ASC) | (1L << DESC) | (1L << LIMIT) | (1L << AS) | (1L << OPT) | (1L << COUNT) | (1L << ANYOFTERMS) | (1L << ALLOFTERMS) | (1L << ALLOFTEXT) | (1L << ANYOFTEXT) | (1L << REGEXP) | (1L << MATCH) | (1L << SHORTEST) | (1L << PROPERTY) | (1L << NDEGREE) | (1L << DEPTH) | (1L << NUMPATHS) | (1L << FIRST) | (1L << OFFSET) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << AVG) | (1L << ID))) != 0)) {
				{
				setState(123);
				edgeName();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(126);
				match(T__2);
				setState(127);
				edgeType();
				}
			}

			setState(130);
			match(T__6);
			setState(131);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(GraphSQLParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHERE);
			setState(134);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(GraphSQLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicalNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFuncContext extends ExprContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public NamedAttributeContext namedAttribute() {
			return getRuleContext(NamedAttributeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(GraphSQLParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(GraphSQLParser.NUMERIC_LITERAL, 0); }
		public StringFuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterStringFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitStringFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitStringFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotNullContext extends ExprContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(GraphSQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(GraphSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(GraphSQLParser.NULL, 0); }
		public NotNullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNotNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNotNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(GraphSQLParser.AND, 0); }
		public LogicalAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisionContext extends ExprContext {
		public Token op;
		public CommonItemContext commonItem() {
			return getRuleContext(CommonItemContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ComparisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterComparision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitComparision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitComparision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(GraphSQLParser.OR, 0); }
		public LogicalOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NotNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				predicate();
				setState(138);
				match(IS);
				setState(139);
				match(NOT);
				setState(140);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new StringFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				funcName();
				setState(143);
				match(T__1);
				setState(144);
				namedAttribute();
				setState(145);
				match(T__8);
				setState(146);
				match(STRING_LITERAL);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(147);
					match(T__8);
					setState(148);
					match(NUMERIC_LITERAL);
					}
				}

				setState(151);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new ComparisionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				commonItem();
				setState(154);
				((ComparisionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
					((ComparisionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				literal_value();
				}
				break;
			case 4:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NOT);
				setState(158);
				expr(4);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__1);
				setState(160);
				expr(0);
				setState(161);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						match(AND);
						setState(167);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						match(OR);
						setState(170);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(GraphSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(GraphSQLParser.BY, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_groupBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(GROUP);
			setState(177);
			match(BY);
			setState(178);
			predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(GraphSQLParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode OPT() { return getToken(GraphSQLParser.OPT, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(SELECT);
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(181);
				match(OPT);
				}
				break;
			}
			setState(184);
			selectItem();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(185);
				match(T__8);
				setState(186);
				selectItem();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectSpecialContext extends SelectItemContext {
		public ShortestPathContext shortestPath() {
			return getRuleContext(ShortestPathContext.class,0);
		}
		public NdegreeContext ndegree() {
			return getRuleContext(NdegreeContext.class,0);
		}
		public SelectSpecialContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterSelectSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitSelectSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitSelectSpecial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectCommonContext extends SelectItemContext {
		public CommonItemContext commonItem() {
			return getRuleContext(CommonItemContext.class,0);
		}
		public TerminalNode AS() { return getToken(GraphSQLParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectCommonContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterSelectCommon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitSelectCommon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitSelectCommon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectItem);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new SelectCommonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				commonItem();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(193);
					match(AS);
					setState(194);
					alias();
					}
				}

				}
				break;
			case 2:
				_localctx = new SelectSpecialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				shortestPath();
				}
				break;
			case 3:
				_localctx = new SelectSpecialContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				ndegree();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortestPathContext extends ParserRuleContext {
		public TerminalNode SHORTEST() { return getToken(GraphSQLParser.SHORTEST, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public List<ShortestOptionsContext> shortestOptions() {
			return getRuleContexts(ShortestOptionsContext.class);
		}
		public ShortestOptionsContext shortestOptions(int i) {
			return getRuleContext(ShortestOptionsContext.class,i);
		}
		public ShortestPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortestPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterShortestPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitShortestPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitShortestPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortestPathContext shortestPath() throws RecognitionException {
		ShortestPathContext _localctx = new ShortestPathContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shortestPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(SHORTEST);
			setState(202);
			match(T__1);
			setState(203);
			property();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(204);
				match(T__8);
				setState(205);
				shortestOptions();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NdegreeContext extends ParserRuleContext {
		public TerminalNode NDEGREE() { return getToken(GraphSQLParser.NDEGREE, 0); }
		public DepthArgsContext depthArgs() {
			return getRuleContext(DepthArgsContext.class,0);
		}
		public NdegreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ndegree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNdegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNdegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNdegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NdegreeContext ndegree() throws RecognitionException {
		NdegreeContext _localctx = new NdegreeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ndegree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(NDEGREE);
			setState(214);
			match(T__1);
			setState(215);
			depthArgs();
			setState(216);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(GraphSQLParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(HAVING);
			setState(219);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(GraphSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(GraphSQLParser.BY, 0); }
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ORDER);
			setState(222);
			match(BY);
			setState(223);
			orderItem();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(224);
				match(T__8);
				setState(225);
				orderItem();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderItemContext extends ParserRuleContext {
		public Token order;
		public CommonItemContext commonItem() {
			return getRuleContext(CommonItemContext.class,0);
		}
		public TerminalNode ASC() { return getToken(GraphSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(GraphSQLParser.DESC, 0); }
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterOrderItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitOrderItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitOrderItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			commonItem();
			setState(232);
			((OrderItemContext)_localctx).order = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
				((OrderItemContext)_localctx).order = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(GraphSQLParser.LIMIT, 0); }
		public List<LimitItemContext> limitItem() {
			return getRuleContexts(LimitItemContext.class);
		}
		public LimitItemContext limitItem(int i) {
			return getRuleContext(LimitItemContext.class,i);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(LIMIT);
			setState(235);
			limitItem();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(236);
				match(T__8);
				setState(237);
				limitItem();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitItemContext extends ParserRuleContext {
		public NodeNameContext nodeName() {
			return getRuleContext(NodeNameContext.class,0);
		}
		public List<LimitArgsContext> limitArgs() {
			return getRuleContexts(LimitArgsContext.class);
		}
		public LimitArgsContext limitArgs(int i) {
			return getRuleContext(LimitArgsContext.class,i);
		}
		public LimitItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLimitItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLimitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLimitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitItemContext limitItem() throws RecognitionException {
		LimitItemContext _localctx = new LimitItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limitItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			nodeName();
			setState(244);
			match(T__1);
			setState(245);
			limitArgs();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(246);
				match(T__8);
				setState(247);
				limitArgs();
				}
			}

			setState(250);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public Token aggr;
		public CommonItemContext commonItem() {
			return getRuleContext(CommonItemContext.class,0);
		}
		public TerminalNode MAX() { return getToken(GraphSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(GraphSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(GraphSQLParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(GraphSQLParser.AVG, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((AggregationContext)_localctx).aggr = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << AVG))) != 0)) ) {
				((AggregationContext)_localctx).aggr = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
			match(T__1);
			setState(254);
			commonItem();
			setState(255);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonItemContext extends ParserRuleContext {
		public NamedAttributeContext namedAttribute() {
			return getRuleContext(NamedAttributeContext.class,0);
		}
		public CountFuncContext countFunc() {
			return getRuleContext(CountFuncContext.class,0);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public CommonItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterCommonItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitCommonItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitCommonItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonItemContext commonItem() throws RecognitionException {
		CommonItemContext _localctx = new CommonItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_commonItem);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				namedAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				countFunc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				aggregation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountFuncContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(GraphSQLParser.COUNT, 0); }
		public CountItemContext countItem() {
			return getRuleContext(CountItemContext.class,0);
		}
		public CountFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterCountFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitCountFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitCountFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountFuncContext countFunc() throws RecognitionException {
		CountFuncContext _localctx = new CountFuncContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_countFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(COUNT);
			setState(263);
			match(T__1);
			setState(264);
			countItem();
			setState(265);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountItemContext extends ParserRuleContext {
		public NamedAttributeContext namedAttribute() {
			return getRuleContext(NamedAttributeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CountItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterCountItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitCountItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitCountItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountItemContext countItem() throws RecognitionException {
		CountItemContext _localctx = new CountItemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_countItem);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				namedAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortestOptionsContext extends ParserRuleContext {
		public DepthArgsContext depthArgs() {
			return getRuleContext(DepthArgsContext.class,0);
		}
		public NumPathsContext numPaths() {
			return getRuleContext(NumPathsContext.class,0);
		}
		public ShortestOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortestOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterShortestOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitShortestOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitShortestOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortestOptionsContext shortestOptions() throws RecognitionException {
		ShortestOptionsContext _localctx = new ShortestOptionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shortestOptions);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEPTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				depthArgs();
				}
				break;
			case NUMPATHS:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				numPaths();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitArgsContext extends ParserRuleContext {
		public FirstContext first() {
			return getRuleContext(FirstContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public LimitArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLimitArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLimitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLimitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitArgsContext limitArgs() throws RecognitionException {
		LimitArgsContext _localctx = new LimitArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_limitArgs);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				first();
				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				offset();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(GraphSQLParser.PROPERTY, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PROPERTY);
			setState(280);
			match(T__2);
			setState(281);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DepthArgsContext extends ParserRuleContext {
		public TerminalNode DEPTH() { return getToken(GraphSQLParser.DEPTH, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(GraphSQLParser.NUMERIC_LITERAL, 0); }
		public DepthArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depthArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterDepthArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitDepthArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitDepthArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepthArgsContext depthArgs() throws RecognitionException {
		DepthArgsContext _localctx = new DepthArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_depthArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(DEPTH);
			setState(284);
			match(T__2);
			setState(285);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumPathsContext extends ParserRuleContext {
		public TerminalNode NUMPATHS() { return getToken(GraphSQLParser.NUMPATHS, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(GraphSQLParser.NUMERIC_LITERAL, 0); }
		public NumPathsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numPaths; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNumPaths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNumPaths(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNumPaths(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumPathsContext numPaths() throws RecognitionException {
		NumPathsContext _localctx = new NumPathsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numPaths);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(NUMPATHS);
			setState(288);
			match(T__2);
			setState(289);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(GraphSQLParser.FIRST, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(GraphSQLParser.NUMERIC_LITERAL, 0); }
		public FirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstContext first() throws RecognitionException {
		FirstContext _localctx = new FirstContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(FIRST);
			setState(292);
			match(T__2);
			setState(293);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(GraphSQLParser.OFFSET, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(GraphSQLParser.NUMERIC_LITERAL, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(OFFSET);
			setState(296);
			match(T__2);
			setState(297);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public NamedAttributeContext namedAttribute() {
			return getRuleContext(NamedAttributeContext.class,0);
		}
		public EdgeNameContext edgeName() {
			return getRuleContext(EdgeNameContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_predicate);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				namedAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				edgeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedAttributeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public NamedAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNamedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNamedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNamedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedAttributeContext namedAttribute() throws RecognitionException {
		NamedAttributeContext _localctx = new NamedAttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			name();
			setState(304);
			match(T__14);
			setState(305);
			attribute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EdgeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterEdgeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitEdgeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitEdgeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeNameContext edgeName() throws RecognitionException {
		EdgeNameContext _localctx = new EdgeNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_edgeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NodeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNodeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNodeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNodeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeNameContext nodeName() throws RecognitionException {
		NodeNameContext _localctx = new NodeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nodeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeLabelContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NodeLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterNodeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitNodeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitNodeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeLabelContext nodeLabel() throws RecognitionException {
		NodeLabelContext _localctx = new NodeLabelContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nodeLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeTypeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EdgeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterEdgeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitEdgeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitEdgeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeTypeContext edgeType() throws RecognitionException {
		EdgeTypeContext _localctx = new EdgeTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_edgeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_attribute);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case WHERE:
			case NOT:
			case AND:
			case OR:
			case IS:
			case NULL:
			case GROUP:
			case HAVING:
			case ORDER:
			case BY:
			case ASC:
			case DESC:
			case LIMIT:
			case AS:
			case OPT:
			case COUNT:
			case ANYOFTERMS:
			case ALLOFTERMS:
			case ALLOFTEXT:
			case ANYOFTEXT:
			case REGEXP:
			case MATCH:
			case SHORTEST:
			case PROPERTY:
			case NDEGREE:
			case DEPTH:
			case NUMPATHS:
			case FIRST:
			case OFFSET:
			case MAX:
			case MIN:
			case SUM:
			case AVG:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				id();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(GraphSQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GraphSQLParser.STRING_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode ANYOFTERMS() { return getToken(GraphSQLParser.ANYOFTERMS, 0); }
		public TerminalNode ALLOFTERMS() { return getToken(GraphSQLParser.ALLOFTERMS, 0); }
		public TerminalNode ALLOFTEXT() { return getToken(GraphSQLParser.ALLOFTEXT, 0); }
		public TerminalNode ANYOFTEXT() { return getToken(GraphSQLParser.ANYOFTEXT, 0); }
		public TerminalNode REGEXP() { return getToken(GraphSQLParser.REGEXP, 0); }
		public TerminalNode MATCH() { return getToken(GraphSQLParser.MATCH, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANYOFTERMS) | (1L << ALLOFTERMS) | (1L << ALLOFTEXT) | (1L << ANYOFTEXT) | (1L << REGEXP) | (1L << MATCH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(GraphSQLParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(GraphSQLParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(GraphSQLParser.WHERE, 0); }
		public TerminalNode NOT() { return getToken(GraphSQLParser.NOT, 0); }
		public TerminalNode AND() { return getToken(GraphSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(GraphSQLParser.OR, 0); }
		public TerminalNode IS() { return getToken(GraphSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(GraphSQLParser.NULL, 0); }
		public TerminalNode GROUP() { return getToken(GraphSQLParser.GROUP, 0); }
		public TerminalNode HAVING() { return getToken(GraphSQLParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(GraphSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(GraphSQLParser.BY, 0); }
		public TerminalNode ASC() { return getToken(GraphSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(GraphSQLParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(GraphSQLParser.LIMIT, 0); }
		public TerminalNode COUNT() { return getToken(GraphSQLParser.COUNT, 0); }
		public TerminalNode SHORTEST() { return getToken(GraphSQLParser.SHORTEST, 0); }
		public TerminalNode PROPERTY() { return getToken(GraphSQLParser.PROPERTY, 0); }
		public TerminalNode NDEGREE() { return getToken(GraphSQLParser.NDEGREE, 0); }
		public TerminalNode DEPTH() { return getToken(GraphSQLParser.DEPTH, 0); }
		public TerminalNode NUMPATHS() { return getToken(GraphSQLParser.NUMPATHS, 0); }
		public TerminalNode FIRST() { return getToken(GraphSQLParser.FIRST, 0); }
		public TerminalNode OFFSET() { return getToken(GraphSQLParser.OFFSET, 0); }
		public TerminalNode MAX() { return getToken(GraphSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(GraphSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(GraphSQLParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(GraphSQLParser.AVG, 0); }
		public TerminalNode AS() { return getToken(GraphSQLParser.AS, 0); }
		public TerminalNode OPT() { return getToken(GraphSQLParser.OPT, 0); }
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_keyword);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(SELECT);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(FROM);
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(WHERE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(NOT);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(OR);
				}
				break;
			case IS:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				match(IS);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				match(NULL);
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				match(GROUP);
				}
				break;
			case HAVING:
				enterOuterAlt(_localctx, 10);
				{
				setState(336);
				match(HAVING);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(337);
				match(ORDER);
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 12);
				{
				setState(338);
				match(BY);
				}
				break;
			case ASC:
				enterOuterAlt(_localctx, 13);
				{
				setState(339);
				match(ASC);
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 14);
				{
				setState(340);
				match(DESC);
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 15);
				{
				setState(341);
				match(LIMIT);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 16);
				{
				setState(342);
				match(COUNT);
				}
				break;
			case SHORTEST:
				enterOuterAlt(_localctx, 17);
				{
				setState(343);
				match(SHORTEST);
				}
				break;
			case PROPERTY:
				enterOuterAlt(_localctx, 18);
				{
				setState(344);
				match(PROPERTY);
				}
				break;
			case NDEGREE:
				enterOuterAlt(_localctx, 19);
				{
				setState(345);
				match(NDEGREE);
				}
				break;
			case DEPTH:
				enterOuterAlt(_localctx, 20);
				{
				setState(346);
				match(DEPTH);
				}
				break;
			case NUMPATHS:
				enterOuterAlt(_localctx, 21);
				{
				setState(347);
				match(NUMPATHS);
				}
				break;
			case FIRST:
				enterOuterAlt(_localctx, 22);
				{
				setState(348);
				match(FIRST);
				}
				break;
			case OFFSET:
				enterOuterAlt(_localctx, 23);
				{
				setState(349);
				match(OFFSET);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 24);
				{
				setState(350);
				match(MAX);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 25);
				{
				setState(351);
				match(MIN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 26);
				{
				setState(352);
				match(SUM);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 27);
				{
				setState(353);
				match(AVG);
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 28);
				{
				setState(354);
				match(AS);
				}
				break;
			case OPT:
				enterOuterAlt(_localctx, 29);
				{
				setState(355);
				match(OPT);
				}
				break;
			case ANYOFTERMS:
			case ALLOFTERMS:
			case ALLOFTEXT:
			case ANYOFTEXT:
			case REGEXP:
			case MATCH:
				enterOuterAlt(_localctx, 30);
				{
				setState(356);
				funcName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphSQLParser.ID, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphSQLListener ) ((GraphSQLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphSQLVisitor ) return ((GraphSQLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_id);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(ID);
				}
				break;
			case SELECT:
			case FROM:
			case WHERE:
			case NOT:
			case AND:
			case OR:
			case IS:
			case NULL:
			case GROUP:
			case HAVING:
			case ORDER:
			case BY:
			case ASC:
			case DESC:
			case LIMIT:
			case AS:
			case OPT:
			case COUNT:
			case ANYOFTERMS:
			case ALLOFTERMS:
			case ALLOFTEXT:
			case ANYOFTEXT:
			case REGEXP:
			case MATCH:
			case SHORTEST:
			case PROPERTY:
			case NDEGREE:
			case DEPTH:
			case NUMPATHS:
			case FIRST:
			case OFFSET:
			case MAX:
			case MIN:
			case SUM:
			case AVG:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\5\2X\n\2\3\2\5\2[\n\2\3\2\5\2^\n\2\3\2\5\2a\n\2\3\2\5\2d\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4n\n\4\5\4p\n\4\3\5\3\5\5\5t\n\5\3\5\3"+
		"\5\5\5x\n\5\3\5\3\5\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\5\6\u0083\n\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0098\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a6"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\5\n\u00b9\n\n\3\n\3\n\3\n\7\n\u00be\n\n\f\n\16\n\u00c1"+
		"\13\n\3\13\3\13\3\13\5\13\u00c6\n\13\3\13\3\13\5\13\u00ca\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00d1\n\f\f\f\16\f\u00d4\13\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00e5\n\17\f\17\16\17"+
		"\u00e8\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00f1\n\21\f\21\16"+
		"\21\u00f4\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u00fb\n\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0107\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\5\26\u0110\n\26\3\27\3\27\5\27\u0114\n\27\3\30\3\30\5"+
		"\30\u0118\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u0130\n\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\5&\u0144"+
		"\n&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0168\n)\3*\3*\5*\u016c\n*\3"+
		"*\2\3\16+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPR\2\7\3\2\f\20\3\2\37 \3\2\62\65\3\2\66\67\3\2%*\2\u0184"+
		"\2T\3\2\2\2\4g\3\2\2\2\6j\3\2\2\2\bq\3\2\2\2\n{\3\2\2\2\f\u0087\3\2\2"+
		"\2\16\u00a5\3\2\2\2\20\u00b2\3\2\2\2\22\u00b6\3\2\2\2\24\u00c9\3\2\2\2"+
		"\26\u00cb\3\2\2\2\30\u00d7\3\2\2\2\32\u00dc\3\2\2\2\34\u00df\3\2\2\2\36"+
		"\u00e9\3\2\2\2 \u00ec\3\2\2\2\"\u00f5\3\2\2\2$\u00fe\3\2\2\2&\u0106\3"+
		"\2\2\2(\u0108\3\2\2\2*\u010f\3\2\2\2,\u0113\3\2\2\2.\u0117\3\2\2\2\60"+
		"\u0119\3\2\2\2\62\u011d\3\2\2\2\64\u0121\3\2\2\2\66\u0125\3\2\2\28\u0129"+
		"\3\2\2\2:\u012f\3\2\2\2<\u0131\3\2\2\2>\u0135\3\2\2\2@\u0137\3\2\2\2B"+
		"\u0139\3\2\2\2D\u013b\3\2\2\2F\u013d\3\2\2\2H\u013f\3\2\2\2J\u0143\3\2"+
		"\2\2L\u0145\3\2\2\2N\u0147\3\2\2\2P\u0167\3\2\2\2R\u016b\3\2\2\2TU\5\22"+
		"\n\2UW\5\4\3\2VX\5\f\7\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\20\t\2ZY\3"+
		"\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\32\16\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2"+
		"_a\5\34\17\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5 \21\2cb\3\2\2\2cd\3\2\2"+
		"\2de\3\2\2\2ef\7\3\2\2f\3\3\2\2\2gh\7\24\2\2hi\5\6\4\2i\5\3\2\2\2jo\5"+
		"\b\5\2km\5\n\6\2ln\5\6\4\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2ok\3\2\2\2op\3"+
		"\2\2\2p\7\3\2\2\2qs\7\4\2\2rt\5@!\2sr\3\2\2\2st\3\2\2\2tw\3\2\2\2uv\7"+
		"\5\2\2vx\5D#\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\6\2\2z\t\3\2\2\2{|\7"+
		"\7\2\2|~\7\b\2\2}\177\5> \2~}\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"\u0081\7\5\2\2\u0081\u0083\5F$\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\7\t\2\2\u0085\u0086\7\n\2\2\u0086\13"+
		"\3\2\2\2\u0087\u0088\7\25\2\2\u0088\u0089\5\16\b\2\u0089\r\3\2\2\2\u008a"+
		"\u008b\b\b\1\2\u008b\u008c\5:\36\2\u008c\u008d\7\31\2\2\u008d\u008e\7"+
		"\26\2\2\u008e\u008f\7\32\2\2\u008f\u00a6\3\2\2\2\u0090\u0091\5N(\2\u0091"+
		"\u0092\7\4\2\2\u0092\u0093\5<\37\2\u0093\u0094\7\13\2\2\u0094\u0097\7"+
		"\67\2\2\u0095\u0096\7\13\2\2\u0096\u0098\7\66\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u00a6"+
		"\3\2\2\2\u009b\u009c\5&\24\2\u009c\u009d\t\2\2\2\u009d\u009e\5L\'\2\u009e"+
		"\u00a6\3\2\2\2\u009f\u00a0\7\26\2\2\u00a0\u00a6\5\16\b\6\u00a1\u00a2\7"+
		"\4\2\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\7\6\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u008a\3\2\2\2\u00a5\u0090\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u009f\3\2"+
		"\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\f\5\2\2\u00a8"+
		"\u00a9\7\27\2\2\u00a9\u00ae\5\16\b\6\u00aa\u00ab\f\4\2\2\u00ab\u00ac\7"+
		"\30\2\2\u00ac\u00ae\5\16\b\5\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\17\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\36\2\2\u00b4"+
		"\u00b5\5:\36\2\u00b5\21\3\2\2\2\u00b6\u00b8\7\23\2\2\u00b7\u00b9\7#\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bf"+
		"\5\24\13\2\u00bb\u00bc\7\13\2\2\u00bc\u00be\5\24\13\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\23\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\5&\24\2\u00c3\u00c4\7\"\2"+
		"\2\u00c4\u00c6\5H%\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca"+
		"\3\2\2\2\u00c7\u00ca\5\26\f\2\u00c8\u00ca\5\30\r\2\u00c9\u00c2\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00cc"+
		"\7+\2\2\u00cc\u00cd\7\4\2\2\u00cd\u00d2\5\60\31\2\u00ce\u00cf\7\13\2\2"+
		"\u00cf\u00d1\5,\27\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7\6\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\u00d9\7\4\2\2"+
		"\u00d9\u00da\5\62\32\2\u00da\u00db\7\6\2\2\u00db\31\3\2\2\2\u00dc\u00dd"+
		"\7\34\2\2\u00dd\u00de\5\16\b\2\u00de\33\3\2\2\2\u00df\u00e0\7\35\2\2\u00e0"+
		"\u00e1\7\36\2\2\u00e1\u00e6\5\36\20\2\u00e2\u00e3\7\13\2\2\u00e3\u00e5"+
		"\5\36\20\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\5&\24\2\u00ea\u00eb\t\3\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7!\2\2\u00ed"+
		"\u00f2\5\"\22\2\u00ee\u00ef\7\13\2\2\u00ef\u00f1\5\"\22\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"!\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5@!\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"\u00fa\5.\30\2\u00f8\u00f9\7\13\2\2\u00f9\u00fb\5.\30\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd"+
		"#\3\2\2\2\u00fe\u00ff\t\4\2\2\u00ff\u0100\7\4\2\2\u0100\u0101\5&\24\2"+
		"\u0101\u0102\7\6\2\2\u0102%\3\2\2\2\u0103\u0107\5<\37\2\u0104\u0107\5"+
		"(\25\2\u0105\u0107\5$\23\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\'\3\2\2\2\u0108\u0109\7$\2\2\u0109\u010a\7\4\2\2"+
		"\u010a\u010b\5*\26\2\u010b\u010c\7\6\2\2\u010c)\3\2\2\2\u010d\u0110\5"+
		"<\37\2\u010e\u0110\5B\"\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"+\3\2\2\2\u0111\u0114\5\62\32\2\u0112\u0114\5\64\33\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114-\3\2\2\2\u0115\u0118\5\66\34\2\u0116\u0118"+
		"\58\35\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118/\3\2\2\2\u0119"+
		"\u011a\7,\2\2\u011a\u011b\7\5\2\2\u011b\u011c\5R*\2\u011c\61\3\2\2\2\u011d"+
		"\u011e\7.\2\2\u011e\u011f\7\5\2\2\u011f\u0120\7\66\2\2\u0120\63\3\2\2"+
		"\2\u0121\u0122\7/\2\2\u0122\u0123\7\5\2\2\u0123\u0124\7\66\2\2\u0124\65"+
		"\3\2\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7\5\2\2\u0127\u0128\7\66\2\2"+
		"\u0128\67\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b\7\5\2\2\u012b\u012c"+
		"\7\66\2\2\u012c9\3\2\2\2\u012d\u0130\5<\37\2\u012e\u0130\5> \2\u012f\u012d"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130;\3\2\2\2\u0131\u0132\5B\"\2\u0132\u0133"+
		"\7\21\2\2\u0133\u0134\5J&\2\u0134=\3\2\2\2\u0135\u0136\5B\"\2\u0136?\3"+
		"\2\2\2\u0137\u0138\5B\"\2\u0138A\3\2\2\2\u0139\u013a\5R*\2\u013aC\3\2"+
		"\2\2\u013b\u013c\5R*\2\u013cE\3\2\2\2\u013d\u013e\5R*\2\u013eG\3\2\2\2"+
		"\u013f\u0140\5R*\2\u0140I\3\2\2\2\u0141\u0144\5R*\2\u0142\u0144\7\22\2"+
		"\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144K\3\2\2\2\u0145\u0146"+
		"\t\5\2\2\u0146M\3\2\2\2\u0147\u0148\t\6\2\2\u0148O\3\2\2\2\u0149\u0168"+
		"\7\23\2\2\u014a\u0168\7\24\2\2\u014b\u0168\7\25\2\2\u014c\u0168\7\26\2"+
		"\2\u014d\u0168\7\27\2\2\u014e\u0168\7\30\2\2\u014f\u0168\7\31\2\2\u0150"+
		"\u0168\7\32\2\2\u0151\u0168\7\33\2\2\u0152\u0168\7\34\2\2\u0153\u0168"+
		"\7\35\2\2\u0154\u0168\7\36\2\2\u0155\u0168\7\37\2\2\u0156\u0168\7 \2\2"+
		"\u0157\u0168\7!\2\2\u0158\u0168\7$\2\2\u0159\u0168\7+\2\2\u015a\u0168"+
		"\7,\2\2\u015b\u0168\7-\2\2\u015c\u0168\7.\2\2\u015d\u0168\7/\2\2\u015e"+
		"\u0168\7\60\2\2\u015f\u0168\7\61\2\2\u0160\u0168\7\62\2\2\u0161\u0168"+
		"\7\63\2\2\u0162\u0168\7\64\2\2\u0163\u0168\7\65\2\2\u0164\u0168\7\"\2"+
		"\2\u0165\u0168\7#\2\2\u0166\u0168\5N(\2\u0167\u0149\3\2\2\2\u0167\u014a"+
		"\3\2\2\2\u0167\u014b\3\2\2\2\u0167\u014c\3\2\2\2\u0167\u014d\3\2\2\2\u0167"+
		"\u014e\3\2\2\2\u0167\u014f\3\2\2\2\u0167\u0150\3\2\2\2\u0167\u0151\3\2"+
		"\2\2\u0167\u0152\3\2\2\2\u0167\u0153\3\2\2\2\u0167\u0154\3\2\2\2\u0167"+
		"\u0155\3\2\2\2\u0167\u0156\3\2\2\2\u0167\u0157\3\2\2\2\u0167\u0158\3\2"+
		"\2\2\u0167\u0159\3\2\2\2\u0167\u015a\3\2\2\2\u0167\u015b\3\2\2\2\u0167"+
		"\u015c\3\2\2\2\u0167\u015d\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u015f\3\2"+
		"\2\2\u0167\u0160\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0162\3\2\2\2\u0167"+
		"\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2"+
		"\2\2\u0168Q\3\2\2\2\u0169\u016c\78\2\2\u016a\u016c\5P)\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016a\3\2\2\2\u016cS\3\2\2\2!WZ]`cmosw~\u0082\u0097\u00a5"+
		"\u00ad\u00af\u00b8\u00bf\u00c5\u00c9\u00d2\u00e6\u00f2\u00fa\u0106\u010f"+
		"\u0113\u0117\u012f\u0143\u0167\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}