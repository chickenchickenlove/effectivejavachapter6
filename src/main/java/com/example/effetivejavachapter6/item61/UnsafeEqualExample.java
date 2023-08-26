package com.example.effetivejavachapter6.item61;

import java.util.Comparator;

public class UnsafeEqualExample {

    public static Comparator<Integer> naturalOrder =
            (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

    public static void main(String[] args) {
        Integer i1 = new Integer(42);
        Integer i2 = new Integer(42);
        int result = naturalOrder.compare(i1, i2);
        System.out.println("result = " + result);
    }
}
