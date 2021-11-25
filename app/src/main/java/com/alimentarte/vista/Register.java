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

public class Register extends AppCompatActivity implements LoginInterfaz.View {
    //Variables
    private EditText usuario;
    private EditText contrasena;
    




    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register); //conexion con la vista (xml)
        //Conexion de variables con elemento
        usuario = findViewById(R.id.direccion);
        contrasena = findViewById(R.id.email);
        boton = findViewById(R.id.btn_submit);
        LoginControlador controler = new LoginControlador(this);

        //escuchador del boton
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test al clickear el boton
                //Toast.makeText(LoginActivity.this,"Hola Mundo!",Toast.LENGTH_LONG).show();
                controler.validarCampos(usuario.getText().toString(), contrasena.getText().toString());
                Intent splash = new Intent(Register.this, Register_ok.class);
                startActivity(splash);
            }
        });
    }

    @Override
    public void msnValidacionLogin(String mensaje) {
        Toast.makeText(Register.this,mensaje,Toast.LENGTH_LONG).show();
    }
}