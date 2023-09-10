package com.example.effetivejavachapter6.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class ConcurrentStream {

    static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    // 병렬 스트림이 적당한 경우.
    static long piParallel(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    public static void main(String[] args) {

        int n = 500000;
        long s1 = System.currentTimeMillis();
        pi(n);
        long e1 = System.currentTimeMillis();


        long s2 = System.currentTimeMillis();
        piParallel(n);
        long e2 = System.currentTimeMillis();

        System.out.println(e1 - s1);
        System.out.println(e2 - s2);
    }
}
