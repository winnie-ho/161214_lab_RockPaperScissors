package com.example.user.rockpaperscissors;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 14/12/2016.
 */
public class ComputerTest {

 Computer computer;

    @Before
    public void before() {
    computer = new Computer();
    }

    @Test
    public void choicesSizeTest(){
        assertEquals(3,computer.choicesSize());
    }

    @Test
    public void addWinToComputerTest(){
        computer.addWinToComputer();
        computer.addWinToComputer();
        assertEquals(2,computer.numberOfComputerWins());
    }

}
