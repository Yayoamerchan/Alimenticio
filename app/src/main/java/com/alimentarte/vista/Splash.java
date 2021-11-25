package com.alimentarte.vista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alimentarte.R;

public class Splash extends AppCompatActivity implements View.OnClickListener{

    public void procesarEvento(int opc){
        switch (opc){
            case R.id.btn_register:
                Intent register = new Intent(Splash.this, Register.class);
                startActivity(register);
                break;
            case R.id.btn_login:
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
        Button btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);
        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        procesarEvento(v.getId());
    }
}
