package com.alimentarte.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alimentarte.R;
import com.alimentarte.controlador.LoginControlador;
import com.alimentarte.interfaz.LoginInterfaz;

public class LoginActivity extends AppCompatActivity implements LoginInterfaz.View {
    //Variables
    private EditText usuario;
    private EditText contrasena;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //conexion con la vista (xml)
        //Conexion de variables con elemento
        usuario = findViewById(R.id.editTextUser);
        contrasena = findViewById(R.id.editTextPassword);
        boton = findViewById(R.id.btnsubmit);
        LoginControlador controler = new LoginControlador(this);

        //escuchador del boton
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test al clickear el boton
                //Toast.makeText(LoginActivity.this,"Hola Mundo!",Toast.LENGTH_LONG).show();
                controler.validarCampos(usuario.getText().toString(), contrasena.getText().toString());

            }
        });
    }

    @Override
    public void msnValidacionLogin(String mensaje) {
        Toast.makeText(LoginActivity.this,mensaje,Toast.LENGTH_LONG).show();
    }
}