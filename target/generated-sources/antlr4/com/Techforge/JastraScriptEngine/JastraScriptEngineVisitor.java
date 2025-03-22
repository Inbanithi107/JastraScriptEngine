// Generated from com/Techforge/JastraScriptEngine/JastraScriptEngine.g4 by ANTLR 4.13.2
package com.Techforge.JastraScriptEngine;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JastraScriptEngineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JastraScriptEngineVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JastraScriptEngineParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(JastraScriptEngineParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link JastraScriptEngineParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JastraScriptEngineParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JastraScriptEngineParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JastraScriptEngineParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JastraScriptEngineParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(JastraScriptEngineParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(JastraScriptEngineParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(JastraScriptEngineParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedCall}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedCall(JastraScriptEngineParser.NestedCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(JastraScriptEngineParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continousExpression}
	 * labeled alternative in {@link JastraScriptEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinousExpression(JastraScriptEngineParser.ContinousExpressionContext ctx);
}