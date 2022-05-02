package com.example.rutabus;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AdminMenuMain extends AppCompatActivity {
    ImageView backButton;
    LinearLayout paradasView, rutasView, driversView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu_main);

        backButton = findViewById(R.id.back_btn);
        paradasView = findViewById(R.id.paradas_btn);
        rutasView = findViewById(R.id.rutas_btn);
        driversView = findViewById(R.id.drivers_btn);
        backButton.setOnClickListener(view -> finish());
        paradasView.setOnClickListener(view -> switchParadasMenu());
        rutasView.setOnClickListener(view -> switchRutasMenu());
        driversView.setOnClickListener(view -> switchDriversMenu());
    }
    private void switchParadasMenu(){
        Intent switchParadas = new Intent(this, AdminMenuParadas.class);
        startActivity(switchParadas);
    }
    private void switchRutasMenu(){
        Intent switchRutas = new Intent(this, AdminMenuRutas.class);
        startActivity(switchRutas);
    }
    private void switchDriversMenu(){
        Intent switchDrivers = new Intent(this, AdminMenuDrivers.class);
        startActivity(switchDrivers);
    }
}