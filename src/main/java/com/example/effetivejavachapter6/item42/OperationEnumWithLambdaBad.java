package com.example.effetivejavachapter6.item42;

public enum OperationEnumWithLambdaBad {

    PLUS("+"){ @Override public double apply(double x, double y) {return x + y;}},
    MINUS("-"){ @Override public double apply(double x, double y) {return x - y;}},
    TIME("*"){ @Override public double apply(double x, double y) {return x * y;}},
    DIVIDE("/"){ @Override public double apply(double x, double y) {return x / y;}};

    OperationEnumWithLambdaBad(String symbol) {
        this.symbol = symbol;
    }

    private final String symbol;

    public abstract double apply(double x, double y);
}
