package com.example.effetivejavachapter6.item63;

import org.junit.jupiter.api.Test;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class GoodStringConcatTest {

    @Test
    void test1() {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        String result = "";
        long s1 = System.currentTimeMillis();
        for (String s : list) {
            result += s;
        }
        long e1 = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        long s2 = System.currentTimeMillis();
        for (String s : list) {
            builder.append(s);
        }
        long e2 = System.currentTimeMillis();

        long t1 = e1 - s1;
        long t2 = e2 - s2;
        System.out.println("문자열 덧셈 걸린 시간 " + t1);
        System.out.println("Builder 걸린 시간 " + t2);
    }

}