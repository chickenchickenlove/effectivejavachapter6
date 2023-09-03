package com.example.effetivejavachapter6.item79.improve1;

import com.google.common.collect.ForwardingSet;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObservablesSet<E> extends ForwardingSet<E> {

    private final List<SetObserver> observers = new ArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

    private void notifyElementAdded(E element) {

        final List<SetObserver> snapshot;
//         외계인 메서드 호출되는 부분 --> 동기화 영역 바깥으로 분리.
        synchronized (observers) {
            snapshot = new ArrayList<>(observers);
        }
        for (SetObserver observer : snapshot) {
            observer.added(this, element);
        }
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added) {
            notifyElementAdded(element);
        }
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        boolean result = false;
        for (E element : collection) {
            result |= add(element);
        }
        return result;
    }

    @Override
    protected Set<E> delegate() {
        return new HashSet<>();
    }

    public static void main(String[] args) {

        // Normal.
        // method1();

        // ConcurrentModificationException
        // method2();

        // Deadlock Case
        method3();
    }


    public static void method1() {
        ObservablesSet<Integer> set = new ObservablesSet<>();
        set.addObserver((s, e) -> System.out.println(e));

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }

    // ConcurrentModificationException.
    public static void method2() {
        ObservablesSet<Integer> set = new ObservablesSet<>();
        set.addObserver(new SetObserver<>() {
            @Override
            public void added(ObservablesSet<Integer> set, Integer element) {
                if (element == 21) {
                    set.removeObserver(this);
                }
                System.out.println(element);
            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }

    // DeadLock
    public static void method3() {
        ObservablesSet<Integer> set = new ObservablesSet<>();
        set.addObserver(new SetObserver<>() {
            @Override
            public void added(ObservablesSet<Integer> set, Integer element) {
                if (element == 21) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    try {
                        executor.submit(() -> set.removeObserver(this)).get();
                    } catch (ExecutionException |InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        executor.shutdown();
                    }
                }
                System.out.println(element);
            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }
}
