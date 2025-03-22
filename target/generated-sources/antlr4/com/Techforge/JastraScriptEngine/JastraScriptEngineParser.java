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
		IF=1, ELSE=2, FOR=3, IN=4, LBRACE=5, RBRACE=6, LPRACE=7, RPRACE=8, CON=9, 
		COMMA=10, NUMBER=11, IDENTIFIER=12, OP=13, DOT=14, STRING=15, WS=16;
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_ifStatement = 2, RULE_forStatement = 3, 
		RULE_condition = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "statement", "ifStatement", "forStatement", "condition", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'in'", "'('", "')'", "'{'", "'}'", 
			null, "','", null, null, "'+'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "IN", "LBRACE", "RBRACE", "LPRACE", "RPRACE", 
			"CON", "COMMA", "NUMBER", "IDENTIFIER", "OP", "DOT", "STRING", "WS"
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 38922L) != 0)) {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(17);
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
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case IDENTIFIER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				expression(0);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				forStatement();
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
			setState(23);
			match(IF);
			setState(24);
			match(LBRACE);
			setState(25);
			condition();
			setState(26);
			match(RBRACE);
			setState(27);
			match(LPRACE);
			setState(28);
			statement();
			setState(29);
			match(RPRACE);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(30);
				match(ELSE);
				setState(31);
				match(LPRACE);
				setState(32);
				statement();
				setState(33);
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
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLoopContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(JastraScriptEngineParser.FOR, 0); }
		public TerminalNode LBRACE() { return getToken(JastraScriptEngineParser.LBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JastraScriptEngineParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JastraScriptEngineParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(JastraScriptEngineParser.IN, 0); }
		public TerminalNode RBRACE() { return getToken(JastraScriptEngineParser.RBRACE, 0); }
		public TerminalNode LPRACE() { return getToken(JastraScriptEngineParser.LPRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RPRACE() { return getToken(JastraScriptEngineParser.RPRACE, 0); }
		public ListLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterListLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitListLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitListLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeLoopContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(JastraScriptEngineParser.FOR, 0); }
		public TerminalNode LBRACE() { return getToken(JastraScriptEngineParser.LBRACE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(JastraScriptEngineParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JastraScriptEngineParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(JastraScriptEngineParser.COMMA, 0); }
		public TerminalNode RBRACE() { return getToken(JastraScriptEngineParser.RBRACE, 0); }
		public TerminalNode LPRACE() { return getToken(JastraScriptEngineParser.LPRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RPRACE() { return getToken(JastraScriptEngineParser.RPRACE, 0); }
		public RangeLoopContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).enterRangeLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JastraScriptEngineListener ) ((JastraScriptEngineListener)listener).exitRangeLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JastraScriptEngineVisitor ) return ((JastraScriptEngineVisitor<? extends T>)visitor).visitRangeLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forStatement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new RangeLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(FOR);
				setState(38);
				match(LBRACE);
				setState(39);
				match(NUMBER);
				setState(40);
				match(COMMA);
				setState(41);
				match(NUMBER);
				setState(42);
				match(RBRACE);
				setState(43);
				match(LPRACE);
				setState(44);
				statement();
				setState(45);
				match(RPRACE);
				}
				break;
			case 2:
				_localctx = new ListLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(FOR);
				setState(48);
				match(LBRACE);
				setState(49);
				match(IDENTIFIER);
				setState(50);
				match(IN);
				setState(51);
				match(IDENTIFIER);
				setState(52);
				match(RBRACE);
				setState(53);
				match(LPRACE);
				setState(54);
				statement();
				setState(55);
				match(RPRACE);
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
		enterRule(_localctx, 8, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			expression(0);
			setState(60);
			match(CON);
			setState(61);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new NestedCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(IDENTIFIER);
				setState(69); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(67);
						match(DOT);
						setState(68);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(NUMBER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ContinousExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(76);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(79); 
					_errHandler.sync(this);
					_alt = 1+1;
					do {
						switch (_alt) {
						case 1+1:
							{
							{
							setState(77);
							match(OP);
							setState(78);
							expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(81); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 5:
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
		"\u0004\u0001\u0010Y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003:\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005F\b"+
		"\u0005\u000b\u0005\f\u0005G\u0001\u0005\u0003\u0005K\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005P\b\u0005\u000b\u0005\f\u0005Q\u0005"+
		"\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0001\u0005\u0002GQ\u0001\n\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0000]\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000\u0000"+
		"\u0000\u00069\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\nJ\u0001"+
		"\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0016\u0003\n\u0005\u0000\u0013"+
		"\u0016\u0003\u0004\u0002\u0000\u0014\u0016\u0003\u0006\u0003\u0000\u0015"+
		"\u0012\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005\u0001\u0000\u0000\u0018\u0019\u0005\u0005\u0000\u0000\u0019"+
		"\u001a\u0003\b\u0004\u0000\u001a\u001b\u0005\u0006\u0000\u0000\u001b\u001c"+
		"\u0005\u0007\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d#\u0005"+
		"\b\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0005\u0007"+
		"\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\b\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000#\u001e\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0005"+
		"\u0005\u0000\u0000\'(\u0005\u000b\u0000\u0000()\u0005\n\u0000\u0000)*"+
		"\u0005\u000b\u0000\u0000*+\u0005\u0006\u0000\u0000+,\u0005\u0007\u0000"+
		"\u0000,-\u0003\u0002\u0001\u0000-.\u0005\b\u0000\u0000.:\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0003\u0000\u000001\u0005\u0005\u0000\u000012\u0005\f\u0000"+
		"\u000023\u0005\u0004\u0000\u000034\u0005\f\u0000\u000045\u0005\u0006\u0000"+
		"\u000056\u0005\u0007\u0000\u000067\u0003\u0002\u0001\u000078\u0005\b\u0000"+
		"\u00008:\u0001\u0000\u0000\u00009%\u0001\u0000\u0000\u00009/\u0001\u0000"+
		"\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005"+
		"\t\u0000\u0000=>\u0003\n\u0005\u0000>\t\u0001\u0000\u0000\u0000?@\u0006"+
		"\u0005\uffff\uffff\u0000@K\u0005\f\u0000\u0000AK\u0005\u000f\u0000\u0000"+
		"BE\u0005\f\u0000\u0000CD\u0005\u000e\u0000\u0000DF\u0005\f\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IK\u0005\u000b"+
		"\u0000\u0000J?\u0001\u0000\u0000\u0000JA\u0001\u0000\u0000\u0000JB\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KU\u0001\u0000\u0000\u0000"+
		"LO\n\u0003\u0000\u0000MN\u0005\r\u0000\u0000NP\u0003\n\u0005\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SL\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\u000b\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"\b\u000f\u0015#9GJQU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}