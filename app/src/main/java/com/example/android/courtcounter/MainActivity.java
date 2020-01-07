package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //variable declaration
    int totalScoreA = 0;
    int totalScoreB = 0;

    /**
     * Changing team A points
     **/
    public void add3PointsA(View view) {
        totalScoreA = totalScoreA + 3;
        displayForTeamA(totalScoreA);
    }

    public void add2PointsA(View view) {
        totalScoreA = totalScoreA + 2;
        displayForTeamA(totalScoreA);
    }

    public void add1PointA(View view) {
        totalScoreA = totalScoreA + 1;
        displayForTeamA(totalScoreA);
    }

    /**
     * Changing team B points
     **/
    public void add3PointsB(View view) {
        totalScoreB = totalScoreB + 3;
        displayForTeamB(totalScoreB);
    }

    public void add2PointsB(View view) {
        totalScoreB = totalScoreB + 2;
        displayForTeamB(totalScoreB);
    }

    public void add1PointB(View view) {
        totalScoreB = totalScoreB + 1;
        displayForTeamB(totalScoreB);
    }

    /**
     * RESET BUTTON
     **/
    public void resetScore(View view) {
        totalScoreA = 0;
        totalScoreB = 0;
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
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
}
