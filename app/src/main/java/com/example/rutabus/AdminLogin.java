package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminLogin extends AppCompatActivity {

    Button EnterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login_);

        EnterBtn = findViewById(R.id.enter_btn);
        EnterBtn.setOnClickListener(view -> switchActivities());
    }
    private void switchActivities(){
        Intent switchActivity = new Intent(this, AdminMenuMain.class);
        startActivity(switchActivity);
    }
}