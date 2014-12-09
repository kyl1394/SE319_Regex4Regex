// Generated from regexParser.g4 by ANTLR 4.2

	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regexParserParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, CONST_ANYTHING=3, WS=4, SINGLE_CHAR=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "';'", "CONST_ANYTHING", "WS", "SINGLE_CHAR"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_regex_char = 2, RULE_single_quote = 3;
	public static final String[] ruleNames = {
		"start", "expr", "regex_char", "single_quote"
	};

	@Override
	public String getGrammarFileName() { return "regexParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public regexParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(8); expr();
			setState(9); match(2);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<Regex_charContext> regex_char() {
			return getRuleContexts(Regex_charContext.class);
		}
		public TerminalNode CONST_ANYTHING() { return getToken(regexParserParser.CONST_ANYTHING, 0); }
		public Regex_charContext regex_char(int i) {
			return getRuleContext(Regex_charContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); regex_char();
			setState(12); match(CONST_ANYTHING);
			setState(13); regex_char();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Regex_charContext extends ParserRuleContext {
		public Single_quoteContext single_quote(int i) {
			return getRuleContext(Single_quoteContext.class,i);
		}
		public TerminalNode SINGLE_CHAR() { return getToken(regexParserParser.SINGLE_CHAR, 0); }
		public List<Single_quoteContext> single_quote() {
			return getRuleContexts(Single_quoteContext.class);
		}
		public Regex_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterRegex_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitRegex_char(this);
		}
	}

	public final Regex_charContext regex_char() throws RecognitionException {
		Regex_charContext _localctx = new Regex_charContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regex_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); single_quote();
			setState(16); match(SINGLE_CHAR);
			setState(17); single_quote();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_quoteContext extends ParserRuleContext {
		public Single_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterSingle_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitSingle_quote(this);
		}
	}

	public final Single_quoteContext single_quote() throws RecognitionException {
		Single_quoteContext _localctx = new Single_quoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\30\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\2\2\6\2\4\6\b\2\2\23\2\n\3\2\2\2\4\r\3\2\2\2\6\21\3\2\2\2\b\25"+
		"\3\2\2\2\n\13\5\4\3\2\13\f\7\4\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\7\5"+
		"\2\2\17\20\5\6\4\2\20\5\3\2\2\2\21\22\5\b\5\2\22\23\7\7\2\2\23\24\5\b"+
		"\5\2\24\7\3\2\2\2\25\26\7\3\2\2\26\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}