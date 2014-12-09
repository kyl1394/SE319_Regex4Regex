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
		T__2=1, T__1=2, T__0=3, CONST_ANYTHING=4, OP_BETWEEN=5, OP_AND=6, WS=7, 
		SINGLE_CHAR=8, MULTIPLE_CHARS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "'\"'", "';'", "CONST_ANYTHING", "OP_BETWEEN", "OP_AND", 
		"WS", "SINGLE_CHAR", "MULTIPLE_CHARS"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_between_and = 2, RULE_regex_char = 3, 
		RULE_regex_string = 4, RULE_char_or_string = 5, RULE_single_quote = 6, 
		RULE_double_quote = 7;
	public static final String[] ruleNames = {
		"start", "expr", "between_and", "regex_char", "regex_string", "char_or_string", 
		"single_quote", "double_quote"
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
			setState(16); expr(0);
			setState(17); match(3);
			printRegex();
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
		public Regex_stringContext regex_string() {
			return getRuleContext(Regex_stringContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Regex_charContext regex_char() {
			return getRuleContext(Regex_charContext.class,0);
		}
		public TerminalNode CONST_ANYTHING() { return getToken(regexParserParser.CONST_ANYTHING, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			switch (_input.LA(1)) {
			case CONST_ANYTHING:
				{
				setState(21); match(CONST_ANYTHING);
				}
				break;
			case 1:
				{
				setState(22); regex_char();
				}
				break;
			case 2:
				{
				setState(23); regex_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(26);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(27); expr(0);
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Between_andContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OP_AND() { return getToken(regexParserParser.OP_AND, 0); }
		public List<Char_or_stringContext> char_or_string() {
			return getRuleContexts(Char_or_stringContext.class);
		}
		public TerminalNode OP_BETWEEN() { return getToken(regexParserParser.OP_BETWEEN, 0); }
		public Char_or_stringContext char_or_string(int i) {
			return getRuleContext(Char_or_stringContext.class,i);
		}
		public Between_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterBetween_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitBetween_and(this);
		}
	}

	public final Between_andContext between_and() throws RecognitionException {
		Between_andContext _localctx = new Between_andContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_between_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); char_or_string();
			setState(34); match(OP_BETWEEN);
			setState(35); char_or_string();
			setState(36); match(OP_AND);
			setState(37); expr(0);
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
		enterRule(_localctx, 6, RULE_regex_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); single_quote();
			setState(40); match(SINGLE_CHAR);
			setState(41); single_quote();
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

	public static class Regex_stringContext extends ParserRuleContext {
		public Double_quoteContext double_quote(int i) {
			return getRuleContext(Double_quoteContext.class,i);
		}
		public TerminalNode MULTIPLE_CHARS() { return getToken(regexParserParser.MULTIPLE_CHARS, 0); }
		public List<Double_quoteContext> double_quote() {
			return getRuleContexts(Double_quoteContext.class);
		}
		public Regex_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterRegex_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitRegex_string(this);
		}
	}

	public final Regex_stringContext regex_string() throws RecognitionException {
		Regex_stringContext _localctx = new Regex_stringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regex_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); double_quote();
			setState(44); match(MULTIPLE_CHARS);
			setState(45); double_quote();
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

	public static class Char_or_stringContext extends ParserRuleContext {
		public Regex_stringContext regex_string() {
			return getRuleContext(Regex_stringContext.class,0);
		}
		public Regex_charContext regex_char() {
			return getRuleContext(Regex_charContext.class,0);
		}
		public Char_or_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_or_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterChar_or_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitChar_or_string(this);
		}
	}

	public final Char_or_stringContext char_or_string() throws RecognitionException {
		Char_or_stringContext _localctx = new Char_or_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_char_or_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			switch (_input.LA(1)) {
			case 1:
				{
				setState(47); regex_char();
				}
				break;
			case 2:
				{
				setState(48); regex_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 12, RULE_single_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(1);
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

	public static class Double_quoteContext extends ParserRuleContext {
		public Double_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterDouble_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitDouble_quote(this);
		}
	}

	public final Double_quoteContext double_quote() throws RecognitionException {
		Double_quoteContext _localctx = new Double_quoteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_double_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7\64\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\2\3\4\n\2\4\6\b\n\f\16\20\2\2\65\2\22\3\2\2\2\4\32\3\2"+
		"\2\2\6#\3\2\2\2\b)\3\2\2\2\n-\3\2\2\2\f\63\3\2\2\2\16\65\3\2\2\2\20\67"+
		"\3\2\2\2\22\23\5\4\3\2\23\24\7\5\2\2\24\25\b\2\1\2\25\3\3\2\2\2\26\27"+
		"\b\3\1\2\27\33\7\6\2\2\30\33\5\b\5\2\31\33\5\n\6\2\32\26\3\2\2\2\32\30"+
		"\3\2\2\2\32\31\3\2\2\2\33 \3\2\2\2\34\35\f\3\2\2\35\37\5\4\3\2\36\34\3"+
		"\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#$\5\f"+
		"\7\2$%\7\7\2\2%&\5\f\7\2&\'\7\b\2\2\'(\5\4\3\2(\7\3\2\2\2)*\5\16\b\2*"+
		"+\7\n\2\2+,\5\16\b\2,\t\3\2\2\2-.\5\20\t\2./\7\13\2\2/\60\5\20\t\2\60"+
		"\13\3\2\2\2\61\64\5\b\5\2\62\64\5\n\6\2\63\61\3\2\2\2\63\62\3\2\2\2\64"+
		"\r\3\2\2\2\65\66\7\3\2\2\66\17\3\2\2\2\678\7\4\2\28\21\3\2\2\2\5\32 \63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}