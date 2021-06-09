package com.example.tic_tac_toeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button twoPlayer = findViewById(R.id.twoPlayers);
        Button onePlayer = findViewById(R.id.onePlayer);

        Button rules = findViewById(R.id.rules);
        twoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pull up main menu
               startActivity(new Intent(MainMenu.this, TwoPlayer.class));
                finish();
            }
        });

        onePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pull up main menu
               startActivity(new Intent(MainMenu.this, SinglePlayer.class));
               finish();
            }
        });
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // pull up main menu
                startActivity(new Intent(MainMenu.this, Rules.class));
                finish();
            }
        });
    }
}
