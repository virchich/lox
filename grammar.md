# Lox Grammar

```text
program     -> declaration* EOF ;
declaration -> varDecl | statement ;
varDecl     -> "var" IDENTIFIER ( "=" expression )? ";" ;
statement   -> exprStmt | ifStmt | printStmt | whileStmt | block ;
whileStmt   -> "while" "(" expression ")" statement ;
exprStmt    -> expression ";" ;
ifStmt      -> "if" "(" expression ")" statement
               ( "else" statement )? ;
printStmt   -> "print" expression ";" ;
block       -> "{" declaration* "}" ;
expression  -> assignment ;
assignment  -> IDENTIFIER "=" assignment | logic_or | ternary ;
logic_or    -> logic_and ( "or" logic_and )* ;
logic_and   -> equality ( "and" equality )* ;
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
