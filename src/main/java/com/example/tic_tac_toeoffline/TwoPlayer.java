package com.example.tic_tac_toeoffline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayer extends AppCompatActivity {
        int turn = 1;
        int playerfirst = 1;
        private Button A1;   private Button A2;    private Button A3;
        private Button B1;   private Button B2;    private Button B3;
        private Button C1;   private Button C2;    private Button C3;
        private TextView countTies;
        private TextView playerOWins;
        private TextView playerXWins;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            turn = 1;
            playerfirst = 1;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two_player);

            Button menu = findViewById(R.id.menu);
            Button reset = findViewById(R.id.reset);
            A1 = findViewById(R.id.btnA1);
            A2 = findViewById(R.id.btnA2);
            A3 = findViewById(R.id.btnA3);

            B1 = findViewById(R.id.btnB1);
            B2 = findViewById(R.id.btnB2);
            B3 = findViewById(R.id.btnB3);

            C1 = findViewById(R.id.btnC1);
            C2 = findViewById(R.id.btnC2);
            C3 = findViewById(R.id.btnC3);

            countTies = findViewById(R.id.countTies);
            playerOWins = findViewById(R.id.playerOWins);
            playerXWins = findViewById(R.id.playerXWins);

            //=================Button Events===================
            A1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(A1);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }

                }
            });
            A2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(A2);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }

                }
            });
            A3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(A3);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });

            B1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(B1);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });
            B2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(B2);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(B3);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });

            C1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(C1);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });
            C2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(C2);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });
            C3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playTurn(C3);
                    int dec = check(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    if (dec == 1)
                    {
                        winningMessage("Player O Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerfirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("Player X Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerfirst = 2;
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerfirst == 2){playerfirst = 1;}
                        else if(playerfirst == 1){playerfirst = 2;turn++;}
                    }
                }
            });

            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                    playerXWins.setText("0");
                    playerOWins.setText("0");
                    countTies.setText("0");
                    playerfirst = 1;
                }
            });

            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // pull up main menu
                    startActivity(new Intent(TwoPlayer.this, MainMenu.class));
                    finish();
                }
            });

        }//end oncreate()


        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putString("a1", String.valueOf(A1.getText()));
            outState.putString("a2", String.valueOf(A2.getText()));
            outState.putString("a3", String.valueOf(A3.getText()));
            outState.putString("b1", String.valueOf(B1.getText()));
            outState.putString("b2", String.valueOf(B2.getText()));
            outState.putString("b3", String.valueOf(B3.getText()));
            outState.putString("c1", String.valueOf(C1.getText()));
            outState.putString("c2", String.valueOf(C2.getText()));
            outState.putString("c3", String.valueOf(C3.getText()));

            outState.putString("o", String.valueOf(playerOWins.getText()));
            outState.putString("x", String.valueOf(playerXWins.getText()));
            outState.putString("ties", String.valueOf(countTies.getText()));
            outState.putInt("turn", turn);
            outState.putInt("playerFirst", playerfirst);
        }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);
            A1.setText(savedInstanceState.getString("a1"));
            A2.setText(savedInstanceState.getString("a2"));
            A3.setText(savedInstanceState.getString("a3"));
            B1.setText(savedInstanceState.getString("b1"));
            B2.setText(savedInstanceState.getString("b2"));
            B3.setText(savedInstanceState.getString("b3"));
            C1.setText(savedInstanceState.getString("c1"));
            C2.setText(savedInstanceState.getString("c2"));
            C3.setText(savedInstanceState.getString("c3"));

            playerOWins.setText(savedInstanceState.getString("o"));
            playerXWins.setText(savedInstanceState.getString("x"));
            countTies.setText(savedInstanceState.getString("ties"));
            turn = savedInstanceState.getInt("turn");
            playerfirst = savedInstanceState.getInt("playerFirst");
            if(String.valueOf(A1.getText()).equals("O")|| String.valueOf(A1.getText()).equals("X"))
            {
                A1.setClickable(false);
            }
            if(String.valueOf(A2.getText()).equals("O")|| String.valueOf(A2.getText()).equals("X"))
            {
                A2.setClickable(false);
            }
            if(String.valueOf(A3.getText()).equals("O")|| String.valueOf(A3.getText()).equals("X"))
            {
                A3.setClickable(false);
            }
            if(String.valueOf(B1.getText()).equals("O")|| String.valueOf(B1.getText()).equals("X"))
            {
                B1.setClickable(false);
            }
            if(String.valueOf(B2.getText()).equals("O")|| String.valueOf(B2.getText()).equals("X"))
            {
                B2.setClickable(false);
            }
            if(String.valueOf(B3.getText()).equals("O")|| String.valueOf(B3.getText()).equals("X"))
            {
                B3.setClickable(false);
            }
            if(String.valueOf(C1.getText()).equals("O")|| String.valueOf(C1.getText()).equals("X"))
            {
                C1.setClickable(false);
            }
            if(String.valueOf(C2.getText()).equals("O")|| String.valueOf(C2.getText()).equals("X"))
            {
                C2.setClickable(false);
            }
            if(String.valueOf(C3.getText()).equals("O")|| String.valueOf(C3.getText()).equals("X"))
            {
                C3.setClickable(false);
            }
        }

        //===============End Button Events============
        //==================================
        //===========LOGIC==================
        //==================================

        private void Reset(Button A1, Button A2, Button A3, Button B1, Button B2, Button B3,Button C1,Button C2,Button C3) {
            turn = 1;
            A1.setText("");
            A2.setText("");
            A3.setText("");

            B1.setText("");
            B2.setText("");
            B3.setText("");

            C1.setText("");
            C2.setText("");
            C3.setText("");

            A1.setClickable(true);
            A2.setClickable(true);
            A3.setClickable(true);

            B1.setClickable(true);
            B2.setClickable(true);
            B3.setClickable(true);

            C1.setClickable(true);
            C2.setClickable(true);
            C3.setClickable(true);
        }
        private void playTurn(Button e)
        {
            if(playerfirst == 1) {
                if (turn <= 9 && turn % 2 == 0) {
                    e.setText("X");
                    turn++;
                    e.setClickable(false);
                }
                else if (turn <= 9 && turn % 2 == 1)
                {
                    e.setText("O");
                    turn++;
                    e.setClickable(false);
                }
            }
            else if(playerfirst == 2) {
                if (turn <= 10 && turn % 2 == 0) {
                    e.setText("X");
                    turn++;
                    e.setClickable(false);
                } else if (turn <= 10 && turn % 2 == 1) {
                    e.setText("O");
                    turn++;
                    e.setClickable(false);
                }
            }
        }

        public void winningMessage(String win){
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, win, duration);
            toast.show();
        }
        @SuppressLint("SetTextI18n")
        private void add_to_score(TextView x)
        {
            int num = Integer.valueOf((String) x.getText());
            num++;
            x.setText(Integer.toString(num));
        }
        private int check(Button A1, Button A2, Button A3, Button B1, Button B2, Button B3,Button C1,Button C2,Button C3)
        {//check if X wins
            if(A1.getText().equals(A2.getText())&& A2.getText().equals(A3.getText()) && A3.getText().equals("X")||
                    B1.getText().equals(B2.getText())&& B2.getText().equals(B3.getText()) && B3.getText().equals("X")||
                    C1.getText().equals(C2.getText())&& C2.getText().equals(C3.getText()) && C3.getText().equals("X")||
                    A1.getText().equals(B1.getText())&& B1.getText().equals(C1.getText()) && C1.getText().equals("X")||
                    A2.getText().equals(B2.getText())&& B2.getText().equals(C2.getText()) && C2.getText().equals("X")||
                    A3.getText().equals(B3.getText())&& B3.getText().equals(C3.getText()) && C3.getText().equals("X")||
                    A1.getText().equals(B2.getText())&& B2.getText().equals(C3.getText()) && C3.getText().equals("X")||
                    A3.getText().equals(B2.getText())&& B2.getText().equals(C1.getText()) && C1.getText().equals("X")
            ) //end of if condition
            {
                return 2;
            }
            else if(A1.getText().equals(A2.getText())&& A2.getText().equals(A3.getText()) && A3.getText().equals("O")||
                    B1.getText().equals(B2.getText())&& B2.getText().equals(B3.getText()) && B3.getText().equals("O")||
                    C1.getText().equals(C2.getText())&& C2.getText().equals(C3.getText()) && C3.getText().equals("O")||
                    A1.getText().equals(B1.getText())&& B1.getText().equals(C1.getText()) && C1.getText().equals("O")||
                    A2.getText().equals(B2.getText())&& B2.getText().equals(C2.getText()) && C2.getText().equals("O")||
                    A3.getText().equals(B3.getText())&& B3.getText().equals(C3.getText()) && C3.getText().equals("O")||
                    A1.getText().equals(B2.getText())&& B2.getText().equals(C3.getText()) && C3.getText().equals("O")||
                    A3.getText().equals(B2.getText())&& B2.getText().equals(C1.getText()) && C1.getText().equals("O")
            ) //end of if condition
            {
                return 1;
            }
            else if(turn > 9 && playerfirst == 1)
            {
                return 0;
            }
            else if(turn > 10 && playerfirst == 2)
            {
                return 0;
            }
            else{
                return 4;
            }
        }

        //==================================
        //=========END==LOGIC===============
        //==================================
    }