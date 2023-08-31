package com.example.effetivejavachapter6.item78;

public class EffectiveImmutableInstance {
    private final String name;
    private int age;

    public EffectiveImmutableInstance(String name) {
        this.name = name;
        this.age = 0;
    }

    public synchronized void updateAge(int age) {
        this.age = age;
    }

    public synchronized int getAge() {
        return this.age;
    }
}
