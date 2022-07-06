package org.example.cardGameProject;
import org.example.cardGameProject.commands.*;

public class Main {
    public static void main(String[] args) {
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
                case "two":
                    currentCommands = new TwoPlayCommands();
                    currentCommands.run();
                    break;
                default:
                    isActive = false;

            }
        }
    }
}
