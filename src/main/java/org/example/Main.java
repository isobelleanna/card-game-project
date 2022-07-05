package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(CardGame.getDeckOfCards());
        HomeCommands homeCommands = new HomeCommands();
        Commands currentCommands = homeCommands;
        boolean isActive = true;
        while(isActive) {
            switch (currentCommands.getNextCommands()) {
                case "home":
                    currentCommands = new HomeCommands();
                    currentCommands.run();
                    break;
                case "sort":
                    currentCommands = new SortCommands();
                    currentCommands.run();
                    break;
                case "play":
                    currentCommands = new PlayCommands();
                    currentCommands.run();
                    break;
                default:
                    isActive = false;

            }
        }
    }
}
