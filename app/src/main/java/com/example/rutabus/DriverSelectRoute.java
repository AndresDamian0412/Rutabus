package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DriverSelectRoute extends AppCompatActivity {

    TextView tv_ruta;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_select_route);

        tv_ruta = (TextView) findViewById(R.id.tv_ruta);
        tv_ruta.setText(getIntent().getStringExtra("extra"));
        btn = (Button) findViewById(R.id.btn_activar);

        btn.setOnClickListener(view -> switchActiveRoute());
    }

    private void switchActiveRoute(){
        Intent intento = new Intent(this,DriverActiveRoute.class);
        intento.putExtra("extra",tv_ruta.getText().toString());
        startActivity(intento);
    }
}