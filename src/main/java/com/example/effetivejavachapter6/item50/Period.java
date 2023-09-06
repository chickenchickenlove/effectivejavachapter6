package com.example.effetivejavachapter6.item50;

import java.sql.Date;

public final class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {

        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    public Date start() {
        return this.start;
    }

    public Date end() {
        return this.end;
    }

    public static void main(String[] args) {
        Date start = new Date(2023);
        Date end = new Date(2023);
        Period p = new Period(start, end);

        p.end().setYear(78); // p의 내부를 수정함.
    }
}
