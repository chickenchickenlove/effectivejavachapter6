package com.example.effetivejavachapter6.item45;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Stream;

public class HardToStream {

    @RequiredArgsConstructor
    @Getter
    static class MyEntity {
        private final String name;
        private final int age;
    }

    public static void main(String[] args) {

        MyEntity a = new MyEntity("a", 1);
        MyEntity b = new MyEntity("b", 2);

        Stream.of(a,b)
            .map(MyEntity::getAge)
            .forEach(System.out::println);
    }
}
