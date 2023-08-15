package com.example.effetivejavachapter6.item49;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FailureAtomic {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        try {
            update(integerList);
        } catch (Exception e) {
            System.out.println(integerList);
        }


    }

    public static void update(List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            Integer integer = integers.get(0);
            int newInteger = integer + 10;
            if (i == 1) {
                throw new RuntimeException();
            }
            integers.add(i, newInteger);
        }
    }
}
