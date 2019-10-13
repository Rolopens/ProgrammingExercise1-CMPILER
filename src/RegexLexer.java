// Generated from C:/Users/Rolo/Documents/GitHub/ProgrammingExercise1-CMPILER/grammar\Regex.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		B=1, R=2, A=3, N=4, X=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"B", "R", "A", "N", "X", "WS"
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
			null, "B", "R", "A", "N", "X", "WS"
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


	public RegexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Regex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\\\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n"+
		"\4\3\5\6\5L\n\5\r\5\16\5M\3\6\3\6\3\6\3\6\5\6T\n\6\3\7\6\7W\n\7\r\7\16"+
		"\7X\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\4\4\2\62;c|\5\2\13\13\17"+
		"\17\"\"\2j\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\3\33\3\2\2\2\5)\3\2\2\2\7H\3\2\2\2\tK\3\2\2\2\13S\3\2\2"+
		"\2\rV\3\2\2\2\17\20\5\7\4\2\20\21\5\5\3\2\21\34\3\2\2\2\22\23\5\13\6\2"+
		"\23\24\7W\2\2\24\25\5\3\2\2\25\26\5\5\3\2\26\34\3\2\2\2\27\30\5\13\6\2"+
		"\30\31\7W\2\2\31\32\5\13\6\2\32\34\3\2\2\2\33\17\3\2\2\2\33\22\3\2\2\2"+
		"\33\27\3\2\2\2\34\4\3\2\2\2\35\36\5\7\4\2\36\37\5\5\3\2\37*\3\2\2\2 !"+
		"\7W\2\2!\"\5\7\4\2\"#\5\5\3\2#*\3\2\2\2$%\7W\2\2%&\5\13\6\2&\'\5\5\3\2"+
		"\'*\3\2\2\2(*\3\2\2\2)\35\3\2\2\2) \3\2\2\2)$\3\2\2\2)(\3\2\2\2*\6\3\2"+
		"\2\2+,\5\t\5\2,-\7-\2\2-I\3\2\2\2./\5\t\5\2/\60\7,\2\2\60I\3\2\2\2\61"+
		"\62\5\t\5\2\62\63\7A\2\2\63I\3\2\2\2\64I\5\t\5\2\65\66\7*\2\2\66\67\5"+
		"\3\2\2\678\7+\2\28I\3\2\2\29:\7*\2\2:;\5\3\2\2;<\7+\2\2<=\7,\2\2=I\3\2"+
		"\2\2>?\7*\2\2?@\5\3\2\2@A\7+\2\2AB\7-\2\2BI\3\2\2\2CD\7*\2\2DE\5\3\2\2"+
		"EF\7+\2\2FG\7A\2\2GI\3\2\2\2H+\3\2\2\2H.\3\2\2\2H\61\3\2\2\2H\64\3\2\2"+
		"\2H\65\3\2\2\2H9\3\2\2\2H>\3\2\2\2HC\3\2\2\2I\b\3\2\2\2JL\t\2\2\2KJ\3"+
		"\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\n\3\2\2\2OT\7G\2\2PQ\7*\2\2QR\7"+
		"G\2\2RT\7+\2\2SO\3\2\2\2SP\3\2\2\2T\f\3\2\2\2UW\t\3\2\2VU\3\2\2\2WX\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\7\2\2[\16\3\2\2\2\t\2\33)HMS"+
		"X\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}