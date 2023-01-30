package modelo;

import service.EmailOutlook;

import java.util.ArrayList;
import java.util.List;

public class Industrial extends Estudiante{

    private Envio envio;
    private EmailOutlook email;
    public Industrial(String nombre, String asignaturas,Envio envio,EmailOutlook email) {
        super(nombre, asignaturas);
        this.envio=envio;
        this.email=email;
    }

    @Override
    public void envioGeneral() {
        envio.material = new ArrayList<>();
        envio.material.add("Cable");
        envio.material.add("Cobre");
        envio.saludoDirector = "Luz Helena envia saludos";
        email.enviarEmail(envio);

    }


    @Override
    public String toString() {
        return "Industrial: "+ getAsignaturas();
    }
}
