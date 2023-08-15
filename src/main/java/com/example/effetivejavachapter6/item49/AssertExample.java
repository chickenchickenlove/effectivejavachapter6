package com.example.effetivejavachapter6.item49;

public class AssertExample {

    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset < a.length;
        assert length >= 0 && length <= a.length - offset;
    }

}
