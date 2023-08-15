package com.example.effetivejavachapter6.item49;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class ShouldCatchExceptionBefore {

    @Getter
    @RequiredArgsConstructor
    static class NullPointer {private final String myObject;}

    public NullPointer doSomething(String myString) {
        NullPointer nullPointer = this.create(myString);
        print(nullPointer);
        return nullPointer;
    }

    private NullPointer create(String myString) {
        assert myString != null;
        return new NullPointer(myString);

    }

    private void print(NullPointer nullPointer) {
        System.out.println("nullPointer.myString = " + nullPointer.getMyObject());
    }
}
