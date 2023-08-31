package com.example.effetivejavachapter6.item78;

public class NotAtomicCase {

    private int a;
    private int b;

    public void notAtomicCase() {
        a++;
        b = b + a;
    }

    public synchronized void atomicCase() {
        a++;
        b = b + a;
    }
}
