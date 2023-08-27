package com.example.effetivejavachapter6.item71;

public class ThrowCheckExceptionRefactor {

    static class CheckedException extends Exception {}

    public boolean canAction(String arg) {
        return arg == null;
    }

    public void action(String arg){
        System.out.println(arg);
    }

    public static void main(String[] args) {
        ThrowCheckExceptionRefactor throwCheckExceptionRefactor = new ThrowCheckExceptionRefactor();
        String arg = "abc";
        if (throwCheckExceptionRefactor.canAction(arg)) {
            throwCheckExceptionRefactor.action(arg);
        } else {
            System.out.println("error 발생");
        }
    }
}
