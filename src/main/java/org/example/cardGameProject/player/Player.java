package org.example.cardGameProject.player;

public class Player {
    private final String username;
    private int score;

    private int id;

    public static int playerCount = 0;

    public static void setPlayerCount(int playerCount) {
        Player.playerCount = playerCount;
    }

    public Player(String username) {
        this.username = username;
        this.score = 0;
        setPlayerCount(playerCount + 1);
        this.id = playerCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseScore(){
        setScore(this.score + 1);
    }

    public String getInfo(){
        return username + "\nScore: " + score;
    }
}
