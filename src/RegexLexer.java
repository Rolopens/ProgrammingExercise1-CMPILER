// Generated from Regex.g4 by ANTLR 4.7.2
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bX\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4E\n\4\3\5\6\5H\n\5\r\5"+
		"\16\5I\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\6\7S\n\7\r\7\16\7T\3\7\3\7\2\2\b\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\3\2\4\4\2\62;c|\5\2\13\13\17\17\"\"\2e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\27"+
		"\3\2\2\2\5%\3\2\2\2\7D\3\2\2\2\tG\3\2\2\2\13O\3\2\2\2\rR\3\2\2\2\17\20"+
		"\5\7\4\2\20\21\5\5\3\2\21\30\3\2\2\2\22\23\5\13\6\2\23\24\7W\2\2\24\25"+
		"\5\3\2\2\25\26\5\5\3\2\26\30\3\2\2\2\27\17\3\2\2\2\27\22\3\2\2\2\30\4"+
		"\3\2\2\2\31\32\5\7\4\2\32\33\5\5\3\2\33&\3\2\2\2\34\35\7W\2\2\35\36\5"+
		"\7\4\2\36\37\5\5\3\2\37&\3\2\2\2 !\7W\2\2!\"\5\13\6\2\"#\5\5\3\2#&\3\2"+
		"\2\2$&\3\2\2\2%\31\3\2\2\2%\34\3\2\2\2% \3\2\2\2%$\3\2\2\2&\6\3\2\2\2"+
		"\'(\5\t\5\2()\7-\2\2)E\3\2\2\2*+\5\t\5\2+,\7,\2\2,E\3\2\2\2-.\5\t\5\2"+
		"./\7A\2\2/E\3\2\2\2\60E\5\t\5\2\61\62\7*\2\2\62\63\5\3\2\2\63\64\7+\2"+
		"\2\64E\3\2\2\2\65\66\7*\2\2\66\67\5\3\2\2\678\7+\2\289\7,\2\29E\3\2\2"+
		"\2:;\7*\2\2;<\5\3\2\2<=\7+\2\2=>\7-\2\2>E\3\2\2\2?@\7*\2\2@A\5\3\2\2A"+
		"B\7+\2\2BC\7A\2\2CE\3\2\2\2D\'\3\2\2\2D*\3\2\2\2D-\3\2\2\2D\60\3\2\2\2"+
		"D\61\3\2\2\2D\65\3\2\2\2D:\3\2\2\2D?\3\2\2\2E\b\3\2\2\2FH\t\2\2\2GF\3"+
		"\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\n\3\2\2\2KP\7G\2\2LM\7*\2\2MN\7"+
		"G\2\2NP\7+\2\2OK\3\2\2\2OL\3\2\2\2P\f\3\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\7\2\2W\16\3\2\2\2\t\2\27%DIO"+
		"T\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}