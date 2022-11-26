package com.example.createchatapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/*
Temporary Class for Opening a Profile- To be changed most likely once other people finish.
 */

public class OpenProfile extends AppCompatActivity {

    private TextView textName;
    private String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_profile);

        user = getIntent().getExtras().get("user_name").toString();

        textName = (TextView) findViewById(R.id.displayName);
        textName.setText(user);


    }

}
