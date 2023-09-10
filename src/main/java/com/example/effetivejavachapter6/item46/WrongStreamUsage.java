package com.example.effetivejavachapter6.item46;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class WrongStreamUsage {

    // Stream을 사용했으나 순수 함수가 아닌 경우.
    public static void main(String[] args) {
        final String file = "data data2 data3 data4 data";

        final Map<String, Long> freq = new HashMap<>();
        try (Stream<String> words = new Scanner(file).tokens()) {
            words.forEach(word ->
                freq.merge(word.toLowerCase(), 1L, Long::sum)); // stream에서 외부 객체(freq)의 상태를 변경함.
        }
        System.out.println(freq);
    }
}
