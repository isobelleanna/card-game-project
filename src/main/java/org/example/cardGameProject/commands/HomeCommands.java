package org.example.cardGameProject.commands;

public class HomeCommands extends Commands {

    public HomeCommands() {
        super(new String[]{"Sort Deck","Play Snap", "Quit"}, "home");
    }

    @Override
    public void run() {
        printMessage("Welcome to the Snap app");
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            setNextCommands("sort");
        } else if(userInput == 2){
            setNextCommands("play");
        }else{
            setNextCommands("");
        }
    }
}
