package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static final List<Card> deckOfCards = new ArrayList<>();

    static {
        for (int i = 0; i < 14; i++) {
            int value = i + 1;
            String symbol = String.valueOf(value);
            if(value == 11) {
                symbol = "J";
            } else if (value == 12) {
                symbol = "Q";
            } else if (value == 13) {
                symbol = "K";
            } else if (value == 14) {
                symbol = "A";
            }
            deckOfCards.add(new Club(symbol, value));
            deckOfCards.add(new Spade(symbol, value));
            deckOfCards.add(new Heart(symbol, value));
            deckOfCards.add(new Diamond(symbol, value));
        }
    }
    public static List<Card> getDeckOfCards(){return deckOfCards;}
}
