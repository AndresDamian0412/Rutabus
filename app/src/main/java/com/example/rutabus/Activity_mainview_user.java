package com.example.rutabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_mainview_user extends AppCompatActivity implements SearchView.OnQueryTextListener {
    EditText et_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        et_search = findViewById(R.id.et_search);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainview_user);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }

    private void search (View view){
        if(et_search.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Digite una ruta para la búsqueda",Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(this,Activity_searchview_user.class);
            startActivity(i);
        }
    }
}