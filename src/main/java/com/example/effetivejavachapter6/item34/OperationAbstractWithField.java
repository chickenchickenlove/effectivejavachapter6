package com.example.effetivejavachapter6.item34;


public enum OperationAbstractWithField {
    PLUS("+"){
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-"){
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE("/"){
        public double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    OperationAbstractWithField(String symbol) {
        this.symbol = symbol;
    }

    public String symbol() {
        return this.symbol;
    }

    public abstract double apply(double x, double y);

}
