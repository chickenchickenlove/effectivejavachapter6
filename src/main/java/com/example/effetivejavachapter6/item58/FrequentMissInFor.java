package com.example.effetivejavachapter6.item58;

import java.util.Iterator;
import java.util.List;

public class GoodForCase {

    public void badCase() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] intArray = new int[10];

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
        }

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
        }

        for (int i = 0; i < intArray.length; i++) {
            int i1 = intArray[i];
        }

        for (int i : list) {
            System.out.println(i);
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }

}
