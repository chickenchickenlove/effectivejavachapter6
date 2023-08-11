package com.example.effetivejavachapter6.item39;

public class SampleTest {
    @test(ArithmeticException.class)
    public static void m1(){
        int i = 0;
        i = i / i; // 성공/
    }
    @test(ArithmeticException.class)
    public static void m2(){
        int[] a= new int[0];
        int i = a[1]; // 다른 예외 발생
    }
    // 실패
    @test(ArithmeticException.class)
    public static void m4(){}

    public static void main(String[] args) throws ClassNotFoundException {
        String name = SampleTest.class.getName();
        RunTests.execute(name);
    }
}
