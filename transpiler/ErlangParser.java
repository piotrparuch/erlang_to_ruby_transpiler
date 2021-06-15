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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, Dot=21, Left_bracket=22, Right_bracket=23, 
		OK=24, Input=25, Output=26, Endl=27, Name=28, Var=29, Op=30, Integer=31, 
		Float=32, String=33, Char=34, WS=35, Comment=36;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_module = 2, RULE_compile = 3, RULE_read = 4, 
		RULE_print = 5, RULE_operation = 6, RULE_list = 7, RULE_tuple = 8, RULE_map = 9, 
		RULE_declaration = 10, RULE_expr = 11, RULE_arg = 12, RULE_funcName = 13, 
		RULE_guard = 14, RULE_line = 15, RULE_body = 16, RULE_if_stat = 17, RULE_func = 18, 
		RULE_funcDec = 19, RULE_main = 20, RULE_map_to_list = 21, RULE_list_reverse = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "module", "compile", "read", "print", "operation", 
			"list", "tuple", "map", "declaration", "expr", "arg", "funcName", "guard", 
			"line", "body", "if_stat", "func", "funcDec", "main", "map_to_list", 
			"list_reverse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-module'", "'-compile'", "'export_all'", "','", "'['", "']'", 
			"'{'", "'}'", "'#{'", "' => '", "'='", "'when'", "'if'", "'->'", "';'", 
			"'true'", "'end'", "'main() ->'", "'maps:to_list('", "'lists:reverse('", 
			"'.'", "'('", "')'", "'ok'", "'io:read'", "'io:format'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Dot", "Left_bracket", 
			"Right_bracket", "OK", "Input", "Output", "Endl", "Name", "Var", "Op", 
			"Integer", "Float", "String", "Char", "WS", "Comment"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(46);
				module();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(49);
				compile();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << Name))) != 0)) {
				{
				{
				setState(52);
				funcDec();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			main();
			setState(59);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(ErlangParser.Integer, 0); }
		public TerminalNode Char() { return getToken(ErlangParser.Char, 0); }
		public TerminalNode String() { return getToken(ErlangParser.String, 0); }
		public TerminalNode Float() { return getToken(ErlangParser.Float, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0)) ) {
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode Left_bracket() { return getToken(ErlangParser.Left_bracket, 0); }
		public TerminalNode Name() { return getToken(ErlangParser.Name, 0); }
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public TerminalNode Dot() { return getToken(ErlangParser.Dot, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			match(Left_bracket);
			setState(65);
			match(Name);
			setState(66);
			match(Right_bracket);
			setState(67);
			match(Dot);
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
		public TerminalNode Left_bracket() { return getToken(ErlangParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public TerminalNode Dot() { return getToken(ErlangParser.Dot, 0); }
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
			setState(69);
			match(T__1);
			setState(70);
			match(Left_bracket);
			setState(71);
			match(T__2);
			setState(72);
			match(Right_bracket);
			setState(73);
			match(Dot);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode Input() { return getToken(ErlangParser.Input, 0); }
		public TerminalNode Left_bracket() { return getToken(ErlangParser.Left_bracket, 0); }
		public TerminalNode String() { return getToken(ErlangParser.String, 0); }
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Input);
			setState(76);
			match(Left_bracket);
			setState(77);
			match(String);
			setState(78);
			match(Right_bracket);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Output() { return getToken(ErlangParser.Output, 0); }
		public TerminalNode Left_bracket() { return getToken(ErlangParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<FuncNameContext> funcName() {
			return getRuleContexts(FuncNameContext.class);
		}
		public FuncNameContext funcName(int i) {
			return getRuleContext(FuncNameContext.class,i);
		}
		public List<TerminalNode> Var() { return getTokens(ErlangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(ErlangParser.Var, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Output);
			setState(81);
			match(Left_bracket);
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case Char:
				{
				setState(82);
				type();
				}
				break;
			case T__18:
			case T__19:
			case Name:
				{
				setState(83);
				funcName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(86);
				match(T__3);
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Char:
					{
					setState(87);
					type();
					}
					break;
				case Var:
					{
					setState(88);
					match(Var);
					}
					break;
				case T__4:
					{
					setState(89);
					list();
					}
					break;
				case T__8:
					{
					setState(90);
					map();
					}
					break;
				case T__18:
				case T__19:
				case Name:
					{
					setState(91);
					funcName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(Right_bracket);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode Op() { return getToken(ErlangParser.Op, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Var() { return getTokens(ErlangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(ErlangParser.Var, i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case Char:
				{
				setState(101);
				type();
				}
				break;
			case Var:
				{
				setState(102);
				match(Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			match(Op);
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case Char:
				{
				setState(106);
				type();
				}
				break;
			case Var:
				{
				setState(107);
				match(Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Var() { return getTokens(ErlangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(ErlangParser.Var, i);
		}
		public List<TerminalNode> OK() { return getTokens(ErlangParser.OK); }
		public TerminalNode OK(int i) {
			return getToken(ErlangParser.OK, i);
		}
		public List<FuncNameContext> funcName() {
			return getRuleContexts(FuncNameContext.class);
		}
		public FuncNameContext funcName(int i) {
			return getRuleContext(FuncNameContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__4);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << OK) | (1L << Name) | (1L << Var) | (1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0)) {
				{
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Char:
					{
					setState(111);
					type();
					}
					break;
				case Var:
					{
					setState(112);
					match(Var);
					}
					break;
				case OK:
					{
					setState(113);
					match(OK);
					}
					break;
				case T__18:
				case T__19:
				case Name:
					{
					setState(114);
					funcName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(117);
					match(T__3);
					}
				}

				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__5);
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

	public static class TupleContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Var() { return getTokens(ErlangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(ErlangParser.Var, i);
		}
		public List<TerminalNode> OK() { return getTokens(ErlangParser.OK); }
		public TerminalNode OK(int i) {
			return getToken(ErlangParser.OK, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OK) | (1L << Var) | (1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0)) {
				{
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Char:
					{
					setState(128);
					type();
					}
					break;
				case Var:
					{
					setState(129);
					match(Var);
					}
					break;
				case OK:
					{
					setState(130);
					match(OK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(133);
					match(T__3);
					}
				}

				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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

	public static class MapContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Var() { return getTokens(ErlangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(ErlangParser.Var, i);
		}
		public List<TerminalNode> Name() { return getTokens(ErlangParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ErlangParser.Name, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__8);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Name) | (1L << Var) | (1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0)) {
				{
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Char:
					{
					setState(144);
					type();
					}
					break;
				case Var:
					{
					setState(145);
					match(Var);
					}
					break;
				case Name:
					{
					setState(146);
					match(Name);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				match(T__9);
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Char:
					{
					setState(150);
					type();
					}
					break;
				case Var:
					{
					setState(151);
					match(Var);
					}
					break;
				case Name:
					{
					setState(152);
					match(Name);
					}
					break;
				case T__4:
					{
					setState(153);
					list();
					}
					break;
				case T__6:
					{
					setState(154);
					tuple();
					}
					break;
				case T__8:
					{
					setState(155);
					map();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(158);
					match(T__3);
					}
				}

				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ErlangParser.Var, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public Map_to_listContext map_to_list() {
			return getRuleContext(Map_to_listContext.class,0);
		}
		public List_reverseContext list_reverse() {
			return getRuleContext(List_reverseContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(168);
				match(Var);
				}
				break;
			case T__6:
				{
				setState(169);
				tuple();
				}
				break;
			case T__4:
				{
				setState(170);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			match(T__10);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case Char:
				{
				setState(174);
				type();
				}
				break;
			case Input:
				{
				setState(175);
				read();
				}
				break;
			case T__8:
				{
				setState(176);
				map();
				}
				break;
			case T__18:
				{
				setState(177);
				map_to_list();
				}
				break;
			case T__19:
				{
				setState(178);
				list_reverse();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				type();
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

	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Var() { return getToken(ErlangParser.Var, 0); }
		public TerminalNode Name() { return getToken(ErlangParser.Name, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				type();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(Var);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(Name);
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

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(ErlangParser.Name, 0); }
		public TerminalNode Left_bracket() { return getToken(ErlangParser.Left_bracket, 0); }
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public Map_to_listContext map_to_list() {
			return getRuleContext(Map_to_listContext.class,0);
		}
		public List_reverseContext list_reverse() {
			return getRuleContext(List_reverseContext.class,0);
		}
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcName);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(Name);
				setState(193);
				match(Left_bracket);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Name) | (1L << Var) | (1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0)) {
					{
					{
					setState(194);
					arg();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(195);
						match(T__3);
						}
					}

					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(Right_bracket);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				map_to_list();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				list_reverse();
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

	public static class GuardContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitGuard(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__11);
			setState(209);
			expr();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(210);
				match(T__3);
				setState(211);
				expr();
				}
				}
				setState(216);
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

	public static class LineContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public TerminalNode Name() { return getToken(ErlangParser.Name, 0); }
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(217);
				expr();
				}
				break;
			case 2:
				{
				setState(218);
				if_stat();
				}
				break;
			case 3:
				{
				setState(219);
				match(Name);
				}
				break;
			case 4:
				{
				setState(220);
				funcName();
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

	public static class BodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__12) | (1L << T__18) | (1L << T__19) | (1L << Output) | (1L << Name) | (1L << Var) | (1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0)) {
				{
				{
				setState(223);
				line();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(224);
					match(T__3);
					}
				}

				}
				}
				setState(231);
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

	public static class If_statContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__12);
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				operation();
				setState(234);
				match(T__13);
				setState(235);
				expr();
				setState(236);
				match(T__14);
				}
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << Integer) | (1L << Float) | (1L << String) | (1L << Char))) != 0) );
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(242);
				match(T__15);
				setState(243);
				match(T__13);
				setState(244);
				expr();
				}
			}

			setState(247);
			match(T__16);
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
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
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
		enterRule(_localctx, 36, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			funcName();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(250);
				guard();
				}
			}

			setState(253);
			match(T__13);
			setState(254);
			body();
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
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public TerminalNode Dot() { return getToken(ErlangParser.Dot, 0); }
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
		enterRule(_localctx, 38, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			func();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(257);
				match(T__14);
				setState(258);
				func();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(Dot);
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

	public static class MainContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ErlangParser.Dot, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__17);
			setState(267);
			body();
			setState(268);
			match(Dot);
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

	public static class Map_to_listContext extends ParserRuleContext {
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public TerminalNode Var() { return getToken(ErlangParser.Var, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public Map_to_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_to_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMap_to_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMap_to_list(this);
		}
	}

	public final Map_to_listContext map_to_list() throws RecognitionException {
		Map_to_listContext _localctx = new Map_to_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_map_to_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__18);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(271);
				match(Var);
				}
				break;
			case T__8:
				{
				setState(272);
				map();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			match(Right_bracket);
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

	public static class List_reverseContext extends ParserRuleContext {
		public TerminalNode Right_bracket() { return getToken(ErlangParser.Right_bracket, 0); }
		public TerminalNode Var() { return getToken(ErlangParser.Var, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_reverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_reverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterList_reverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitList_reverse(this);
		}
	}

	public final List_reverseContext list_reverse() throws RecognitionException {
		List_reverseContext _localctx = new List_reverseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list_reverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__19);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(278);
				match(Var);
				}
				break;
			case T__4:
				{
				setState(279);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			match(Right_bracket);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\5\2\65\n\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\5\7W\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\7\7a\n\7\f\7\16"+
		"\7d\13\7\3\7\3\7\3\b\3\b\5\bj\n\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\5\tv\n\t\3\t\5\ty\n\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0086\n\n\3\n\5\n\u0089\n\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u009f\n\13\3\13\5\13\u00a2\n\13\7\13\u00a4\n\13\f\13\16"+
		"\13\u00a7\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00b6\n\f\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\5\16"+
		"\u00c1\n\16\3\17\3\17\3\17\3\17\5\17\u00c7\n\17\7\17\u00c9\n\17\f\17\16"+
		"\17\u00cc\13\17\3\17\3\17\3\17\5\17\u00d1\n\17\3\20\3\20\3\20\3\20\7\20"+
		"\u00d7\n\20\f\20\16\20\u00da\13\20\3\21\3\21\3\21\3\21\5\21\u00e0\n\21"+
		"\3\22\3\22\5\22\u00e4\n\22\7\22\u00e6\n\22\f\22\16\22\u00e9\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\6\23\u00f1\n\23\r\23\16\23\u00f2\3\23\3\23\3"+
		"\23\5\23\u00f8\n\23\3\23\3\23\3\24\3\24\5\24\u00fe\n\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u0106\n\25\f\25\16\25\u0109\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0114\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u011b\n\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\3\3\2!$\2\u013f\2\61\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\b"+
		"G\3\2\2\2\nM\3\2\2\2\fR\3\2\2\2\16i\3\2\2\2\20p\3\2\2\2\22\u0081\3\2\2"+
		"\2\24\u0091\3\2\2\2\26\u00ad\3\2\2\2\30\u00bb\3\2\2\2\32\u00c0\3\2\2\2"+
		"\34\u00d0\3\2\2\2\36\u00d2\3\2\2\2 \u00df\3\2\2\2\"\u00e7\3\2\2\2$\u00ea"+
		"\3\2\2\2&\u00fb\3\2\2\2(\u0102\3\2\2\2*\u010c\3\2\2\2,\u0110\3\2\2\2."+
		"\u0117\3\2\2\2\60\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2"+
		"\63\65\5\b\5\2\64\63\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\668\5(\25\2\67"+
		"\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5*\26"+
		"\2=>\7\2\2\3>\3\3\2\2\2?@\t\2\2\2@\5\3\2\2\2AB\7\3\2\2BC\7\30\2\2CD\7"+
		"\36\2\2DE\7\31\2\2EF\7\27\2\2F\7\3\2\2\2GH\7\4\2\2HI\7\30\2\2IJ\7\5\2"+
		"\2JK\7\31\2\2KL\7\27\2\2L\t\3\2\2\2MN\7\33\2\2NO\7\30\2\2OP\7#\2\2PQ\7"+
		"\31\2\2Q\13\3\2\2\2RS\7\34\2\2SV\7\30\2\2TW\5\4\3\2UW\5\34\17\2VT\3\2"+
		"\2\2VU\3\2\2\2Wb\3\2\2\2X^\7\6\2\2Y_\5\4\3\2Z_\7\37\2\2[_\5\20\t\2\\_"+
		"\5\24\13\2]_\5\34\17\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2"+
		"\2\2_a\3\2\2\2`X\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2"+
		"\2\2ef\7\31\2\2f\r\3\2\2\2gj\5\4\3\2hj\7\37\2\2ig\3\2\2\2ih\3\2\2\2jk"+
		"\3\2\2\2kn\7 \2\2lo\5\4\3\2mo\7\37\2\2nl\3\2\2\2nm\3\2\2\2o\17\3\2\2\2"+
		"p|\7\7\2\2qv\5\4\3\2rv\7\37\2\2sv\7\32\2\2tv\5\34\17\2uq\3\2\2\2ur\3\2"+
		"\2\2us\3\2\2\2ut\3\2\2\2vx\3\2\2\2wy\7\6\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2"+
		"\2\2zu\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\b\2\2\u0080\21\3\2\2\2\u0081\u008c\7\t\2\2\u0082\u0086\5\4\3"+
		"\2\u0083\u0086\7\37\2\2\u0084\u0086\7\32\2\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\7\6"+
		"\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0085\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\n\2\2\u0090"+
		"\23\3\2\2\2\u0091\u00a5\7\13\2\2\u0092\u0096\5\4\3\2\u0093\u0096\7\37"+
		"\2\2\u0094\u0096\7\36\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009e\7\f\2\2\u0098\u009f\5\4"+
		"\3\2\u0099\u009f\7\37\2\2\u009a\u009f\7\36\2\2\u009b\u009f\5\20\t\2\u009c"+
		"\u009f\5\22\n\2\u009d\u009f\5\24\13\2\u009e\u0098\3\2\2\2\u009e\u0099"+
		"\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\7\6\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0095\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\n\2\2\u00a9\25\3\2\2\2\u00aa\u00ae"+
		"\7\37\2\2\u00ab\u00ae\5\22\n\2\u00ac\u00ae\5\20\t\2\u00ad\u00aa\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b5"+
		"\7\r\2\2\u00b0\u00b6\5\4\3\2\u00b1\u00b6\5\n\6\2\u00b2\u00b6\5\24\13\2"+
		"\u00b3\u00b6\5,\27\2\u00b4\u00b6\5.\30\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\27\3\2\2\2\u00b7\u00bc\5\16\b\2\u00b8\u00bc\5\26\f\2\u00b9\u00bc\5\f"+
		"\7\2\u00ba\u00bc\5\4\3\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00c1\5\4\3"+
		"\2\u00be\u00c1\7\37\2\2\u00bf\u00c1\7\36\2\2\u00c0\u00bd\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\33\3\2\2\2\u00c2\u00c3\7\36\2"+
		"\2\u00c3\u00ca\7\30\2\2\u00c4\u00c6\5\32\16\2\u00c5\u00c7\7\6\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\7\31\2\2\u00ce\u00d1\5"+
		",\27\2\u00cf\u00d1\5.\30\2\u00d0\u00c2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d8\5\30"+
		"\r\2\u00d4\u00d5\7\6\2\2\u00d5\u00d7\5\30\r\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\37\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5\30\r\2\u00dc\u00e0\5$\23\2\u00dd"+
		"\u00e0\7\36\2\2\u00de\u00e0\5\34\17\2\u00df\u00db\3\2\2\2\u00df\u00dc"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0!\3\2\2\2\u00e1"+
		"\u00e3\5 \21\2\u00e2\u00e4\7\6\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00f0\7\17\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00ed\7\20\2\2\u00ed"+
		"\u00ee\5\30\r\2\u00ee\u00ef\7\21\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f7\3\2\2\2\u00f4\u00f5\7\22\2\2\u00f5\u00f6\7\20\2\2\u00f6\u00f8\5"+
		"\30\r\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7\23\2\2\u00fa%\3\2\2\2\u00fb\u00fd\5\34\17\2\u00fc\u00fe\5\36"+
		"\20\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7\20\2\2\u0100\u0101\5\"\22\2\u0101\'\3\2\2\2\u0102\u0107\5&\24"+
		"\2\u0103\u0104\7\21\2\2\u0104\u0106\5&\24\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\27\2\2\u010b)\3\2\2\2\u010c\u010d"+
		"\7\24\2\2\u010d\u010e\5\"\22\2\u010e\u010f\7\27\2\2\u010f+\3\2\2\2\u0110"+
		"\u0113\7\25\2\2\u0111\u0114\7\37\2\2\u0112\u0114\5\24\13\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\31\2\2"+
		"\u0116-\3\2\2\2\u0117\u011a\7\26\2\2\u0118\u011b\7\37\2\2\u0119\u011b"+
		"\5\20\t\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011d\7\31\2\2\u011d/\3\2\2\2%\61\649V^binux|\u0085\u0088\u008c"+
		"\u0095\u009e\u00a1\u00a5\u00ad\u00b5\u00bb\u00c0\u00c6\u00ca\u00d0\u00d8"+
		"\u00df\u00e3\u00e7\u00f2\u00f7\u00fd\u0107\u0113\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}