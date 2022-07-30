package com.example.zxcalculusdemo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.zxcalculusdemo.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {
        Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, HomeScreen.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }
}