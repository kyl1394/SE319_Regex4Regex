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
		T__1=1, T__0=2, CONST_ANYTHING=3, CONST_START=4, CONST_END=5, OP_BETWEEN=6, 
		THEN=7, NOT=8, OP_AND=9, WS=10, SINGLE_CHAR=11, MULTIPLE_CHARS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'''", "'\"'", "CONST_ANYTHING", "CONST_START", "CONST_END", "OP_BETWEEN", 
		"THEN", "NOT", "OP_AND", "WS", "SINGLE_CHAR", "MULTIPLE_CHARS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "CONST_ANYTHING", "CONST_START", "CONST_END", "OP_BETWEEN", 
		"THEN", "NOT", "OP_AND", "WS", "SINGLE_CHAR", "MULTIPLE_CHARS"
	};



		public static String regex = "(";

		public void add(String addition)
		{
			System.out.println("Addition:" + addition);
			regex += addition;
			System.out.println("Regex:" + regex);
		}

		public void printRegex()
		{
			System.out.println("Regex:" + regex + ")");
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
		case 2: CONST_ANYTHING_action((RuleContext)_localctx, actionIndex); break;

		case 3: CONST_START_action((RuleContext)_localctx, actionIndex); break;

		case 4: CONST_END_action((RuleContext)_localctx, actionIndex); break;

		case 6: THEN_action((RuleContext)_localctx, actionIndex); break;

		case 7: NOT_action((RuleContext)_localctx, actionIndex); break;

		case 10: SINGLE_CHAR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SINGLE_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: add(getText()); break;
		}
	}
	private void CONST_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: add("$"); break;
		}
	}
	private void THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: add(")("); break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: add("!"); break;
		}
	}
	private void CONST_ANYTHING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: add(".*"); break;
		}
	}
	private void CONST_START_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: add("^"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13S\n\13\r\13\16\13T\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\6\r]\n\r\r\r\16\r^\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\3\2\4\5\2\13\f\17\17\"\"\3\2c|a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3"+
		"\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t*\3\2\2\2\13\62\3\2\2\2\r8\3\2"+
		"\2\2\17@\3\2\2\2\21G\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27X\3\2\2\2\31\\"+
		"\3\2\2\2\33\34\7)\2\2\34\4\3\2\2\2\35\36\7$\2\2\36\6\3\2\2\2\37 \7C\2"+
		"\2 !\7P\2\2!\"\7[\2\2\"#\7V\2\2#$\7J\2\2$%\7K\2\2%&\7P\2\2&\'\7I\2\2\'"+
		"(\3\2\2\2()\b\4\2\2)\b\3\2\2\2*+\7U\2\2+,\7V\2\2,-\7C\2\2-.\7T\2\2./\7"+
		"V\2\2/\60\3\2\2\2\60\61\b\5\3\2\61\n\3\2\2\2\62\63\7G\2\2\63\64\7P\2\2"+
		"\64\65\7F\2\2\65\66\3\2\2\2\66\67\b\6\4\2\67\f\3\2\2\289\7d\2\29:\7g\2"+
		"\2:;\7v\2\2;<\7y\2\2<=\7g\2\2=>\7g\2\2>?\7p\2\2?\16\3\2\2\2@A\7V\2\2A"+
		"B\7J\2\2BC\7G\2\2CD\7P\2\2DE\3\2\2\2EF\b\b\5\2F\20\3\2\2\2GH\7P\2\2HI"+
		"\7Q\2\2IJ\7V\2\2JK\3\2\2\2KL\b\t\6\2L\22\3\2\2\2MN\7c\2\2NO\7p\2\2OP\7"+
		"f\2\2P\24\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV"+
		"\3\2\2\2VW\b\13\7\2W\26\3\2\2\2XY\t\3\2\2YZ\b\f\b\2Z\30\3\2\2\2[]\t\3"+
		"\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\32\3\2\2\2\5\2T^\t\3\4"+
		"\2\3\5\3\3\6\4\3\b\5\3\t\6\b\2\2\3\f\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}