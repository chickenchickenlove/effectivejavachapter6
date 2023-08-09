package com.example.effetivejavachapter6.item40;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HelloGood {

    private final char first;
    private final char second;

    public HelloGood(char first, char second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public boolean equals(Object b) {
        if (!(b instanceof HelloGood))
            return false;

        HelloGood bb = (HelloGood) b;
        return (bb.first == first) && (bb.second == second);
    }

    @Override
    public int hashCode() {return 31 * first + second;}


    public static void main(String[] args) {

        Set<HelloGood> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new HelloGood(ch, ch));
            }
        }
        System.out.println(s.size());
        System.out.println(s.size() == 26);
    }
}
