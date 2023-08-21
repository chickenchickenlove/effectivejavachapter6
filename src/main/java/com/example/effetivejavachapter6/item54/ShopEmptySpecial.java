package com.example.effetivejavachapter6.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 빈 컬렉션은 굳이 null로 특별 취급할 필요가 없음.
// null을 반환하면, 사용하는 쪽도 null 체크를 해야하므로 번거롭고 이득이 없음.
public class ShopEmptySpecial {

    static enum Cheese {
        STILTON,
    }

    private final List<Cheese> cheesesInStock = new ArrayList<>();

    public List<Cheese> getCheeses() {
        return cheesesInStock.isEmpty() ?
                null :
                new ArrayList<>(cheesesInStock);
    }

    public List<Cheese> getCheesesForOptimization() {
        return cheesesInStock.isEmpty() ?
                Collections.emptyList() :
                new ArrayList<>(cheesesInStock);
    }

    public static void main(String[] args) {

        ShopEmptySpecial shop = new ShopEmptySpecial();
        List<Cheese> cheeses = shop.getCheeses();
        if (cheeses != null && cheeses.contains(Cheese.STILTON)) {
            System.out.println("it's good");
        }
    }
}
