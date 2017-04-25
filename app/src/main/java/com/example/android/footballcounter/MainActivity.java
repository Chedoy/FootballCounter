package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballcounter.R;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int shotOnGoalA = 0;
    int shotOnGoalB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase the shots on goal for Team A by 1.
     */
    public void addSogForTeamA(View v) {
        shotOnGoalA = shotOnGoalA + 1;
        displayShotsForTeamA(shotOnGoalA);

    }

    /**
     * Increase the shots on goal for Team B by 1.
     */
    public void addSogForTeamB(View v) {
        shotOnGoalB = shotOnGoalB + 1;
        displayShotsForTeamB(shotOnGoalB);

    }

    /**
     * Resets the score for both teams to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotOnGoalA = 0;
        shotOnGoalB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayShotsForTeamA(shotOnGoalA);
        displayShotsForTeamB(shotOnGoalB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shots for Team A.
     */
    public void displayShotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_sog);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shots for Team B.
     */
    public void displayShotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_sog);
        scoreView.setText(String.valueOf(score));
    }
}
