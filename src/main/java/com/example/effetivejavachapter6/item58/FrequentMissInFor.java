package com.example.effetivejavachapter6.item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FrequentMissInFor {

    enum Suit {CLUB, DIAMOND, HEART, SPADE}
    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
    public record Card(Suit suit, Rank rank) {}

    public void badCase() {

        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());

        List<Card> deck = new ArrayList<>();
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                deck.add(new Card(i.next(), j.next()));
            }
        }
    }

    public void goodCase() {

        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());

        List<Card> deck = new ArrayList<>();
        for (Suit suit : suits)
            for (Rank rank : ranks)
                deck.add(new Card(suit, rank));
    }

    public void isItGood() {
        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks1 = Arrays.asList(Rank.values());
        List<Rank> ranks2 = Arrays.asList(Rank.values());
        List<Rank> ranks3 = Arrays.asList(Rank.values());

        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < suits.size(); i++) {
            for (int j = 0; j < ranks3.size(); j++) {
                deck.add(new Card(suits.get(i), ranks1.get(j)));
                deck.add(new Card(suits.get(i), ranks2.get(j)));
                deck.add(new Card(suits.get(i), ranks3.get(j)));
            }
        }
    }

    public void thisIsBetter() {
        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks1 = Arrays.asList(Rank.values());
        List<Rank> ranks2 = Arrays.asList(Rank.values());
        List<Rank> ranks3 = Arrays.asList(Rank.values());

        List<Card> deck = new ArrayList<>();
        for (Suit suit : suits)
            for (Rank rank : ranks1)
                deck.add(new Card(suit, rank));

        for (Suit suit : suits)
            for (Rank rank : ranks2)
                deck.add(new Card(suit, rank));

        for (Suit suit : suits)
            for (Rank rank : ranks3)
                deck.add(new Card(suit, rank));
    }

}
