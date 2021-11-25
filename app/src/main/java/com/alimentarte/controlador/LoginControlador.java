package com.alimentarte.controlador;

import com.alimentarte.interfaz.LoginInterfaz;

//implemento las funcionalidades de la interfaz
public class LoginControlador implements LoginInterfaz.Controlador, LoginInterfaz.ControladorR{
    private final LoginInterfaz.View vista;

    public LoginControlador(LoginInterfaz.View vista) {
        this.vista = vista;
    }

    @Override
    public Boolean validarCamposL(String usuario, String contrasena) {
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

    @Override
    public Boolean validarCampos(String usuario, String contrasena, String email, String nombre, String apellido, String sexo, String direccion, String ciudad, String celular) {
        if (usuario.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo usuario Esta vacio");
            return false;
        }
        else if (contrasena.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Contraseña Esta vacio");
            return false;
        }
        else if (email.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo email Esta vacio");
            return false;
        }
        else if (nombre.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Nombre Esta vacio");
            return false;
        }
        else if (apellido.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Apellido Esta vacio");
            return false;
        }
        else if (sexo.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Sexo Esta vacio");
            return false;
        }
        else if (direccion.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Direccion Esta vacio");
            return false;
        }
        else if (ciudad.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Ciudad Esta vacio");
            return false;
        }
        else if (celular.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionLogin("El campo Celular Esta vacio");
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
