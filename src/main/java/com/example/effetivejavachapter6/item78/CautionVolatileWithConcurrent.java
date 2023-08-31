package com.example.effetivejavachapter6.item78;

import java.util.concurrent.atomic.AtomicInteger;

public class CautionVolatileWithConcurrent {

    private static AtomicInteger a = new AtomicInteger(0);
    // a++ 원자적으로 연산 안됨.
    public static void increment() {
        a.getAndIncrement();
    }
}
