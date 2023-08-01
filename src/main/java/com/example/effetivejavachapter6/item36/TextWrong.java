package com.example.effetivejavachapter6.item36;

// 구닥다리 비트 열거
public class TextWrong {

    // 각각은 비트 연산을 나타냄.
    public static final int STYLE_BOLD =            1 << 0; // 1
    public static final int STYLE_ITALIC =          1 << 1; // 2
    public static final int STYLE_UNDERLINE =       1 << 2; // 4
    public static final int STYLE_STRIKETHROUGH =   1 << 2; // 8

    // 매개변수 styles는 0개 이상의 STYLE_ 상수를 비트별 OR한 값이다.
    public void applyStyles(int style) {
        System.out.println(style);
    }

    public static void main(String[] args) {
        TextWrong textWrong = new TextWrong();
        textWrong.applyStyles(STYLE_BOLD | STYLE_ITALIC); // 굳이 이런 비트 연산을 직접 할 필요가 있을까?
    }
}
