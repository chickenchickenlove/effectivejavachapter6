package com.example.effetivejavachapter6.item54;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopEmptyNotSpecialTest {

    @Test
    void test1() {
        ShopEmptyNotSpecial shopEmptyNotSpecial = new ShopEmptyNotSpecial(new ArrayList<>());
        Assertions.assertThat(shopEmptyNotSpecial.getCheesesWithArray().length).isEqualTo(0);
    }

    @Test
    void test2() {
        ShopEmptyNotSpecial shopEmptyNotSpecial = new ShopEmptyNotSpecial(List.of(ShopEmptyNotSpecial.Cheese.STILTON));
        Assertions.assertThat(shopEmptyNotSpecial.getCheesesWithArray().length).isEqualTo(1);

    }

}