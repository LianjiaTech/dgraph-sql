// Generated from /Users/zhaoxiang/Documents/code/IdeaProjects/graph-sql-parser/src/main/antlr/GraphSQL.g4 by ANTLR 4.8
package com.ke.search.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphSQLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "SELECT", 
			"FROM", "WHERE", "NOT", "AND", "OR", "IS", "NULL", "GROUP", "HAVING", 
			"ORDER", "BY", "ASC", "DESC", "LIMIT", "AS", "OPT", "COUNT", "ANYOFTERMS", 
			"ALLOFTERMS", "ALLOFTEXT", "ANYOFTEXT", "REGEXP", "MATCH", "SHORTEST", 
			"PROPERTY", "NDEGREE", "DEPTH", "NUMPATHS", "FIRST", "OFFSET", "MAX", 
			"MIN", "SUM", "AVG", "NUMERIC_LITERAL", "STRING_LITERAL", "ID", "WS", 
			"DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public GraphSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\65\6\65\u01a0\n\65\r\65\16\65\u01a1\3\65\3\65\7\65\u01a6\n\65\f\65"+
		"\16\65\u01a9\13\65\5\65\u01ab\n\65\3\65\3\65\5\65\u01af\n\65\3\65\6\65"+
		"\u01b2\n\65\r\65\16\65\u01b3\5\65\u01b6\n\65\3\65\3\65\6\65\u01ba\n\65"+
		"\r\65\16\65\u01bb\3\65\3\65\5\65\u01c0\n\65\3\65\6\65\u01c3\n\65\r\65"+
		"\16\65\u01c4\5\65\u01c7\n\65\5\65\u01c9\n\65\3\66\3\66\3\66\3\66\7\66"+
		"\u01cf\n\66\f\66\16\66\u01d2\13\66\3\66\3\66\3\67\5\67\u01d7\n\67\3\67"+
		"\3\67\7\67\u01db\n\67\f\67\16\67\u01de\13\67\38\38\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\2\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\3\2\"\4\2--//\3\2)"+
		")\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u020c\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\3\u00a7\3\2\2\2\5\u00a9\3\2\2\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2"+
		"\13\u00af\3\2\2\2\r\u00b1\3\2\2\2\17\u00b3\3\2\2\2\21\u00b5\3\2\2\2\23"+
		"\u00b8\3\2\2\2\25\u00ba\3\2\2\2\27\u00bc\3\2\2\2\31\u00be\3\2\2\2\33\u00c1"+
		"\3\2\2\2\35\u00c3\3\2\2\2\37\u00c6\3\2\2\2!\u00c8\3\2\2\2#\u00ca\3\2\2"+
		"\2%\u00d1\3\2\2\2\'\u00d6\3\2\2\2)\u00dc\3\2\2\2+\u00e0\3\2\2\2-\u00e4"+
		"\3\2\2\2/\u00e7\3\2\2\2\61\u00ea\3\2\2\2\63\u00ef\3\2\2\2\65\u00f5\3\2"+
		"\2\2\67\u00fc\3\2\2\29\u0102\3\2\2\2;\u0105\3\2\2\2=\u0109\3\2\2\2?\u010e"+
		"\3\2\2\2A\u0114\3\2\2\2C\u0117\3\2\2\2E\u011b\3\2\2\2G\u0121\3\2\2\2I"+
		"\u012c\3\2\2\2K\u0137\3\2\2\2M\u0141\3\2\2\2O\u014b\3\2\2\2Q\u0152\3\2"+
		"\2\2S\u0158\3\2\2\2U\u0161\3\2\2\2W\u016a\3\2\2\2Y\u0172\3\2\2\2[\u0178"+
		"\3\2\2\2]\u0181\3\2\2\2_\u0187\3\2\2\2a\u018e\3\2\2\2c\u0192\3\2\2\2e"+
		"\u0196\3\2\2\2g\u019a\3\2\2\2i\u01c8\3\2\2\2k\u01ca\3\2\2\2m\u01d6\3\2"+
		"\2\2o\u01df\3\2\2\2q\u01e3\3\2\2\2s\u01e5\3\2\2\2u\u01e7\3\2\2\2w\u01e9"+
		"\3\2\2\2y\u01eb\3\2\2\2{\u01ed\3\2\2\2}\u01ef\3\2\2\2\177\u01f1\3\2\2"+
		"\2\u0081\u01f3\3\2\2\2\u0083\u01f5\3\2\2\2\u0085\u01f7\3\2\2\2\u0087\u01f9"+
		"\3\2\2\2\u0089\u01fb\3\2\2\2\u008b\u01fd\3\2\2\2\u008d\u01ff\3\2\2\2\u008f"+
		"\u0201\3\2\2\2\u0091\u0203\3\2\2\2\u0093\u0205\3\2\2\2\u0095\u0207\3\2"+
		"\2\2\u0097\u0209\3\2\2\2\u0099\u020b\3\2\2\2\u009b\u020d\3\2\2\2\u009d"+
		"\u020f\3\2\2\2\u009f\u0211\3\2\2\2\u00a1\u0213\3\2\2\2\u00a3\u0215\3\2"+
		"\2\2\u00a5\u0217\3\2\2\2\u00a7\u00a8\7=\2\2\u00a8\4\3\2\2\2\u00a9\u00aa"+
		"\7*\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\7<\2\2\u00ac\b\3\2\2\2\u00ad\u00ae"+
		"\7+\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7/\2\2\u00b0\f\3\2\2\2\u00b1\u00b2"+
		"\7]\2\2\u00b2\16\3\2\2\2\u00b3\u00b4\7_\2\2\u00b4\20\3\2\2\2\u00b5\u00b6"+
		"\7/\2\2\u00b6\u00b7\7@\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9\24"+
		"\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd"+
		"\30\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0\32\3\2\2\2\u00c1"+
		"\u00c2\7@\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"\36\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7,\2\2\u00c9"+
		"\"\3\2\2\2\u00ca\u00cb\5\u0097L\2\u00cb\u00cc\5{>\2\u00cc\u00cd\5\u0089"+
		"E\2\u00cd\u00ce\5{>\2\u00ce\u00cf\5w<\2\u00cf\u00d0\5\u0099M\2\u00d0$"+
		"\3\2\2\2\u00d1\u00d2\5}?\2\u00d2\u00d3\5\u0095K\2\u00d3\u00d4\5\u008f"+
		"H\2\u00d4\u00d5\5\u008bF\2\u00d5&\3\2\2\2\u00d6\u00d7\5\u009fP\2\u00d7"+
		"\u00d8\5\u0081A\2\u00d8\u00d9\5{>\2\u00d9\u00da\5\u0095K\2\u00da\u00db"+
		"\5{>\2\u00db(\3\2\2\2\u00dc\u00dd\5\u008dG\2\u00dd\u00de\5\u008fH\2\u00de"+
		"\u00df\5\u0099M\2\u00df*\3\2\2\2\u00e0\u00e1\5s:\2\u00e1\u00e2\5\u008d"+
		"G\2\u00e2\u00e3\5y=\2\u00e3,\3\2\2\2\u00e4\u00e5\5\u008fH\2\u00e5\u00e6"+
		"\5\u0095K\2\u00e6.\3\2\2\2\u00e7\u00e8\5\u0083B\2\u00e8\u00e9\5\u0097"+
		"L\2\u00e9\60\3\2\2\2\u00ea\u00eb\5\u008dG\2\u00eb\u00ec\5\u009bN\2\u00ec"+
		"\u00ed\5\u0089E\2\u00ed\u00ee\5\u0089E\2\u00ee\62\3\2\2\2\u00ef\u00f0"+
		"\5\177@\2\u00f0\u00f1\5\u0095K\2\u00f1\u00f2\5\u008fH\2\u00f2\u00f3\5"+
		"\u009bN\2\u00f3\u00f4\5\u0091I\2\u00f4\64\3\2\2\2\u00f5\u00f6\5\u0081"+
		"A\2\u00f6\u00f7\5s:\2\u00f7\u00f8\5\u009dO\2\u00f8\u00f9\5\u0083B\2\u00f9"+
		"\u00fa\5\u008dG\2\u00fa\u00fb\5\177@\2\u00fb\66\3\2\2\2\u00fc\u00fd\5"+
		"\u008fH\2\u00fd\u00fe\5\u0095K\2\u00fe\u00ff\5y=\2\u00ff\u0100\5{>\2\u0100"+
		"\u0101\5\u0095K\2\u01018\3\2\2\2\u0102\u0103\5u;\2\u0103\u0104\5\u00a3"+
		"R\2\u0104:\3\2\2\2\u0105\u0106\5s:\2\u0106\u0107\5\u0097L\2\u0107\u0108"+
		"\5w<\2\u0108<\3\2\2\2\u0109\u010a\5y=\2\u010a\u010b\5{>\2\u010b\u010c"+
		"\5\u0097L\2\u010c\u010d\5w<\2\u010d>\3\2\2\2\u010e\u010f\5\u0089E\2\u010f"+
		"\u0110\5\u0083B\2\u0110\u0111\5\u008bF\2\u0111\u0112\5\u0083B\2\u0112"+
		"\u0113\5\u0099M\2\u0113@\3\2\2\2\u0114\u0115\5s:\2\u0115\u0116\5\u0097"+
		"L\2\u0116B\3\2\2\2\u0117\u0118\5\u008fH\2\u0118\u0119\5\u0091I\2\u0119"+
		"\u011a\5\u0099M\2\u011aD\3\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7q\2\2"+
		"\u011d\u011e\7w\2\2\u011e\u011f\7p\2\2\u011f\u0120\7v\2\2\u0120F\3\2\2"+
		"\2\u0121\u0122\7c\2\2\u0122\u0123\7p\2\2\u0123\u0124\7{\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0126\7h\2\2\u0126\u0127\7v\2\2\u0127\u0128\7g\2\2\u0128"+
		"\u0129\7t\2\2\u0129\u012a\7o\2\2\u012a\u012b\7u\2\2\u012bH\3\2\2\2\u012c"+
		"\u012d\7c\2\2\u012d\u012e\7n\2\2\u012e\u012f\7n\2\2\u012f\u0130\7q\2\2"+
		"\u0130\u0131\7h\2\2\u0131\u0132\7v\2\2\u0132\u0133\7g\2\2\u0133\u0134"+
		"\7t\2\2\u0134\u0135\7o\2\2\u0135\u0136\7u\2\2\u0136J\3\2\2\2\u0137\u0138"+
		"\7c\2\2\u0138\u0139\7n\2\2\u0139\u013a\7n\2\2\u013a\u013b\7q\2\2\u013b"+
		"\u013c\7h\2\2\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2\u013e\u013f\7z\2\2"+
		"\u013f\u0140\7v\2\2\u0140L\3\2\2\2\u0141\u0142\7c\2\2\u0142\u0143\7p\2"+
		"\2\u0143\u0144\7{\2\2\u0144\u0145\7q\2\2\u0145\u0146\7h\2\2\u0146\u0147"+
		"\7v\2\2\u0147\u0148\7g\2\2\u0148\u0149\7z\2\2\u0149\u014a\7v\2\2\u014a"+
		"N\3\2\2\2\u014b\u014c\7t\2\2\u014c\u014d\7g\2\2\u014d\u014e\7i\2\2\u014e"+
		"\u014f\7g\2\2\u014f\u0150\7z\2\2\u0150\u0151\7r\2\2\u0151P\3\2\2\2\u0152"+
		"\u0153\7o\2\2\u0153\u0154\7c\2\2\u0154\u0155\7v\2\2\u0155\u0156\7e\2\2"+
		"\u0156\u0157\7j\2\2\u0157R\3\2\2\2\u0158\u0159\7u\2\2\u0159\u015a\7j\2"+
		"\2\u015a\u015b\7q\2\2\u015b\u015c\7t\2\2\u015c\u015d\7v\2\2\u015d\u015e"+
		"\7g\2\2\u015e\u015f\7u\2\2\u015f\u0160\7v\2\2\u0160T\3\2\2\2\u0161\u0162"+
		"\7r\2\2\u0162\u0163\7t\2\2\u0163\u0164\7q\2\2\u0164\u0165\7r\2\2\u0165"+
		"\u0166\7g\2\2\u0166\u0167\7t\2\2\u0167\u0168\7v\2\2\u0168\u0169\7{\2\2"+
		"\u0169V\3\2\2\2\u016a\u016b\7p\2\2\u016b\u016c\7f\2\2\u016c\u016d\7g\2"+
		"\2\u016d\u016e\7i\2\2\u016e\u016f\7t\2\2\u016f\u0170\7g\2\2\u0170\u0171"+
		"\7g\2\2\u0171X\3\2\2\2\u0172\u0173\7f\2\2\u0173\u0174\7g\2\2\u0174\u0175"+
		"\7r\2\2\u0175\u0176\7v\2\2\u0176\u0177\7j\2\2\u0177Z\3\2\2\2\u0178\u0179"+
		"\7p\2\2\u0179\u017a\7w\2\2\u017a\u017b\7o\2\2\u017b\u017c\7r\2\2\u017c"+
		"\u017d\7c\2\2\u017d\u017e\7v\2\2\u017e\u017f\7j\2\2\u017f\u0180\7u\2\2"+
		"\u0180\\\3\2\2\2\u0181\u0182\7h\2\2\u0182\u0183\7k\2\2\u0183\u0184\7t"+
		"\2\2\u0184\u0185\7u\2\2\u0185\u0186\7v\2\2\u0186^\3\2\2\2\u0187\u0188"+
		"\7q\2\2\u0188\u0189\7h\2\2\u0189\u018a\7h\2\2\u018a\u018b\7u\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7v\2\2\u018d`\3\2\2\2\u018e\u018f\7o\2\2\u018f"+
		"\u0190\7c\2\2\u0190\u0191\7z\2\2\u0191b\3\2\2\2\u0192\u0193\7o\2\2\u0193"+
		"\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195d\3\2\2\2\u0196\u0197\7u\2\2\u0197"+
		"\u0198\7w\2\2\u0198\u0199\7o\2\2\u0199f\3\2\2\2\u019a\u019b\7c\2\2\u019b"+
		"\u019c\7x\2\2\u019c\u019d\7i\2\2\u019dh\3\2\2\2\u019e\u01a0\5q9\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01aa\3\2\2\2\u01a3\u01a7\7\60\2\2\u01a4\u01a6\5q9\2\u01a5"+
		"\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01a3\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01b5\3\2\2\2\u01ac\u01ae\5{>\2\u01ad\u01af\t\2\2"+
		"\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2"+
		"\5q9\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01ac\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01c9\3\2\2\2\u01b7\u01b9\7\60\2\2\u01b8\u01ba\5q9\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01c6\3\2\2\2\u01bd\u01bf\5{>\2\u01be\u01c0\t\2\2\2\u01bf\u01be"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3\5q9\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u019f\3\2\2\2\u01c8\u01b7\3\2\2\2\u01c9j\3\2\2\2"+
		"\u01ca\u01d0\7)\2\2\u01cb\u01cf\n\3\2\2\u01cc\u01cd\7)\2\2\u01cd\u01cf"+
		"\7)\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d4\7)\2\2\u01d4l\3\2\2\2\u01d5\u01d7\7\u0080\2\2\u01d6\u01d5"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\t\4\2\2\u01d9"+
		"\u01db\t\5\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01ddn\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0"+
		"\t\6\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\b8\2\2\u01e2p\3\2\2\2\u01e3\u01e4"+
		"\t\7\2\2\u01e4r\3\2\2\2\u01e5\u01e6\t\b\2\2\u01e6t\3\2\2\2\u01e7\u01e8"+
		"\t\t\2\2\u01e8v\3\2\2\2\u01e9\u01ea\t\n\2\2\u01eax\3\2\2\2\u01eb\u01ec"+
		"\t\13\2\2\u01ecz\3\2\2\2\u01ed\u01ee\t\f\2\2\u01ee|\3\2\2\2\u01ef\u01f0"+
		"\t\r\2\2\u01f0~\3\2\2\2\u01f1\u01f2\t\16\2\2\u01f2\u0080\3\2\2\2\u01f3"+
		"\u01f4\t\17\2\2\u01f4\u0082\3\2\2\2\u01f5\u01f6\t\20\2\2\u01f6\u0084\3"+
		"\2\2\2\u01f7\u01f8\t\21\2\2\u01f8\u0086\3\2\2\2\u01f9\u01fa\t\22\2\2\u01fa"+
		"\u0088\3\2\2\2\u01fb\u01fc\t\23\2\2\u01fc\u008a\3\2\2\2\u01fd\u01fe\t"+
		"\24\2\2\u01fe\u008c\3\2\2\2\u01ff\u0200\t\25\2\2\u0200\u008e\3\2\2\2\u0201"+
		"\u0202\t\26\2\2\u0202\u0090\3\2\2\2\u0203\u0204\t\27\2\2\u0204\u0092\3"+
		"\2\2\2\u0205\u0206\t\30\2\2\u0206\u0094\3\2\2\2\u0207\u0208\t\31\2\2\u0208"+
		"\u0096\3\2\2\2\u0209\u020a\t\32\2\2\u020a\u0098\3\2\2\2\u020b\u020c\t"+
		"\33\2\2\u020c\u009a\3\2\2\2\u020d\u020e\t\34\2\2\u020e\u009c\3\2\2\2\u020f"+
		"\u0210\t\35\2\2\u0210\u009e\3\2\2\2\u0211\u0212\t\36\2\2\u0212\u00a0\3"+
		"\2\2\2\u0213\u0214\t\37\2\2\u0214\u00a2\3\2\2\2\u0215\u0216\t \2\2\u0216"+
		"\u00a4\3\2\2\2\u0217\u0218\t!\2\2\u0218\u00a6\3\2\2\2\22\2\u01a1\u01a7"+
		"\u01aa\u01ae\u01b3\u01b5\u01bb\u01bf\u01c4\u01c6\u01c8\u01ce\u01d0\u01d6"+
		"\u01dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}