package org.example.cardGameProject.player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player testPlayer;

    @BeforeEach
    public void init(){testPlayer = new Player("Player");}

    @Test
    public void IncreaseScore_HasScore1_ReturnsScore (){
        testPlayer.increaseScore();
        assertEquals(1, testPlayer.getScore());
    }

}