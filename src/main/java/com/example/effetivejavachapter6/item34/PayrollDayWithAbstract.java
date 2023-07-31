package com.example.effetivejavachapter6.item34;

public enum PayrollDayWithAbstract {

    MONDAY{
        public int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                    0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            return basePay + overtimePay;
        }
    },
    TUESDAY{
        public int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                    0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            return basePay + overtimePay;
    }},
    WEDNESDAY{
        public int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                    0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            return basePay + overtimePay;
        }
    },
    THURSDAY{
        public int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay = minutesWorked <= MINS_PER_SHIFT ?
                    0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            return basePay + overtimePay;
        }

    },
    FRIDAY{
        public int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay = basePay / 2;
            return basePay + overtimePay;
        }
    },
    SATURDAY{
        public int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overtimePay = basePay / 2;
            return basePay + overtimePay;
        }
    },
    SUNDAY{
        public int pay(int minutesWorked, int payRate) {
            return 0;
        }
    };

    private static final int MINS_PER_SHIFT = 8 * 60;


    public abstract int pay(int minutesWorked, int payRate);
}
