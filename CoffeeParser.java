// Generated from Coffee.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoffeeParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_import_stmt = 1, RULE_global_decl = 2, RULE_var_decl = 3, 
		RULE_var_assign = 4, RULE_var = 5, RULE_data_type = 6, RULE_method_decl = 7, 
		RULE_return_type = 8, RULE_param = 9, RULE_block = 10, RULE_statement = 11, 
		RULE_loop_var = 12, RULE_method_call = 13, RULE_expr = 14, RULE_assign_op = 15, 
		RULE_literal = 16, RULE_bool_lit = 17, RULE_location = 18, RULE_limit = 19, 
		RULE_low = 20, RULE_high = 21, RULE_step = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_stmt", "global_decl", "var_decl", "var_assign", "var", 
			"data_type", "method_decl", "return_type", "param", "block", "statement", 
			"loop_var", "method_call", "expr", "assign_op", "literal", "bool_lit", 
			"location", "limit", "low", "high", "step"
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

	@Override
	public String getGrammarFileName() { return "Coffee.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoffeeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoffeeParser.EOF, 0); }
		public List<Import_stmtContext> import_stmt() {
			return getRuleContexts(Import_stmtContext.class);
		}
		public Import_stmtContext import_stmt(int i) {
			return getRuleContext(Import_stmtContext.class,i);
		}
		public List<Global_declContext> global_decl() {
			return getRuleContexts(Global_declContext.class);
		}
		public Global_declContext global_decl(int i) {
			return getRuleContext(Global_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << VOID) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LCURLY) | (1L << ID) | (1L << SEMI))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					import_stmt();
					}
					break;
				case 2:
					{
					setState(47);
					global_decl();
					}
					break;
				case 3:
					{
					setState(48);
					method_decl();
					}
					break;
				case 4:
					{
					setState(49);
					block();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(EOF);
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

	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CoffeeParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(CoffeeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoffeeParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoffeeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoffeeParser.COMMA, i);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitImport_stmt(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IMPORT);
			setState(58);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				match(ID);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(SEMI);
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

	public static class Global_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Global_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterGlobal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitGlobal_decl(this);
		}
	}

	public final Global_declContext global_decl() throws RecognitionException {
		Global_declContext _localctx = new Global_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			var_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Var_assignContext> var_assign() {
			return getRuleContexts(Var_assignContext.class);
		}
		public Var_assignContext var_assign(int i) {
			return getRuleContext(Var_assignContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoffeeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoffeeParser.COMMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			data_type();
			setState(71);
			var_assign();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				var_assign();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(SEMI);
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

	public static class Var_assignContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CoffeeParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			var();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(82);
				match(EQ);
				setState(83);
				expr(0);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(CoffeeParser.LSQUARE, 0); }
		public TerminalNode INT_LIT() { return getToken(CoffeeParser.INT_LIT, 0); }
		public TerminalNode RSQUARE() { return getToken(CoffeeParser.RSQUARE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ID);
				setState(88);
				match(LSQUARE);
				setState(89);
				match(INT_LIT);
				setState(90);
				match(RSQUARE);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CoffeeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CoffeeParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CoffeeParser.BOOLEAN, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class Method_declContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public TerminalNode LROUND() { return getToken(CoffeeParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(CoffeeParser.RROUND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoffeeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoffeeParser.COMMA, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			return_type();
			setState(96);
			match(ID);
			setState(97);
			match(LROUND);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(98);
				param();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					param();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
			match(RROUND);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(109);
				block();
				}
				break;
			case 2:
				{
				setState(110);
				expr(0);
				}
				break;
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

	public static class Return_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CoffeeParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_type);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				data_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(VOID);
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

	public static class ParamContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			data_type();
			setState(118);
			match(ID);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(CoffeeParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(CoffeeParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(LCURLY);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LCURLY) | (1L << ID) | (1L << SEMI))) != 0)) {
					{
					setState(123);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
					case FLOAT:
					case BOOLEAN:
						{
						setState(121);
						var_decl();
						}
						break;
					case BREAK:
					case CONTINUE:
					case RETURN:
					case IF:
					case FOR:
					case WHILE:
					case LCURLY:
					case ID:
					case SEMI:
						{
						setState(122);
						block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(RCURLY);
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
			case IF:
			case FOR:
			case WHILE:
			case ID:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EvalContext extends StatementContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public EvalContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitEval(this);
		}
	}
	public static class BreakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(CoffeeParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitBreak(this);
		}
	}
	public static class PassContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public PassContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterPass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitPass(this);
		}
	}
	public static class ContinueContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(CoffeeParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public ContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitContinue(this);
		}
	}
	public static class ForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(CoffeeParser.FOR, 0); }
		public TerminalNode LROUND() { return getToken(CoffeeParser.LROUND, 0); }
		public Loop_varContext loop_var() {
			return getRuleContext(Loop_varContext.class,0);
		}
		public TerminalNode IN() { return getToken(CoffeeParser.IN, 0); }
		public TerminalNode RROUND() { return getToken(CoffeeParser.RROUND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitFor(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(CoffeeParser.WHILE, 0); }
		public TerminalNode LROUND() { return getToken(CoffeeParser.LROUND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RROUND() { return getToken(CoffeeParser.RROUND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends StatementContext {
		public TerminalNode IF() { return getToken(CoffeeParser.IF, 0); }
		public TerminalNode LROUND() { return getToken(CoffeeParser.LROUND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RROUND() { return getToken(CoffeeParser.RROUND, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoffeeParser.ELSE, 0); }
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitIf(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(CoffeeParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitReturn(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoffeeParser.SEMI, 0); }
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitAssign(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new EvalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				method_call();
				setState(133);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				location();
				setState(136);
				assign_op();
				setState(137);
				expr(0);
				setState(138);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(IF);
				setState(141);
				match(LROUND);
				setState(142);
				expr(0);
				setState(143);
				match(RROUND);
				setState(144);
				block();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(145);
					match(ELSE);
					setState(146);
					block();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(FOR);
				setState(150);
				match(LROUND);
				setState(151);
				loop_var();
				setState(152);
				match(IN);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(153);
					match(ID);
					}
					break;
				case LSQUARE:
					{
					setState(154);
					limit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157);
				match(RROUND);
				setState(158);
				block();
				}
				break;
			case 5:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(WHILE);
				setState(161);
				match(LROUND);
				setState(162);
				expr(0);
				setState(163);
				match(RROUND);
				setState(164);
				block();
				}
				break;
			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(RETURN);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << LROUND) | (1L << ID) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << CHAR_LIT) | (1L << STRING_LIT) | (1L << NOT))) != 0)) {
					{
					setState(167);
					expr(0);
					}
				}

				setState(170);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(BREAK);
				setState(172);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				match(CONTINUE);
				setState(174);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new PassContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(175);
				match(SEMI);
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

	public static class Loop_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public Loop_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterLoop_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitLoop_var(this);
		}
	}

	public final Loop_varContext loop_var() throws RecognitionException {
		Loop_varContext _localctx = new Loop_varContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public TerminalNode LROUND() { return getToken(CoffeeParser.LROUND, 0); }
		public TerminalNode RROUND() { return getToken(CoffeeParser.RROUND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoffeeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoffeeParser.COMMA, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(LROUND);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << LROUND) | (1L << ID) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << CHAR_LIT) | (1L << STRING_LIT) | (1L << NOT))) != 0)) {
				{
				setState(182);
				expr(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					expr(0);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(192);
			match(RROUND);
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
		public TerminalNode LROUND() { return getToken(CoffeeParser.LROUND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RROUND() { return getToken(CoffeeParser.RROUND, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CoffeeParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(CoffeeParser.NOT, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CoffeeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CoffeeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CoffeeParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(CoffeeParser.ADD, 0); }
		public TerminalNode GT() { return getToken(CoffeeParser.GT, 0); }
		public TerminalNode LT() { return getToken(CoffeeParser.LT, 0); }
		public TerminalNode GTEQ() { return getToken(CoffeeParser.GTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(CoffeeParser.LTEQ, 0); }
		public TerminalNode DEQ() { return getToken(CoffeeParser.DEQ, 0); }
		public TerminalNode NEQ() { return getToken(CoffeeParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(CoffeeParser.AND, 0); }
		public TerminalNode OR() { return getToken(CoffeeParser.OR, 0); }
		public TerminalNode QUEST() { return getToken(CoffeeParser.QUEST, 0); }
		public TerminalNode COLON() { return getToken(CoffeeParser.COLON, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitExpr(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(195);
				match(LROUND);
				setState(196);
				expr(0);
				setState(197);
				match(RROUND);
				}
				break;
			case 2:
				{
				setState(199);
				match(LROUND);
				setState(200);
				data_type();
				setState(201);
				match(RROUND);
				setState(202);
				expr(13);
				}
				break;
			case 3:
				{
				setState(204);
				match(SUB);
				setState(205);
				expr(12);
				}
				break;
			case 4:
				{
				setState(206);
				match(NOT);
				setState(207);
				expr(11);
				}
				break;
			case 5:
				{
				setState(208);
				location();
				}
				break;
			case 6:
				{
				setState(209);
				literal();
				}
				break;
			case 7:
				{
				setState(210);
				method_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(214);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(217);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(220);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTEQ) | (1L << GTEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==NEQ || _la==DEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						match(AND);
						setState(227);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(229);
						match(OR);
						setState(230);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(232);
						match(QUEST);
						setState(233);
						expr(0);
						setState(234);
						match(COLON);
						setState(235);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CoffeeParser.EQ, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(EQ);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(CoffeeParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(CoffeeParser.FLOAT_LIT, 0); }
		public Bool_litContext bool_lit() {
			return getRuleContext(Bool_litContext.class,0);
		}
		public TerminalNode STRING_LIT() { return getToken(CoffeeParser.STRING_LIT, 0); }
		public TerminalNode CHAR_LIT() { return getToken(CoffeeParser.CHAR_LIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(INT_LIT);
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(FLOAT_LIT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				bool_lit();
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(STRING_LIT);
				}
				break;
			case CHAR_LIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(CHAR_LIT);
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

	public static class Bool_litContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CoffeeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoffeeParser.FALSE, 0); }
		public Bool_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterBool_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitBool_lit(this);
		}
	}

	public final Bool_litContext bool_lit() throws RecognitionException {
		Bool_litContext _localctx = new Bool_litContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoffeeParser.ID, 0); }
		public TerminalNode LSQUARE() { return getToken(CoffeeParser.LSQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(CoffeeParser.RSQUARE, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_location);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(ID);
				setState(255);
				match(LSQUARE);
				setState(256);
				expr(0);
				setState(257);
				match(RSQUARE);
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

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(CoffeeParser.LSQUARE, 0); }
		public List<TerminalNode> COLON() { return getTokens(CoffeeParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoffeeParser.COLON, i);
		}
		public TerminalNode RSQUARE() { return getToken(CoffeeParser.RSQUARE, 0); }
		public LowContext low() {
			return getRuleContext(LowContext.class,0);
		}
		public HighContext high() {
			return getRuleContext(HighContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitLimit(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(LSQUARE);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << LROUND) | (1L << ID) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << CHAR_LIT) | (1L << STRING_LIT) | (1L << NOT))) != 0)) {
				{
				setState(262);
				low();
				}
			}

			setState(265);
			match(COLON);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << LROUND) | (1L << ID) | (1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << CHAR_LIT) | (1L << STRING_LIT) | (1L << NOT))) != 0)) {
				{
				setState(266);
				high();
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(269);
				match(COLON);
				setState(270);
				step();
				}
			}

			setState(273);
			match(RSQUARE);
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

	public static class LowContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_low; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterLow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitLow(this);
		}
	}

	public final LowContext low() throws RecognitionException {
		LowContext _localctx = new LowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_low);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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

	public static class HighContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HighContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterHigh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitHigh(this);
		}
	}

	public final HighContext high() throws RecognitionException {
		HighContext _localctx = new HighContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_high);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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

	public static class StepContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoffeeListener ) ((CoffeeListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\5\tm\n\t\3\t\3\t\3\t\5\tr\n"+
		"\t\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081"+
		"\13\f\3\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00b3\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00bc"+
		"\n\17\f\17\16\17\u00bf\13\17\5\17\u00c1\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00f0\n\20\f\20\16\20\u00f3\13\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00fc\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n"+
		"\24\3\25\3\25\5\25\u010a\n\25\3\25\3\25\5\25\u010e\n\25\3\25\3\25\5\25"+
		"\u0112\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\3\36\31\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\b\3\2\7\t\4\2\26\27\64"+
		"\64\3\2\24\25\3\2\33\36\3\2\31\32\3\2\22\23\2\u0135\2\66\3\2\2\2\4;\3"+
		"\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nS\3\2\2\2\f]\3\2\2\2\16_\3\2\2\2\20a\3\2"+
		"\2\2\22u\3\2\2\2\24w\3\2\2\2\26\u0084\3\2\2\2\30\u00b2\3\2\2\2\32\u00b4"+
		"\3\2\2\2\34\u00b6\3\2\2\2\36\u00d5\3\2\2\2 \u00f4\3\2\2\2\"\u00fb\3\2"+
		"\2\2$\u00fd\3\2\2\2&\u0105\3\2\2\2(\u0107\3\2\2\2*\u0115\3\2\2\2,\u0117"+
		"\3\2\2\2.\u0119\3\2\2\2\60\65\5\4\3\2\61\65\5\6\4\2\62\65\5\20\t\2\63"+
		"\65\5\26\f\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\2\2"+
		"\3:\3\3\2\2\2;<\7\5\2\2<A\7\'\2\2=>\7.\2\2>@\7\'\2\2?=\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\60\2\2E\5\3\2\2\2FG\5\b"+
		"\5\2G\7\3\2\2\2HI\5\16\b\2IN\5\n\6\2JK\7.\2\2KM\5\n\6\2LJ\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\60\2\2R\t\3\2\2\2S"+
		"V\5\f\7\2TU\7\30\2\2UW\5\36\20\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2X^\7\'"+
		"\2\2YZ\7\'\2\2Z[\7!\2\2[\\\7(\2\2\\^\7\"\2\2]X\3\2\2\2]Y\3\2\2\2^\r\3"+
		"\2\2\2_`\t\2\2\2`\17\3\2\2\2ab\5\22\n\2bc\7\'\2\2cl\7%\2\2di\5\24\13\2"+
		"ef\7.\2\2fh\5\24\13\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2ld\3\2\2\2lm\3\2\2\2mn\3\2\2\2nq\7&\2\2or\5\26\f\2pr\5\36"+
		"\20\2qo\3\2\2\2qp\3\2\2\2r\21\3\2\2\2sv\5\16\b\2tv\7\6\2\2us\3\2\2\2u"+
		"t\3\2\2\2v\23\3\2\2\2wx\5\16\b\2xy\7\'\2\2y\25\3\2\2\2z\177\7#\2\2{~\5"+
		"\b\5\2|~\5\26\f\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085\7$\2"+
		"\2\u0083\u0085\5\30\r\2\u0084z\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3"+
		"\2\2\2\u0086\u0087\5\34\17\2\u0087\u0088\7\60\2\2\u0088\u00b3\3\2\2\2"+
		"\u0089\u008a\5&\24\2\u008a\u008b\5 \21\2\u008b\u008c\5\36\20\2\u008c\u008d"+
		"\7\60\2\2\u008d\u00b3\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0090\7%\2\2\u0090"+
		"\u0091\5\36\20\2\u0091\u0092\7&\2\2\u0092\u0095\5\26\f\2\u0093\u0094\7"+
		"\16\2\2\u0094\u0096\5\26\f\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u00b3\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u0099\7%\2\2\u0099\u009a\5\32"+
		"\16\2\u009a\u009d\7\20\2\2\u009b\u009e\7\'\2\2\u009c\u009e\5(\25\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7&"+
		"\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00b3\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3"+
		"\u00a4\7%\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7&\2\2\u00a6\u00a7\5\26"+
		"\f\2\u00a7\u00b3\3\2\2\2\u00a8\u00aa\7\f\2\2\u00a9\u00ab\5\36\20\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\7\60"+
		"\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00b3\7\60\2\2\u00af\u00b0\7\13\2\2\u00b0"+
		"\u00b3\7\60\2\2\u00b1\u00b3\7\60\2\2\u00b2\u0086\3\2\2\2\u00b2\u0089\3"+
		"\2\2\2\u00b2\u008e\3\2\2\2\u00b2\u0097\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2"+
		"\u00a8\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5\33\3\2\2\2\u00b6\u00b7"+
		"\7\'\2\2\u00b7\u00c0\7%\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00ba\7.\2\2\u00ba"+
		"\u00bc\5\36\20\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7&"+
		"\2\2\u00c3\35\3\2\2\2\u00c4\u00c5\b\20\1\2\u00c5\u00c6\7%\2\2\u00c6\u00c7"+
		"\5\36\20\2\u00c7\u00c8\7&\2\2\u00c8\u00d6\3\2\2\2\u00c9\u00ca\7%\2\2\u00ca"+
		"\u00cb\5\16\b\2\u00cb\u00cc\7&\2\2\u00cc\u00cd\5\36\20\17\u00cd\u00d6"+
		"\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d6\5\36\20\16\u00d0\u00d1\7\63"+
		"\2\2\u00d1\u00d6\5\36\20\r\u00d2\u00d6\5&\24\2\u00d3\u00d6\5\"\22\2\u00d4"+
		"\u00d6\5\34\17\2\u00d5\u00c4\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00ce\3"+
		"\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00f1\3\2\2\2\u00d7\u00d8\f\f\2\2\u00d8\u00d9\t\3"+
		"\2\2\u00d9\u00f0\5\36\20\r\u00da\u00db\f\13\2\2\u00db\u00dc\t\4\2\2\u00dc"+
		"\u00f0\5\36\20\f\u00dd\u00de\f\n\2\2\u00de\u00df\t\5\2\2\u00df\u00f0\5"+
		"\36\20\13\u00e0\u00e1\f\t\2\2\u00e1\u00e2\t\6\2\2\u00e2\u00f0\5\36\20"+
		"\n\u00e3\u00e4\f\b\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00f0\5\36\20\t\u00e6"+
		"\u00e7\f\7\2\2\u00e7\u00e8\7 \2\2\u00e8\u00f0\5\36\20\b\u00e9\u00ea\f"+
		"\6\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7/\2\2\u00ed"+
		"\u00ee\5\36\20\7\u00ee\u00f0\3\2\2\2\u00ef\u00d7\3\2\2\2\u00ef\u00da\3"+
		"\2\2\2\u00ef\u00dd\3\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef"+
		"\u00e6\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5"+
		"\7\30\2\2\u00f5!\3\2\2\2\u00f6\u00fc\7(\2\2\u00f7\u00fc\7)\2\2\u00f8\u00fc"+
		"\5$\23\2\u00f9\u00fc\7+\2\2\u00fa\u00fc\7*\2\2\u00fb\u00f6\3\2\2\2\u00fb"+
		"\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc#\3\2\2\2\u00fd\u00fe\t\7\2\2\u00fe%\3\2\2\2\u00ff\u0106\7\'"+
		"\2\2\u0100\u0101\7\'\2\2\u0101\u0102\7!\2\2\u0102\u0103\5\36\20\2\u0103"+
		"\u0104\7\"\2\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2"+
		"\2\2\u0106\'\3\2\2\2\u0107\u0109\7!\2\2\u0108\u010a\5*\26\2\u0109\u0108"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7/\2\2\u010c"+
		"\u010e\5,\27\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u0110\7/\2\2\u0110\u0112\5.\30\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\"\2\2\u0114)\3\2\2\2"+
		"\u0115\u0116\5\36\20\2\u0116+\3\2\2\2\u0117\u0118\5\36\20\2\u0118-\3\2"+
		"\2\2\u0119\u011a\5\36\20\2\u011a/\3\2\2\2\35\64\66ANV]ilqu}\177\u0084"+
		"\u0095\u009d\u00aa\u00b2\u00bd\u00c0\u00d5\u00ef\u00f1\u00fb\u0105\u0109"+
		"\u010d\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}