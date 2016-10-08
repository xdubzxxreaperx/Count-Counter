package com.example.user.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addThreeToTeamA(View View){
        ScoreTeamA = ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);

    }

    public void addTwoToTeamA(View View){
        ScoreTeamA = ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);
    }

    public void addOneToTeamA(View View){
        ScoreTeamA = ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score1);
        scoreView.setText(String.valueOf(score));
    }
    public void clickrest(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reset);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeToTeamB(View View){
        ScoreTeamB = ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);

    }
    public void addTwoToTeamB(View View){
        ScoreTeamB = ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);

    }
    public void addOneToTeamB(View View){
        ScoreTeamB = ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);

    }

    public void clickreset(View view){
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }
}

