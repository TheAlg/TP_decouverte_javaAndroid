package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class createUserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user_activity);


        //handling the button
        Button createButton = (Button) findViewById(R.id.createUser);
        createButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                // inflate the layout of the popup window
                LayoutInflater inflater = (LayoutInflater)
                        getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.popup_design, null);

                // create the popup window
                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                final PopupWindow popupWindow = new PopupWindow(popupView, width, height, true);
                // which view you pass in doesn't matter, it is only used for the window tolken
                popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

                // dismiss the popup window when touched
                popupView.setOnTouchListener(new View.OnTouchListener() {

                    public boolean onTouch(View v, MotionEvent event) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });

    }


    public void showUser(View view){
        Intent showUserIntent = new Intent(this, showUserActivity.class);
        showUserIntent.putExtra("firstName", ((EditText) findViewById(R.id.firstName)).getText().toString());
        showUserIntent.putExtra("lastName", ((EditText) findViewById(R.id.lastName)).getText().toString());
        showUserIntent.putExtra("birthday", ((EditText) findViewById(R.id.birthdate)).getText().toString());
        showUserIntent.putExtra("domain", ((EditText) findViewById(R.id.domain)).getText().toString());
        showUserIntent.putExtra("phone", ((EditText) findViewById(R.id.phone)).getText().toString());
        startActivity(showUserIntent);
    }




}