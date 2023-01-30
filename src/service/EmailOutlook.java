package service;

import modelo.Envio;

public class EmailOutlook implements EstablecerConexiServer{

    public void enviarEmail(Envio envio) {
        //responsabilidad unica
        System.out.println("EMAIL ENVIADO y correspondencia " + envio);
    }

    @Override
    public void establecerConexion() {
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
    }
}
