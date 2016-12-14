package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class Computer {
    private ArrayList<String> choices;


    public Computer(){
        choices = new ArrayList<String>();
        populateChoices();
    }

    private void populateChoices(){
        choices.add("Rock");
        choices.add("Paper");
        choices.add("Scissors");
    }

    public int choicesSize(){
        return choices.size();
    }

    public String getComputerOption(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(3);
        String randomChoice = choices.get(randomIndex);
        return randomChoice;
    }


}
