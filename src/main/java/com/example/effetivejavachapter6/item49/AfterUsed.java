package com.example.effetivejavachapter6.item49;

import java.util.ArrayList;
import java.util.List;

public class AfterUsed {

    public static void main(String[] args) {
        Integer a[] = {null, null, null};
        List<Object> objects = create(a);
        System.out.println(objects);
    }

    public static List<Object> create(Integer a[]) {
        return List.of(a);
    }


}
