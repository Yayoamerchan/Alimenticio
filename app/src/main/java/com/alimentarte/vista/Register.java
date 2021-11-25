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
    private EditText email;
    private EditText nombre;
    private EditText apellido;
    private EditText sexo;
    private EditText direccion;
    private EditText ciudad;
    private EditText celular;

    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register); //conexion con la vista (xml)
        //Conexion de variables con elemento
        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        email = findViewById(R.id.email);
        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellido);
        sexo = findViewById(R.id.sexo);
        direccion = findViewById(R.id.direccion);
        ciudad = findViewById(R.id.ciudad);
        celular = findViewById(R.id.celular);
        boton = findViewById(R.id.btn_submit);
        LoginControlador controlregistro = new LoginControlador(this);

        //escuchador del boton
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test al clickear el boton
                //Toast.makeText(LoginActivity.this,"Hola Mundo!",Toast.LENGTH_LONG).show();
                controlregistro.validarCampos(usuario.getText().toString(), contrasena.getText().toString(), email.getText().toString(), nombre.getText().toString(), apellido.getText().toString(), sexo.getText().toString(), direccion.getText().toString(), ciudad.getText().toString(), celular.getText().toString());
                Intent registrado = new Intent(Register.this, Register_ok.class);
                startActivity(registrado);
            }
        });
    }

    @Override
    public void msnValidacionLogin(String mensaje) {
        Toast.makeText(Register.this,mensaje,Toast.LENGTH_LONG).show();
    }
}