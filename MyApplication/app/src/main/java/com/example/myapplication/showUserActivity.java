package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class showUserActivity extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.show_user_activity);

            Intent intent = getIntent();
            //show data
            TextView firstName = (TextView)findViewById(R.id.show_firstName);
            firstName.setText(intent.getStringExtra("firstName"));

            TextView lastName = (TextView)findViewById(R.id.show_lastName);
            lastName.setText(intent.getStringExtra("lastName"));

            TextView birthday = (TextView)findViewById(R.id.show_birthdate);
            birthday.setText(intent.getStringExtra("birthday"));

            TextView domain = (TextView)findViewById(R.id.show_domain);
            domain.setText(intent.getStringExtra("domain"));

            TextView phone = (TextView)findViewById(R.id.show_phone);
            phone.setText(intent.getStringExtra("phone"));

        }

        //going back to previous activity
        public void back(){
            Intent intent = new Intent(this, createUserActivity.class);
            startActivity(intent);
        }
        //going back to new activity
        public void forward(View view){
            Intent intent = new Intent(this, emptyActivity.class);
            startActivity(intent);
            finish();
        }



}
