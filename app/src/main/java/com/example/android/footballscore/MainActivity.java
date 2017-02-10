package com.example.android.footballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    public int yellowCardA = 0;
    public int yellowCardB = 0;
    public int redCardA = 0;
    public int redCardB = 0;

    /*
    *A team calculation
     */

    public void addScoreA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
    }
    public void displayScoreA(int score){
        TextView scoreView = (TextView) findViewById(R.id.a_team_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addYellowA(View v){
        yellowCardA = yellowCardA + 1;
        displayYellowA(yellowCardA);
    }
    public void displayYellowA(int score){
        TextView scoreView = (TextView) findViewById(R.id.a_team_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }
    public void addRedA(View v){
        redCardA = redCardA + 1;
        displayRedA(redCardA);
    }
    public void displayRedA(int score){
        TextView scoreView = (TextView) findViewById(R.id.a_team_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /*
    *B team calculation
     */
    public void addScoreB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
    }
    public void displayScoreB(int score){
        TextView scoreView = (TextView) findViewById(R.id.b_team_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addYellowB(View v){
        yellowCardB = yellowCardB + 1;
        displayYellowB(yellowCardB);
    }
    public void displayYellowB(int score){
        TextView scoreView = (TextView) findViewById(R.id.b_team_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }
    public void addRedB(View v){
        redCardB = redCardB + 1;
        displayRedB(redCardB);
    }
    public void displayRedB(int score){
        TextView scoreView = (TextView) findViewById(R.id.b_team_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v){
        scoreTeamA = 0;
        displayScoreA(scoreTeamA);
        scoreTeamB = 0;
        displayScoreB(scoreTeamB);
        yellowCardA = 0;
        displayYellowA(yellowCardA);
        yellowCardB = 0;
        displayYellowB(yellowCardB);
        redCardA = 0;
        displayRedA(redCardA);
        redCardB =0;
        displayRedB(redCardB);
    }
}
