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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Atom=9, 
		Type=10, Var=11, Op=12, Float=13, Integer=14, Char=15, String=16, List=17, 
		Tuple=18, Comment=19, WS=20, Endl=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "DGT", 
			"UPPER", "LOWER", "Atom", "Type", "Var", "Op", "Float", "Integer", "Char", 
			"String", "List", "Tuple", "Comment", "WS", "Endl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'_'", "'@'", "'('", "','", "')'", "'when'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "Atom", "Type", 
			"Var", "Op", "Float", "Integer", "Char", "String", "List", "Tuple", "Comment", 
			"WS", "Endl"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00fe\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\rS\n"+
		"\r\f\r\16\rV\13\r\3\r\3\r\3\r\3\r\5\r\\\n\r\3\r\7\r_\n\r\f\r\16\rb\13"+
		"\r\3\r\5\re\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16m\n\16\3\17\3\17\5\17"+
		"q\n\17\3\17\3\17\3\17\3\17\7\17w\n\17\f\17\16\17z\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0086\n\20\3\21\5\21\u0089\n"+
		"\21\3\21\6\21\u008c\n\21\r\21\16\21\u008d\3\21\3\21\6\21\u0092\n\21\r"+
		"\21\16\21\u0093\3\21\3\21\5\21\u0098\n\21\3\21\6\21\u009b\n\21\r\21\16"+
		"\21\u009c\5\21\u009f\n\21\3\22\5\22\u00a2\n\22\3\22\6\22\u00a5\n\22\r"+
		"\22\16\22\u00a6\3\22\3\22\3\22\6\22\u00ac\n\22\r\22\16\22\u00ad\5\22\u00b0"+
		"\n\22\3\23\3\23\5\23\u00b4\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc"+
		"\n\23\3\24\3\24\3\24\3\24\5\24\u00c2\n\24\3\24\7\24\u00c5\n\24\f\24\16"+
		"\24\u00c8\13\24\3\24\3\24\3\25\3\25\5\25\u00ce\n\25\3\25\5\25\u00d1\n"+
		"\25\7\25\u00d3\n\25\f\25\16\25\u00d6\13\25\3\25\3\25\3\26\3\26\5\26\u00dc"+
		"\n\26\3\26\5\26\u00df\n\26\7\26\u00e1\n\26\f\26\16\26\u00e4\13\26\3\26"+
		"\3\26\3\27\3\27\7\27\u00ea\n\27\f\27\16\27\u00ed\13\27\3\27\5\27\u00f0"+
		"\n\27\3\27\3\27\3\27\3\27\3\30\6\30\u00f7\n\30\r\30\16\30\u00f8\3\30\3"+
		"\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2"+
		"\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\3\2\20\3"+
		"\2\62;\3\2C\\\3\2c|\4\2BBaa\3\2^^\4\2))^^\6\2,-//\61\61@@\4\2GGgg\4\2"+
		"--//\4\2C\\c|\4\2\f\f\17\17\4\2$$^^\4\2\2\"\u0082\u00a2\5\2..\60\60=="+
		"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5"+
		"\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2"+
		"\21D\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31d\3\2\2\2\33l\3\2\2"+
		"\2\35p\3\2\2\2\37\u0085\3\2\2\2!\u0088\3\2\2\2#\u00a1\3\2\2\2%\u00b1\3"+
		"\2\2\2\'\u00bd\3\2\2\2)\u00cb\3\2\2\2+\u00d9\3\2\2\2-\u00e7\3\2\2\2/\u00f6"+
		"\3\2\2\2\61\u00fc\3\2\2\2\63\64\7?\2\2\64\4\3\2\2\2\65\66\7a\2\2\66\6"+
		"\3\2\2\2\678\7B\2\28\b\3\2\2\29:\7*\2\2:\n\3\2\2\2;<\7.\2\2<\f\3\2\2\2"+
		"=>\7+\2\2>\16\3\2\2\2?@\7y\2\2@A\7j\2\2AB\7g\2\2BC\7p\2\2C\20\3\2\2\2"+
		"DE\7/\2\2EF\7@\2\2F\22\3\2\2\2GH\t\2\2\2H\24\3\2\2\2IJ\t\3\2\2J\26\3\2"+
		"\2\2KL\t\4\2\2L\30\3\2\2\2MT\5\27\f\2NS\5\23\n\2OS\5\27\f\2PS\5\25\13"+
		"\2QS\t\5\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2Ue\3\2\2\2VT\3\2\2\2W`\7)\2\2X[\7^\2\2Y\\\n\6\2\2Z\\\7^\2"+
		"\2[Y\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2]_\n\7\2\2^X\3\2\2\2^]\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2ce\7)\2\2dM\3\2\2\2dW\3\2"+
		"\2\2e\32\3\2\2\2fm\5#\22\2gm\5%\23\2hm\5\'\24\2im\5!\21\2jm\5)\25\2km"+
		"\5+\26\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m"+
		"\34\3\2\2\2nq\5\25\13\2oq\7a\2\2pn\3\2\2\2po\3\2\2\2qx\3\2\2\2rw\5\23"+
		"\n\2sw\5\27\f\2tw\5\25\13\2uw\t\5\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\36\3\2\2\2zx\3\2\2\2{\u0086\t"+
		"\b\2\2|}\7@\2\2}\u0086\7?\2\2~\u0086\7>\2\2\177\u0080\7>\2\2\u0080\u0086"+
		"\7?\2\2\u0081\u0082\7?\2\2\u0082\u0086\7?\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\u0086\7?\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085~\3\2\2\2\u0085\177\3"+
		"\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086 \3\2\2\2\u0087\u0089"+
		"\7/\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u008c\5\23\n\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\60\2\2\u0090"+
		"\u0092\5\23\n\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u009e\3\2\2\2\u0095\u0097\t\t\2\2\u0096"+
		"\u0098\t\n\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u009b\5\23\n\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0095\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\"\3\2\2\2\u00a0\u00a2\7/\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\5\23\n\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00af\3\2\2\2\u00a8\u00ab\7%\2\2\u00a9\u00ac\5\23\n\2\u00aa"+
		"\u00ac\t\13\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00a8\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0$\3\2\2\2\u00b1\u00bb\7&\2\2\u00b2"+
		"\u00b4\7^\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00bc\n\f\2\2\u00b6\u00b7\7^\2\2\u00b7\u00b8\5\23\n\2\u00b8"+
		"\u00b9\5\23\n\2\u00b9\u00ba\5\23\n\2\u00ba\u00bc\3\2\2\2\u00bb\u00b3\3"+
		"\2\2\2\u00bb\u00b6\3\2\2\2\u00bc&\3\2\2\2\u00bd\u00c6\7$\2\2\u00be\u00c1"+
		"\7^\2\2\u00bf\u00c2\n\6\2\2\u00c0\u00c2\7^\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\n\r\2\2\u00c4\u00be\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7$"+
		"\2\2\u00ca(\3\2\2\2\u00cb\u00d4\7]\2\2\u00cc\u00ce\5\33\16\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\7.\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7_\2\2\u00d8*\3\2\2\2\u00d9"+
		"\u00e2\7}\2\2\u00da\u00dc\5\33\16\2\u00db\u00da\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\7.\2\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\177\2\2\u00e6,\3\2\2\2\u00e7\u00eb\7\'\2"+
		"\2\u00e8\u00ea\n\f\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\7\17\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\27\2\2\u00f4"+
		".\3\2\2\2\u00f5\u00f7\t\16\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\b\30\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\t\17\2\2\u00fd\62\3\2\2\2\'\2R"+
		"T[^`dlpvx\u0085\u0088\u008d\u0093\u0097\u009c\u009e\u00a1\u00a6\u00ab"+
		"\u00ad\u00af\u00b3\u00bb\u00c1\u00c4\u00c6\u00cd\u00d0\u00d4\u00db\u00de"+
		"\u00e2\u00eb\u00ef\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}