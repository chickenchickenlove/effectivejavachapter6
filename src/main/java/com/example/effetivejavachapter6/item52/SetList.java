package com.example.effetivejavachapter6.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// 다중정의 메서드의 오토박싱 + 제네릭의 환상콤보
public class SetList {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }

        System.out.println(set + " " + list);
    }
}
