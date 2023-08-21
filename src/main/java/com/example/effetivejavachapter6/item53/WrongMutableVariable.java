package com.example.effetivejavachapter6.item53;

public class WrongMutableVariable {

    static int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }

        return sum;
    }


    static int min(int... args) {
        // 가변인수에는 Null도 올 수 있음.
        // 이 경우 문제가 발생함.
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            min = Math.min(min, args[i]);
        }

        return min;
    }

    static int minSafe(int... args) {
        // 가변인수에는 Null도 올 수 있음.
        // 이 경우 문제가 발생함.
        if (args.length == 0) {
            throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");
        }

        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            min = Math.min(min, args[i]);
        }

        return min;
    }

    static int minRightSafe(int firstValue, int... args) {
        int min = firstValue;
        for (int arg : args) {
            min = Math.min(min, arg);
        }

        return min;
    }


    public static void main(String[] args) {
        int sum = sum();
        System.out.println(sum);

        int min = min();
        System.out.println(min);

        int minSafe = minSafe();
        System.out.println(minSafe);


    }


}
