// Generated from com/Techforge/JastraScriptEngine/JastraScriptEngine.g4 by ANTLR 4.13.2
package com.Techforge.JastraScriptEngine;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JastraScriptEngineParser}.
 */
public interface JastraScriptEngineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JastraScriptEngineParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(JastraScriptEngineParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link JastraScriptEngineParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(JastraScriptEngineParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link JastraScriptEngineParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JastraScriptEngineParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JastraScriptEngineParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JastraScriptEngineParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JastraScriptEngineParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JastraScriptEngineParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JastraScriptEngineParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JastraScriptEngineParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeLoop}
	 * labeled alternative in {@link JastraScriptEngineParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterRangeLoop(JastraScriptEngineParser.RangeLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeLoop}
	 * labeled alternative in {@link JastraScriptEngineParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitRangeLoop(JastraScriptEngineParser.RangeLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listLoop}
	 * labeled alternative in {@link JastraScriptEngineParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterListLoop(JastraScriptEngineParser.ListLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listLoop}
	 * labeled alternative in {@link JastraScriptEngineParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitListLoop(JastraScriptEngineParser.ListLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JastraScriptEngineParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JastraScriptEngineParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JastraScriptEngineParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JastraScriptEngineParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(JastraScriptEngineParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(JastraScriptEngineParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(JastraScriptEngineParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(JastraScriptEngineParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedCall}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNestedCall(JastraScriptEngineParser.NestedCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedCall}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNestedCall(JastraScriptEngineParser.NestedCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(JastraScriptEngineParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(JastraScriptEngineParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continousExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterContinousExpression(JastraScriptEngineParser.ContinousExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continousExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitContinousExpression(JastraScriptEngineParser.ContinousExpressionContext ctx);
}