// Generated from Erlang.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DGT=11, Module_name=12, Atom=13, Type=14, Var=15, Op=16, Float=17, 
		Integer=18, Char=19, String=20, OK=21, List=22, Tuple=23, Input=24, Output=25, 
		Comment=26, WS=27, Endl=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "DGT", "UPPER", "LOWER", "Module_name", "Atom", "Type", "Var", 
			"Op", "Float", "Integer", "Char", "String", "OK", "List", "Tuple", "Input", 
			"Output", "Comment", "WS", "Endl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'-module('", "').'", "'-compile(export_all).'", "'('", 
			"')'", "','", "'when'", "'->'", "';'", null, null, null, null, null, 
			null, null, null, null, null, "'ok'", null, null, "'io:read'", "'io:format'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "DGT", 
			"Module_name", "Atom", "Type", "Var", "Op", "Float", "Integer", "Char", 
			"String", "OK", "List", "Tuple", "Input", "Output", "Comment", "WS", 
			"Endl"
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
	public String getGrammarFileName() { return "Erlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17|\n\17\3\17\3\17\3\17\3\17\7\17\u0082"+
		"\n\17\f\17\16\17\u0085\13\17\3\20\3\20\3\20\3\20\3\20\7\20\u008c\n\20"+
		"\f\20\16\20\u008f\13\20\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\20\7\20"+
		"\u0098\n\20\f\20\16\20\u009b\13\20\3\20\5\20\u009e\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a6\n\21\3\22\3\22\5\22\u00aa\n\22\3\22\3\22\3"+
		"\22\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bf\n\23\3\24\5\24\u00c2\n\24\3\24"+
		"\6\24\u00c5\n\24\r\24\16\24\u00c6\3\24\3\24\6\24\u00cb\n\24\r\24\16\24"+
		"\u00cc\3\24\3\24\5\24\u00d1\n\24\3\24\6\24\u00d4\n\24\r\24\16\24\u00d5"+
		"\5\24\u00d8\n\24\3\25\5\25\u00db\n\25\3\25\6\25\u00de\n\25\r\25\16\25"+
		"\u00df\3\25\3\25\3\25\6\25\u00e5\n\25\r\25\16\25\u00e6\5\25\u00e9\n\25"+
		"\3\26\3\26\5\26\u00ed\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f5\n"+
		"\26\3\27\3\27\3\27\3\27\5\27\u00fb\n\27\3\27\7\27\u00fe\n\27\f\27\16\27"+
		"\u0101\13\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u010c\n"+
		"\31\3\31\5\31\u010f\n\31\7\31\u0111\n\31\f\31\16\31\u0114\13\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\5\32\u011c\n\32\3\32\5\32\u011f\n\32\7\32\u0121"+
		"\n\32\f\32\16\32\u0124\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7"+
		"\35\u013c\n\35\f\35\16\35\u013f\13\35\3\35\5\35\u0142\n\35\3\35\3\35\3"+
		"\35\3\35\3\36\6\36\u0149\n\36\r\36\16\36\u014a\3\36\3\36\3\37\3\37\2\2"+
		" \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\16\37"+
		"\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35="+
		"\36\3\2\20\3\2\62;\3\2C\\\3\2c|\4\2BBaa\3\2^^\4\2))^^\6\2,-//\61\61@@"+
		"\4\2GGgg\4\2--//\4\2C\\c|\4\2\f\f\17\17\4\2$$^^\4\2\2\"\u0082\u00a2\5"+
		"\2..\60\60==\2\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7J\3\2\2\2\tM\3\2\2\2\13c\3\2\2\2\r"+
		"e\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23n\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2"+
		"\31u\3\2\2\2\33w\3\2\2\2\35{\3\2\2\2\37\u009d\3\2\2\2!\u00a5\3\2\2\2#"+
		"\u00a9\3\2\2\2%\u00be\3\2\2\2\'\u00c1\3\2\2\2)\u00da\3\2\2\2+\u00ea\3"+
		"\2\2\2-\u00f6\3\2\2\2/\u0104\3\2\2\2\61\u0107\3\2\2\2\63\u0117\3\2\2\2"+
		"\65\u0127\3\2\2\2\67\u012f\3\2\2\29\u0139\3\2\2\2;\u0148\3\2\2\2=\u014e"+
		"\3\2\2\2?@\7?\2\2@\4\3\2\2\2AB\7/\2\2BC\7o\2\2CD\7q\2\2DE\7f\2\2EF\7w"+
		"\2\2FG\7n\2\2GH\7g\2\2HI\7*\2\2I\6\3\2\2\2JK\7+\2\2KL\7\60\2\2L\b\3\2"+
		"\2\2MN\7/\2\2NO\7e\2\2OP\7q\2\2PQ\7o\2\2QR\7r\2\2RS\7k\2\2ST\7n\2\2TU"+
		"\7g\2\2UV\7*\2\2VW\7g\2\2WX\7z\2\2XY\7r\2\2YZ\7q\2\2Z[\7t\2\2[\\\7v\2"+
		"\2\\]\7a\2\2]^\7c\2\2^_\7n\2\2_`\7n\2\2`a\7+\2\2ab\7\60\2\2b\n\3\2\2\2"+
		"cd\7*\2\2d\f\3\2\2\2ef\7+\2\2f\16\3\2\2\2gh\7.\2\2h\20\3\2\2\2ij\7y\2"+
		"\2jk\7j\2\2kl\7g\2\2lm\7p\2\2m\22\3\2\2\2no\7/\2\2op\7@\2\2p\24\3\2\2"+
		"\2qr\7=\2\2r\26\3\2\2\2st\t\2\2\2t\30\3\2\2\2uv\t\3\2\2v\32\3\2\2\2wx"+
		"\t\4\2\2x\34\3\2\2\2y|\5\33\16\2z|\7a\2\2{y\3\2\2\2{z\3\2\2\2|\u0083\3"+
		"\2\2\2}\u0082\5\27\f\2~\u0082\5\33\16\2\177\u0082\5\31\r\2\u0080\u0082"+
		"\t\5\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\36\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008d\5\33\16\2\u0087\u008c\5\27"+
		"\f\2\u0088\u008c\5\33\16\2\u0089\u008c\5\31\r\2\u008a\u008c\t\5\2\2\u008b"+
		"\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u009e\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0099\7)\2\2\u0091\u0094\7^\2"+
		"\2\u0092\u0095\n\6\2\2\u0093\u0095\7^\2\2\u0094\u0092\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0098\n\7\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7)\2\2\u009d"+
		"\u0086\3\2\2\2\u009d\u0090\3\2\2\2\u009e \3\2\2\2\u009f\u00a6\5)\25\2"+
		"\u00a0\u00a6\5+\26\2\u00a1\u00a6\5-\27\2\u00a2\u00a6\5\'\24\2\u00a3\u00a6"+
		"\5\61\31\2\u00a4\u00a6\5\63\32\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2"+
		"\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\"\3\2\2\2\u00a7\u00aa\5\31\r\2\u00a8\u00aa\7a\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00b0\5\27"+
		"\f\2\u00ac\u00b0\5\33\16\2\u00ad\u00b0\5\31\r\2\u00ae\u00b0\t\5\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"$\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00bf\t\b\2\2\u00b5\u00b6\7@\2\2\u00b6"+
		"\u00bf\7?\2\2\u00b7\u00bf\7>\2\2\u00b8\u00b9\7>\2\2\u00b9\u00bf\7?\2\2"+
		"\u00ba\u00bb\7?\2\2\u00bb\u00bf\7?\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00bf"+
		"\7?\2\2\u00be\u00b4\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b7\3\2\2\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf&\3\2\2\2"+
		"\u00c0\u00c2\7/\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c5\5\27\f\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca"+
		"\7\60\2\2\u00c9\u00cb\5\27\f\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d7\3\2\2\2\u00ce\u00d0"+
		"\t\t\2\2\u00cf\u00d1\t\n\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\5\27\f\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00ce\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8(\3\2\2\2\u00d9\u00db\7/\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5\27"+
		"\f\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e8\3\2\2\2\u00e1\u00e4\7%\2\2\u00e2\u00e5\5\27"+
		"\f\2\u00e3\u00e5\t\13\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9*\3\2\2\2\u00ea\u00f4"+
		"\7&\2\2\u00eb\u00ed\7^\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f5\n\f\2\2\u00ef\u00f0\7^\2\2\u00f0\u00f1\5\27"+
		"\f\2\u00f1\u00f2\5\27\f\2\u00f2\u00f3\5\27\f\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00ec\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5,\3\2\2\2\u00f6\u00ff\7$\2\2\u00f7"+
		"\u00fa\7^\2\2\u00f8\u00fb\n\6\2\2\u00f9\u00fb\7^\2\2\u00fa\u00f8\3\2\2"+
		"\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\n\r\2\2\u00fd\u00f7"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7$"+
		"\2\2\u0103.\3\2\2\2\u0104\u0105\7q\2\2\u0105\u0106\7m\2\2\u0106\60\3\2"+
		"\2\2\u0107\u0112\7]\2\2\u0108\u010c\5!\21\2\u0109\u010c\5#\22\2\u010a"+
		"\u010c\5/\30\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\7.\2\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010b\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7_\2\2\u0116\62\3\2\2\2"+
		"\u0117\u0122\7}\2\2\u0118\u011c\5!\21\2\u0119\u011c\5#\22\2\u011a\u011c"+
		"\5/\30\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\7.\2\2\u011e\u011d\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\177\2\2\u0126\64\3\2\2\2\u0127"+
		"\u0128\7k\2\2\u0128\u0129\7q\2\2\u0129\u012a\7<\2\2\u012a\u012b\7t\2\2"+
		"\u012b\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e\7f\2\2\u012e\66\3\2"+
		"\2\2\u012f\u0130\7k\2\2\u0130\u0131\7q\2\2\u0131\u0132\7<\2\2\u0132\u0133"+
		"\7h\2\2\u0133\u0134\7q\2\2\u0134\u0135\7t\2\2\u0135\u0136\7o\2\2\u0136"+
		"\u0137\7c\2\2\u0137\u0138\7v\2\2\u01388\3\2\2\2\u0139\u013d\7\'\2\2\u013a"+
		"\u013c\n\f\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0142\7\17\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143\u0144\7\f\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\35\2\2\u0146"+
		":\3\2\2\2\u0147\u0149\t\16\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\b\36\2\2\u014d<\3\2\2\2\u014e\u014f\t\17\2\2\u014f>\3\2\2\2*\2{\u0081"+
		"\u0083\u008b\u008d\u0094\u0097\u0099\u009d\u00a5\u00a9\u00af\u00b1\u00be"+
		"\u00c1\u00c6\u00cc\u00d0\u00d5\u00d7\u00da\u00df\u00e4\u00e6\u00e8\u00ec"+
		"\u00f4\u00fa\u00fd\u00ff\u010b\u010e\u0112\u011b\u011e\u0122\u013d\u0141"+
		"\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}