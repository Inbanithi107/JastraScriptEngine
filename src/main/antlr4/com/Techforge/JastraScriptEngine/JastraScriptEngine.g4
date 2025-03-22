grammar JastraScriptEngine;

script : (statement)*;

statement : expression
            | ifStatement
            ;

ifStatement : IF LBRACE condition RBRACE LPRACE statement RPRACE (ELSE LPRACE statement RPRACE)?;
condition : expression CON expression;
expression : IDENTIFIER # identifierExpression
            | STRING # stringExpression
            | expression (OP expression)+? # continousExpression
            | IDENTIFIER (DOT IDENTIFIER)+? #nestedCall
            | NUMBER # numberExpression
            ;

IF : 'if';
ELSE : 'else';
LBRACE : '(';
RBRACE : ')';
LPRACE : '{';
RPRACE : '}';
CON : ('==' | '!=' | '<' | '>');
NUMBER : [0-9_]+;
IDENTIFIER : [a-zA-Z0-9_]+;
OP : '+';
DOT : '.';
STRING : '"' .*? '"';
WS : [ \t\r\n]+ -> skip;