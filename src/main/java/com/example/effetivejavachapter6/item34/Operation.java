package com.example.effetivejavachapter6.item34;

// Switch로 enum 상수별로 다른 동작을 할 수 있지만,
// 기술적으로 동작할 수 없는 부분까지 컴파일 에러 때문에 AssertionError()를 해주어야 함.
    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE;

        public double apply(double x, double y) {

            switch (this) {
                case PLUS: return (x + y);
                case MINUS: return (x - y);
                case TIMES: return (x * y);
                case DIVIDE: return (x / y);
            }

            throw new AssertionError("unknown operation : " + this);
        }
    }
