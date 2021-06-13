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
		T__9=10, T__10=11, DGT=12, UPPER=13, LOWER=14, Atom=15, Type=16, Var=17, 
		Op=18, Float=19, Integer=20, Char=21, String=22, List=23, Tuple=24, Comment=25, 
		WS=26, Endl=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "DGT", "UPPER", "LOWER", "Atom", "Type", "Var", "Op", 
			"Float", "Integer", "Char", "String", "List", "Tuple", "Comment", "WS", 
			"Endl"
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
			"DGT", "UPPER", "LOWER", "Atom", "Type", "Var", "Op", "Float", "Integer", 
			"Char", "String", "List", "Tuple", "Comment", "WS", "Endl"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0126\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\7\20{\n\20\f\20\16\20~\13\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0084\n\20\3\20\7\20\u0087\n\20\f\20\16\20\u008a\13\20"+
		"\3\20\5\20\u008d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0095\n\21\3"+
		"\22\3\22\5\22\u0099\n\22\3\22\3\22\3\22\3\22\7\22\u009f\n\22\f\22\16\22"+
		"\u00a2\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ae"+
		"\n\23\3\24\5\24\u00b1\n\24\3\24\6\24\u00b4\n\24\r\24\16\24\u00b5\3\24"+
		"\3\24\6\24\u00ba\n\24\r\24\16\24\u00bb\3\24\3\24\5\24\u00c0\n\24\3\24"+
		"\6\24\u00c3\n\24\r\24\16\24\u00c4\5\24\u00c7\n\24\3\25\5\25\u00ca\n\25"+
		"\3\25\6\25\u00cd\n\25\r\25\16\25\u00ce\3\25\3\25\3\25\6\25\u00d4\n\25"+
		"\r\25\16\25\u00d5\5\25\u00d8\n\25\3\26\3\26\5\26\u00dc\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00e4\n\26\3\27\3\27\3\27\3\27\5\27\u00ea\n"+
		"\27\3\27\7\27\u00ed\n\27\f\27\16\27\u00f0\13\27\3\27\3\27\3\30\3\30\5"+
		"\30\u00f6\n\30\3\30\5\30\u00f9\n\30\7\30\u00fb\n\30\f\30\16\30\u00fe\13"+
		"\30\3\30\3\30\3\31\3\31\5\31\u0104\n\31\3\31\5\31\u0107\n\31\7\31\u0109"+
		"\n\31\f\31\16\31\u010c\13\31\3\31\3\31\3\32\3\32\7\32\u0112\n\32\f\32"+
		"\16\32\u0115\13\32\3\32\5\32\u0118\n\32\3\32\3\32\3\32\3\32\3\33\6\33"+
		"\u011f\n\33\r\33\16\33\u0120\3\33\3\33\3\34\3\34\2\2\35\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\20\3\2\62;\3\2C"+
		"\\\3\2c|\4\2BBaa\3\2^^\4\2))^^\6\2,-//\61\61@@\4\2GGgg\4\2--//\4\2C\\"+
		"c|\4\2\f\f\17\17\4\2$$^^\4\2\2\"\u0082\u00a2\5\2..\60\60==\2\u0155\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2"+
		"\2\7D\3\2\2\2\tF\3\2\2\2\13I\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2"+
		"\2\23e\3\2\2\2\25g\3\2\2\2\27l\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35s\3\2"+
		"\2\2\37\u008c\3\2\2\2!\u0094\3\2\2\2#\u0098\3\2\2\2%\u00ad\3\2\2\2\'\u00b0"+
		"\3\2\2\2)\u00c9\3\2\2\2+\u00d9\3\2\2\2-\u00e5\3\2\2\2/\u00f3\3\2\2\2\61"+
		"\u0101\3\2\2\2\63\u010f\3\2\2\2\65\u011e\3\2\2\2\67\u0124\3\2\2\29:\7"+
		"?\2\2:\4\3\2\2\2;<\7/\2\2<=\7o\2\2=>\7q\2\2>?\7f\2\2?@\7w\2\2@A\7n\2\2"+
		"AB\7g\2\2BC\7*\2\2C\6\3\2\2\2DE\7a\2\2E\b\3\2\2\2FG\7+\2\2GH\7\60\2\2"+
		"H\n\3\2\2\2IJ\7/\2\2JK\7e\2\2KL\7q\2\2LM\7o\2\2MN\7r\2\2NO\7k\2\2OP\7"+
		"n\2\2PQ\7g\2\2QR\7*\2\2RS\7g\2\2ST\7z\2\2TU\7r\2\2UV\7q\2\2VW\7t\2\2W"+
		"X\7v\2\2XY\7a\2\2YZ\7c\2\2Z[\7n\2\2[\\\7n\2\2\\]\7+\2\2]^\7\60\2\2^\f"+
		"\3\2\2\2_`\7B\2\2`\16\3\2\2\2ab\7*\2\2b\20\3\2\2\2cd\7.\2\2d\22\3\2\2"+
		"\2ef\7+\2\2f\24\3\2\2\2gh\7y\2\2hi\7j\2\2ij\7g\2\2jk\7p\2\2k\26\3\2\2"+
		"\2lm\7/\2\2mn\7@\2\2n\30\3\2\2\2op\t\2\2\2p\32\3\2\2\2qr\t\3\2\2r\34\3"+
		"\2\2\2st\t\4\2\2t\36\3\2\2\2u|\5\35\17\2v{\5\31\r\2w{\5\35\17\2x{\5\33"+
		"\16\2y{\t\5\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\u008d\3\2\2\2~|\3\2\2\2\177\u0088\7)\2\2\u0080\u0083"+
		"\7^\2\2\u0081\u0084\n\6\2\2\u0082\u0084\7^\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0087\n\7\2\2\u0086\u0080\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\7)"+
		"\2\2\u008cu\3\2\2\2\u008c\177\3\2\2\2\u008d \3\2\2\2\u008e\u0095\5)\25"+
		"\2\u008f\u0095\5+\26\2\u0090\u0095\5-\27\2\u0091\u0095\5\'\24\2\u0092"+
		"\u0095\5/\30\2\u0093\u0095\5\61\31\2\u0094\u008e\3\2\2\2\u0094\u008f\3"+
		"\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\"\3\2\2\2\u0096\u0099\5\33\16\2\u0097\u0099\7a\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u009f"+
		"\5\31\r\2\u009b\u009f\5\35\17\2\u009c\u009f\5\33\16\2\u009d\u009f\t\5"+
		"\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1$\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00ae\t\b\2\2\u00a4\u00a5"+
		"\7@\2\2\u00a5\u00ae\7?\2\2\u00a6\u00ae\7>\2\2\u00a7\u00a8\7>\2\2\u00a8"+
		"\u00ae\7?\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ae\7?\2\2\u00ab\u00ac\7\61\2"+
		"\2\u00ac\u00ae\7?\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a6"+
		"\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"&\3\2\2\2\u00af\u00b1\7/\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b4\5\31\r\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\7\60\2\2\u00b8\u00ba\5\31\r\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c6\3\2\2\2\u00bd"+
		"\u00bf\t\t\2\2\u00be\u00c0\t\n\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5\31\r\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00ca"+
		"\7/\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\5\31\r\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d7\3\2\2\2\u00d0\u00d3\7%\2\2\u00d1"+
		"\u00d4\5\31\r\2\u00d2\u00d4\t\13\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8*\3\2\2\2"+
		"\u00d9\u00e3\7&\2\2\u00da\u00dc\7^\2\2\u00db\u00da\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e4\n\f\2\2\u00de\u00df\7^\2\2\u00df"+
		"\u00e0\5\31\r\2\u00e0\u00e1\5\31\r\2\u00e1\u00e2\5\31\r\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4,\3\2\2\2\u00e5"+
		"\u00ee\7$\2\2\u00e6\u00e9\7^\2\2\u00e7\u00ea\n\6\2\2\u00e8\u00ea\7^\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed"+
		"\n\r\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\7$\2\2\u00f2.\3\2\2\2\u00f3\u00fc\7]\2\2\u00f4\u00f6"+
		"\5!\21\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f9\7.\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7_"+
		"\2\2\u0100\60\3\2\2\2\u0101\u010a\7}\2\2\u0102\u0104\5!\21\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\7.\2\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0103\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\177\2\2\u010e\62\3\2"+
		"\2\2\u010f\u0113\7\'\2\2\u0110\u0112\n\f\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0118\7\17\2\2\u0117\u0116\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\f\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\b\32\2\2\u011c\64\3\2\2\2\u011d\u011f\t\16\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\33\2\2\u0123\66\3\2\2\2\u0124\u0125"+
		"\t\17\2\2\u01258\3\2\2\2\'\2z|\u0083\u0086\u0088\u008c\u0094\u0098\u009e"+
		"\u00a0\u00ad\u00b0\u00b5\u00bb\u00bf\u00c4\u00c6\u00c9\u00ce\u00d3\u00d5"+
		"\u00d7\u00db\u00e3\u00e9\u00ec\u00ee\u00f5\u00f8\u00fc\u0103\u0106\u010a"+
		"\u0113\u0117\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}