package com.example.effetivejavachapter6.item80;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public void test() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 작업 단위 정의
        Callable<String> stringCallable = () -> {
            System.out.println("hello");
            return "hello";
        };

        Future<String> submit = executorService.submit(stringCallable);
        try {
            String result = submit.get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
