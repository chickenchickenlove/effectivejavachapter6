package com.example.effetivejavachapter6.item40;

import java.util.HashSet;
import java.util.Set;

public class HelloWrong {

    private final char first;
    private final char second;

    public HelloWrong(char first, char second) {
        this.first = first;
        this.second = second;
    }


    // @Override 없어서 다중정의 됨.
    public boolean equals(HelloWrong b) {
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {

        Set<HelloWrong> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new HelloWrong(ch, ch));
            }
        }
        System.out.println(s.size());
        System.out.println(s.size() == 26);
    }
}
