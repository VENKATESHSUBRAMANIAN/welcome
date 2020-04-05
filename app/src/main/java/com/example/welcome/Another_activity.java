package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

    public class Another_activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_another_activity);

            Intent nn = getIntent();
            String FirstName = nn.getStringExtra("FirstName");
            String LastName = nn.getStringExtra("LastName");
            TextView ts =(TextView)findViewById(R.id.lblmyvalue);
            ts.setText(FirstName+LastName);
        }
    }
