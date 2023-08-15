package com.example.effetivejavachapter6.item49;

public class UnintentedException {

    private static final int initValue = 10;


    public void testMethod(int num) {
        // will throw ArithmeticException
        if ((initValue / num > 0) && num > 0) {
            throw new RuntimeException();
        }
    }
}
