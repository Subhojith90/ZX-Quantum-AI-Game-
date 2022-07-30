package com.example.zxcalculusdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {
    Handler handler = new Handler();

    private ImageView levels;
    private ImageView game;
    private ImageView vector;
    private ImageView blah;

    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        progressBar = findViewById(R.id.progressBar);
        text = findViewById(R.id.text_view_progress);
        levels = (ImageView) findViewById(R.id.chapter1);
        game = (ImageView) findViewById(R.id.quantum_game);
        vector = (ImageView) findViewById(R.id.vector_stimulator);
        blah = (ImageView) findViewById(R.id.blah1);

        levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this, ContentPage.class);
                startActivity(i);
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Quantum_Game.class);
                startActivity(intent);
            }
        });
        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Vector_Space.class);
                startActivity(intent);
            }
        });

        /////PROGRESS BAR COMPILATION
        levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentProgress = CurrentProgress +10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        text.setText(String.valueOf(CurrentProgress));
                    }
                });
            }
        });
        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentProgress = CurrentProgress +10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        text.setText(String.valueOf(CurrentProgress));
                    }
                });
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentProgress = CurrentProgress +10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        text.setText(String.valueOf(CurrentProgress));
                    }
                });
            }
        });
        blah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentProgress = CurrentProgress +10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        text.setText(String.valueOf(CurrentProgress));
                    }
                });
            }
        });
    }
}

