package com.example.effetivejavachapter6.item42;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // 익명 클래스
        Collections.sort(List.of("A", "B"), new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });


        // 람다식
        Collections.sort(List.of("A", "B"),
                (s1, s2) -> Integer.compare(s1.length(), s2.length()));

    }


}
