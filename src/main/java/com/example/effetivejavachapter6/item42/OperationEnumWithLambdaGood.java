package com.example.effetivejavachapter6.item42;

import java.util.function.DoubleBinaryOperator;

public enum OperationEnumWithLambdaGood {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIME("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    OperationEnumWithLambdaGood(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    private final String symbol;
    private final DoubleBinaryOperator op;

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
