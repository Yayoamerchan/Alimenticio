package com.alimentarte.controlador;

import com.alimentarte.interfaz.Formulario_Interfaz;
import com.alimentarte.interfaz.LoginInterfaz;

public class FormularioControlador implements Formulario_Interfaz.Controlador {

    private final Formulario_Interfaz.View vista;

    public FormularioControlador(Formulario_Interfaz.View vista) {
        this.vista = vista;
    }

    @Override
    public Boolean validarCampos(String usuario, String contrasena, String email, String nombre, String apellido, String sexo, String direccion, String ciudad, String celular) {
        //switch

        if (usuario.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo usuario Esta vacio");
            return false;
        }
        else if (contrasena.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Contraseña Esta vacio");
            return false;
        }
        else if (email.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo email Esta vacio");
            return false;
        }
        else if (nombre.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Nombre Esta vacio");
            return false;
        }
        else if (apellido.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Apellido Esta vacio");
            return false;
        }
        else if (sexo.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Sexo Esta vacio");
            return false;
        }
        else if (direccion.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Direccion Esta vacio");
            return false;
        }
        else if (ciudad.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Ciudad Esta vacio");
            return false;
        }
        else if (celular.trim().isEmpty()){//borra espacios en el input
            vista.msnValidacionFormulario("El campo Celular Esta vacio");
            return false;
        }
        return true;
    }
}
