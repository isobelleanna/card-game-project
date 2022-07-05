package org.example;

public class PlayCommands extends Commands{
    protected PlayCommands() {
        super(new String[]{"Start game", "Go Back", "Quit"}, "play");
    }

    @Override
    public void run() {
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            printMessage("Playing game");
            printMessage("Card: " + Snap.dealCard());
            String stringInput = getStringInput();

        } else if (userInput ==2) {
            setNextCommands("home");
        }else {
            setNextCommands("");
        }
    }
}
