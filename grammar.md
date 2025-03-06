# Lox Grammar

```text
program     -> declaration* EOF ;
declaration -> varDecl | statement ;
varDecl     -> "var" IDENTIFIER ( "=" expression )? ";" ;
statement   -> exprStmt | ifStmt | printStmt | block ;
exprStmt    -> expression ";" ;
ifStmt      -> "if" "(" expression ")" statement
               ( "else" statement )? ;
printStmt   -> "print" expression ";" ;
block       -> "{" declaration* "}" ;
expression  -> assignment ;
assignment  -> IDENTIFIER "=" assignment | ternary ;
ternary     -> equality ( "?" primary ":" primary )? ;
equality    -> comparison ( ( "!=" | "==" ) comparison )* ;
comparison  -> term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
term        -> factor ( ( "-" | "+" ) factor )* ;
factor      -> unary ( ( "/" | "*" ) unary )* ;
unary       -> ( "-" | "!" ) unary | primary ;
primary     -> NUMBER | STRING | "true" | "false" | "nil" | "(" expression ")" | IDENTIFIER ;
```

Where,

- '*' — zero or more times;
- '+' — one or more times;
- '?' — zero or one time but not more;
