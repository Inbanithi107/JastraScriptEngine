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
    public static void main(String[] args) {
        String input = "";
        try {
            input = new String(Files.readAllBytes(Paths.get("src/main/resources/simple.jastra")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        CharStream charStream = CharStreams.fromString(input);

        JastraScriptEngineLexer lexer = new JastraScriptEngineLexer(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JastraScriptEngineParser parser = new JastraScriptEngineParser(tokens);

        ParseTree tree = parser.script();

        Map<String, Object> map = new HashMap<>();
        map.put("username", "inbanithi");
        List<User> users = new ArrayList<>();
        users.add(new User("inbanithi", "1234"));
        users.add(new User("kavin", "4321"));
        map.put("users", users);
        JastraEngine engine = new JastraEngine(map);
        String output = engine.visit(tree);
        System.out.println(output);
    }
}
