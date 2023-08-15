package com.example.effetivejavachapter6.item73;

import lombok.RequiredArgsConstructor;

import java.nio.channels.AcceptPendingException;

public class GoodExceptionTranslator {

    @RequiredArgsConstructor
    static class GoodHighClass {
        private final GoodLowClass lowClass;
        public void doSomething(){
            try {
                lowClass.throwError();
            } catch (RuntimeException e) {
                System.out.println();
            }
        }
    }

    static interface GoodLowClass {
        void throwError();
    }

    static class GoodLowClassV2 implements GoodLowClass {
        @Override
        public void throwError() {
            try {
                throw new AcceptPendingException();
            } catch (AcceptPendingException e) {
                throw new RuntimeException();
            }

        }
    }

    static class GoodLowClassV1 implements GoodLowClass {
        @Override
        public void throwError(){
            try {
                throw new IndexOutOfBoundsException();
            } catch (AcceptPendingException e) {
                throw new RuntimeException();
            }
        }
    }
}
