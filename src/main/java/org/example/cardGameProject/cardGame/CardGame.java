package org.example.cardGameProject.cardGame;

import org.example.cardGameProject.card.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;


public abstract class CardGame {
    public static final List<Card> deckOfCards = new ArrayList<>();

    static {
        for (int i = 1; i < 14; i++) {
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

    public static Card dealCard(){return getCardByIndex((int)(Math.random() * 52) + 1);}

    public static List<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    public static List<Card> sortDeckInNumberOrder(){
        List<Card> sortedByNumber = deckOfCards.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedByNumber;
    }
}
