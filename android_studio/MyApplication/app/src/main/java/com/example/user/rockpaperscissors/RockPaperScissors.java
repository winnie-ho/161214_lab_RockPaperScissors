package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissors extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView result;
    TextView winCounts;

    int PlayerWins = 0;
    int ComputerWins = 0;
    int Draws = 0;



    public void play(String playerOption){


        Computer computer = new Computer();
        String computerOption = computer.getComputerOption();

        Game game = new Game(computerOption, playerOption);
        result.setText("Computer played: " + computerOption +"\n"+ game.getWinner());

        if (game.getWinner() == "You Win"){
            PlayerWins++ ;
        }
        else if (game.getWinner()== "Computer Wins"){
            ComputerWins++ ;
        }
        else if (game.getWinner()=="It's a Draw"){
            Draws++ ;
        }
        winCounts.setText("Computer Wins: " + ComputerWins+ "\nPlayer Wins: " + PlayerWins + "\nDraws: " + Draws);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Log.d("RockPaperScissors", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton=(Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton=(Button)findViewById(R.id.scissors_button);
        result=(TextView)findViewById(R.id.result_text);
        winCounts=(TextView)findViewById(R.id.winCount_text);


        rockButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("RockPaperScissors", "Rock button clicked");
                String playerOption = "Rock";
                play(playerOption);
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "Paper button clicked");

                String playerOption = "Paper";
                play(playerOption);
            }

        });

        scissorsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("RockPaperScissors", "Scissors button clicked");

                String playerOption = "Scissors";
                play(playerOption);
            }
        });
    }
}

