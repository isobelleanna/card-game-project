package org.example;

public class SortCommands extends Commands{
    protected SortCommands() {
        super(new String[]{ "Deal a card","Sort by number", "Sort by suit", "Shuffle the deck", "Go back"}, "sort");
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
                break;
            case 4:
                printMessage("Shuffling the deck....");
                CardGame.shuffleDeck();
                CardGame.getDeckOfCards().forEach(card -> printMessage(card.toString()));
                break;
            default:
                setNextCommands("home");
                break;
        }
    }
}
