package com.example.effetivejavachapter6.item43;

import java.util.HashMap;

public class TestCode {

    public static void main(String[] args) {


        final HashMap<String, Integer> map = new HashMap<>();
        final String key = "hello";

        // 람다식
        map.merge(key, 1, (count, incr) -> count + incr);

        // 메서드 참조
        map.merge(key, 1, Integer::sum);


//        map.merge(key, 1, (num1, num2, num3, num4, num5) -> num1 + num2 + num3 + num4 + num5);
//        map.merge(key, 1, Integer::sum);
    }
}
