package com.example.effetivejavachapter6.item38;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        double x = 0.2;
        double y = 0.3;
        test(ExtendedOperation.class, x, y);
        testCollections(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void testCollections(List<ExtendedOperation> asList, double x, double y) {
        for (ExtendedOperation exp : asList) {
            System.out.printf("%f %s %f = %f%n",
                    x, exp, y, exp.apply(x, y));
        }
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> enumType, double x, double y) {
        for (T exp : enumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n",
                    x, exp, y, exp.apply(x, y));
        }
    }
}
