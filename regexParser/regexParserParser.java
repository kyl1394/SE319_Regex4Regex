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
		T__1=1, T__0=2, CONST_ANYTHING=3, CONST_START=4, CONST_END=5, OP_BETWEEN=6, 
		THEN=7, OP_AND=8, WS=9, SINGLE_CHAR=10, MULTIPLE_CHARS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "'\"'", "CONST_ANYTHING", "CONST_START", "CONST_END", 
		"OP_BETWEEN", "THEN", "OP_AND", "WS", "SINGLE_CHAR", "MULTIPLE_CHARS"
	};
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_start_expr = 2, RULE_end_expr = 3, 
		RULE_between_and = 4, RULE_regex_char = 5, RULE_regex_string = 6, RULE_char_or_string = 7, 
		RULE_single_quote = 8, RULE_double_quote = 9;
	public static final String[] ruleNames = {
		"start", "expr", "start_expr", "end_expr", "between_and", "regex_char", 
		"regex_string", "char_or_string", "single_quote", "double_quote"
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

	public regexParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(regexParserParser.EOF, 0); }
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
			setState(20); expr(0);
			setState(21); match(EOF);
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
		public TerminalNode THEN() { return getToken(regexParserParser.THEN, 0); }
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
			setState(29);
			switch (_input.LA(1)) {
			case CONST_ANYTHING:
				{
				setState(25); match(CONST_ANYTHING);
				}
				break;
			case 1:
				{
				setState(26); regex_char();
				}
				break;
			case 2:
				{
				setState(27); regex_string();
				}
				break;
			case THEN:
				{
				setState(28); match(THEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
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
					setState(31);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(32); expr(0);
					}
					} 
				}
				setState(37);
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

	public static class Start_exprContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(regexParserParser.THEN, 0); }
		public TerminalNode CONST_START() { return getToken(regexParserParser.CONST_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Start_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterStart_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitStart_expr(this);
		}
	}

	public final Start_exprContext start_expr() throws RecognitionException {
		Start_exprContext _localctx = new Start_exprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_expr);
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); match(CONST_START);
				setState(39); expr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); match(CONST_START);
				setState(41); match(THEN);
				setState(42); expr(0);
				}
				break;
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

	public static class End_exprContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(regexParserParser.THEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONST_END() { return getToken(regexParserParser.CONST_END, 0); }
		public End_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).enterEnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexParserListener ) ((regexParserListener)listener).exitEnd_expr(this);
		}
	}

	public final End_exprContext end_expr() throws RecognitionException {
		End_exprContext _localctx = new End_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_end_expr);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case CONST_ANYTHING:
			case THEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); expr(0);
				setState(46); match(CONST_END);
				}
				break;
			case CONST_END:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); match(CONST_END);
				setState(49); match(THEN);
				setState(50); expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 8, RULE_between_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); char_or_string();
			setState(54); match(OP_BETWEEN);
			setState(55); char_or_string();
			setState(56); match(OP_AND);
			setState(57); expr(0);
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
		enterRule(_localctx, 10, RULE_regex_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); single_quote();
			setState(60); match(SINGLE_CHAR);
			setState(61); single_quote();
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
		enterRule(_localctx, 12, RULE_regex_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); double_quote();
			setState(64); match(MULTIPLE_CHARS);
			setState(65); double_quote();
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
		enterRule(_localctx, 14, RULE_char_or_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			switch (_input.LA(1)) {
			case 1:
				{
				setState(67); regex_char();
				}
				break;
			case 2:
				{
				setState(68); regex_string();
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
		enterRule(_localctx, 16, RULE_single_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(1);
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
		enterRule(_localctx, 18, RULE_double_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(2);
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
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rN\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t"+
		"H\n\t\3\n\3\n\3\13\3\13\3\13\2\3\4\f\2\4\6\b\n\f\16\20\22\24\2\2J\2\26"+
		"\3\2\2\2\4\37\3\2\2\2\6-\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f=\3\2\2\2"+
		"\16A\3\2\2\2\20G\3\2\2\2\22I\3\2\2\2\24K\3\2\2\2\26\27\5\4\3\2\27\30\7"+
		"\2\2\3\30\31\b\2\1\2\31\3\3\2\2\2\32\33\b\3\1\2\33 \7\5\2\2\34 \5\f\7"+
		"\2\35 \5\16\b\2\36 \7\t\2\2\37\32\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2"+
		"\37\36\3\2\2\2 %\3\2\2\2!\"\f\4\2\2\"$\5\4\3\2#!\3\2\2\2$\'\3\2\2\2%#"+
		"\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2()\7\6\2\2).\5\4\3\2*+\7\6\2\2"+
		"+,\7\t\2\2,.\5\4\3\2-(\3\2\2\2-*\3\2\2\2.\7\3\2\2\2/\60\5\4\3\2\60\61"+
		"\7\7\2\2\61\66\3\2\2\2\62\63\7\7\2\2\63\64\7\t\2\2\64\66\5\4\3\2\65/\3"+
		"\2\2\2\65\62\3\2\2\2\66\t\3\2\2\2\678\5\20\t\289\7\b\2\29:\5\20\t\2:;"+
		"\7\n\2\2;<\5\4\3\2<\13\3\2\2\2=>\5\22\n\2>?\7\f\2\2?@\5\22\n\2@\r\3\2"+
		"\2\2AB\5\24\13\2BC\7\r\2\2CD\5\24\13\2D\17\3\2\2\2EH\5\f\7\2FH\5\16\b"+
		"\2GE\3\2\2\2GF\3\2\2\2H\21\3\2\2\2IJ\7\3\2\2J\23\3\2\2\2KL\7\4\2\2L\25"+
		"\3\2\2\2\7\37%-\65G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}