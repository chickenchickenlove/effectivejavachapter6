package com.example.effetivejavachapter6.item44;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodCaseFunctionalInterface {


    public void doSomething(int n1, int n2, Action action) {
        log.info("action called");
        action.execute(5, 10);
    }

    public void doSomething(Transformer transformer, int n1, int n2) {
        log.info("transformer called");
        transformer.translate(5, 10);
    }

    public static void main(String[] args) {

        GoodCaseFunctionalInterface sut = new GoodCaseFunctionalInterface();
        sut.doSomething(1, 2, (x,y) -> x + y);
    }

    @FunctionalInterface
    static interface Action {
        int execute(int value1, int value2);
    }

    @FunctionalInterface
    static interface Transformer{
        int translate(int value1, int value2);
    }


}
