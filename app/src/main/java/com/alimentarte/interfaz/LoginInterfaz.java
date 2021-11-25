package com.alimentarte.interfaz;

public interface LoginInterfaz {
    interface View {
        void msnValidacionLogin (String mensaje);
    }

    interface Controlador {
        Boolean validarCamposL (String usuario, String contrasena);
    }

    interface ControladorR {
        Boolean validarCampos (String usuario, String contrasena, String email, String nombre, String apellido, String sexo, String direccion, String ciudad, String celular);
    }

    interface Modelo {
    }
}
