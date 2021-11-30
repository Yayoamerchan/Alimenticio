package com.alimentarte.interfaz;

public interface Formulario_Interfaz {
    interface View {
        void msnValidacionFormulario (String mensaje); //String User se puede usar?
    }

    interface Controlador {
        Boolean validarCampos (String usuario, String contrasena, String email, String nombre, String apellido, String sexo, String direccion, String ciudad, String celular);
    }

    interface Modelo {
    }
}
