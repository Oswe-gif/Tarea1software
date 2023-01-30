package service;

import modelo.Envio;

public class EmailOutlook {

    public void enviarEmail(Envio envio) {
        //responsabilidad unica
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
        System.out.println("EMAIL ENVIADO y correspondencia " + envio);
    }
}
