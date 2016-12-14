package com.example.user.rockpaperscissors;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 14/12/2016.
 */
public class GameTest {

    Game game;
    Game game2;
    Game game3;

    @Before
    public void before(){
        game = new Game("Rock", "Scissors");
        game2 = new Game ("Scissors", "Scissors");
        game3 = new Game ("Scissors", "Rock");
    }

    @Test
    public void winnerTest(){
        assertEquals("Computer Wins!",game.getWinner());
        assertEquals("It's a Draw!", game2.getWinner());
        assertEquals("You Win!", game3.getWinner());
    }

    @Test
    public void addWinToPlayerTest(){
        game.addWinToPlayer();
        game.addWinToPlayer();
        assertEquals(2,game.numberOfPlayerWins());
    }

}
