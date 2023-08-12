package com.example.effetivejavachapter6.item45;

import java.util.List;

public class HardToStreamButCalculator {

    public static void main(String[] args) {
        List.of("a", "b", "c", "d").stream()
                .map(string -> string + "1234567890")
                .forEach(s -> System.out.println(s.charAt(0)));
    }
}
