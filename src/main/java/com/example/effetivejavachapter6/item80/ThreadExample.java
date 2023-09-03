package com.example.effetivejavachapter6.item80;

public class ThreadExample {

    public static void main(String[] args) {
        // Task 정의
        Thread thread = new Thread(() -> System.out.println("hello"));

        // 실행 메커니즘 정의.
        thread.start();
    }
}
