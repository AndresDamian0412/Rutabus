package com.example.rutabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AdminMenuParadas extends AppCompatActivity {
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu_paradas);

        backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(view -> finish());
    }
}