// Generated from c:\Users\Piter\Documents\Studja\sem6\tkik\erlang_to_ruby_transpiler\erlang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ErlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AtomToken=1, VarToken=2, FloatToken=3, IntegerToken=4, CharToken=5, StringToken=6, 
		AttrName=7, Comment=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DGT", "UPPER", "LOWER", "AtomToken", "VarToken", "FloatToken", "IntegerToken", 
			"CharToken", "StringToken", "AttrName", "Comment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AtomToken", "VarToken", "FloatToken", "IntegerToken", "CharToken", 
			"StringToken", "AttrName", "Comment", "WS"
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


	public ErlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "erlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\'\n\5\f\5\16\5*\13\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\7\5\63\n\5\f\5"+
		"\16\5\66\13\5\3\5\5\59\n\5\3\6\3\6\5\6=\n\6\3\6\3\6\3\6\3\6\7\6C\n\6\f"+
		"\6\16\6F\13\6\3\7\5\7I\n\7\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\6\7R\n\7\r\7"+
		"\16\7S\3\7\3\7\5\7X\n\7\3\7\6\7[\n\7\r\7\16\7\\\5\7_\n\7\3\b\5\bb\n\b"+
		"\3\b\6\be\n\b\r\b\16\bf\3\b\3\b\3\b\6\bl\n\b\r\b\16\bm\5\bp\n\b\3\t\3"+
		"\t\5\tt\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\5\n\u0082"+
		"\n\n\3\n\7\n\u0085\n\n\f\n\16\n\u0088\13\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f"+
		"\7\f\u009d\n\f\f\f\16\f\u00a0\13\f\3\f\5\f\u00a3\n\f\3\f\3\f\3\f\3\f\3"+
		"\r\6\r\u00aa\n\r\r\r\16\r\u00ab\3\r\3\r\2\2\16\3\2\5\2\7\2\t\3\13\4\r"+
		"\5\17\6\21\7\23\b\25\t\27\n\31\13\3\2\16\3\2\62;\3\2C\\\3\2c|\4\2BBaa"+
		"\3\2^^\4\2))^^\4\2GGgg\4\2--//\4\2C\\c|\4\2\f\f\17\17\4\2$$^^\4\2\2\""+
		"\u0082\u00a2\2\u00cc\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33"+
		"\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t8\3\2\2\2\13<\3\2\2\2\rH\3\2\2\2\17"+
		"a\3\2\2\2\21q\3\2\2\2\23}\3\2\2\2\25\u008b\3\2\2\2\27\u009a\3\2\2\2\31"+
		"\u00a9\3\2\2\2\33\34\t\2\2\2\34\4\3\2\2\2\35\36\t\3\2\2\36\6\3\2\2\2\37"+
		" \t\4\2\2 \b\3\2\2\2!(\5\7\4\2\"\'\5\3\2\2#\'\5\7\4\2$\'\5\5\3\2%\'\t"+
		"\5\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2)9\3\2\2\2*(\3\2\2\2+\64\7)\2\2,/\7^\2\2-\60\n\6\2\2.\60\7^\2"+
		"\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61\63\n\7\2\2\62,\3\2\2\2\62\61\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3"+
		"\2\2\2\679\7)\2\28!\3\2\2\28+\3\2\2\29\n\3\2\2\2:=\5\5\3\2;=\7a\2\2<:"+
		"\3\2\2\2<;\3\2\2\2=D\3\2\2\2>C\5\3\2\2?C\5\7\4\2@C\5\5\3\2AC\t\5\2\2B"+
		">\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"E\f\3\2\2\2FD\3\2\2\2GI\7/\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\3\2\2"+
		"KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7\60\2\2PR\5\3\2"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T^\3\2\2\2UW\t\b\2\2VX\t\t\2"+
		"\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]_\3\2\2\2^U\3\2\2\2^_\3\2\2\2_\16\3\2\2\2`b\7/\2\2a`\3"+
		"\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2go\3\2\2\2hk\7%\2\2il\5\3\2\2jl\t\n\2\2ki\3\2\2\2kj\3\2\2\2lm\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2oh\3\2\2\2op\3\2\2\2p\20\3\2\2\2q"+
		"{\7&\2\2rt\7^\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2u|\n\13\2\2vw\7^\2\2wx"+
		"\5\3\2\2xy\5\3\2\2yz\5\3\2\2z|\3\2\2\2{s\3\2\2\2{v\3\2\2\2|\22\3\2\2\2"+
		"}\u0086\7$\2\2~\u0081\7^\2\2\177\u0082\n\6\2\2\u0080\u0082\7^\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0085\n\f\2"+
		"\2\u0084~\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7$\2\2\u008a\24\3\2\2\2\u008b\u0098\7/\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7r\2\2\u008e\u008f\7g\2\2\u008f\u0099\7e\2\2\u0090\u0091\7e\2\2"+
		"\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7n\2\2\u0094\u0095"+
		"\7d\2\2\u0095\u0096\7c\2\2\u0096\u0097\7e\2\2\u0097\u0099\7m\2\2\u0098"+
		"\u008c\3\2\2\2\u0098\u0090\3\2\2\2\u0099\26\3\2\2\2\u009a\u009e\7\'\2"+
		"\2\u009b\u009d\n\13\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a3\7\17\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\f"+
		"\2\2\u00a7\30\3\2\2\2\u00a8\u00aa\t\r\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\b\r\2\2\u00ae\32\3\2\2\2 \2&(/\62\648<BDHMSW\\^afkmos{\u0081\u0084"+
		"\u0086\u0098\u009e\u00a2\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}