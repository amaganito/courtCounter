package com.example.andrewmaganito.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.andrewmaganito.courtcounter.R.id.team_a_score;
import static com.example.andrewmaganito.courtcounter.R.id.team_b_score;

public class MainActivity extends AppCompatActivity {

    /**
     * Team A score tracker
     */
    private int teamAScore = 0;

    /**
     * Team B score tracker
     */
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 3 points to Team A
     */
    public void addThreeForTeamA(View v) {
        teamAScore +=3;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 2 points to Team A
     */
    public void addTwoForTeamA(View v) {
        teamAScore +=2;
        displayForTeamA(teamAScore);
    }

    /**
     * Add 1 point to Team A
     */
    public void addOneForTeamA(View v) {
        teamAScore +=1;
        displayForTeamA(teamAScore);
    }

    public void minusOneForTeamA(View v) {
        if(teamAScore != 0){
            teamAScore -= 1;}
        else {Toast.makeText(this, "No negative scores.", Toast.LENGTH_LONG).show();}
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3 points to Team B
     */
    public void addThreeForTeamB(View v) {
        teamBScore +=3;
        displayForTeamB(teamBScore);
    }

    /**
     * Add 2 points to Team B
     */
    public void addTwoForTeamB(View v) {
        teamBScore +=2;
        displayForTeamB(teamBScore);
    }

    /**
     * Add 1 point to Team B
     */
    public void addOneForTeamB(View v) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void minusOneForTeamB(View v) {
        if(teamBScore != 0){
        teamBScore -= 1;}
        else {Toast.makeText(this, "No negative scores.", Toast.LENGTH_LONG).show();}
        displayForTeamB(teamBScore);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset Team A and Team B Score
     */
    public void resetScores(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
