// Generated from Erlang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ErlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Atom=12, Type=13, Var=14, Op=15, Float=16, Integer=17, 
		Char=18, String=19, List=20, Tuple=21, Comment=22, WS=23, Endl=24, LOWER=25, 
		UPPER=26, DGT=27;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_module = 2, RULE_compile = 3, 
		RULE_expr = 4, RULE_func = 5, RULE_funcDec = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "module", "compile", "expr", "func", "funcDec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'-module('", "'_'", "').'", "'-compile(export_all).'", 
			"'@'", "'('", "','", "')'", "'when'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Atom", "Type", "Var", "Op", "Float", "Integer", "Char", "String", "List", 
			"Tuple", "Comment", "WS", "Endl", "LOWER", "UPPER", "DGT"
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
	public String getGrammarFileName() { return "Erlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ErlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ErlangParser.EOF, 0); }
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public CompileContext compile() {
			return getRuleContext(CompileContext.class,0);
		}
		public List<FuncDecContext> funcDec() {
			return getRuleContexts(FuncDecContext.class);
		}
		public FuncDecContext funcDec(int i) {
			return getRuleContext(FuncDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(14);
				module();
				}
			}

			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(17);
				compile();
				}
			}

			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==LOWER) {
				{
				{
				setState(20);
				funcDec();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ErlangParser.Var, 0); }
		public TerminalNode Type() { return getToken(ErlangParser.Type, 0); }
		public TerminalNode Endl() { return getToken(ErlangParser.Endl, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(Var);
			setState(29);
			match(T__0);
			setState(30);
			match(Type);
			setState(31);
			match(Endl);
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

	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> LOWER() { return getTokens(ErlangParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(ErlangParser.LOWER, i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==LOWER) {
				{
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==LOWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	public static class CompileContext extends ParserRuleContext {
		public CompileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCompile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCompile(this);
		}
	}

	public final CompileContext compile() throws RecognitionException {
		CompileContext _localctx = new CompileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__4);
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
		public List<TerminalNode> Type() { return getTokens(ErlangParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(ErlangParser.Type, i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public TerminalNode Op() { return getToken(ErlangParser.Op, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				{
				setState(44);
				match(Type);
				}
				break;
			case T__2:
			case LOWER:
				{
				setState(45);
				func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Op) {
				{
				setState(48);
				match(Op);
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(49);
					match(Type);
					}
					break;
				case T__2:
				case LOWER:
					{
					setState(50);
					func();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> LOWER() { return getTokens(ErlangParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(ErlangParser.LOWER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> UPPER() { return getTokens(ErlangParser.UPPER); }
		public TerminalNode UPPER(int i) {
			return getToken(ErlangParser.UPPER, i);
		}
		public List<TerminalNode> DGT() { return getTokens(ErlangParser.DGT); }
		public TerminalNode DGT(int i) {
			return getToken(ErlangParser.DGT, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==LOWER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << LOWER) | (1L << UPPER) | (1L << DGT))) != 0)) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << LOWER) | (1L << UPPER) | (1L << DGT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__6);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Type) | (1L << LOWER))) != 0)) {
				{
				{
				setState(63);
				expr();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(64);
					match(T__7);
					}
				}

				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__8);
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

	public static class FuncDecContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Endl() { return getTokens(ErlangParser.Endl); }
		public TerminalNode Endl(int i) {
			return getToken(ErlangParser.Endl, i);
		}
		public List<FuncDecContext> funcDec() {
			return getRuleContexts(FuncDecContext.class);
		}
		public FuncDecContext funcDec(int i) {
			return getRuleContext(FuncDecContext.class,i);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFuncDec(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			func();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(75);
				match(T__9);
				setState(76);
				expr();
				}
			}

			setState(79);
			match(T__10);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					expr();
					setState(81);
					match(Endl);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					funcDec();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\5\2\25\n"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\7\4&\n\4\f\4\16\4)\13\4\3\4\3\4\3\5\3\5\3\6\3\6\5\6\61\n\6\3\6\3\6\3"+
		"\6\5\6\66\n\6\5\68\n\6\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\7\3\7\3\7\5\7"+
		"D\n\7\7\7F\n\7\f\7\16\7I\13\7\3\7\3\7\3\b\3\b\3\b\5\bP\n\b\3\b\3\b\3\b"+
		"\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\2\2\t\2"+
		"\4\6\b\n\f\16\2\4\4\2\5\5\33\33\5\2\5\5\b\b\33\35\2f\2\21\3\2\2\2\4\36"+
		"\3\2\2\2\6#\3\2\2\2\b,\3\2\2\2\n\60\3\2\2\2\f9\3\2\2\2\16L\3\2\2\2\20"+
		"\22\5\6\4\2\21\20\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\5\b\5\2\24"+
		"\23\3\2\2\2\24\25\3\2\2\2\25\31\3\2\2\2\26\30\5\16\b\2\27\26\3\2\2\2\30"+
		"\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34"+
		"\35\7\2\2\3\35\3\3\2\2\2\36\37\7\20\2\2\37 \7\3\2\2 !\7\17\2\2!\"\7\32"+
		"\2\2\"\5\3\2\2\2#\'\7\4\2\2$&\t\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\6\2\2+\7\3\2\2\2,-\7\7\2\2-\t\3\2\2"+
		"\2.\61\7\17\2\2/\61\5\f\7\2\60.\3\2\2\2\60/\3\2\2\2\61\67\3\2\2\2\62\65"+
		"\7\21\2\2\63\66\7\17\2\2\64\66\5\f\7\2\65\63\3\2\2\2\65\64\3\2\2\2\66"+
		"8\3\2\2\2\67\62\3\2\2\2\678\3\2\2\28\13\3\2\2\29=\t\2\2\2:<\t\3\2\2;:"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@G\7\t\2\2A"+
		"C\5\n\6\2BD\7\n\2\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\13\2\2K\r\3\2\2\2LO\5\f\7"+
		"\2MN\7\f\2\2NP\5\n\6\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QW\7\r\2\2RS\5\n\6"+
		"\2ST\7\32\2\2TV\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2"+
		"\2\2YW\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17"+
		"\3\2\2\2_]\3\2\2\2\17\21\24\31\'\60\65\67=CGOW]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}