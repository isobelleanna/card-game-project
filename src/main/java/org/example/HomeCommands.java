package org.example;

public class HomeCommands extends Commands{

    protected HomeCommands() {
        super(new String[]{"Sort Deck", "Quit"}, "home");
    }

    @Override
    public void run() {
        printMessage("Welcome to the Snap app");
        printCommands();
        int userInput = getIntegerInput();
        if(userInput == 1){
            setNextCommands("sort");
        }else{
            setNextCommands("");
        }
    }
}
