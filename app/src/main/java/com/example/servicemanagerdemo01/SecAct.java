package com.example.servicemanagerdemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        ServiceSinglton.getInstance().getUser();
    }
}