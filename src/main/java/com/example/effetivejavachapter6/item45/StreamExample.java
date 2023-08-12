package com.example.effetivejavachapter6.item45;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {


        List<List<Integer>> lists = List.of(List.of(1, 2, 3, 4, 5), List.of(10, 100, 1000, 10000));

        System.out.println("**** NO FLATMAP ****");
        lists.stream()
                .forEach(integers -> System.out.println(integers));


        System.out.println("**** WITH FLATMAP ****");
        lists.stream()
                .flatMap(integers -> integers.stream())
                .forEach(integer -> System.out.println(integer));
    }

}
