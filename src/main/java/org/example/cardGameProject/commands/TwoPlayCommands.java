package org.example.cardGameProject.commands;

import org.example.cardGameProject.card.Card;
import org.example.cardGameProject.card.CardSuit;
import org.example.cardGameProject.cardGame.Snap;
import org.example.cardGameProject.player.Player;

public class TwoPlayCommands extends Commands{
    private Player playerOne;
    private Player playerTwo;

    public TwoPlayCommands() {
        super(new String[]{"Start Game", "Go Back", "Quit"}, "two");
    }

    @Override
    public void run() {
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            printMessage("Enter username Player 1");
            String username = getStringInput();
            playerOne = new Player(username);
            printMessage("Enter username Player 2");
            username = getStringInput();
            playerTwo = new Player(username);
            boolean activeGame = true;
            int i = 0;
            Snap.shuffleDeck();
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
                        if (i % 2 == 0){
                            playerOne.increaseScore();
                            printMessage("Player 1: " + playerOne.getInfo());
                        }else {
                            playerTwo.increaseScore();
                            printMessage("Player 2: " + playerTwo.getInfo());
                        }
                    } else if (i == 51) {
                        activeGame = false;
                        printMessage("You have completed the deck!");
                        setNextCommands("play");
                    }else if (i % 2 == 0){
                        printMessage("Player One:");
                        getStringInput();
                    }else if (i % 2 != 0){
                        printMessage("Player Two:");
                        getStringInput();
                    }
                    i ++;
            }
        } else if (userInput == 2) {
            setNextCommands("home");
        }else {
            setNextCommands("");
        }
    }
}
