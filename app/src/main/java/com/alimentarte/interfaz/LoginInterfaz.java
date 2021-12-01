package com.alimentarte.interfaz;

public interface LoginInterfaz {
    interface View {
        void msnValidacionLogin (String mensaje);
    }

    interface Controlador {
        Boolean validarCamposL (String usuario, String contrasena);
        Boolean cotejar (String usuario, String contrasena);
    }

    interface Modelo {
    }
}
