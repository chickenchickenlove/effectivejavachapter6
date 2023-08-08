package com.example.item44;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class CacheLinkedHashMapWithLambda extends LinkedHashMap {

    private final Predicate<Map.Entry> judge;

    public CacheLinkedHashMapWithLambda(Predicate<Map.Entry> function) {
        this.judge = function;
    }
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.judge.test(eldest);
    }

    public static void main(String[] args) {
        CacheLinkedHashMapWithLambda map = new CacheLinkedHashMapWithLambda(entry -> false);
    }
}
