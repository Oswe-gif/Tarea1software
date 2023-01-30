package modelo;

import service.EmailOutlook;

import java.util.ArrayList;
import java.util.List;

public class Informatica extends Estudiante{
    private Envio envio;
    private EmailOutlook email;
    public Informatica(String nombre, String asignaturas,Envio envio,EmailOutlook email) {
        super(nombre, asignaturas);
        this.envio=envio;
        this.email=email;
    }

    @Override
    public void envioGeneral() {
        envio.material = new ArrayList<>();
        envio.material.add("Computador");
        envio.material.add("Mouse");
        envio.saludoDirector = "Jenny envia saludos";
        email.enviarEmail(envio);
    }


    @Override
    public String toString() {
        return "Informatica: "+ getAsignaturas();
    }

}
