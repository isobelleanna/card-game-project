package org.example.cardGameProject.player;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player testPlayer;

    @BeforeEach
    public void init(){testPlayer = new Player("Player");}

    @Test
    public void GetScore_HasScore0_ReturnsScore (){
        assertEquals(0, testPlayer.getScore());
        assertNotEquals(10, testPlayer.getScore());
    }

    @Test
    public void IncreaseScore_HasScore1_ReturnsScore (){
        testPlayer.increaseScore();
        assertEquals(1, testPlayer.getScore());
        assertNotEquals(10, testPlayer.getScore());
    }

    @Test
    public void IncreaseScore_IncreaseMulti_ReturnScore (){
        testPlayer.increaseScore();
        testPlayer.increaseScore();
        testPlayer.increaseScore();
        testPlayer.increaseScore();
        testPlayer.increaseScore();
        assertEquals(5, testPlayer.getScore());
        assertNotEquals(10, testPlayer.getScore());
    }

    @Test
    public void GetInfo_HasUsernameAndScore_ReturnInfo (){
        assertEquals("Player\nScore: 0", testPlayer.getInfo());
        assertNotEquals("Username\nScore: 20", testPlayer.getInfo());
        assertNotNull(testPlayer.getInfo());
    }


}