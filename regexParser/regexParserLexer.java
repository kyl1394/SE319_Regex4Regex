// Generated from regexParser.g4 by ANTLR 4.2

	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regexParserLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, CONST_ANYTHING=3, WS=4, SINGLE_CHAR=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'''", "';'", "CONST_ANYTHING", "WS", "SINGLE_CHAR"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "CONST_ANYTHING", "WS", "SINGLE_CHAR"
	};




	public regexParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "regexParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: CONST_ANYTHING_action((RuleContext)_localctx, actionIndex); break;

		case 4: SINGLE_CHAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SINGLE_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.print(getText()); break;
		}
	}
	private void CONST_ANYTHING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.print(".*"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7&\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\6\5\36\n\5\r\5\16\5\37\3\5\3\5\3\6\3\6\3\6\2"+
		"\2\7\3\3\5\4\7\5\t\6\13\7\3\2\4\5\2\13\f\17\17\"\"\3\2c|&\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\17\3\2"+
		"\2\2\7\21\3\2\2\2\t\35\3\2\2\2\13#\3\2\2\2\r\16\7)\2\2\16\4\3\2\2\2\17"+
		"\20\7=\2\2\20\6\3\2\2\2\21\22\7C\2\2\22\23\7P\2\2\23\24\7[\2\2\24\25\7"+
		"V\2\2\25\26\7J\2\2\26\27\7K\2\2\27\30\7P\2\2\30\31\7I\2\2\31\32\3\2\2"+
		"\2\32\33\b\4\2\2\33\b\3\2\2\2\34\36\t\2\2\2\35\34\3\2\2\2\36\37\3\2\2"+
		"\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\5\3\2\"\n\3\2\2\2#$\t\3\2"+
		"\2$%\b\6\4\2%\f\3\2\2\2\4\2\37\5\3\4\2\b\2\2\3\6\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}