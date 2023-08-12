package com.example.effetivejavachapter6.item45;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NotSureCase {

    @RequiredArgsConstructor
    @ToString
    static class Card {
        private final Rank rank;
        private final Suit suit;
    }

    public static void main(String[] args) {
        // Stream으로 처리한 경우
        List<Card> cards = Arrays.stream(Suit.values())
                .flatMap(suit -> Stream.of(Rank.values()).map(rank -> new Card(rank, suit)))
                .toList();

        // 이중 for문으로 처리한 경우
        List<Card> cardList = new ArrayList<>();
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cardList.add(new Card(r, s));
            }
        }
    }
}
