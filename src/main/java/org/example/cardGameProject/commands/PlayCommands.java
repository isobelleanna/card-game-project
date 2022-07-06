package org.example.cardGameProject.commands;

import org.example.cardGameProject.cardGame.CardGame;
import org.example.cardGameProject.cardGame.Snap;

public class PlayCommands extends Commands {
    public PlayCommands() {
        super(new String[]{"Start game", "Go Back", "Quit"}, "play");
    }

    @Override
    public void run() {
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            printMessage("Playing game");
            printMessage("Card: " + Snap.dealCard());
            String stringInput;
            boolean activeGame = true;
            while (activeGame){
                Snap.shuffleDeck();
                printMessage("Card: " + Snap.dealCard());
               stringInput = getStringInput();
                if (stringInput.contains("snap")){
                    printMessage("You win");
                    activeGame = false;
                }
            }

        } else if (userInput ==2) {
            setNextCommands("home");
        }else {
            setNextCommands("");
        }
    }
}
