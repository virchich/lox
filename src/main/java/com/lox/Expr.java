package com.lox;

abstract class Expr {
    abstract <R> R accept(Visitor<R> visitor);

    interface Visitor<R> {
        R visitBinaryExpr(Binary expr);

        R visitGroupingExpr(Grouping expr);

        R visitLiteralExpr(Literal expr);

        R visitUnaryExpr(Unary expr);
    }

    public static class Binary extends Expr {
        final Expr left;
        final Token operator;
        final Expr right;

        Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitBinaryExpr(this);
        }

        @Override
        public String toString() {
            return "Binary{" +
                    "left=" + left +
                    ", operator=" + operator +
                    ", right=" + right +
                    '}';
        }
    }

    public static class Grouping extends Expr {
        final Expr expression;

        Grouping(Expr expression) {
            this.expression = expression;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitGroupingExpr(this);
        }

        @Override
        public String toString() {
            return "Grouping{" +
                    "expression=" + expression +
                    '}';
        }
    }

    public static class Literal extends Expr {
        final Object value;

        Literal(Object value) {
            this.value = value;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitLiteralExpr(this);
        }

        @Override
        public String toString() {
            return "Literal{" +
                    "value=" + value +
                    '}';
        }
    }

    public static class Unary extends Expr {
        final Token operator;
        final Expr right;

        Unary(Token operator, Expr right) {
            this.operator = operator;
            this.right = right;
        }

        @Override
        <R> R accept(Visitor<R> visitor) {
            return visitor.visitUnaryExpr(this);
        }

        @Override
        public String toString() {
            return "Unary{" +
                    "operator=" + operator +
                    ", right=" + right +
                    '}';
        }
    }
}
