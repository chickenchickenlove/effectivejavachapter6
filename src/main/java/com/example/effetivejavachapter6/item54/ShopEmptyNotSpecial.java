package com.example.effetivejavachapter6.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopEmptyNotSpecial {

    static enum Cheese {
        STILTON,
    }

    public ShopEmptyNotSpecial(List<Cheese> cheesesInStock) {
        this.cheesesInStock = cheesesInStock;
    }

    private final List<Cheese> cheesesInStock;

    public List<Cheese> getCheeses() {
        return new ArrayList<>(cheesesInStock);
    }

    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
    public Cheese[] getCheesesWithArray() {
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    public static void main(String[] args) {

        ShopEmptyNotSpecial shop = new ShopEmptyNotSpecial(List.of(Cheese.STILTON));
        List<Cheese> cheeses = shop.getCheeses();
        if (cheeses.contains(Cheese.STILTON)) {
            System.out.println("it's good");
        }
    }
}
