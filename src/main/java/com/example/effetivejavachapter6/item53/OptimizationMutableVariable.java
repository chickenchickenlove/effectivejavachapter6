package com.example.effetivejavachapter6.item53;

public class OptimizationMutableVariable {
    // 배열 재할당 문제로 가변인수가 병목 구간이 될 경우,
    // 아래처럼 오버로딩을 통해 해결할 수 있음.
    public void foo() {}
    public void foo(int a){}
    public void foo(int a, int b){}
    public void foo(int a, int b, int c){}
    public void foo(int a, int b, int c, int... args) {}
}
