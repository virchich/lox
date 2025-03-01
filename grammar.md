# Lox Grammar

```text
expression  -> ternary ;
ternary     -> equality ( "?" primary ":" primary )? ;
equality    -> comparison ( ( "!=" | "==" ) comparison )* ;
comparison  -> term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
term        -> factor ( ( "-" | "+" ) factor )* ;
factor      -> unary ( ( "/" | "*" ) unary )* ;
unary       -> ( "-" | "!" ) unary | primary ;
primary     -> NUMBER | STRING | "true" | "false" | "nil" | "(" expression ")" ;
```

Where,

- '*' — zero or more times;
- '+' — one or more times;
- '?' — zero or one time but not more;
