package com.lox;

public class RpnAstPrinter extends AstPrinter implements Expr.Visitor<String> {

    @Override
    public String visitGroupingExpr(Expr.Grouping expr) {
        return parenthesize("", expr.expression);
    }

    @Override
    protected String parenthesize(String name, Expr... expressions) {
        StringBuilder builder = new StringBuilder();

        for (Expr expr : expressions) {
            builder.append(expr.accept(this));
            builder.append(" ");
        }
        builder.append(name);

        return builder.toString();
    }
}
