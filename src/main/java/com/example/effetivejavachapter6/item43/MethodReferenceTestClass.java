package com.example.effetivejavachapter6.item43;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

public class MethodReferenceTestClass {


    public static void main(String[] args) {

        final HashMap<String, Integer> map = new HashMap<>();
        final String key = "hello";

        // 람다식
        map.merge(key, 1, (n1, n2, n3, n4, n5, n6) -> n1, n2, n3, n4, n5, n6);

        // 메서드 참조
        map.merge(key, 1, Integer::sum);

        MethodReferenceTestClass methodReferenceTestClass = new MethodReferenceTestClass();
        methodReferenceTestClass.myFunction(integer -> );

    }

    public void myFunction(Function<Integer, Integer> func) {



    }


    public static int addAllNumber(int ... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
    }







}
