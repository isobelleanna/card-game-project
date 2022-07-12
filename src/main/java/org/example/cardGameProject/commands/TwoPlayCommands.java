package org.example.cardGameProject.commands;

import org.example.cardGameProject.card.Card;
import org.example.cardGameProject.card.CardSuit;
import org.example.cardGameProject.cardGame.Snap;
import org.example.cardGameProject.player.Player;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class TwoPlayCommands extends Commands{
    private Player playerOne;
    private Player playerTwo;
    String userString;
    public TwoPlayCommands() {
        super(new String[]{"Level Easy", "Level Hard", "Go Back", "Quit"}, "two");
    }

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            userString = getStringInput();
            if(Objects.equals(userString, "snap")){
                System.out.println("You win\n");
                timer.cancel();
            }else {
                System.out.println("You loose\n");
                timer.cancel();
            }
        }
    };

    @Override
    public void run()  {
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            printMessage("Enter username Player 1");
            String username = getStringInput();
            playerOne = new Player(username);
            printMessage("Enter username Player 2");
            username = getStringInput();
            playerTwo = new Player(username);
            int i = 0;
            boolean activeGame = true;
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
                if (i % 2 == 0){
                    printMessage("Player One:");
                }else {
                    printMessage("Player Two:");
                }
                printMessage(currentCard.toString());
                if(previousCardSuit == currentCardSuit){
                    try
                    {
                        timer.schedule(task, 2000);
                        Thread.sleep(2000);
                        activeGame = false;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    setNextCommands("");

                } else if (i == 51) {
                    activeGame = false;
                    printMessage("You have completed the deck!");
                    setNextCommands("play");
                }else {
                    getStringInput();
                }
                i ++;
            }
        } else if (userInput == 3) {
            setNextCommands("home");
        }else {
            setNextCommands("");
        }
    }
}
