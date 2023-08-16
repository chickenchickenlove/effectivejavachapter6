package com.example.effetivejavachapter6.item76;

import java.util.EmptyStackException;

public class AtomicFailure {
    private int size = 0;
    private final String[] elements = new String[10];

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {

        AtomicFailure notAtomicFailure = new AtomicFailure();
        try {
            Object pop = notAtomicFailure.pop();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(notAtomicFailure.getSize());
        }
    }
}
