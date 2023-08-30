package com.example.effetivejavachapter6.item69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FailCase {

    static class Climber {

        public void climb() {

        }
    }

    // 아래 코드는 무엇을 의미할까?
    public static void main(String[] args) {
        Climber[] range = new Climber[0];
        try {
            int i = 0;
            while (true) {
                range[i++].climb();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        for (Climber climber : range) {
            climber.climb();
        }


        ArrayList<Climber> climbers = new ArrayList<>();
        for (Iterator<Climber> iterator = climbers.iterator(); iterator.hasNext();) {
            Climber climber = iterator.next();
            climber.climb();
        }
    }


}
