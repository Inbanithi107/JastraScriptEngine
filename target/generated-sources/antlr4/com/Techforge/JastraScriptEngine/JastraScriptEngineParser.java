// Generated from com/Techforge/JastraScriptEngine/JastraScriptEngine.g4 by ANTLR 4.13.2
package com.Techforge.JastraScriptEngine;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JastraScriptEngineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, LBRACE=3, RBRACE=4, LPRACE=5, RPRACE=6, CON=7, NUMBER=8, 
		IDENTIFIER=9, OP=10, DOT=11, STRING=12, WS=13;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_ifStatement = 2, RULE_condition = 3, 
		RULE_expression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "statement", "ifStatement", "condition", "expression"
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

	@Override
	public String getGrammarFileName() { return "JastraScriptEngine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JastraScriptEngineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4866L) != 0)) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				expression(0);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				ifStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JastraScriptEngineParser.IF, 0); }
		public TerminalNode LBRACE() { return getToken(JastraScriptEngineParser.LBRACE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JastraScriptEngineParser.RBRACE, 0); }
		public List<TerminalNode> LPRACE() { return getTokens(JastraScriptEngineParser.LPRACE); }
		public TerminalNode LPRACE(int i) {
			return getToken(JastraScriptEngineParser.LPRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RPRACE() { return getTokens(JastraScriptEngineParser.RPRACE); }
		public TerminalNode RPRACE(int i) {
			return getToken(JastraScriptEngineParser.RPRACE, i);
		}
		public TerminalNode ELSE() { return getToken(JastraScriptEngineParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(IF);
			setState(21);
			match(LBRACE);
			setState(22);
			condition();
			setState(23);
			match(RBRACE);
			setState(24);
			match(LPRACE);
			setState(25);
			statement();
			setState(26);
			match(RPRACE);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(27);
				match(ELSE);
				setState(28);
				match(LPRACE);
				setState(29);
				statement();
				setState(30);
				match(RPRACE);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CON() { return getToken(JastraScriptEngineParser.CON, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			expression(0);
			setState(35);
			match(CON);
			setState(36);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(JastraScriptEngineParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(JastraScriptEngineParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedCallContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JastraScriptEngineParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JastraScriptEngineParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JastraScriptEngineParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JastraScriptEngineParser.DOT, i);
		}
		public NestedCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterNestedCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitNestedCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitNestedCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JastraScriptEngineParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinousExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(JastraScriptEngineParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(JastraScriptEngineParser.OP, i);
		}
		public ContinousExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterContinousExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitContinousExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitContinousExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new NestedCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(IDENTIFIER);
				setState(44); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(42);
						match(DOT);
						setState(43);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(46); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(NUMBER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ContinousExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(51);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(54); 
					_errHandler.sync(this);
					_alt = 1+1;
					do {
						switch (_alt) {
						case 1+1:
							{
							{
							setState(52);
							match(OP);
							setState(53);
							expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(56); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\r@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004-\b\u0004\u000b\u0004"+
		"\f\u0004.\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u00047\b\u0004\u000b\u0004\f\u00048\u0005\u0004;\b\u0004"+
		"\n\u0004\f\u0004>\t\u0004\u0001\u0004\u0002.8\u0001\b\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000C\u0000\r\u0001\u0000\u0000\u0000\u0002\u0012"+
		"\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006\"\u0001"+
		"\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000"+
		"\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0013\u0003\b"+
		"\u0004\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0003\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005\u0003"+
		"\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u0018\u0005\u0004"+
		"\u0000\u0000\u0018\u0019\u0005\u0005\u0000\u0000\u0019\u001a\u0003\u0002"+
		"\u0001\u0000\u001a \u0005\u0006\u0000\u0000\u001b\u001c\u0005\u0002\u0000"+
		"\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d\u001e\u0003\u0002\u0001"+
		"\u0000\u001e\u001f\u0005\u0006\u0000\u0000\u001f!\u0001\u0000\u0000\u0000"+
		" \u001b\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0005\u0001"+
		"\u0000\u0000\u0000\"#\u0003\b\u0004\u0000#$\u0005\u0007\u0000\u0000$%"+
		"\u0003\b\u0004\u0000%\u0007\u0001\u0000\u0000\u0000&\'\u0006\u0004\uffff"+
		"\uffff\u0000\'2\u0005\t\u0000\u0000(2\u0005\f\u0000\u0000),\u0005\t\u0000"+
		"\u0000*+\u0005\u000b\u0000\u0000+-\u0005\t\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u000002\u0005\b\u0000\u00001&\u0001\u0000"+
		"\u0000\u00001(\u0001\u0000\u0000\u00001)\u0001\u0000\u0000\u000010\u0001"+
		"\u0000\u0000\u00002<\u0001\u0000\u0000\u000036\n\u0003\u0000\u000045\u0005"+
		"\n\u0000\u000057\u0003\b\u0004\u000064\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9;\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\t\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000\u0007\r\u0012 .18<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}