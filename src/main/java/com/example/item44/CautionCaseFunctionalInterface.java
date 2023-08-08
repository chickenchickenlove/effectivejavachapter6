package com.example.item44;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

@Slf4j
public class CautionCaseFunctionalInterface {


    public void doSomething(Action action) {
        log.info("action called");
        action.execute(5, 10);
    }

    public void doSomething(Transformer transformer) {
        log.info("transformer called");
        transformer.translate(5, 10);
    }

    public static void main(String[] args) {

        CautionCaseFunctionalInterface sut = new CautionCaseFunctionalInterface();
//        sut.doSomething((x,y) -> x + y);
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
