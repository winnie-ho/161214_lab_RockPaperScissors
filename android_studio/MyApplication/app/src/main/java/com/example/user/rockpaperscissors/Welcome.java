package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class Welcome extends AppCompatActivity {
    TextView welcomeText;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockPaperScissors", "onCreateCalledWelcome");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeText = (TextView) findViewById(R.id.welcome_text);
        playButton = (Button) findViewById(R.id.play_button);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockPaperScissors", "play button clicked");


                Intent intent = new Intent(Welcome.this, RockPaperScissors.class);

                startActivity(intent);

            }
        });

    }
}
