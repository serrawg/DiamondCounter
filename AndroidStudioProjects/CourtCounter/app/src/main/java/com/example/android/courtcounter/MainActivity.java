package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for team A
    int scoreTeamA = 0;

    // tracks the score for team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
      }

      public void resetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA (scoreTeamA);
        displayForTeamB(scoreTeamB);
      }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to the team A score.
     */
    public void addThreeForTeamA(View v) {
       displayForTeamA(3);
       scoreTeamA = scoreTeamA + 3;
       displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 points to the team A score.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

     /**
      * Adds 1 point to the team A score.
      */
     public void addOneForTeamA(View v) {
         displayForTeamA(1);
         scoreTeamA = scoreTeamA + 1;
         displayForTeamA(scoreTeamA);
     }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to the team B score.
     */
    public void addThreeForTeamB(View v) {
        displayForTeamB(3);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 points to the team B score.
     */
    public void addTwoForTeamB(View v) {
        displayForTeamB(2);
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 point to the team B score.
     */
    public void addOneForTeamB(View v) {
        displayForTeamB(1);
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

}
