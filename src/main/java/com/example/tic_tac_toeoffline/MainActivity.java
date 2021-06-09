package com.example.tic_tac_toeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                //finish();
                startActivity(new Intent(MainActivity.this,MainMenu.class));
                finish();
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 3000);
    }
}
