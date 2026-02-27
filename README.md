# Lox

A tree-walk interpreter for the [Lox language](https://craftinginterpreters.com/the-lox-language.html), built in Java by following Part II (jlox) of [*Crafting Interpreters*](https://craftinginterpreters.com/) by Robert Nystrom.

This is a learning project — not a production tool.

## What's implemented

All chapters from Part II of the book are covered:

| Chapter | Feature | Status |
|---------|---------|--------|
| 4 | Scanning (lexer) | ✅ |
| 5–6 | Parsing (recursive descent) | ✅ |
| 7 | Evaluating expressions | ✅ |
| 8 | Statements and state (variables, scoping) | ✅ |
| 9 | Control flow (`if`, `while`, `for`) | ✅ |
| 10 | Functions and closures | ✅ |
| 11 | Resolving and binding (static analysis pass) | ✅ |
| 12 | Classes (methods, `this`, constructors) | ✅ |
| 13 | Inheritance (`super`, method lookup chain) | ✅ |

### Extensions beyond the book

- **Ternary operator** (`condition ? a : b`) — a book challenge, fully wired through parser, resolver, and interpreter
- **Nested block comments** (`/* /* ... */ */`) — tracks nesting depth
- **String + number concatenation** (`"value: " + 42` → `"value: 42"`)
- **Single-character string comparison** (`"a" < "b"` using char codes)

## Building and running

Requires Java and Maven.

```sh
mvn package
```

Run a file:

```sh
java -cp target/lox-1.0.0-Alpha.0.jar com.lox.Lox main.lox
```

Start the REPL:

```sh
java -cp target/lox-1.0.0-Alpha.0.jar com.lox.Lox
```

## Example

`main.lox`:

```lox
class D {
  cook() {
    print "Fry until golden brown.";
  }
}

class B < D {
  cook() {
    super.cook();
    print "Pipe full of custard and coat with chocolate.";
  }
}

var b = B();
b.cook();
```

Output:

```
Fry until golden brown.
Pipe full of custard and coat with chocolate.
```

## Grammar

See [`grammar.md`](grammar.md) for the full BNF grammar.
