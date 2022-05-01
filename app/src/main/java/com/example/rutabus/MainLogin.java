package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainLogin extends AppCompatActivity {

    Button UserBtn;
    LinearLayout DriverBtn, AdminBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        UserBtn = findViewById(R.id.user_view_btn);
        DriverBtn = findViewById(R.id.driver_view_btn);
        AdminBtn = findViewById(R.id.admin_view_btn);
        UserBtn.setOnClickListener(view -> switchUserView());
        DriverBtn.setOnClickListener(view -> switchDriverView());
        AdminBtn.setOnClickListener(view -> switchAdminView());
    }
    private void switchUserView(){
        Intent switchActivity = new Intent(this, UserMain.class);
        startActivity(switchActivity);
    }
    private void switchDriverView(){
        Intent switchActivity = new Intent(this, DriverLogin.class);
        startActivity(switchActivity);
    }
    private void switchAdminView(){
        Intent switchActivity = new Intent(this, AdminLogin.class);
        startActivity(switchActivity);
    }
}