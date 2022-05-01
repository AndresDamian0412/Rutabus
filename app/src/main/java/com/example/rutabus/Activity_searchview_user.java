package com.example.rutabus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Activity_searchview_user extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchview_user);

        recycler = (RecyclerView) findViewById(R.id.recycler_v);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos = new ArrayList<String>();
        listDatos.add("TEC - VALLE ALTO");
        listDatos.add("TEC - PASR");

        AdapterDatos adapter = new AdapterDatos(listDatos);
    }
}