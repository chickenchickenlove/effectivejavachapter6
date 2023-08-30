package com.example.effetivejavachapter6.item44;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

// 함수형 인터페이스는 기본적으로 제공되는 (java.util.fuction)을 사용하자.
public class MyCustomCastor {

    private final Function<Integer, String> caster;

    public MyCustomCastor(Function<Integer, String> caster) {
        this.caster = caster;
    }

    public String doCast(int number) {
        return caster.apply(number);
    }
}
