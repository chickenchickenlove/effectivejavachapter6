package com.example.effetivejavachapter6.item76;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class NonAtomicFailureCaseWithConcurrentModification {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        try {
            for (String item : list) {
                if (item.equals("one")) {
                    list.remove(item); // 여기서 ConcurrentModificationException이 발생합니다.
                }
            }
        } catch (ConcurrentModificationException e) {
            list.forEach(s -> System.out.println(s));
        }
    }

}
