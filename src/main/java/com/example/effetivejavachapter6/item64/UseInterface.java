package com.example.effetivejavachapter6.item64;


import java.util.LinkedHashSet;
import java.util.Set;

public class UseInterface {

    public static void main(String[] args) {
        // Good example. use interface.
        Set<String> stringset = new LinkedHashSet<>();

        // Bad Example. use concrete class.
        LinkedHashSet<String> stringLinkedSet = new LinkedHashSet<>();
    }



}
