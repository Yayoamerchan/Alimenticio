package com.alimentarte.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.alimentarte.R;
import com.alimentarte.controlador.FormularioControlador;
import com.alimentarte.interfaz.Formulario_Interfaz;

import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity implements Formulario_Interfaz.View {
    //Variables
    private EditText usuario;
    private EditText contrasena;
    private EditText email;
    private EditText nombre;
    private EditText apellido;
    private Spinner sexo;
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
        FormularioControlador controlregistro = new FormularioControlador(this);

        //escuchador del boton
        mostrarSexo();
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //test al clickear el boton
                //Toast.makeText(LoginActivity.this,"Hola Mundo!",Toast.LENGTH_LONG).show();
                if (v.getId() == R.id.btn_submit){
                    if (controlregistro.validarCampos(usuario.getText().toString(), contrasena.getText().toString(), email.getText().toString(), nombre.getText().toString(), apellido.getText().toString(), sexo.getSelectedItem().toString(), direccion.getText().toString(), ciudad.getText().toString(), celular.getText().toString())) {
                        Intent registrado = new Intent(Register.this, Register_ok.class);
                        startActivity(registrado);
                    }
                }
            }
        });
    }

    @Override
    public void msnValidacionFormulario(String mensaje) {
        Toast.makeText(Register.this,mensaje,Toast.LENGTH_LONG).show();
    }

    public List<String> obtenerSexo() {
        List<String> direccion = new ArrayList<>();

        direccion.add("Seleccione el Sexo                                 V");
        direccion.add("MASCULINO");
        direccion.add("FEMENINO");
        direccion.add("OTRO");

        return direccion;
    }

    private void mostrarSexo() {
        ArrayAdapter<String> dataAdapterDireccion = new ArrayAdapter<>(this, R.layout.textview_spinner, obtenerSexo());
        sexo.setAdapter(dataAdapterDireccion);
        sexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }
}