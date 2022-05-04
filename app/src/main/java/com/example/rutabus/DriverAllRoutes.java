package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DriverAllRoutes extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_all_routes);
        tv1 = (TextView) findViewById(R.id.textView14);
        tv2 = (TextView) findViewById(R.id.textView15);

        tv1.setOnClickListener(view -> switchDriverSelect1());
        tv2.setOnClickListener(view -> switchDriverSelect2());
    }

    private void switchDriverSelect1(){
        Intent intento = new Intent(this,DriverSelectRoute.class);
        intento.putExtra("extra",tv1.getText().toString());
        startActivity(intento);
    }

    private void switchDriverSelect2(){
        Intent intento = new Intent(this,DriverSelectRoute.class);
        intento.putExtra("extra",tv2.getText().toString());
        startActivity(intento);
    }
}