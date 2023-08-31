package com.example.effetivejavachapter6.item78;

import java.util.concurrent.TimeUnit;

public class StopThreadSynchronized {
    private static boolean stopRequested;
    public static synchronized boolean getStopRequested() { return stopRequested; }
    public static synchronized void setStopRequested(boolean b) { stopRequested = b; }
    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!getStopRequested())
                i++;
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        setStopRequested(true);
    }
}
