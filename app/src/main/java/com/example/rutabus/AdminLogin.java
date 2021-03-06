package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminLogin extends AppCompatActivity {

    Button EnterBtn;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login_);

        EnterBtn = findViewById(R.id.enter_btn);
        backButton = findViewById(R.id.back_btn);
        EnterBtn.setOnClickListener(view -> switchAdminMenu());
        backButton.setOnClickListener(view -> finish());
    }
    private void switchAdminMenu(){
        Intent switchActivity = new Intent(this, AdminMenuMain.class);
        startActivity(switchActivity);
    }
}