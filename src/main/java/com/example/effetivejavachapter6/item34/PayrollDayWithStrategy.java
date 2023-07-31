package com.example.effetivejavachapter6.item34;

import static com.example.effetivejavachapter6.item34.PayrollDayWithStrategy.PayType.*;

public enum PayrollDayWithStrategy {

    MONDAY(WEEKDAY), TUESDAY(WEEKDAY), WEDNESDAY(WEEKDAY), THURSDAY(WEEKDAY), FRIDAY(WEEKDAY),
    SATURDAY(WEEKEND), SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDayWithStrategy(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    enum PayType {
        WEEKDAY{
            int overtimePay(int mins, int payRate) {
                return  mins <= MINS_PER_SHIFT ?
                        0 : (mins - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND{
            int overtimePay(int mins, int payRate) {
                return (mins * payRate) / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;
            int overTimePay = overtimePay(minutesWorked, payRate);
            return basePay + overTimePay;
        }
    }
}
