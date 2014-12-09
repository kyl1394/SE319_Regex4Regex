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
		T__2=1, T__1=2, T__0=3, CONST_ANYTHING=4, OP_BETWEEN=5, OP_AND=6, WS=7, 
		SINGLE_CHAR=8, MULTIPLE_CHARS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'''", "'\"'", "';'", "CONST_ANYTHING", "OP_BETWEEN", "OP_AND", "WS", 
		"SINGLE_CHAR", "MULTIPLE_CHARS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "CONST_ANYTHING", "OP_BETWEEN", "OP_AND", "WS", 
		"SINGLE_CHAR", "MULTIPLE_CHARS"
	};



		public String regex = "";

		public void add(String addition)
		{
			//System.out.println("Addition:" + addition);
			regex += addition;
			//System.out.println("Regex:" + regex);
		}

		public void printRegex()
		{
			System.out.println("Regex:" + regex);
		}


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
		case 3: CONST_ANYTHING_action((RuleContext)_localctx, actionIndex); break;

		case 7: SINGLE_CHAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SINGLE_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: add(getText()); break;
		}
	}
	private void CONST_ANYTHING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: add(".*"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13A\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\6\b\64\n\b\r\b\16\b\65\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\6\n>\n\n\r\n\16\n?\2\2\13\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\3\2\4\5\2\13\f\17\17\"\"\3\2c|B\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t\33\3\2"+
		"\2\2\13&\3\2\2\2\r.\3\2\2\2\17\63\3\2\2\2\219\3\2\2\2\23=\3\2\2\2\25\26"+
		"\7)\2\2\26\4\3\2\2\2\27\30\7$\2\2\30\6\3\2\2\2\31\32\7=\2\2\32\b\3\2\2"+
		"\2\33\34\7C\2\2\34\35\7P\2\2\35\36\7[\2\2\36\37\7V\2\2\37 \7J\2\2 !\7"+
		"K\2\2!\"\7P\2\2\"#\7I\2\2#$\3\2\2\2$%\b\5\2\2%\n\3\2\2\2&\'\7d\2\2\'("+
		"\7g\2\2()\7v\2\2)*\7y\2\2*+\7g\2\2+,\7g\2\2,-\7p\2\2-\f\3\2\2\2./\7c\2"+
		"\2/\60\7p\2\2\60\61\7f\2\2\61\16\3\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\b\b\3\28\20"+
		"\3\2\2\29:\t\3\2\2:;\b\t\4\2;\22\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2"+
		"?=\3\2\2\2?@\3\2\2\2@\24\3\2\2\2\5\2\65?\5\3\5\2\b\2\2\3\t\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}