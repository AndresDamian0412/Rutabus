package com.example.rutabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DriverActiveRoute extends AppCompatActivity {
    TextView tv_ruta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_active_route);
        tv_ruta = (TextView) findViewById(R.id.texto_ruta);
        tv_ruta.setText(getIntent().getStringExtra("extra"));
    }
}