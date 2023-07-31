package com.example.effetivejavachapter6.item35;

// 이런 문제가 있음.
// 1. SIX = 6임. 그런데 six도 추가하고 싶다면?
// 2. Number 열거형에서 3을 제외하고 싶다면?
public enum NumberWrong {
    ONE, TWO, THREE, FOUR, FIVE, SIX;

    public int getCount() {
        return ordinal() + 1;
    }
}
