package com.example.effetivejavachapter6.item83;

// 지연 초기화에 의한 초기화 순환 참조 발생 → StackOverFlow 발생.
public class CircularLazyInit2 {

    static class ServiceA {
        private static ServiceA instance;
        private ServiceB serviceB;

        private ServiceA() {
            serviceB = ServiceB.getInstance();
        }

        public static ServiceA getInstance() {
            synchronized (ServiceA.class) {
                if (instance == null) {
                    instance = new ServiceA();
                }
            }
            return instance;
        }
    }

    static class ServiceB {
        private static ServiceB instance;
        private ServiceA serviceA;

        private ServiceB() {
            serviceA = ServiceA.getInstance();
        }

        public static ServiceB getInstance() {
            synchronized (ServiceB.class) {
                if (instance == null) {
                    instance = new ServiceB();
                }
            }
            return instance;
        }
    }


    public static void main(String[] args) {
        ServiceA instance = ServiceA.getInstance();
        System.out.println(instance);
    }
}
