package com.alimentarte.controlador;

import com.alimentarte.interfaz.LoginInterface;

//implemento las funcionalidades de la interfaz
public class ControladorLogin implements LoginInterface.Controlador{
    private final LoginInterface.View vista;

    public ControladorLogin(LoginInterface.View vista) {
        this.vista = vista;
    }

    @Override
    public Boolean validarCamposL(String usuario, String contrasena) {
        if (usuario.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo usuario no puede estar vacio");
            return false;
        } else if (usuario.trim().length() < 4) {
            vista.msnValidacionLogin("El campo Usuario debe tener por menos 5 caracteres");
            return false;
        }
        else if (contrasena.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Contraseña no puede estar vacio");
            return false;
        } else if (contrasena.trim().length() < 4) {
            vista.msnValidacionLogin("El campo Contraseña debe tener por menos 5 caracteres");
            return false;
        }
        return true;
    }

    @Override
    public Boolean cotejar (String usuario, String contrasena) {
        if (usuario.equals("Prueba")) {
            if (contrasena.equals("12345")) {
                vista.msnValidacionLogin("Usuario Autorizado");
                return true;
            } else
                vista.msnValidacionLogin("Contraseña Incorrecta");
                return false;
        } else
            vista.msnValidacionLogin("Usuario Incorrecto");
                return false;
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
