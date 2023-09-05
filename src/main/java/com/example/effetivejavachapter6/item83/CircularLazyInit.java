package com.example.effetivejavachapter6.item83;

// 지연 초기화에 의한 초기화 순환 참조 발생 → StackOverFlow 발생.
public class CircularLazyInit {

    static class ServiceA{
        private static ServiceA instance;
        private ServiceB serviceB;

        public ServiceA() {
            this.serviceB = ServiceB.getInstance();
        }

        public static ServiceA getInstance() {
            if (instance == null) {
                instance = new ServiceA();
            }
            return instance;
        }
    }

    static class ServiceB {
        private static ServiceB instance;
        private ServiceA serviceA;

        public ServiceB() {
            this.serviceA = ServiceA.getInstance();
        }

        public static ServiceB getInstance() {
            if (instance == null) {
                instance = new ServiceB();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        ServiceA instance = ServiceA.getInstance();
        System.out.println(instance);
    }
}
