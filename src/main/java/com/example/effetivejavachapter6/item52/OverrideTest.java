package com.example.effetivejavachapter6.item52;

import java.math.BigInteger;
import java.util.*;


// 재정의는 런타임 시점에 객체의 타입에 의해 결정됨.
public class OverrideTest {

    static class Wine {
        String name() {
            return "와인";
        }
    }

    static class SparklingWine extends Wine {
        @Override
        String name() {
            return "발포성 포도주";
        }
    }

    static class Champagne extends Wine {
        @Override
        String name() {
            return "샴페인";
        }
    }

    public static void main(String[] args) {
        List<Wine> wines = List.of(
                new Wine(), new SparklingWine(), new Champagne()
        );
        wines.forEach(wine -> System.out.println(wine.name()));
    }
}
