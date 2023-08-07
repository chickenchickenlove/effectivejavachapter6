package com.example.effetivejavachapter6.item43;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReferenceTestClass {


    public static void main(String[] args) {

        final HashMap<String, Integer> map = new HashMap<>();
        final String key = "hello";


        // 람다식
        map.merge(key, 1, (n1, n2) -> (n1 + n2) * n2 * n1);

        // 메서드 참조
        map.merge(key, 1, Integer::sum);

        String myString = "hello";
        myString.toUpperCase();

        // 비한정적 메서드 참조
        MethodReferenceTestClass r1 = new MethodReferenceTestClass();
        MethodReferenceTestClass r2 = new MethodReferenceTestClass();
        MethodReferenceTestClass r3 = new MethodReferenceTestClass();
        List<MethodReferenceTestClass> myList = List.of(r1, r2, r3);

        myList.stream()
                .map(MethodReferenceTestClass::getName)
                .collect(Collectors.toList());


        // 한정적 메서드 참조
        String str = "hello";
        Supplier<String> supplier = str::toUpperCase;

        // 정적 메서드 참조
        Function<Double, Double> sqrt = Math::sqrt;


    }

    public String getName() {
        return this.toString();
    }
}
