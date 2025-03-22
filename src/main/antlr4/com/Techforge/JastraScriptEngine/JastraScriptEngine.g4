grammar JastraScriptEngine;

script : (statement)*;

statement : expression
            | ifStatement
            | forStatement
            ;

ifStatement : IF LBRACE condition RBRACE LPRACE statement RPRACE (ELSE LPRACE statement RPRACE)?;
forStatement : FOR LBRACE NUMBER COMMA NUMBER RBRACE LPRACE statement RPRACE # rangeLoop
                | FOR LBRACE IDENTIFIER IN IDENTIFIER RBRACE LPRACE statement RPRACE # listLoop
                ;
condition : expression CON expression;
expression : IDENTIFIER # identifierExpression
            | STRING # stringExpression
            | expression (OP expression)+? # continousExpression
            | IDENTIFIER (DOT IDENTIFIER)+? #nestedCall
            | NUMBER # numberExpression
            ;

IF : 'if';
ELSE : 'else';
FOR : 'for';
IN : 'in';
LBRACE : '(';
RBRACE : ')';
LPRACE : '{';
RPRACE : '}';
CON : ('==' | '!=' | '<' | '>');
COMMA : ',';
NUMBER : [0-9_]+;
IDENTIFIER : [a-zA-Z0-9_]+;
OP : '+';
DOT : '.';
STRING : '"' .*? '"';
WS : [ \t\r\n]+ -> skip;