package modelo;

import service.EmailOutlook;

import java.util.ArrayList;


public class Administracion extends Estudiante{
    private Envio envio;
    private EmailOutlook email;
    public Administracion(String nombre, String asignaturas,Envio envio,EmailOutlook email) {
        super(nombre, asignaturas);
        this.envio=envio;
        this.email=email;
    }

    @Override
    public void envioGeneral() {
        envio.material = new ArrayList<>();
        envio.material.add("Libro");
        envio.material.add("Empresa");
        envio.saludoDirector = "Carolina envia saludos";
        email.enviarEmail(envio);
    }


    @Override
    public String toString() {
        return "Administración: "+ getAsignaturas();
    }
}
