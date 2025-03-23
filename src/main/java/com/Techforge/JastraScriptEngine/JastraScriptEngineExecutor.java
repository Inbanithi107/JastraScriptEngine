package com.Techforge.JastraScriptEngine;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JastraScriptEngineExecutor {

    private  Map<String,Object> context;

    public JastraScriptEngineExecutor(Map<String,Object> context){
        this.context = context;
    }

    public String execute(String input) {

        CharStream charStream = CharStreams.fromString(input);

        JastraScriptEngineLexer lexer = new JastraScriptEngineLexer(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JastraScriptEngineParser parser = new JastraScriptEngineParser(tokens);

        ParseTree tree = parser.script();

        JastraEngine engine = new JastraEngine(context);
        String output = engine.visit(tree);
        return output;
    }
}
