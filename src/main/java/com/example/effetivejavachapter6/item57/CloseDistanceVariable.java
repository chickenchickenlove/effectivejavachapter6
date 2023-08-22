package com.example.effetivejavachapter6.item57;

import java.util.List;

public class CloseDistanceVariable {

    public void tooLong() {
        int value = 0;
        int k = 10;
        int v = 10;
        int abc = 10;


        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7);

        for (Integer i : integerList) {
            value += i;
        }
    }

    public void good() {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7);

        int value = 0;
        for (Integer i : integerList) {
            value += i;
        }
    }

    public void whereIs() {
        int k = 0;
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7);
        for (Integer integer : integerList) {
            int i = 0;
        }
        // 지역변수 범위 한정됨. 컴파일 에러 발생.
        // System.out.println("i = " + i);
    }

    public void iter() {

        while (true) {
            int i = 0;
        }
//        System.out.println(i);
    }

    public void tryCatchWith() {

        int i = 0;
        try {
            i = 0;
        } catch (Exception e) {
            System.out.println("error");
       }
        int sum = i + 1;
    }




}
