package com.studyjam.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int teamScoreA;
    int teamScoreB;
    TextView teamScoreATextView;
    TextView teamScoreBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamScoreATextView = (TextView) findViewById(R.id.teamAScoreValue);
        teamScoreBTextView = (TextView) findViewById(R.id.teamBScoreValue);

        findViewById(R.id.resetBtn).setOnClickListener(this);
        findViewById(R.id.teamA3Points).setOnClickListener(this);
        findViewById(R.id.teamB3Points).setOnClickListener(this);
        findViewById(R.id.teamA2Points).setOnClickListener(this);
        findViewById(R.id.teamB2Points).setOnClickListener(this);
        findViewById(R.id.teamAFreeScore).setOnClickListener(this);
        findViewById(R.id.teamBFreeScore).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.resetBtn:
                teamScoreA = 0;
                teamScoreB = 0;
                resetTeamsScore();
                break;

            case R.id.teamA3Points:
                teamScoreA += 3;
                updateScoreA();
                break;

            case R.id.teamB3Points:
                teamScoreB += 3;
                updateScoreB();
                break;

            case R.id.teamA2Points:
                teamScoreA += 2;
                updateScoreA();
                break;

            case R.id.teamB2Points:
                teamScoreB += 2;
                updateScoreB();
                break;

            case R.id.teamAFreeScore:
                break;

            case R.id.teamBFreeScore:
                break;
        }
    }

    private void resetTeamsScore() {
        teamScoreATextView.setText("0");
        teamScoreBTextView.setText("0");
    }

    private void updateScoreA() {
        teamScoreATextView.setText("" + teamScoreA);
    }

    private void updateScoreB() {
        teamScoreBTextView.setText("" + teamScoreB);
    }
}
