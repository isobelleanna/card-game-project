package org.example;

public class Card implements Comparable<Card>, Searchable {
    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "\n" + symbol + " " + suit + "\nvalue: " + value;
    }

    @Override
    public int compareTo(Card card) {
        return value - card.getValue();
    }

    public boolean hasMatch(String searchTerm) {
        return suit.contains(searchTerm);
    }
}
