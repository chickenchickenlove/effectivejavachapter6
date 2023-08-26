package com.example.effetivejavachapter6.item63;

import java.util.List;

public class GoodStringConcat {

    // String은 불변 객체임. 두 문자열을 연결하기 위해서 양쪽 내용을 복사해서 붙여야 함.
    public static String slowStatement() {
        List<String> strings = List.of("A", "B", "C");
        String result = "";
        for (String string : strings) {
            result += string; // 문자열 연결
        }
        return result;
    }

    // Builder의 append() 메서드를 이용하면 빨라짐.
    public static String fastStatement() {
        List<String> strings = List.of("A", "B", "C");
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(slowStatement());
        System.out.println(fastStatement());
    }
}
