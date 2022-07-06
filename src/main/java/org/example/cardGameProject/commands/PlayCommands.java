package org.example.cardGameProject.commands;

import org.example.cardGameProject.card.Card;
import org.example.cardGameProject.card.CardSuit;
import org.example.cardGameProject.cardGame.Snap;

public class PlayCommands extends Commands {
    public PlayCommands() {
        super(new String[]{"Single Player Game","Two Player Game", "Go Back", "Quit"}, "play");
    }

    @Override
    public void run() {
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            Snap.shuffleDeck();
            boolean activeGame = true;
            int i = 0;
            Card previousCard = Snap.getCardByIndex(i);
            printMessage(previousCard + "\n");
            while (activeGame) {
                previousCard = Snap.getCardByIndex(i);
                CardSuit previousCardSuit = previousCard.getSuit();
                Card currentCard = Snap.getCardByIndex(i + 1);
                CardSuit currentCardSuit = currentCard.getSuit();
                printMessage(currentCard.toString());
                if(previousCardSuit == currentCardSuit){
                    activeGame = false;
                    printMessage("Snap! You win!");
                    setNextCommands("play");
                } else if (i == 51) {
                    activeGame = false;
                    printMessage("You have completed the deck!");
                    setNextCommands("play");
                }else {
                    getStringInput();
                }
                i ++;
            }
        } else if (userInput ==2) {
            setNextCommands("two");
        }else if (userInput ==3) {
            setNextCommands("home");
        }else {
            setNextCommands("");
        }
    }
}
