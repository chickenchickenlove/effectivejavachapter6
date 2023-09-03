package com.example.effetivejavachapter6.item79;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class WrongCase {

    public List<BiConsumer> consumers = new ArrayList<>();

    public synchronized void hello() {
        hello2();
    }

    public synchronized void hello3() {
        consumers.stream().forEach(biConsumer -> biConsumer.accept(new Object(), new Object()));
    }
    public void hello2() {
        System.out.println("fire");
    }
}
