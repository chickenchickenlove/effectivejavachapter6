package com.example.effetivejavachapter6.item52;

import java.math.BigInteger;
import java.util.*;


// 다중정의는 컴파일 시점에 기록된 타입으로 어떤 메서드가 호출될지 결정됨.
public class CollectionClassifier {

    public static String classify(Set<?> s) {
        return "집합";
    }

    public static String classify(List<?> list) {
        return "리스트";
    }

    public static String classify(Collection<?> c) {
        return "그 외";
    }

    public static void main(String[] args) {
        Collection<?>[] collections =
                {
                        new HashSet<String>(),
                        new ArrayList<BigInteger>(),
                        new HashMap<String, String>().values()};

        for (Collection<?> collection : collections) {
            System.out.println(classify(collection));
        }
    }

}
