package com.Techforge.JastraScriptEngine;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JastraEngine extends JastraScriptEngineBaseVisitor<String>{
    private Map<String, Object> context;
    private StringBuilder builder;
    public JastraEngine(Map<String, Object> map){
        this.context = map;
        this.builder = new StringBuilder();
    }

    @Override
    public String visitScript(JastraScriptEngineParser.ScriptContext ctx) {
        for (JastraScriptEngineParser.StatementContext stmt : ctx.statement()){
            builder.append(visit(stmt));
        }
        return builder.toString();
    }

    @Override
    public String visitStringExpression(JastraScriptEngineParser.StringExpressionContext ctx) {
        String text = ctx.STRING().getText();
        return text.substring(1,text.length()-1);
    }

    @Override
    public String visitIdentifierExpression(JastraScriptEngineParser.IdentifierExpressionContext ctx) {
        String reference = ctx.IDENTIFIER().getText();
        if(reference.equals("null")){
            return null;
        }
        String result = (String) context.getOrDefault(reference, "unable to find");
        return result;
    }

    @Override
    public String visitContinousExpression(JastraScriptEngineParser.ContinousExpressionContext ctx) {
        List<JastraScriptEngineParser.ExpressionContext> expressions = ctx.expression();
        StringBuilder sb = new StringBuilder();
        String init = visit(expressions.get(0));
        sb.append(init);
        for (int i=0;i<ctx.OP().size();i++){
            sb.append(visit(expressions.get(i+1)));
        }
        return sb.toString();
    }

    @Override
    public String visitNestedCall(JastraScriptEngineParser.NestedCallContext ctx) {
        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        Object baseObject = context.get(identifiers.get(0).getText());
        identifiers.remove(0);
        for (TerminalNode id : identifiers) {
            String methodname = id.getText();
            if (baseObject == null) {
                throw new RuntimeException("Null reference in nested call at: " + methodname);
            }
            try {
                Method method = baseObject.getClass().getMethod(methodname);
                baseObject = method.invoke(baseObject);
            } catch (Exception e) {
                throw new RuntimeException("Error invoking method: " + methodname, e);
            }
        }
        return baseObject.toString();
    }

    @Override
    public String visitIfStatement(JastraScriptEngineParser.IfStatementContext ctx) {
        String condition = visit(ctx.condition());
        if (condition.equals("true")){
            return visit(ctx.statement(0));
        } else if (ctx.ELSE()!=null) {
            return visit(ctx.statement(1));
        }
        return null;
    }

    @Override
    public String visitCondition(JastraScriptEngineParser.ConditionContext ctx) {
        String left = visit(ctx.expression(0));
        String right = visit(ctx.expression(1));
        String CON = ctx.CON().getText();
        switch (CON){
            case "==" :
                return left.equals(right) ? "true" : "false";
            case "!=" :
                return !(left.equals(right)) ? "true" : "false";
        }
        return null;
    }

    @Override
    public String visitRangeLoop(JastraScriptEngineParser.RangeLoopContext ctx) {
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(ctx.NUMBER(0).getText());
        int end = Integer.parseInt(ctx.NUMBER(1).getText());
        for(int i=start ; i<end ; i++){
            sb.append(visit(ctx.statement()));
        }
        return sb.toString();
    }

    @Override
    public String visitListLoop(JastraScriptEngineParser.ListLoopContext ctx) {
        StringBuilder sb = new StringBuilder();
        Object objs = context.get(ctx.IDENTIFIER(1).getText());
        List<?> objList;
        if (objs instanceof List<?>) {
            objList = (List<?>) objs;
        } else {
            objList = Collections.singletonList(objs); // Wrap single object in a list
        }
        for (Object obj : objList){
            context.put(ctx.IDENTIFIER(0).getText(), obj);
            sb.append(visit(ctx.statement()));
        }
        return sb.toString();
    }
}
