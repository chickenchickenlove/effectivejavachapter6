package com.example.effetivejavachapter6.item76;

public class NotAtomicFailure {
    private int size = 0;
    private final String[] elements = new String[10];

    public Object pop() {
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {

        NotAtomicFailure notAtomicFailure = new NotAtomicFailure();
        try {
            Object pop = notAtomicFailure.pop();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(notAtomicFailure.getSize());
        }
    }
}
