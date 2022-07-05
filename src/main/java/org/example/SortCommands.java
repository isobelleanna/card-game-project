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
                printMessage("Your card is " + CardGame.getCardByIndex(0));
                break;
            case 2:
                printMessage("Sort by number");
                break;
            case 3:
                printMessage("Sort by suit");
                break;
            case 4:
                printMessage("Shuffle the deck");
                break;
            default:
                setNextCommands("home");
                break;
        }
    }
}
