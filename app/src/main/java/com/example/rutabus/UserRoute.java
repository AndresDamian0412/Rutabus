package com.example.rutabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UserRoute extends AppCompatActivity {
    TextView tv_ruta, unidadMain, unidad1, unidad2, unidad3;
    ImageView imgRuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_route);
        tv_ruta = (TextView) findViewById(R.id.tv_nombreRuta);
        unidadMain = (TextView)findViewById(R.id.tv_unidad);
        unidad1 = (TextView)findViewById(R.id.textView11);
        unidad2 = (TextView)findViewById(R.id.textView12);
        unidad3 = (TextView)findViewById(R.id.textView13);
        imgRuta = (ImageView)findViewById(R.id.iv_imagenRuta);
        llenaInfo();

        tv_ruta.setText(getIntent().getStringExtra("extra"));
    }

    private void llenaInfo(){
        String extra = getIntent().getStringExtra("extra");

        if(extra.equalsIgnoreCase("TEC-VALLE_ALTO")){
            unidadMain.setText("Autobus No. 04");
            unidad1.setText("Autobus No.04");
            unidad2.setText("Autobus No.16");
            unidad3.setText("Autobus No.320");
            imgRuta.setImageResource(R.drawable.mapa_valto);
        }else{
            unidadMain.setText("Autobus No. 02");
            unidad1.setText("Autobus No.02");
            unidad2.setText("Autobus No.44");
            unidad3.setText("Autobus No.160");
            imgRuta.setImageResource(R.drawable.mapa_pasr);
        }
    }
}