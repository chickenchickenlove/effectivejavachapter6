package com.example.effetivejavachapter6.item78;

import java.util.concurrent.TimeUnit;

public class CautionVolatile {
    private static volatile int a = 0;

    // a++ 원자적으로 연산 안됨.
    public static void increment() {
        a++;
    }
}
