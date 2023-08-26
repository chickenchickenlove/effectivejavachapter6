package com.example.effetivejavachapter6.item62;

public class ThreadLocal1 {
    // 객체 생성 불가.
    private ThreadLocal1() {}

    // 현 스레드의 값을 키로 구분해 저장한다.
    public static void set(String key, Object value) {};

    // (키가 가리키는) 현 스레드의 값을 반환한다.
    public static Object get(String key) {return null; }
}
