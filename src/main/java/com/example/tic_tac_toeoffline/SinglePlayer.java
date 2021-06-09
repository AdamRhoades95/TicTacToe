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

import java.util.Random;

public class SinglePlayer extends AppCompatActivity {

    int firstTurn = 20;
    int secondTurn = 20;
    int thirdTurn = 20;
    int compB2 = 20;
    int compC2 = 20;
    Random rand = new Random();
    int gen;
    int turn = 1;
    int playerFirst = 1;
    private Button A1;   private Button A2;    private Button A3;
    private Button B1;   private Button B2;    private Button B3;
    private Button C1;   private Button C2;    private Button C3;
    private TextView countTies;
    private TextView playerOWins;
    private TextView playerXWins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        turn = 1;
        playerFirst = 1;

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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;
                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                        winningMessage("You Won!");
                        add_to_score(playerOWins);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        playerFirst = 1;
                    }
                    else if (dec == 2)
                    {
                        winningMessage("I Won!");
                        add_to_score(playerXWins);

                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        turn++;
                        playerFirst = 2;

                        computersTurn();
                    }
                    else if (dec == 0)
                    {
                        winningMessage("You Tied ME");
                        add_to_score(countTies);
                        Reset(A1, A2, A3, B1, B2, B3, C1, C2, C3);
                        if(playerFirst == 2){
                            playerFirst = 1;}
                        else if(playerFirst == 1){
                            playerFirst = 2;turn++;computersTurn();}
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
                    playerFirst = 1;
                }
            });

            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // pull up main menu
                    startActivity(new Intent(SinglePlayer.this, MainMenu.class));
                    finish();
                }
            });

        }






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
        outState.putInt("playerFirst", playerFirst);

        outState.putInt("firstTurn", firstTurn);
        outState.putInt("secondTurn", secondTurn);
        outState.putInt("thirdTurn", thirdTurn);
        outState.putInt("compB2", compB2);
        outState.putInt("compC2", compC2);
        outState.putInt("gen", gen);
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
        playerFirst = savedInstanceState.getInt("playerFirst");

        firstTurn = savedInstanceState.getInt("firstTurn");
        secondTurn = savedInstanceState.getInt("secondTurn");
        thirdTurn = savedInstanceState.getInt("thirdTurn");
        compB2 = savedInstanceState.getInt("compB2");
        compC2 = savedInstanceState.getInt("compC2");
        gen = savedInstanceState.getInt("gen");

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
        if(playerFirst == 1) {
            if (turn <= 9 && turn % 2 == 1)
            {
                e.setText("O");
                turn++;
                e.setClickable(false);
                computersTurn();
            }
            else if(turn == 1){
                computersTurn();
            }
        }
        else if(playerFirst == 2) {
            if (turn <= 10 && turn % 2 == 1) {
                e.setText("O");
                turn++;
                e.setClickable(false);
                computersTurn();
            }
            else if(turn == 2){
                computersTurn();
            }
        }
    }
    @SuppressLint("SetTextI18n")
    private void add_to_score(TextView x)
    {
        int num = Integer.valueOf((String) x.getText());
        num++;
        x.setText(Integer.toString(num));
    }
    public void winningMessage(String win){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, win, duration);
        toast.show();
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
        else if(turn > 9 && playerFirst == 1)
        {
            return 0;
        }
        else if(turn > 10 && playerFirst == 2)
        {
            return 0;
        }
        else{
            return 4;
        }
    }
    // computer's turn placing
    public void computersTurn()
    {
        if(turn == 2) {
            if(A1.getText().equals("")&& A2.getText().equals("") && A3.getText().equals("")&&
                    B1.getText().equals("")&& B2.getText().equals("") && B3.getText().equals("")&&
                    C1.getText().equals("")&& C2.getText().equals("") && C3.getText().equals(""))
            {
                gen = rand.nextInt(9);
                if(gen == 0){A1.setText("X");turn++;
                    A1.setClickable(false);}
                else if(gen == 1){A2.setText("X");turn++;
                    A2.setClickable(false);}
                else if(gen == 2){A3.setText("X");turn++;
                    A3.setClickable(false);}
                else if(gen == 3){B1.setText("X");turn++;
                    B1.setClickable(false);}
                else if(gen == 4){B2.setText("X");turn++;
                    B2.setClickable(false);}
                else if(gen == 5){B3.setText("X");turn++;
                    B3.setClickable(false);}
                else if(gen == 6){C1.setText("X");turn++;
                    C1.setClickable(false);}
                else if(gen == 7){C2.setText("X");turn++;
                    C2.setClickable(false);}
                else if(gen == 8){C3.setText("X");turn++;
                    C3.setClickable(false);}
            }
            else
            {
                if(!A1.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 0;}
                else if(!A2.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 1;}
                else if(!A3.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 2;}
                else if(!B1.isClickable()){A1.setText("X");turn++;
                    A1.setClickable(false);gen = 3;}
                else if(!B2.isClickable()){A1.setText("X");turn++;
                    A1.setClickable(false);gen = 4;}
                else if(!B3.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 5;}
                else if(!C1.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 6;}
                else if(!C2.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 7;}
                else if(!C3.isClickable()){B2.setText("X");turn++;
                    B2.setClickable(false);gen = 8;}
            }
        }

        else if(turn == 4) {
            if(playerFirst ==1) {
                if (gen == 0 && A1.getText().equals("O")) {
                    if (A2.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 1;
                        A3.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 2;
                        A2.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 3;
                        C1.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 5;
                        A3.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 6;
                        B1.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 7;
                        C1.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 8;
                        A2.setClickable(false);
                    }
                }
                else if (gen == 1 && A2.getText().equals("O")) {
                    if (A1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 0;
                        A3.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 2;
                        A1.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 3;
                        A3.setClickable(false);
                    } else if (B2.getText().equals("O")) {
                        C2.setText("X");
                        turn++;
                        secondTurn = 4;
                        C2.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 5;
                        A1.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 6;
                        A1.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 7;
                        C1.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 8;
                        A1.setClickable(false);
                    }
                }
                else if (gen == 2 && A3.getText().equals("O")) {
                    if (A1.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 0;
                        A2.setClickable(false);
                    } else if (A2.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 1;
                        A1.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 3;
                        A2.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        secondTurn = 5;
                        C3.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 6;
                        A2.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        secondTurn = 7;
                        B3.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        secondTurn = 8;
                        B3.setClickable(false);
                    }
                }
                else if (gen == 3 && B1.getText().equals("O")) {
                    if (A2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        secondTurn = 1;
                        B2.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        secondTurn = 2;
                        B2.setClickable(false);
                    } else if (B2.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        secondTurn = 4;
                        B3.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        secondTurn = 5;
                        B2.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        secondTurn = 6;
                        B2.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        secondTurn = 7;
                        B2.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        secondTurn = 8;
                        B2.setClickable(false);
                    }
                }
                else if (gen == 4 && B2.getText().equals("O")) {
                    if (A2.getText().equals("O")) {
                        C2.setText("X");
                        turn++;
                        secondTurn = 1;
                        C2.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 2;
                        C1.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        secondTurn = 3;
                        B3.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 5;
                        B1.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 6;
                        A3.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 7;
                        A2.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 8;
                        C1.setClickable(false);
                    }
                }
                else if (gen == 5 && B3.getText().equals("O")) {
                    if (A1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 0;
                        A3.setClickable(false);
                    } else if (A2.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 1;
                        A3.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        secondTurn = 2;
                        C3.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 3;
                        A1.setClickable(false);
                    } else if (B2.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 4;
                        B1.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 6;
                        A3.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 7;
                        C1.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 8;
                        A3.setClickable(false);
                    }
                }
                else if (gen == 6 && C1.getText().equals("O")) {
                    if (A1.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 0;
                        B1.setClickable(false);
                    } else if (A2.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 1;
                        A1.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 2;
                        B1.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        secondTurn = 3;
                        A1.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        secondTurn = 5;
                        C3.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        secondTurn = 7;
                        C3.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        C2.setText("X");
                        turn++;
                        secondTurn = 8;
                        C2.setClickable(false);
                    }
                }
                else if (gen == 7 && C2.getText().equals("O")) {
                    if (A2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 1;
                        C1.setClickable(false);
                    } else if (A1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 0;
                        C1.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 2;
                        C1.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 3;
                        C1.setClickable(false);
                    } else if (B2.getText().equals("O")) {
                        A2.setText("X");
                        turn++;
                        secondTurn = 4;
                        A2.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        secondTurn = 6;
                        C3.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 5;
                        C1.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 8;
                        C1.setClickable(false);
                    }
                }
                else if (gen == 8 && C3.getText().equals("O")) {
                    if (A1.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 0;
                        B1.setClickable(false);
                    } else if (A2.getText().equals("O")) {
                        B1.setText("X");
                        turn++;
                        secondTurn = 1;
                        B1.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        secondTurn = 2;
                        B3.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 3;
                        C1.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        secondTurn = 5;
                        A3.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        C2.setText("X");
                        turn++;
                        secondTurn = 6;
                        C2.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        secondTurn = 7;
                        C1.setClickable(false);
                    }
                }
            }

            else if(playerFirst ==2) {
                if (gen == 0) {
                    if (A2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 1;
                        B2.setClickable(false);
                    }
                    else if (A3.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 2;
                        C3.setClickable(false);
                    }
                    else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    }
                    else if (B2.getText().equals("O")) {
                        firstTurn = rand.nextInt(4);
                        if(firstTurn == 0) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else if(firstTurn == 1) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else if(firstTurn == 2) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else if(firstTurn == 3) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        firstTurn = 4;
                    }
                    else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 5;
                        B2.setClickable(false);
                    }
                    else if (C1.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 6;
                        C3.setClickable(false);
                    }
                    else if (C2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 7;
                        B2.setClickable(false);
                    }
                    else if (C3.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 8;
                        A3.setClickable(false);
                    }
                }
                else if (gen == 1) {
                    if (A1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 0;
                        B2.setClickable(false);
                    }
                    else if (A3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 2;
                        B2.setClickable(false);
                    }
                    else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    }
                    else if (B2.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        firstTurn = 4;
                        B3.setClickable(false);
                    }
                    else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 5;
                        B2.setClickable(false);
                    }
                    else if (C1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 6;
                        B2.setClickable(false);
                    }
                    else if (C2.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 7;
                        A3.setClickable(false);
                    }
                    else if (C3.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 8;
                        A3.setClickable(false);
                    }
                }
                else if (gen == 2) {
                    if (A1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 0;
                        C1.setClickable(false);
                    }
                    else if (A2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 1;
                        B2.setClickable(false);
                    }
                    else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    }
                    else if (B2.getText().equals("O")) {
                        firstTurn = rand.nextInt(4);
                        if(firstTurn == 0) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                            compB2=0;
                        }
                        else if(firstTurn == 1) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                            compB2=1;
                        }
                        else if(firstTurn == 2) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                            compB2=2;
                        }
                        else if(firstTurn == 3) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                            compB2=3;
                        }
                        firstTurn = 4;
                    }
                    else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 5;
                        B2.setClickable(false);
                    }
                    else if (C1.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 6;
                        A1.setClickable(false);
                    }
                    else if (C2.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 7;
                        A1.setClickable(false);
                    }
                    else if (C3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 8;
                        C1.setClickable(false);
                    }
                }
                else if (gen == 3) {
                    if (A1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 0;
                        B2.setClickable(false);
                    }
                    else if (A2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 1;
                        B2.setClickable(false);
                    }
                    else if (A3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 2;
                        A1.setClickable(false);
                    }
                    else if (B2.getText().equals("O")) {
                        compB2 = rand.nextInt(6);
                        if(compB2 == 0) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else if(compB2 == 1) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else if(compB2 == 2) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else if(compB2 == 3) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else if(compB2 == 4) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else if(compB2 == 5) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        firstTurn = 4;
                    }
                    else if (B3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 5;
                        A1.setClickable(false);
                    }
                    else if (C1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 6;
                        B2.setClickable(false);
                    }
                    else if (C2.getText().equals("O")) {
                        compC2 = rand.nextInt(2);
                        if (compC2 == 0) {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                        else{
                            compC2 = 1;
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        firstTurn = 7;
                    }
                    else if (C3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 8;
                        C1.setClickable(false);
                    }
                }
                else if (gen == 4) {
                    if (A1.getText().equals("O")) {
                        C2.setText("X");
                        turn++;
                        firstTurn = 0;
                        C2.setClickable(false);
                    }
                    else if (A2.getText().equals("O")) {
                        compB2 = rand.nextInt(2);
                        if(compB2==0){
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else if(compB2==1){
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        firstTurn = 1;
                    }
                    else if (A3.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 2;
                        C3.setClickable(false);
                    }
                    else if (B1.getText().equals("O")) {
                        compB2 = rand.nextInt(2);
                        if(compB2==0){
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else if(compB2==1){
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        firstTurn = 3;
                    }
                    else if (B3.getText().equals("O")) {
                        compB2 = rand.nextInt(2);
                        if(compB2==0){
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else if(compB2==1){
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        firstTurn = 5;
                    }
                    else if (C1.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 6;
                        A1.setClickable(false);
                    }
                    else if (C2.getText().equals("O")) {
                        compB2 = rand.nextInt(2);
                        if(compB2==0){
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else if(compB2==1){
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        firstTurn = 7;
                    }
                    else if (C3.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 8;
                        C1.setClickable(false);
                    }
                }
                else if (gen == 5) {
                    if (A1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 0;
                        A3.setClickable(false);
                    } else if (A2.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 1;
                        A3.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 2;
                        B2.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    } else if (B2.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 4;
                        C3.setClickable(false);
                    } else if (C1.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 6;
                        C3.setClickable(false);
                    } else if (C2.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 7;
                        C3.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 8;
                        B2.setClickable(false);
                    }
                }
                else if (gen == 6) {
                    if (A1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 0;
                        A3.setClickable(false);
                    } else if (A2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 1;
                        B2.setClickable(false);
                    } else if (A3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 2;
                        A1.setClickable(false);
                    } else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    } else if (B2.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 4;
                        A3.setClickable(false);
                    } else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 5;
                        B2.setClickable(false);
                    }else if (C2.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 7;
                        B2.setClickable(false);
                    } else if (C3.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 8;
                        A3.setClickable(false);
                    }
                }
                else if (gen == 7) {
                    if (A1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 0;
                        C1.setClickable(false);
                    }
                    else if (A2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 1;
                        C1.setClickable(false);
                    }
                    else if (A3.getText().equals("O")) {
                        C3.setText("X");
                        turn++;
                        firstTurn = 2;
                        C3.setClickable(false);
                    }
                    else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    }
                    else if (B2.getText().equals("O")) {
                        compB2 = rand.nextInt(6);
                        if(compB2 == 0) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else if(compB2 == 1) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else if(compB2 == 2) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else if(compB2 == 3) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                        else if(compB2 == 4) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else if(compB2 == 5) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        firstTurn = 4;
                    }
                    else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 5;
                        B2.setClickable(false);
                    }
                    else if (C1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 6;
                        B2.setClickable(false);
                    }
                    else if (C3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 8;
                        B2.setClickable(false);
                    }
                }
                else if (gen == 8) {
                    if (A1.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 0;
                        C1.setClickable(false);
                    }
                    else if (A2.getText().equals("O")) {
                        C1.setText("X");
                        turn++;
                        firstTurn = 1;
                        C1.setClickable(false);
                    }
                    else if (A3.getText().equals("O")) {
                        A1.setText("X");
                        turn++;
                        firstTurn = 2;
                        A1.setClickable(false);
                    }
                    else if (B1.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 3;
                        B2.setClickable(false);
                    }
                    else if (B2.getText().equals("O")) {
                        compB2 = rand.nextInt(7);
                        if(compB2 == 0) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else if(compB2 == 1) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else if(compB2 == 2) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else if(compB2 == 3) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else if(compB2 == 4) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                        else if(compB2 == 5) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else if(compB2 == 6) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        firstTurn = 4;
                    }
                    else if (B3.getText().equals("O")) {
                        B2.setText("X");
                        turn++;
                        firstTurn = 5;
                        B2.setClickable(false);
                    }
                    else if (C1.getText().equals("O")) {
                        A3.setText("X");
                        turn++;
                        firstTurn = 6;
                        A3.setClickable(false);
                    }
                    else if (C2.getText().equals("O")) {
                        B3.setText("X");
                        turn++;
                        firstTurn = 7;
                        B3.setClickable(false);
                    }
                }
            }
        }

        else if(turn == 6) {
            if(playerFirst ==1) {
                if (gen == 0 && A1.getText().equals("O")) {
                    if (A2.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                            thirdTurn = 6;
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && A2.getText().equals("X")) {
                        if (C2.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 7;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 2;
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 6;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (C1.getText().equals("O") && B1.getText().equals("X")) {
                        if (B3.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 5;
                            turn++;
                            A2.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 2;
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (C3.getText().equals("O") && A2.getText().equals("X")) {
                        if (C2.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 7;
                            turn++;
                            C1.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                }
                else if (gen == 1 && A2.getText().equals("O")) {
                    if (A1.getText().equals("O") && !C1.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 6;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && A1.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 6;
                            turn++;
                            A1.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && A1.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            A3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (C1.getText().equals("O")) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 2;
                            turn++;
                            A1.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (C3.getText().equals("O")) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            B3.setClickable(false);
                        } else if (B3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 5;
                            turn++;
                            A3.setClickable(false);
                        } else if (B1.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 3;
                            turn++;
                            A3.setClickable(false);
                        } else if (C1.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 6;
                            turn++;
                            C2.setClickable(false);
                        } else if (C2.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 7;
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                }
                else if (gen == 2 && A3.getText().equals("O")) {
                    if (A1.getText().equals("O") && A2.getText().equals("X")) {
                        if (C2.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 7;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (A2.getText().equals("O") && A1.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && A2.getText().equals("X")) {
                        if (C2.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 7;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && C3.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 0;
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (C1.getText().equals("O") && A2.getText().equals("X")) {
                        if (C2.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 7;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && B3.getText().equals("X")) {
                        if (B1.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 3;
                            turn++;
                            A1.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (C3.getText().equals("O") && B3.getText().equals("X")) {
                        if (B1.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 3;
                            turn++;
                            A1.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 3 && B1.getText().equals("O")) {
                    if (A2.getText().equals("O") && B2.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C1.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && B2.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (B2.getText().equals("O") && B3.getText().equals("X")) {
                        if (A2.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 1;
                            turn++;
                            C2.setClickable(false);
                        } else if (A3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C1.setClickable(false);
                        } else if (C1.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 6;
                            turn++;
                            A3.setClickable(false);
                        } else if (C2.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 7;
                            turn++;
                            A2.setClickable(false);
                        } else if (C3.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 8;
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && B2.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            A3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (C1.getText().equals("O") && B2.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && B2.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C1.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (C3.getText().equals("O") && B2.getText().equals("X")) {
                        if (A2.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 1;
                            turn++;
                            A3.setClickable(false);
                        } else if (A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else if (C1.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 6;
                            turn++;
                            C2.setClickable(false);
                        } else if (C2.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 7;
                            turn++;
                            C1.setClickable(false);
                        } else if (B3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 5;
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
                else if (gen == 4 && B2.getText().equals("O")) {
                    if (A2.getText().equals("O") && C2.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C1.setClickable(false);
                        } else if (B1.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 3;
                            turn++;
                            B3.setClickable(false);
                        } else if (B3.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 5;
                            turn++;
                            B1.setClickable(false);
                        } else if (C1.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 6;
                            turn++;
                            A3.setClickable(false);
                        } else if (C3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && C1.getText().equals("X")) {
                        if (B1.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 3;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && B3.getText().equals("X")) {
                        if (A2.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 1;
                            turn++;
                            C2.setClickable(false);
                        } else if (A3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C1.setClickable(false);
                        } else if (C1.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 6;
                            turn++;
                            A3.setClickable(false);
                        } else if (C2.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 7;
                            turn++;
                            A2.setClickable(false);
                        } else if (C3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && B1.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 6;
                            turn++;
                            A3.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (C1.getText().equals("O") && A3.getText().equals("X")) {
                        if (A2.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 1;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && A2.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            C1.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C1.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (C3.getText().equals("O") && C1.getText().equals("X")) {
                        if (B1.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 3;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 5 && B3.getText().equals("O")) {
                    if (A2.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 6;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && C3.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 0;
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && A1.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            A3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (A1.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 6;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (C1.getText().equals("O") && A3.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 0;
                            turn++;
                            B1.setClickable(false);
                        } else if (A2.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 1;
                            turn++;
                            C3.setClickable(false);
                        } else if (B1.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 3;
                            turn++;
                            A1.setClickable(false);
                        } else if (C2.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 7;
                            turn++;
                            C3.setClickable(false);
                        } else if (C3.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (C3.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 6;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                }
                else if (gen == 6 && C1.getText().equals("O")) {
                    if (A1.getText().equals("O") && B1.getText().equals("X")) {
                        if (B3.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 5;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (A2.getText().equals("O") && A1.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && B1.getText().equals("X")) {
                        if (B3.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 5;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && A1.getText().equals("X")) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 8;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && C3.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 0;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && C3.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 0;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (C3.getText().equals("O") && C2.getText().equals("X")) {
                        if (A2.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 1;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                }
                else if (gen == 7 && C2.getText().equals("O")) {
                    if (secondTurn == 0 && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 2;
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 1 && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 2;
                            turn++;
                            A1.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 2 && C1.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            thirdTurn = 0;
                            turn++;
                            A2.setClickable(false);
                        } else if (A2.getText().equals("O")) {
                            A1.setText("X");
                            thirdTurn = 1;
                            turn++;
                            A1.setClickable(false);
                        } else if (B1.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 3;
                            turn++;
                            C3.setClickable(false);
                        } else if (B3.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 5;
                            turn++;
                            C3.setClickable(false);
                        } else if (C3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 8;
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 3 && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 5 && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            C3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 6 && C3.getText().equals("X")) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 0;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 8 && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
                else if (gen == 8 && C3.getText().equals("O")) {
                    if (A1.getText().equals("O") && B1.getText().equals("X")) {
                        if (B3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 5;
                            turn++;
                            A3.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (A2.getText().equals("O") && B1.getText().equals("X")) {
                        if (B3.getText().equals("O")) {
                            A3.setText("X");
                            thirdTurn = 5;
                            turn++;
                            A3.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (A3.getText().equals("O") && B3.getText().equals("X")) {
                        if (B1.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 3;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (B1.getText().equals("O") && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (B3.getText().equals("O") && A3.getText().equals("X")) {
                        if (C1.getText().equals("O")) {
                            C2.setText("X");
                            thirdTurn = 6;
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (C1.getText().equals("O") && C2.getText().equals("X")) {
                        if (A2.getText().equals("O")) {
                            B1.setText("X");
                            thirdTurn = 1;
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (C2.getText().equals("O") && C1.getText().equals("X")) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            thirdTurn = 2;
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
            }

            else if(playerFirst ==2) {
                if (gen == 0) {
                    if (firstTurn==1) {
                        if (C3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 8;
                            C1.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==2) {
                        if (B2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 4;
                            C1.setClickable(false);
                        }
                        else{
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn==3) {
                        if (C3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            secondTurn = 8;
                            A2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if(A2.getText().equals("X")) {
                            if(A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn=2;
                            }
                            else{
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        else if(A3.getText().equals("X")) {
                            if(A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                                secondTurn=1;
                            }
                            else{
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                        else if(B1.getText().equals("X")) {
                            if(C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                                secondTurn=6;
                            }
                            else{
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                        else if(C1.getText().equals("X")) {
                            if(B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                                secondTurn=3;
                            }
                            else{
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5) {
                        if (C3.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 5;
                            A3.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==6) {
                        if (B2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 4;
                            A3.setClickable(false);
                        }
                        else{
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn==7) {
                        if (C3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 8;
                            C1.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==8) {
                        if (A2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 8;
                            C1.setClickable(false);
                        }
                        else{
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                }
                else if (gen == 1) {
                    if (firstTurn==0) {
                        if (C2.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            secondTurn = 7;
                            B1.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn==2) {
                        if (C2.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            secondTurn = 7;
                            B3.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn==3) {
                        if (C2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 7;
                            A3.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if (A1.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 0;
                            C3.setClickable(false);
                        }
                        else if (A3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 2;
                            C1.setClickable(false);
                        }
                        else if (B1.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 3;
                            A3.setClickable(false);
                        }
                        else if (C2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 7;
                            A3.setClickable(false);
                        }
                        else if (C3.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 8;
                            A1.setClickable(false);
                        }
                        else if (C1.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 6;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn==5) {
                        if(C2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 7;
                            A1.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6) {
                        if(C2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 7;
                            C3.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7) {
                        if(A1.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 0;
                            C3.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8) {
                        if(A1.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 0;
                            B2.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                }
                else if (gen == 2) {
                    if (firstTurn==0) {
                        if(B2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 4;
                            C3.setClickable(false);
                        }
                        else{
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn==1) {
                        if(C1.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            secondTurn = 6;
                            B3.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==3) {
                        if(C1.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 6;
                            A1.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if(compB2==0) {
                            if(A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                secondTurn = 1;
                                C2.setClickable(false);
                            }
                            else{
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                        else if(compB2==1) {
                            if(A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 0;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if(compB2==2) {
                            if(C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 8;
                                A1.setClickable(false);
                            }
                            else{
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        else if(compB2==3) {
                            if(B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 5;
                                B1.setClickable(false);
                            }
                            else{
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5) {
                        if(C1.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 6;
                            A1.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==6) {
                        if(A2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 1;
                            C3.setClickable(false);
                        }
                        else{
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==7) {
                        if(A2.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 1;
                            B2.setClickable(false);
                        }
                        else{
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==8) {
                        if(B2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 4;
                            A1.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                }
                else if (gen == 3) {
                    if (firstTurn==0) {
                        if(B3.getText().equals("O")){
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                            secondTurn = 5;
                        }
                        else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn==1) {
                        if(B3.getText().equals("O")){
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                            secondTurn = 5;
                        }
                        else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn==2) {
                        if(C1.getText().equals("O")){
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                            secondTurn = 6;
                        }
                        else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        //firstTurn==4 is not done
                        if(compB2 == 0) {
                            if(C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                                secondTurn=6;
                            }
                            else{
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                        else if(compB2 == 1) {
                            if(A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                                secondTurn = 0;
                            }
                            else if(A3.getText().equals("O")){
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 2;
                            }
                            else if(B3.getText().equals("O")){
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 5;
                            }
                            else if(C1.getText().equals("O")){
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                                secondTurn = 6;
                            }
                            else if(C2.getText().equals("O")){
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 7;
                            }
                            else if(C3.getText().equals("O")){
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 8;
                            }
                        }
                        else if(compB2 == 2) {
                            if(A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                                secondTurn = 0;
                            }
                            else if(A2.getText().equals("O")){
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                                secondTurn = 1;
                            }
                            else if(B3.getText().equals("O")){
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 5;
                            }
                            else if(C1.getText().equals("O")){
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                                secondTurn = 6;
                            }
                            else if(C2.getText().equals("O")){
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                                secondTurn = 7;
                            }
                            else if(C3.getText().equals("O")){
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 8;
                            }
                        }
                        else if(compB2 == 3) {
                            if(A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                                secondTurn = 0;
                            }
                            else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if(compB2 == 4) {
                            if(A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                                secondTurn = 0;
                            }
                            else if(A2.getText().equals("O")){
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 1;
                            }
                            else if(A3.getText().equals("O")){
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 2;
                            }
                            else if(B3.getText().equals("O")){
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 5;
                            }
                            else if(C1.getText().equals("O")){
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                                secondTurn = 6;
                            }
                            else if(C3.getText().equals("O")){
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 8;
                            }
                        }
                        else if(compB2 == 5) {
                            if(A1.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 0;
                            }
                            else if(A2.getText().equals("O")){
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                                secondTurn = 1;
                            }
                            else if(A3.getText().equals("O")){
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 2;
                            }
                            else if(B3.getText().equals("O")){
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                                secondTurn = 5;
                            }
                            else if(C1.getText().equals("O")){
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                                secondTurn = 6;
                            }
                            else if(C2.getText().equals("O")){
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                                secondTurn = 7;
                            }
                        }
                    }
                    else if (firstTurn==5) {
                        if(C1.getText().equals("O")){
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                            secondTurn = 6;
                        }
                        else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==6) {
                        if(B3.getText().equals("O")){
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                            secondTurn = 5;
                        }
                        else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn==7) {
                        if (compC2 == 0) {
                            if (B3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                                secondTurn = 5;
                            }
                            else{
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                        else if (compC2 == 1){
                            if (A1.getText().equals("O")) {
                                B2.setText("X");
                                turn++;
                                B2.setClickable(false);
                                secondTurn = 0;
                            }
                            else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==8) {
                        if (A1.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                            secondTurn = 0;
                        }
                        else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                }
                else if (gen == 4) {
                    if (firstTurn==0) {
                        if (A2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 1;
                            A3.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn==1) {
                        if(compB2 == 0) {
                            if (C3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 8;
                                B1.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        if(compB2 == 1) {
                            if (C1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                secondTurn = 6;
                                B3.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==2) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            secondTurn = 0;
                            A2.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn==3) {
                        if(compB2 == 0) {
                            if (C3.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                secondTurn = 8;
                                A2.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        if(compB2 == 1) {
                            if (A3.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                secondTurn = 2;
                                C2.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5) {
                        if(compB2 == 0) {
                            if (C1.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                secondTurn = 6;
                                A2.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                        if(compB2 == 1) {
                            if (A1.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                secondTurn = 0;
                                C2.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==6) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            secondTurn = 8;
                            C2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==7) {
                        if(compB2 == 0) {
                            if (A3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 2;
                                A1.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        if(compB2 == 1) {
                            if (A1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 0;
                                A3.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==8) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            secondTurn = 2;
                            B3.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
                else if (gen == 5) {
                    if (firstTurn == 0) {
                        if (C3.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 8;
                            B2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1) {
                        if (C3.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 8;
                            B2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2) {
                        if (B1.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 3;
                            A1.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3) {
                        if (A1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 0;
                            C1.setClickable(false);
                        }
                        else if (A2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 1;
                            C3.setClickable(false);
                        }
                        else if (A3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            secondTurn = 2;
                            A2.setClickable(false);
                        }
                        else if (C1.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 6;
                            A1.setClickable(false);
                        }
                        else if (C2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 7;
                            C3.setClickable(false);
                        }
                        else if (C3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            secondTurn = 8;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 4) {
                        if (A3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 2;
                            C1.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6) {
                        if (A3.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 2;
                            B2.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7) {
                        if (A3.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 2;
                            B2.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8) {
                        if (B1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 3;
                            C1.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 6) {
                    if (firstTurn == 0) {
                        if (B2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 4;
                            C3.setClickable(false);
                        }
                        else{
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1) {
                        if (A3.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 2;
                            A1.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2) {
                        if (B1.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 3;
                            C3.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 2;
                            C3.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 4) {
                        if (A1.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 0;
                            C3.setClickable(false);
                        }
                        else if (A2.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            secondTurn = 1;
                            C2.setClickable(false);
                        }
                        else if (B1.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            secondTurn = 3;
                            B3.setClickable(false);
                        }
                        else if (B3.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            secondTurn = 5;
                            B1.setClickable(false);
                        }
                        else if (C2.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            secondTurn = 7;
                            A2.setClickable(false);
                        }
                        else if (C3.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 8;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 5) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 2;
                            C3.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7) {
                        if (A3.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 2;
                            A1.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8) {
                        if (B2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 4;
                            A1.setClickable(false);
                        }
                        else{
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                }
                else if (gen == 7) {
                    if (firstTurn==0) {
                        if (C3.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 8;
                            B2.setClickable(false);
                        }
                        else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==1) {
                        if (C3.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 8;
                            A3.setClickable(false);
                        }
                        else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==2) {
                        if (C1.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 6;
                            B2.setClickable(false);
                        }
                        else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==3) {
                        if (A2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 1;
                            C1.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if (compB2==0) {
                            if (A2.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 1;
                                C1.setClickable(false);
                            }
                            else if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                secondTurn = 3;
                                B3.setClickable(false);
                            }
                            else if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 5;
                                B1.setClickable(false);
                            }
                            else if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else if (C3.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 8;
                                A3.setClickable(false);
                            }
                        }
                        else if (compB2==1) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 0;
                                C3.setClickable(false);
                            }
                            else if (A2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 1;
                                C3.setClickable(false);
                            }
                            else if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                secondTurn = 3;
                                B3.setClickable(false);
                            }
                            else if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 5;
                                B1.setClickable(false);
                            }
                            else if (C1.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 6;
                                A1.setClickable(false);
                            }
                            else if (C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 8;
                                A1.setClickable(false);
                            }
                        }
                        else if (compB2==2) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 0;
                                C3.setClickable(false);
                            }
                            else if (A2.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 1;
                                C1.setClickable(false);
                            }
                            else if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else if (B3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 5;
                                C1.setClickable(false);
                            }
                            else if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else if (C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 8;
                                A1.setClickable(false);
                            }
                        }
                        else if (compB2==3) {
                            if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else if (C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 8;
                                A1.setClickable(false);
                            }
                            else if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 0;
                                C3.setClickable(false);
                            }
                            else if (A2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 1;
                                C3.setClickable(false);
                            }
                            else if (B1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                secondTurn = 3;
                                C3.setClickable(false);
                            }
                        }
                        else if (compB2==4) {
                            if (C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                secondTurn = 8;
                                A1.setClickable(false);
                            }
                            else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        else if (compB2==5) {
                            if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5) {
                        if (A2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 1;
                            C1.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==6) {
                        if (A2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 1;
                            A1.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==8) {
                        if (A2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 1;
                            A3.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                }
                else if (gen == 8) {
                    if (firstTurn == 0) {
                        if (C2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 7;
                            A3.setClickable(false);
                        }
                        else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1) {
                        if (C2.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 7;
                            B2.setClickable(false);
                        }
                        else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2) {
                        if (B2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 4;
                            C1.setClickable(false);
                        }
                        else {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3) {
                        if (A1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 0;
                            C1.setClickable(false);
                        }
                        else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 4) {
                        if (compB2 == 0) {
                            if (A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                secondTurn = 1;
                                C2.setClickable(false);
                            }
                            else if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                secondTurn = 3;
                                B3.setClickable(false);
                            }
                            else if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 5;
                                B1.setClickable(false);
                            }
                            else if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else if (C2.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                secondTurn = 7;
                                A2.setClickable(false);
                            }
                        }
                        else if (compB2 == 1) {
                            if (A1.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 0;
                                C1.setClickable(false);
                            }
                            else if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                secondTurn = 3;
                                B3.setClickable(false);
                            }
                            else if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 5;
                                B1.setClickable(false);
                            }
                            else if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else if (C2.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 7;
                                A3.setClickable(false);
                            }
                        }
                        else if (compB2 == 2) {
                            if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                secondTurn = 5;
                                B1.setClickable(false);
                            }
                            else {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                        else if (compB2 == 3) {
                            if (A1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 0;
                                A3.setClickable(false);
                            }
                            else if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else if (A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                secondTurn = 1;
                                C2.setClickable(false);
                            }
                            else if (B3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 5;
                                C1.setClickable(false);
                            }
                            else if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else if (C2.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                secondTurn = 7;
                                A2.setClickable(false);
                            }
                        }
                        else if (compB2 == 4) {
                            if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                secondTurn = 2;
                                C1.setClickable(false);
                            }
                            else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        else if (compB2 == 5) {
                            if (C2.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                secondTurn = 7;
                                A2.setClickable(false);
                            }
                            else {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                        }
                        else if (compB2 == 6) {
                            if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                secondTurn = 6;
                                A3.setClickable(false);
                            }
                            else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn == 5) {
                        if (A1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 0;
                            C1.setClickable(false);
                        }
                        else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6) {
                        if (B3.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 5;
                            A1.setClickable(false);
                        }
                        else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7) {
                        if (A3.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 2;
                            B2.setClickable(false);
                        }
                        else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
            }
        }

        else if(turn == 8) {
            if(playerFirst ==1) {
                if (gen == 0) {
                    if (secondTurn == 1 && thirdTurn == 6) {
                        if (B3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 2 && thirdTurn == 7) {
                        if (B3.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 3 && thirdTurn == 2) {
                        if (C2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (secondTurn == 5 && thirdTurn == 6) {
                        if (A2.getText().equals("O") || C3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 5) {
                        if (C2.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 2) {
                        if (B1.getText().equals("O") || C3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 8 && thirdTurn == 7) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
                else if (gen == 1) {
                    if (secondTurn == 0 && thirdTurn == 6) {
                        if (B3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 2 && thirdTurn == 8) {
                        if (B1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (secondTurn == 3 && thirdTurn == 6) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 5 && thirdTurn == 8) {
                        if (C1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 8) {
                        if (B1.getText().equals("O") || A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 2) {
                        if (C3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 8) {
                        if (thirdTurn == 2) {
                            if (B1.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        } else if (thirdTurn == 3) {
                            if (C1.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 5) {
                            if (C1.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 6) {
                            if (B1.getText().equals("O") || A3.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        } else if (thirdTurn == 7) {
                            if (A3.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                    }
                }
                else if (gen == 2) {
                    if (secondTurn == 0 && thirdTurn == 7) {
                        if (B3.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 1 && thirdTurn == 8) {
                        if (B1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (secondTurn == 3 && thirdTurn == 7) {
                        if (A1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 5 && thirdTurn == 0) {
                        if (C2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 7) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 3) {
                        if (C3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 8 && thirdTurn == 3) {
                        if (C1.getText().equals("O") || A2.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                }
                else if (gen == 3) {
                    if (secondTurn == 1 && thirdTurn == 8) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 2 && thirdTurn == 8) {
                        if (C1.getText().equals("O") || A2.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (secondTurn == 4) {
                        if (thirdTurn == 1) {
                            if (C1.getText().equals("O") || C3.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 2) {
                            if (C3.getText().equals("O") || A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        } else if (thirdTurn == 6) {
                            if (C2.getText().equals("O") || A2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        } else if (thirdTurn == 7 || thirdTurn == 8) {
                            if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                    } else if (secondTurn == 5 && thirdTurn == 8) {
                        if (C1.getText().equals("O") || C2.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 8) {
                        if (A2.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 8) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 8) {
                        if (thirdTurn == 1) {
                            if (A3.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        } else if (thirdTurn == 2) {
                            if (C1.getText().equals("O") || A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 5) {
                            if (C1.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 6) {
                            if (A2.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        } else if (thirdTurn == 7) {
                            if (A3.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                    }
                }
                else if (gen == 4) {
                    if (secondTurn == 1) {
                        if (thirdTurn == 2) {
                            if (B1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        } else if (thirdTurn == 3) {
                            if (C1.getText().equals("O") || C3.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 5) {
                            if (C1.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        } else if (thirdTurn == 6) {
                            if (B1.getText().equals("O") || C3.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        } else if (thirdTurn == 8) {
                            if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                    } else if (secondTurn == 2 && thirdTurn == 3) {
                        if (C3.getText().equals("O") || A2.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 3) {
                        if (thirdTurn == 1) {
                            if (C3.getText().equals("O") || A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        } else if (thirdTurn == 2) {
                            if (C3.getText().equals("O") || A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        } else if (thirdTurn == 6) {
                            if (A2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        } else if (thirdTurn == 7) {
                            if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            } else {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        } else if (thirdTurn == 8) {
                            if (A2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                    } else if (secondTurn == 5 && thirdTurn == 6) {
                        if (A2.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 1) {
                        if (C3.getText().equals("O") || B1.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 2) {
                        if (B1.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    } else if (secondTurn == 8 && thirdTurn == 3) {
                        if (C2.getText().equals("O") || A3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                }
                else if (gen == 5) {
                    if (secondTurn == 0 && thirdTurn == 6) {
                        if (A2.getText().equals("O") || C3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 1 && thirdTurn == 6) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 2 && thirdTurn == 0) {
                        if (C2.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    } else if (secondTurn == 3 && thirdTurn == 8) {
                        if (A2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 6) {
                        if (thirdTurn == 0) {
                            if (A2.getText().equals("O") || C3.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        } else if (thirdTurn == 1) {
                            if (A1.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        } else if (thirdTurn == 3) {
                            if (C3.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        } else if (thirdTurn == 7) {
                            if (A1.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        } else if (thirdTurn == 8) {
                            if (A2.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }

                    } else if (secondTurn == 7 && thirdTurn == 2) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 8 && thirdTurn == 6) {
                        if (A2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                }
                else if (gen == 6) {
                    if (secondTurn == 0 && thirdTurn == 5) {
                        if (A2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 1 && thirdTurn == 8) {
                        if (A2.getText().equals("O") || A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 2 && thirdTurn == 5) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 3 && thirdTurn == 8) {
                        if (A2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 5 && thirdTurn == 0) {
                        if (A3.getText().equals("O") || C2.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 0) {
                        if (B3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 8 && thirdTurn == 1) {
                        if (B3.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
                else if (gen == 7) {
                    if (secondTurn == 0 && thirdTurn == 2) {
                        if (B1.getText().equals("O") || C3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 1 && thirdTurn == 2) {
                        if (C3.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    } else if (secondTurn == 2) {
                        if (thirdTurn == 0) {
                            if (B1.getText().equals("O") || C3.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        } else if (thirdTurn == 1) {
                            if (B1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        } else if (thirdTurn == 3) {
                            if (A1.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        } else if (thirdTurn == 5) {
                            if (A1.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        } else if (thirdTurn == 8) {
                            if (B1.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                    } else if (secondTurn == 3 && thirdTurn == 2) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 5 && thirdTurn == 2) {
                        if (A1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 0) {
                        if (B3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 8 && thirdTurn == 2) {
                        if (B1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 8) {
                    if (secondTurn == 0 && thirdTurn == 5) {
                        if (C1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (secondTurn == 1 && thirdTurn == 5) {
                        if (C1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        } else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    } else if (secondTurn == 2 && thirdTurn == 3) {
                        if (A2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 3 && thirdTurn == 2) {
                        if (A1.getText().equals("O") || C2.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    } else if (secondTurn == 5 && thirdTurn == 6) {
                        if (A2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    } else if (secondTurn == 6 && thirdTurn == 1) {
                        if (B3.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        } else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    } else if (secondTurn == 7 && thirdTurn == 2) {
                        if (B1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
            }
            else if(playerFirst ==2) {
                if (gen == 0) {
                    if (firstTurn == 1&&secondTurn==8) {
                        if (A3.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            secondTurn = 8;
                            B1.setClickable(false);
                        } else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2&&secondTurn==4) {
                        if (B1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            secondTurn = 4;
                            C2.setClickable(false);
                        } else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3&&secondTurn == 8) {
                        if (C2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 8;
                            A3.setClickable(false);
                        } else {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 4) {
                        if (secondTurn==2) {
                            if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                        else if (secondTurn==1) {
                            if (B1.getText().equals("O")||C1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                        else if (secondTurn==3) {
                            if (A2.getText().equals("O")||A3.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                        else if (secondTurn==6) {
                            if (A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn == 5) {
                        if (C3.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 5;
                            A3.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6) {
                        if (B2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            secondTurn = 4;
                            A3.setClickable(false);
                        } else {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7) {
                        if (C3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 8;
                            C1.setClickable(false);
                        } else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8) {
                        if (A2.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 8;
                            C1.setClickable(false);
                        } else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                }
                else if (gen == 1) {
                    if (firstTurn==0&&secondTurn == 7) {
                        if (B3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else{
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn==2&&secondTurn == 7) {
                        if (B1.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn==3&&secondTurn == 7) {
                        if (C1.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            secondTurn = 7;
                            A1.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if (secondTurn == 0) {
                            if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                thirdTurn = 2;
                                C1.setClickable(false);
                            }
                            else{
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        else if (secondTurn == 2) {
                            if (A1.getText().equals("O")||B1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                thirdTurn = 2;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if (secondTurn == 3) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                thirdTurn = 2;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if (secondTurn == 7) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                thirdTurn = 2;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if (secondTurn == 8) {
                            if (A3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                thirdTurn = 2;
                                C1.setClickable(false);
                            }
                            else{
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        else if (secondTurn == 6) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5&&secondTurn == 7) {
                        if(C3.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            thirdTurn = 8;
                            A3.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6&&secondTurn == 7) {
                        if(A1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            thirdTurn = 0;
                            B1.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7&&secondTurn == 0) {
                        if(B3.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            secondTurn = 0;
                            C1.setClickable(false);
                        }
                        else{
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8&&secondTurn == 0) {
                        if(C1.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            secondTurn = 0;
                            C2.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                }
                else if (gen == 2) {
                    if (firstTurn == 0&&secondTurn ==4) {
                        if(B3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            secondTurn = 4;
                            C2.setClickable(false);
                        }
                        else{
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1&&secondTurn ==6) {
                        if(B1.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3&&secondTurn ==6) {
                        if(C3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            secondTurn = 6;
                            A2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 4) {
                        if(compB2==0&&secondTurn == 1) {
                            if(C1.getText().equals("O")||B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                secondTurn = 1;
                                B3.setClickable(false);
                            }
                            else{
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                        else if(compB2==1&&secondTurn == 0) {
                            if(B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                            else{
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                        else if(compB2==2&&secondTurn == 8) {
                            if(A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;

                                C2.setClickable(false);
                            }
                            else{
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                        else if(compB2==3&&secondTurn == 5) {
                            if(C1.getText().equals("O")||C2.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                            else{
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn == 5) {
                        if(C3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6) {
                        if(B2.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            secondTurn = 1;
                            B3.setClickable(false);
                        }
                        else{
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7&&secondTurn==1) {
                        if(C1.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 1;
                            C3.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8&&secondTurn==4) {
                        if(B1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            secondTurn = 4;
                            A2.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 3) {
                    if (firstTurn==0&&secondTurn==5) {
                        if(A2.getText().equals("O")){
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    if (firstTurn==0&&secondTurn==6) {
                        if(A2.getText().equals("O")){
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==1&&secondTurn==5) {
                        if(A1.getText().equals("O")){
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn==2&&secondTurn==6) {
                        if(B3.getText().equals("O")){
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if(compB2 == 0&&secondTurn==6) {
                            if(A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                            else{
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                        else if(compB2 == 1) {
                            if(secondTurn==5||secondTurn==7||secondTurn==8) {
                                if(A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else{
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                            else if(secondTurn==0) {
                                if(C1.getText().equals("O")||C2.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else{
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if(secondTurn==2) {
                                if(A1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else{
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if(secondTurn==6) {
                                if(A1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else{
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                        }
                        else if(compB2 == 2) {
                            if(secondTurn==5||secondTurn==8) {
                                if(A2.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else{
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                            }
                            else if(secondTurn==7) {
                                if(A1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else{
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if(secondTurn==6) {
                                if(B3.getText().equals("O")) {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                                else{
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                            else if(secondTurn==1) {
                                if(A1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else if(B3.getText().equals("O")){
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else if(C1.getText().equals("O")){
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else if(C3.getText().equals("O")){
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if(secondTurn==0) {
                                if(B3.getText().equals("O")){
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                                else {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                        }
                        else if(compB2 == 3) {
                            if(C2.getText().equals("O")){
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                            else {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                        }
                        else if(compB2 == 4) {
                            if(secondTurn==1||secondTurn==2||secondTurn==5) {
                                if(A1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else{
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if(secondTurn==0) {
                                if(C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else{
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if(secondTurn==6) {
                                if(A1.getText().equals("O")||A2.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else{
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if(secondTurn==8) {
                                if(C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else{
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                        }
                        else if(compB2 == 5) {
                            if(secondTurn == 0) {
                                if(C2.getText().equals("O")) {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                                else{
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                            }
                            else if(secondTurn == 1){
                                if(C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else{
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if(secondTurn == 2){
                                if(C2.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else{
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                            }
                            else if(secondTurn == 5){
                                if(C2.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else{
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                            }
                            else if(secondTurn == 6){
                                if(B3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else{
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                            else if(secondTurn == 7){
                                if(A3.getText().equals("O")){
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                        }
                    }
                    else if (firstTurn==5&&secondTurn==6) {
                        if(B2.getText().equals("O")){
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn==6&&secondTurn==5) {
                        if(A2.getText().equals("O")){
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        else {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn==7) {
                        if (compC2 ==0&&secondTurn==5) {
                            if (C3.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                            else{
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        else if (compC2 ==1&&secondTurn==0){
                            if (B3.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                                secondTurn = 0;
                            }
                            else {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==8&&secondTurn == 0) {
                        if (A3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                        else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }
                else if (gen == 4) {
                    if (firstTurn==0&&secondTurn == 1) {
                        if (C1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else{
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                    else if (firstTurn==1) {
                        if(compB2 == 0&&secondTurn == 8) {
                            if (C1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                        if(compB2 == 1&&secondTurn ==6) {
                            if (B1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==2&&secondTurn == 0) {
                        if (C2.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn==3) {
                        if(compB2 == 0&&secondTurn == 8) {
                            if (C2.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            } else {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                        }
                        if(compB2 == 1&&secondTurn == 2) {
                            if (A2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5) {
                        if(compB2 == 0&&secondTurn == 6) {
                            if (A1.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            } else {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        if(compB2 == 1&&secondTurn == 0) {
                            if (A2.getText().equals("O")) {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            } else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==6&&secondTurn == 8) {
                        if (A2.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                        else{
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==7) {
                        if(compB2 == 0&&secondTurn == 2) {
                            if (C3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        if(compB2 == 1&&secondTurn == 0) {
                            if (C1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            } else {
                                C1.setText("X");
                                turn++;
                                C1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==8&&secondTurn == 2) {
                        if (B1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 5) {
                    if (firstTurn == 0&&secondTurn == 8) {
                        if (B1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1&&secondTurn == 8) {
                        if (B1.getText().equals("O")) {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2&&secondTurn == 3) {
                        if (C3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3) {
                        if (secondTurn==0) {
                            if (A3.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                            else{
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        if (secondTurn==1) {
                            if (A3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                            else{
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        if (secondTurn==2) {
                            if (C2.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                            else{
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                        }
                        if (secondTurn==6) {
                            if (C3.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                            else{
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        if (secondTurn==7) {
                            if (A3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                            else{
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                        }
                        if (secondTurn==8) {
                            if (A2.getText().equals("O")) {
                                A3.setText("X");
                                turn++;
                                A3.setClickable(false);
                            }
                            else{
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn == 4&&secondTurn == 2) {
                        if (C2.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6&&secondTurn == 2) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            secondTurn = 2;
                            B1.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7&&secondTurn == 2) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            secondTurn = 2;
                            B1.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8&&secondTurn == 3) {
                        if (A3.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else{
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                }

                else if (gen == 6) {
                    if (firstTurn == 0&&secondTurn == 4) {
                        if (B3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else{
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1&&secondTurn == 2) {
                        if (C3.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2&&secondTurn == 3) {
                        if (C2.getText().equals("O")) {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                        else{
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3&&secondTurn == 2) {
                        if (A1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 4) {
                        if (secondTurn == 0) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if (secondTurn == 1) {
                            if (C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                            else{
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        else if (secondTurn == 3) {
                            if (C3.getText().equals("O")) {
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            } else {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                        }
                        else if (secondTurn == 5) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if (secondTurn == 7) {
                            if (A1.getText().equals("O")) {
                                C3.setText("X");
                                turn++;
                                C3.setClickable(false);
                            }
                            else{
                                A1.setText("X");
                                turn++;
                                A1.setClickable(false);
                            }
                        }
                        else if (secondTurn == 8) {
                            if (B1.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                            else{
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn == 5&&secondTurn == 2) {
                        if (A1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else{
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7&&secondTurn == 2) {
                        if (C3.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else{
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 8&&secondTurn == 4) {
                        if (B1.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else{
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                }
                else if (gen == 7) {
                    if (firstTurn==0&&secondTurn == 8) {
                        if (A2.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==1&&secondTurn == 8) {
                        if (B2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn==2&&secondTurn == 6) {
                        if (A2.getText().equals("O")) {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                        else {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                    }
                    else if (firstTurn==3&&secondTurn == 1) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            secondTurn = 1;
                            C3.setClickable(false);
                        }
                        else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn==4) {
                        if (compB2==0) {
                            if (secondTurn==1) {
                                if (B1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else {
                                    B1.setText("X");
                                    turn++;
                                    B1.setClickable(false);
                                }
                            }
                            else if (secondTurn==2) {
                                if (B1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else {
                                    B1.setText("X");
                                    turn++;
                                    B1.setClickable(false);
                                }
                            }
                            else if (secondTurn==3) {
                                if (A2.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else if (A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else if (C3.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                            else if (secondTurn==5) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn==6) {
                                if (A2.getText().equals("O")) {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                                else {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                            }
                            else if (secondTurn==8) {
                                if (A2.getText().equals("O")) {
                                    B1.setText("X");
                                    turn++;
                                    B1.setClickable(false);
                                }
                                else {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                            }
                        }
                        else if (compB2==1) {
                            if (secondTurn==0) {
                                if (B3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                            else if (secondTurn==1) {
                                if (B3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                } else {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                            else if (secondTurn==3) {
                                if (C3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else{
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                            }
                            else if (secondTurn==5) {
                                if (A1.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else if (A2.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else if (C1.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else if (C3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if (secondTurn==6) {
                                if (A2.getText().equals("O")) {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                                else {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                            }
                            else if (secondTurn==8) {
                                if (A2.getText().equals("O")) {
                                    B1.setText("X");
                                    turn++;
                                    B1.setClickable(false);
                                }
                                else {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                            }
                        }
                        else if (compB2==2) {
                            if (secondTurn==0) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn==1||secondTurn==2||secondTurn==5) {
                                if (C3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                            }
                            else if (secondTurn==6) {
                                if (A1.getText().equals("O")||A2.getText().equals("O")) {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                                else {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if (secondTurn==8) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                        }
                        else if (compB2==3) {
                            if (secondTurn==2) {
                                if (C3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                            }
                            else if (secondTurn==0||secondTurn==1||secondTurn==3) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn==6) {
                                if (C3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else {
                                    C3.setText("X");
                                    turn++;
                                    C3.setClickable(false);
                                }
                            }
                            else if (secondTurn==8) {
                                if (A2.getText().equals("O")||A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                        }
                        else if (compB2==4&&secondTurn==8) {
                            if (B1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                            else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                        else if (compB2==5&&secondTurn==6) {
                            if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                            else {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn==5&&secondTurn == 1) {
                        if (A3.getText().equals("O")) {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                        else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn==6&&secondTurn == 1) {
                        if (C3.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                        else {
                            C3.setText("X");
                            turn++;
                            C3.setClickable(false);
                        }
                    }
                    else if (firstTurn==8&&secondTurn == 1) {
                        if (C1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else {
                            C1.setText("X");
                            turn++;
                            C1.setClickable(false);
                        }
                    }
                }
                //still needs work
                else if (gen == 8) {
                    if (firstTurn == 0&&secondTurn == 7) {
                        if (B2.getText().equals("O")) {
                            B3.setText("X");
                            turn++;
                            B3.setClickable(false);
                        }
                        else {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 1&&secondTurn == 7) {
                        if (A1.getText().equals("O")) {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                        else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 2&&secondTurn == 4) {
                        if (B1.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                    }
                    else if (firstTurn == 3&&secondTurn == 0) {
                        if (A3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    //still needs work firstTurn == 4 is last one
                    else if (firstTurn == 4) {
                        if (compB2 == 0) {
                            if (secondTurn == 1) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 2) {
                                if (B1.getText().equals("O")) {
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                                else {
                                    B1.setText("X");
                                    turn++;
                                    B1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 3) {
                                if (A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                            else if (secondTurn == 5) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 6) {
                                if (A2.getText().equals("O")) {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                                else {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                            }
                            else if (secondTurn == 7) {
                                if (A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                        }
                        if (compB2 == 1) {
                            if (secondTurn == 0) {
                                if (C2.getText().equals("O")) {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                                else {
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                            }
                            else if (secondTurn == 2) {
                                if (C2.getText().equals("O")) {
                                    B1.setText("X");
                                    turn++;
                                    B1.setClickable(false);
                                }
                                else {
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                            }
                            else if (secondTurn == 3) {
                                if (A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                            else if (secondTurn == 5) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 6||secondTurn == 7) {
                                if (A1.getText().equals("O")) {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                                else {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                        }
                        if (compB2 == 2&&secondTurn == 5) {
                            if (A1.getText().equals("O")||A2.getText().equals("O")) {
                                C2.setText("X");
                                turn++;
                                secondTurn = 5;
                                C2.setClickable(false);
                            }
                            else {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                        }
                        if (compB2 == 3) {
                            //stopped here
                            if (secondTurn == 0) {
                                if (B3.getText().equals("O")) {
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                                else {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                            else if (secondTurn == 1) {
                                if (C1.getText().equals("O")) {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                                else {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 2) {
                                if (A1.getText().equals("O")) {
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                                else {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 5) {
                                if (A1.getText().equals("O")) {
                                    C2.setText("X");
                                    turn++;
                                    C2.setClickable(false);
                                }
                                else {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                            }
                            else if (secondTurn == 6) {
                                if (B3.getText().equals("O")) {
                                    A2.setText("X");
                                    turn++;
                                    A2.setClickable(false);
                                }
                                else {
                                    B3.setText("X");
                                    turn++;
                                    B3.setClickable(false);
                                }
                            }
                            else if (secondTurn == 7) {
                                if (A3.getText().equals("O")) {
                                    C1.setText("X");
                                    turn++;
                                    C1.setClickable(false);
                                }
                                else if (B3.getText().equals("O")) {
                                    A1.setText("X");
                                    turn++;
                                    A1.setClickable(false);
                                }
                                else {
                                    A3.setText("X");
                                    turn++;
                                    A3.setClickable(false);
                                }
                            }
                        }
                        if (compB2 == 4&&secondTurn == 2) {
                            if (C2.getText().equals("O")) {
                                A2.setText("X");
                                turn++;
                                A2.setClickable(false);
                            }
                            else {
                                C2.setText("X");
                                turn++;
                                C2.setClickable(false);
                            }
                        }
                        if (compB2 == 5&&secondTurn == 7) {
                            if (B1.getText().equals("O")||A1.getText().equals("O")) {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                            else {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                        }
                        if (compB2 == 6&&secondTurn == 6) {
                            if (B3.getText().equals("O")) {
                                B1.setText("X");
                                turn++;
                                B1.setClickable(false);
                            }
                            else {
                                B3.setText("X");
                                turn++;
                                B3.setClickable(false);
                            }
                        }
                    }
                    else if (firstTurn == 5&&secondTurn == 0) {
                        if (A3.getText().equals("O")) {
                            C2.setText("X");
                            turn++;
                            C2.setClickable(false);
                        }
                        else {
                            A3.setText("X");
                            turn++;
                            A3.setClickable(false);
                        }
                    }
                    else if (firstTurn == 6&&secondTurn == 5) {
                        if (B2.getText().equals("O")) {
                            A2.setText("X");
                            turn++;
                            A2.setClickable(false);
                        }
                        else {
                            B2.setText("X");
                            turn++;
                            B2.setClickable(false);
                        }
                    }
                    else if (firstTurn == 7&&secondTurn == 2) {
                        if (A1.getText().equals("O")) {
                            B1.setText("X");
                            turn++;
                            B1.setClickable(false);
                        }
                        else {
                            A1.setText("X");
                            turn++;
                            A1.setClickable(false);
                        }
                    }
                }
            }
        }

        else if(turn == 10) {
            if(A1.getText().equals("")){
                A1.setText("X");
                turn++;
                A1.setClickable(false);
            }
            else if(A2.getText().equals("")){
                A2.setText("X");
                turn++;
                A2.setClickable(false);
            }
            else if(A3.getText().equals("")){
                A3.setText("X");
                turn++;
                A3.setClickable(false);
            }
            else if(B1.getText().equals("")){
                B1.setText("X");
                turn++;
                B1.setClickable(false);
            }
            else if(B2.getText().equals("")){
                B2.setText("X");
                turn++;
                B2.setClickable(false);
            }
            else if(B3.getText().equals("")){
                B3.setText("X");
                turn++;
                B3.setClickable(false);
            }
            else if(C1.getText().equals("")){
                C1.setText("X");
                turn++;
                C1.setClickable(false);
            }
            else if(C2.getText().equals("")){
                C2.setText("X");
                turn++;
                C2.setClickable(false);
            }
            else if(C3.getText().equals("")){
                C3.setText("X");
                turn++;
                C3.setClickable(false);
            }
        }
    }
    //==================================
    //=========END==LOGIC===============
    //==================================
}