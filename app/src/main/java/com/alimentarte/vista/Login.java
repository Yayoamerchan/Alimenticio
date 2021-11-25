package com.alimentarte.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alimentarte.R;
import com.alimentarte.controlador.LoginControlador;
import com.alimentarte.interfaz.LoginInterfaz;

public class Login extends AppCompatActivity implements LoginInterfaz.View {

    private EditText usuario;
    private EditText contrasena;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        //Conexion de variables con elemento
        usuario = findViewById(R.id.usuariol);
        contrasena = findViewById(R.id.contrasenal);
        boton = findViewById(R.id.btn_loginl);
        LoginControlador contrologin = new LoginControlador(this);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contrologin.validarCamposL(usuario.getText().toString(), contrasena.getText().toString());
                Intent logueado = new Intent(Login.this, Productos.class);
                startActivity(logueado);
            }
        });
    }

    @Override
    public void msnValidacionLogin(String mensaje) {
        Toast.makeText(Login.this,mensaje,Toast.LENGTH_LONG).show();
    }
}