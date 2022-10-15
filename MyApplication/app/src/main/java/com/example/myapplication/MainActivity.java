package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainButton(View view) {
        Intent intent = new Intent(this, createUserActivity.class);
        startActivity(intent);
        }

    public void mainTrain(View view) {
        Intent intent = new Intent(this, trainSchedule.class);
        startActivity(intent);
    }

    public void mainAgenda(View view) {
        Intent intent = new Intent(this, agendaActivity.class);
        startActivity(intent);
    }

}