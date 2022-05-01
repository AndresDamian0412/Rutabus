package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserMain extends AppCompatActivity {

    EditText et_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        et_search = findViewById(R.id.et_search);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
    }

    public void busqueda (View view){
        Intent i = new Intent(this,UserSearch.class);
        startActivity(i);
    }
}