package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;


public class emptyActivity extends FragmentActivity {

    String number = "06 XX XX XX XX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);


        TextView phoneNumber = (TextView) findViewById(R.id.phone_call);
        phoneNumber.setText(number);

        Button callButton = (Button) findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)  {
                call(number);
            }
        });
    }

    public void call(String number){
        //ACTION_CALL needs user's permission
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:" + number));

        startActivity(callIntent);
    }
}