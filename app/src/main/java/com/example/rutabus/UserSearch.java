package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class UserSearch extends AppCompatActivity {

    ListView listaRutas;
    TextView texto;
    ImageView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search);

        texto = (TextView) findViewById(R.id.tv_search);
        listaRutas = (ListView) findViewById(R.id.lv_rutas);
        btn_back =(ImageView) findViewById(R.id.back_btn);

        texto.setText("TEC");

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arrayRutas, android.R.layout.simple_list_item_1);

        listaRutas.setAdapter(adaptador);
        listaRutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intento = new Intent(getApplicationContext(),UserRoute.class);
                intento.putExtra("extra",adapterView.getItemAtPosition(i).toString());
                startActivity(intento);
            }
        });
    }

    public void back(View view){

        Intent i = new Intent(this,UserMain.class);
        startActivity(i);
    }

}