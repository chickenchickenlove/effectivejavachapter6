package com.example.effetivejavachapter6.item35;

// ITEM 35 : ordinal()은 가급적이면 사용하지 마라. 필요한 값은 생성자에 넣고 사용해라.
public enum NumberGood {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    private final int number;

    NumberGood(int number) {
        this.number = number;
    }

    public int numberOfMusicians() {
        return this.number;
    }
}
