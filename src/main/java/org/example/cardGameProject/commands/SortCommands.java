package org.example.cardGameProject.commands;

import org.example.cardGameProject.card.Card;
import org.example.cardGameProject.cardGame.CardGame;

import java.util.List;
import java.util.stream.Collectors;

public class SortCommands extends Commands {
    public SortCommands() {
        super(new String[]{ "Deal a card","Sort by number", "Sort by suit", "Shuffle the deck", "Go back", "Quit"}, "sort");
    }

    @Override
    public void run() {
        printMessage("Sort your cards");
        printCommands();
        int userInput = getIntegerInput();
        switch (userInput) {
            case 1:
                printMessage("Your card is " + CardGame.dealCard());
                break;
            case 2:
                printMessage("Sorting the deck by number....");
                CardGame.sortDeckInNumberOrder().forEach(card -> printMessage(card.toString()));
                break;
            case 3:
                printMessage("Sort by suit");
                List<Card> sortedByNumber = CardGame.sortDeckInNumberOrder();
                List<String> suitSpade = sortedByNumber
                        .stream()
                        .filter(card -> card.hasMatch("spade"))
                        .map(Card::toString)
                        .collect(Collectors.toList());
                suitSpade.forEach(this::printMessage);
                List<String> suitClub = sortedByNumber
                        .stream()
                        .filter(card -> card.hasMatch("club"))
                        .map(Card::toString)
                        .collect(Collectors.toList());
                suitClub.forEach(this::printMessage);
                List<String> suitHeart = sortedByNumber
                        .stream()
                        .filter(card -> card.hasMatch("heart"))
                        .map(Card::toString)
                        .collect(Collectors.toList());
                suitHeart.forEach(this::printMessage);
                List<String> suitDiamond = sortedByNumber
                        .stream()
                        .filter(card -> card.hasMatch("diamond"))
                        .map(Card::toString)
                        .collect(Collectors.toList());
                suitDiamond.forEach(this::printMessage);
                break;
            case 4:
                printMessage("Shuffling the deck....");
                CardGame.shuffleDeck();
                CardGame.getDeckOfCards().forEach(card -> printMessage(card.toString()));
                break;
            case 5:
                setNextCommands("home");
                break;
            default:
                setNextCommands("");
                break;
        }
    }
}
