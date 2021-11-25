package com.alimentarte.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alimentarte.R;
import com.alimentarte.interfaz.LoginInterfaz;

public class Login extends AppCompatActivity implements LoginInterfaz.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    @Override
    public void msnValidacionLogin(String mensaje) {

    }
}