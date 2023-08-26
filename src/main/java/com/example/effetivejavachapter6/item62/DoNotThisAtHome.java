package com.example.effetivejavachapter6.item62;

public class DoNotThisAtHome {

    public static void main(String[] args) {
        String className = "A";
        String value = "B";

        String compoundKey = className + "#" + value;
    }

    static class CompoundKey{
        private final String className;
        private final String value;

        public CompoundKey(String className, String value) {
            this.className = className;
            this.value = value;
        }

        public void addFunction(){}
    }

}
