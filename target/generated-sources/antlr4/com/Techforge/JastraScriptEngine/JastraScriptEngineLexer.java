// Generated from com/Techforge/JastraScriptEngine/JastraScriptEngine.g4 by ANTLR 4.13.2
package com.Techforge.JastraScriptEngine;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JastraScriptEngineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, LBRACE=3, RBRACE=4, LPRACE=5, RPRACE=6, CON=7, NUMBER=8, 
		IDENTIFIER=9, OP=10, DOT=11, STRING=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "LBRACE", "RBRACE", "LPRACE", "RPRACE", "CON", "NUMBER", 
			"IDENTIFIER", "OP", "DOT", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'('", "')'", "'{'", "'}'", null, null, null, 
			"'+'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "LBRACE", "RBRACE", "LPRACE", "RPRACE", "CON", "NUMBER", 
			"IDENTIFIER", "OP", "DOT", "STRING", "WS"
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


	public JastraScriptEngineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JastraScriptEngine.g4"; }

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
		"\u0004\u0000\rP\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u00061\b\u0006\u0001\u0007\u0004\u00074\b\u0007\u000b\u0007\f\u00075"+
		"\u0001\b\u0004\b9\b\b\u000b\b\f\b:\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000bC\b\u000b\n\u000b\f\u000bF\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0004\fK\b\f\u000b\f\f\fL\u0001\f\u0001\f\u0001"+
		"D\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001"+
		"\u0000\u0004\u0002\u0000<<>>\u0002\u000009__\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  U\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003\u001e\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000"+
		"\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001"+
		"\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000"+
		"\u0000\u00118\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000\u0015"+
		">\u0001\u0000\u0000\u0000\u0017@\u0001\u0000\u0000\u0000\u0019J\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005i\u0000\u0000\u001c\u001d\u0005f\u0000"+
		"\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f\u0005e\u0000\u0000"+
		"\u001f \u0005l\u0000\u0000 !\u0005s\u0000\u0000!\"\u0005e\u0000\u0000"+
		"\"\u0004\u0001\u0000\u0000\u0000#$\u0005(\u0000\u0000$\u0006\u0001\u0000"+
		"\u0000\u0000%&\u0005)\u0000\u0000&\b\u0001\u0000\u0000\u0000\'(\u0005"+
		"{\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005}\u0000\u0000*\f\u0001"+
		"\u0000\u0000\u0000+,\u0005=\u0000\u0000,1\u0005=\u0000\u0000-.\u0005!"+
		"\u0000\u0000.1\u0005=\u0000\u0000/1\u0007\u0000\u0000\u00000+\u0001\u0000"+
		"\u0000\u00000-\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u000e"+
		"\u0001\u0000\u0000\u000024\u0007\u0001\u0000\u000032\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0010\u0001\u0000\u0000\u000079\u0007\u0002\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005"+
		"+\u0000\u0000=\u0014\u0001\u0000\u0000\u0000>?\u0005.\u0000\u0000?\u0016"+
		"\u0001\u0000\u0000\u0000@D\u0005\"\u0000\u0000AC\t\u0000\u0000\u0000B"+
		"A\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0005\"\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IK\u0007"+
		"\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0006\f\u0000\u0000O\u001a\u0001\u0000\u0000\u0000\u0006\u0000"+
		"05:DL\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}