package org.example;

import java.util.Scanner;

public abstract class Commands {
    private final Scanner scanner = new Scanner(System.in);
    private final String[] commands;
    private String nextCommands;

    protected Commands(String[] commands, String nextCommands) {
        this.commands = commands;
        this.nextCommands = nextCommands;
    }

    abstract public void run();

    public String getNextCommands() {
        return nextCommands;
    }

    public void setNextCommands(String nextCommands) {
        this.nextCommands = nextCommands;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printCommands(String[] commandsArr){
        for (int i = 0; i < commandsArr.length; i++) {
            printMessage((i + 1) +  ": " + commandsArr[i]);
        }
    }

    public void printCommands(){
        printCommands(commands);
    }

    public int getIntegerInput(int rangeLimit){
        boolean isActive = true;
        int input = 0;
        while(isActive){
            printMessage("Enter a number between 1 - " + rangeLimit);
            int userInput = scanner.nextInt();
            if(userInput > 0 && userInput<= rangeLimit){
                isActive = false;
                input = userInput;
            }else {
                printMessage("Unable to understand input, try again");
            }
        }
        scanner.nextLine();
        return input;
    }
    public int getIntegerInput(){
        return getIntegerInput(commands.length);
    }

    public String getStringInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }
}
