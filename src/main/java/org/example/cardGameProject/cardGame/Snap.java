package org.example.cardGameProject.cardGame;


import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame {
    public static Timer timer = new Timer();



    public static Timer getTimer() {
        return timer;
    }


}
