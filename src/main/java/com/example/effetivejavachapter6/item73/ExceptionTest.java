package com.example.effetivejavachapter6.item73;

public class ExceptionTest {


    public void test() {
        try {
            System.out.println("true = " + true);
        } catch (IndexOutOfBoundsException cause) {
            cause.getCause(); // 필요하면 이걸로 확인.
            // cause.initCause(); // 필요하면 이걸로 cause 추가.
            throw new RuntimeException(cause);
        }
    }
}
