package com.example.effetivejavachapter6.item79;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnescapeableCase {

    private static int value;

    public synchronized void increment(int newValue) {
        String threadName = Thread.currentThread().getName();
        System.out.printf("threadName : %s , value : %d \n", threadName, value);
        value = newValue;
        System.out.printf("threadName : %s , value : %d \n", threadName, value);

    }

    public static void main(String[] args) throws InterruptedException {

        int threadSize = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(threadSize);

        CountDownLatch latch = new CountDownLatch(threadSize);
        for (int i = 0; i < 3; i++) {
            int index = i;
            executorService.submit(() -> {
                new UnescapeableCase().increment(index);
                latch.countDown();
            });
        }

        latch.await();
        System.out.println(UnescapeableCase.value);
    }
}
