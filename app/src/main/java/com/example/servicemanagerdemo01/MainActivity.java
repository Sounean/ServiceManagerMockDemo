package com.example.servicemanagerdemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicemanagerdemo01.bean.UserInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceSinglton.getInstance().setUser(new UserInfo("用户名123","123456"));
    }

    public void btnJump(View view) {
        startActivity(new Intent(this,SecAct.class));
    }
}