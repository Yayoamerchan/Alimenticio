package com.alimentarte.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.alimentarte.R;

public class Register_ok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_ok);
        getSupportActionBar().hide();
        contar();
    }

    private void contar() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                finalizarmain();
            }
        }, 5000); //5segundo
    }
    public void finalizarmain() {
        Intent siguiente = new Intent(this, Login.class);
        startActivity(siguiente);
        finish(); //finaliza la activity main
    }
}