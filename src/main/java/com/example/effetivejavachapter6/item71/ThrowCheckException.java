package com.example.effetivejavachapter6.item71;

import java.net.BindException;

public class ThrowCheckException {

    static class CheckedException extends Exception {
    }

    public void action(String arg) throws CheckedException {
        if (arg == null) {
            throw new CheckedException();
        }
        System.out.println(arg);
    }

    public static void main(String[] args) {

        ThrowCheckException throwCheckException = new ThrowCheckException();
        try {
            throwCheckException.action(null);
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }
}
