package com.alimentarte.controlador;

import com.alimentarte.interfaz.LoginInterfaz;

//implemento las funcionalidades de la interfaz
public class LoginControlador implements LoginInterfaz.Controlador {
    private final LoginInterfaz.View vista;

    public LoginControlador(LoginInterfaz.View vista) {
        this.vista = vista;
    }

    @Override
    public Boolean validarCampos(String usuario, String contrasena) {
        if (usuario.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo usuario no puede estar vacio");
            return false;
        }
        else if (contrasena.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Contraseña no puede estar vacio");
            return false;
        }
        return true;
    }
/*
    @Override
    public Boolean validarCampos(String usuario, String contrasena) {
        if (usuario.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo usuario no puede estar vacio");
            return false;
        }
        else if (contrasena.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Contraseña no puede estar vacio");
            return false;
        }
        return true;
    }*/
}
