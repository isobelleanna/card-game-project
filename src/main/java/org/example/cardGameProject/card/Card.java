package org.example.cardGameProject.card;

import org.example.cardGameProject.utils.Searchable;

public class Card implements Comparable<Card>, Searchable {
    private final CardSuit suit;
    private String symbol;
    private int value;

    public Card(CardSuit suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return "\n" + symbol + " " + suit;
    }

    @Override
    public int compareTo(Card card) {
        return value - card.getValue();
    }

    @Override
    public boolean hasMatch(String searchTerm) {
        return suit.toString().toLowerCase().contains(searchTerm);
    }
}
