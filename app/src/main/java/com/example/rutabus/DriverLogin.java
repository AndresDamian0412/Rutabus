package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class DriverLogin extends AppCompatActivity {

    Button EnterBtn;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        EnterBtn = findViewById(R.id.enter_btn);
        backButton = findViewById(R.id.back_btn);
        EnterBtn.setOnClickListener(view -> switchDriverMenu());
        backButton.setOnClickListener(view -> finish());
    }
    private void switchDriverMenu(){
        Intent switchActivity = new Intent(this, DriverAllRoutes.class);
        startActivity(switchActivity);
    }
}