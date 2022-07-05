package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static final List<Card> deckOfCards = new ArrayList<>();

    static {
        for (int i = 0; i < 14; i++) {
            int value = i + 1;
            String symbol = String.valueOf(value);
            switch (value) {
                case 11:
                    symbol = "J";
                    break;
                case 12:
                    symbol = "Q";
                    break;
                case 13:
                    symbol = "K";
                    break;
                case 14:
                    symbol = "A";
                    break;
            }
            deckOfCards.add(new Club(symbol, value));
            deckOfCards.add(new Spade(symbol, value));
            deckOfCards.add(new Heart(symbol, value));
            deckOfCards.add(new Diamond(symbol, value));
        }
    }
    public static List<Card> getDeckOfCards(){return deckOfCards;}

    public static Card getCardByIndex(int index){return deckOfCards.get(index);}
}
