package com.example.effetivejavachapter6.item61;

public class unittest {

    public static void main(String[] args) {
        Long sumLong = 0L;
        int limit = 100000000;

        long s1 = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            sumLong += i;
        }
        long t1 = System.currentTimeMillis() - s1;


        long sum = 0L;
        long s2 = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            sum += i;
        }
        long t2 = System.currentTimeMillis() - s2;

        System.out.println(t1);
        System.out.println(t2);
    }
}
