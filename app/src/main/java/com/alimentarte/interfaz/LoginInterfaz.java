package com.alimentarte.interfaz;

public interface LoginInterfaz {
    interface View {
        void msnValidacionLogin (String mensaje);
    }

    interface Controlador {
        Boolean validarCampos (String usuario, String contrasena);
    }

    interface Modelo {
    }
}
