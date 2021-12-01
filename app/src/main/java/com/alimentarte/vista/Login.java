package com.alimentarte.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alimentarte.R;
import com.alimentarte.controlador.ControladorLogin;
import com.alimentarte.interfaz.LoginInterface;

public class Login extends AppCompatActivity implements LoginInterface.View {
//Variables de los campos y los botones de la vista Login.xml
    private EditText usuario;
    private EditText contrasena;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        //Conexion de variables con elemento por el Id
        usuario = findViewById(R.id.usuariol);
        contrasena = findViewById(R.id.contrasenal);
        boton = findViewById(R.id.btn_loginl);
        //Instanciamos la clase ControladorLogin y la ponemos en la var contrologin
        ControladorLogin contrologin = new ControladorLogin(this);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_loginl) {
                    //controllogin es la instancia de ControladorLogin, con el metodo validarCampoL. Es decir usa el metodo ValidarCampoL de la clase ControladorLogin
                    //con los atributos
                    if (contrologin.validarCamposL(usuario.getText().toString(), contrasena.getText().toString())){
                        if (contrologin.cotejar(usuario.getText().toString(), contrasena.getText().toString())){
                            Intent logueado = new Intent(Login.this, Productos.class);
                            startActivity(logueado);
                        } //else
//                            Toast.makeText(Login.this, "Usuario o Contraseña Incorrectos",Toast.LENGTH_LONG).show(); //Hacer del lado del controlador
                    }
                }
            }
        });
    }

    @Override
    public void msnValidacionLogin(String mensaje) {
        Toast.makeText(Login.this,mensaje,Toast.LENGTH_LONG).show();
    }
}