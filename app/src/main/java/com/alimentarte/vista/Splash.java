package com.alimentarte.vista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alimentarte.R;

public class Splash extends AppCompatActivity implements View.OnClickListener{

    public void procesarEvento(int opc){ //el Atributo es el id del boton (en Numero)
    //Mira cual es el id del boton y usa el switch
        switch (opc){
            case R.id.btn_registers:
                Intent register = new Intent(Splash.this, Register.class);
                startActivity(register);
                break;
            case R.id.btn_logins:
                Intent login = new Intent(Splash.this, Login.class);
                startActivity(login);
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

/*  //Implementación botón por botón
    Nota: Arriba del @Override private Button btn_register;

        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(Splash.this, Register.class);
                startActivity(register);
            }
        });
*/
    //Implementación un evento Listener a varios botones
        Button login = (Button) findViewById(R.id.btn_logins);
        login.setOnClickListener(this);
        Button btn_register = findViewById(R.id.btn_registers);
        btn_register.setOnClickListener(this);
    }

//Implementa el View.OnClickListener
    @Override
    public void onClick(View v) {
        procesarEvento(v.getId());  //v.getId() capturamos el id del boton (en Numero) y vamos a metodo procesarEvento
    }
}
