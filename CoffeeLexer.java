// Generated from Coffee.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoffeeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_COMMENT=1, MULTI_COMMENT=2, IMPORT=3, VOID=4, INT=5, FLOAT=6, BOOLEAN=7, 
		BREAK=8, CONTINUE=9, RETURN=10, IF=11, ELSE=12, FOR=13, IN=14, WHILE=15, 
		TRUE=16, FALSE=17, ADD=18, SUB=19, DIV=20, MUL=21, EQ=22, NEQ=23, DEQ=24, 
		LTEQ=25, GTEQ=26, LT=27, GT=28, AND=29, OR=30, LSQUARE=31, RSQUARE=32, 
		LCURLY=33, RCURLY=34, LROUND=35, RROUND=36, ID=37, INT_LIT=38, FLOAT_LIT=39, 
		CHAR_LIT=40, STRING_LIT=41, QUEST=42, DOT=43, COMMA=44, COLON=45, SEMI=46, 
		DQUOTE=47, SQUOTE=48, NOT=49, MOD=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_COMMENT", "MULTI_COMMENT", "IMPORT", "VOID", "INT", "FLOAT", 
			"BOOLEAN", "BREAK", "CONTINUE", "RETURN", "IF", "ELSE", "FOR", "IN", 
			"WHILE", "TRUE", "FALSE", "ADD", "SUB", "DIV", "MUL", "EQ", "NEQ", "DEQ", 
			"LTEQ", "GTEQ", "LT", "GT", "AND", "OR", "LSQUARE", "RSQUARE", "LCURLY", 
			"RCURLY", "LROUND", "RROUND", "ALPHA", "NUM", "ALPHA_NUM", "ID", "INT_LIT", 
			"FLOAT_LIT", "VALID_CHAR", "CHAR_LIT", "STRING_LIT", "QUEST", "DOT", 
			"COMMA", "COLON", "SEMI", "DQUOTE", "SQUOTE", "NOT", "MOD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'import'", "'void'", "'int'", "'float'", "'bool'", 
			"'break'", "'continue'", "'return'", "'if'", "'else'", "'for'", "'in'", 
			"'while'", "'true'", "'false'", "'+'", "'-'", "'/'", "'*'", "'='", "'!='", 
			"'=='", "'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", "'['", "']'", "'{'", 
			"'}'", "'('", "')'", null, null, null, null, null, "'?'", "'.'", "','", 
			"':'", "';'", "'\"'", "'''", "'!'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_COMMENT", "MULTI_COMMENT", "IMPORT", "VOID", "INT", "FLOAT", 
			"BOOLEAN", "BREAK", "CONTINUE", "RETURN", "IF", "ELSE", "FOR", "IN", 
			"WHILE", "TRUE", "FALSE", "ADD", "SUB", "DIV", "MUL", "EQ", "NEQ", "DEQ", 
			"LTEQ", "GTEQ", "LT", "GT", "AND", "OR", "LSQUARE", "RSQUARE", "LCURLY", 
			"RCURLY", "LROUND", "RROUND", "ID", "INT_LIT", "FLOAT_LIT", "CHAR_LIT", 
			"STRING_LIT", "QUEST", "DOT", "COMMA", "COLON", "SEMI", "DQUOTE", "SQUOTE", 
			"NOT", "MOD", "WS"
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


	public CoffeeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Coffee.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u015f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\7\2v\n\2\f\2"+
		"\16\2y\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\5(\u0110\n(\3)\3)\7)\u0114"+
		"\n)\f)\16)\u0117\13)\3*\6*\u011a\n*\r*\16*\u011b\3+\6+\u011f\n+\r+\16"+
		"+\u0120\3+\3+\7+\u0125\n+\f+\16+\u0128\13+\3+\7+\u012b\n+\f+\16+\u012e"+
		"\13+\3+\3+\6+\u0132\n+\r+\16+\u0133\5+\u0136\n+\3,\3,\3,\5,\u013b\n,\3"+
		"-\3-\3-\3-\3.\3.\7.\u0143\n.\f.\16.\u0146\13.\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\38\38\4w\u0084\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\'S(U)W\2Y*[+],_-a.c/e\60"+
		"g\61i\62k\63m\64o\65\3\2\7\5\2C\\aac|\3\2\62;\6\2\13\f\16\17$$))\b\2$"+
		"$))hhppttvv\5\2\13\f\16\17\"\"\2\u0166\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\3q\3\2\2\2\5~\3\2\2\2\7\u008c\3\2\2\2\t\u0093\3\2\2\2\13\u0098"+
		"\3\2\2\2\r\u009c\3\2\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00ad\3"+
		"\2\2\2\25\u00b6\3\2\2\2\27\u00bd\3\2\2\2\31\u00c0\3\2\2\2\33\u00c5\3\2"+
		"\2\2\35\u00c9\3\2\2\2\37\u00cc\3\2\2\2!\u00d2\3\2\2\2#\u00d7\3\2\2\2%"+
		"\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3"+
		"\2\2\2/\u00e7\3\2\2\2\61\u00ea\3\2\2\2\63\u00ed\3\2\2\2\65\u00f0\3\2\2"+
		"\2\67\u00f3\3\2\2\29\u00f5\3\2\2\2;\u00f7\3\2\2\2=\u00fa\3\2\2\2?\u00fd"+
		"\3\2\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0107\3\2\2\2K\u0109\3\2\2\2M\u010b\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2"+
		"\2\2S\u0119\3\2\2\2U\u0135\3\2\2\2W\u013a\3\2\2\2Y\u013c\3\2\2\2[\u0140"+
		"\3\2\2\2]\u0149\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c\u014f\3\2\2\2e"+
		"\u0151\3\2\2\2g\u0153\3\2\2\2i\u0155\3\2\2\2k\u0157\3\2\2\2m\u0159\3\2"+
		"\2\2o\u015b\3\2\2\2qr\7\61\2\2rs\7\61\2\2sw\3\2\2\2tv\13\2\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\f\2\2{|\3\2\2"+
		"\2|}\b\2\2\2}\4\3\2\2\2~\177\7\61\2\2\177\u0080\7,\2\2\u0080\u0084\3\2"+
		"\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\3\2\2\u008b\6\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7o\2\2\u008e"+
		"\u008f\7r\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7v\2\2"+
		"\u0092\b\3\2\2\2\u0093\u0094\7x\2\2\u0094\u0095\7q\2\2\u0095\u0096\7k"+
		"\2\2\u0096\u0097\7f\2\2\u0097\n\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7p\2\2\u009a\u009b\7v\2\2\u009b\f\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7m\2\2\u00ac\22\3\2\2\2\u00ad"+
		"\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2"+
		"\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\26\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bf\30\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\32\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7"+
		"t\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\36"+
		"\3\2\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7k\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6\"\3\2\2\2\u00d7"+
		"\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc$\3\2\2\2\u00dd\u00de\7-\2\2\u00de&\3\2\2\2\u00df"+
		"\u00e0\7/\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2*\3\2\2\2\u00e3"+
		"\u00e4\7,\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6.\3\2\2\2\u00e7\u00e8"+
		"\7#\2\2\u00e8\u00e9\7?\2\2\u00e9\60\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7?\2\2\u00ef\64"+
		"\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2\7?\2\2\u00f2\66\3\2\2\2\u00f3"+
		"\u00f4\7>\2\2\u00f48\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6:\3\2\2\2\u00f7\u00f8"+
		"\7(\2\2\u00f8\u00f9\7(\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7~\2\2\u00fb\u00fc"+
		"\7~\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7]\2\2\u00fe@\3\2\2\2\u00ff\u0100\7"+
		"_\2\2\u0100B\3\2\2\2\u0101\u0102\7}\2\2\u0102D\3\2\2\2\u0103\u0104\7\177"+
		"\2\2\u0104F\3\2\2\2\u0105\u0106\7*\2\2\u0106H\3\2\2\2\u0107\u0108\7+\2"+
		"\2\u0108J\3\2\2\2\u0109\u010a\t\2\2\2\u010aL\3\2\2\2\u010b\u010c\t\3\2"+
		"\2\u010cN\3\2\2\2\u010d\u0110\5K&\2\u010e\u0110\5M\'\2\u010f\u010d\3\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110P\3\2\2\2\u0111\u0115\5K&\2\u0112\u0114"+
		"\5O(\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116R\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\5M\'\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011cT\3\2\2\2\u011d\u011f\5M\'\2\u011e\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0126\5_\60\2\u0123\u0125\5M\'\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0136\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012b\5M\'\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0131\5_\60\2\u0130\u0132\5M\'\2\u0131\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u011e\3\2\2\2\u0135\u012c\3\2\2\2\u0136V\3\2\2\2"+
		"\u0137\u013b\n\4\2\2\u0138\u0139\7^\2\2\u0139\u013b\t\5\2\2\u013a\u0137"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013bX\3\2\2\2\u013c\u013d\5i\65\2\u013d"+
		"\u013e\5W,\2\u013e\u013f\5i\65\2\u013fZ\3\2\2\2\u0140\u0144\5g\64\2\u0141"+
		"\u0143\5W,\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2"+
		"\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148"+
		"\5g\64\2\u0148\\\3\2\2\2\u0149\u014a\7A\2\2\u014a^\3\2\2\2\u014b\u014c"+
		"\7\60\2\2\u014c`\3\2\2\2\u014d\u014e\7.\2\2\u014eb\3\2\2\2\u014f\u0150"+
		"\7<\2\2\u0150d\3\2\2\2\u0151\u0152\7=\2\2\u0152f\3\2\2\2\u0153\u0154\7"+
		"$\2\2\u0154h\3\2\2\2\u0155\u0156\7)\2\2\u0156j\3\2\2\2\u0157\u0158\7#"+
		"\2\2\u0158l\3\2\2\2\u0159\u015a\7\'\2\2\u015an\3\2\2\2\u015b\u015c\t\6"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b8\2\2\u015ep\3\2\2\2\17\2w\u0084"+
		"\u010f\u0115\u011b\u0120\u0126\u012c\u0133\u0135\u013a\u0144\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}