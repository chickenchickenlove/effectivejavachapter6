package com.example.effetivejavachapter6.item73;

import lombok.RequiredArgsConstructor;

import java.nio.channels.AcceptPendingException;

public class BadExceptionTranslator {

    @RequiredArgsConstructor
    static class BadHighClass {
        private final BadLowClass lowClass;
        public void doSomething(){
            try {
                lowClass.throwError();
            } catch (IndexOutOfBoundsException e) {
                System.out.println();
            }
        }
    }

    static interface BadLowClass {
        void throwError();
    }

    static class BadLowClassV2 implements BadLowClass {
        @Override
        public void throwError() {
            throw new AcceptPendingException();
        }
    }

    static class BadLowClassV1 implements BadLowClass {
        @Override
        public void throwError(){
            throw new IndexOutOfBoundsException();
        }
    }
}
