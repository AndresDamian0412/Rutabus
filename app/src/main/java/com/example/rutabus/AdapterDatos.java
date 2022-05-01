package com.example.rutabus;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {


    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos viewHolderDatos, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
        }
    }
}
