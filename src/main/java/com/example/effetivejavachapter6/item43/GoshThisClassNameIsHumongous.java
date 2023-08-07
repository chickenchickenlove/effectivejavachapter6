package com.example.effetivejavachapter6.item43;

public class GoshThisClassNameIsHumongous {

    public void hello() {
        // 람다식이 메서드 참조보다 더 간편함.
        hello1(() -> action());
        hello1(GoshThisClassNameIsHumongous::action);
    }

    public void hello1(Runnable runnable) {

    }

    public static void action() {
        System.out.println("true = " + true);
    }
}
