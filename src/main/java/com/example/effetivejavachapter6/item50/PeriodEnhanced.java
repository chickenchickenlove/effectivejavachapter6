package com.example.effetivejavachapter6.item50;

import java.sql.Date;

public final class PeriodEnhanced {
    private final Date start;
    private final Date end;

    public PeriodEnhanced(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException();
        }
    }

    public Date start() {
        return new Date(this.start.getTime());
    }

    public Date end() {
        return new Date(this.end.getTime());
    }

    public static void main(String[] args) {
        Date start = new Date(2023);
        Date end = new Date(2023);
        PeriodEnhanced p = new PeriodEnhanced(start, end);

        p.end().setYear(78); // p의 내부를 수정함.
    }
}
