package com.example.effetivejavachapter6.item76;

import java.util.EmptyStackException;

public class AtomicFailure1 {
    private int size = 0;
    private final String[] elements = new String[10];

    public Object pop() {
        // 실패할만한 코드.
        int nextSize = size - 1;
        Object result = elements[nextSize];

        // 상태 바뀌는 연산.
        elements[nextSize] = null;
        this.size = nextSize;
        return result;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {

        AtomicFailure1 notAtomicFailure = new AtomicFailure1();
        try {
            Object pop = notAtomicFailure.pop();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(notAtomicFailure.getSize());
        }
    }
}
