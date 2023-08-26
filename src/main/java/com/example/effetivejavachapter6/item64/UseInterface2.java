package com.example.effetivejavachapter6.item64;


import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UseInterface2 {

    static interface MyInterface {
        void sayHello();
    }

    static class MyConcreteInterface implements MyInterface{
        @Override
        public void sayHello() {

        }

        public void hello() {

        }
    }

    static class MyOtherConcreteInterface implements MyInterface{
        @Override
        public void sayHello() {
        }
    }

    public static void main(String[] args) {
        MyConcreteInterface myConcreteInterface = new MyConcreteInterface();
        myConcreteInterface.hello();
    }
}
