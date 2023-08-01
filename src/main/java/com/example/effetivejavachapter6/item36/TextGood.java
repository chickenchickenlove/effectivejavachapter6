package com.example.effetivejavachapter6.item36;

import java.util.EnumSet;

import static com.example.effetivejavachapter6.item36.TextGood.Style.*;

// EnumSet은 비트 벡터로 구현되어있고, 각 메서드는 비트 연산을 의미함.
// 비트 연산이 구현되어 있어 속도가 빠르고, Enum으로 표현되어 표현력도 좋음.
public class TextGood {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH;}

    public static EnumSet<Style> styleMap = EnumSet.allOf(Style.class);


    public void applyStyles(EnumSet<Style> style) {
        System.out.println(style);
    }

    public static void main(String[] args) {
        TextGood textWrong = new TextGood();
        textWrong.applyStyles(EnumSet.of(BOLD, ITALIC)); //  BOLD | ITALIC이라는 비트 연산 대신, EnumSet.of()라는 OR 연산을 사용하자.
    }
}
