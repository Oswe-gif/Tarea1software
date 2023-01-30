package modelo;

import service.EmailOutlook;

import java.util.ArrayList;
import java.util.List;

public class Industrial extends Estudiante{


    public Industrial(String nombre, String asignaturas,Envio envio) {
        super(nombre, asignaturas,envio);

    }

    @Override
    public void envioGeneral() {
        getEnvio().material = new ArrayList<>();
        getEnvio().material.add("Cable");
        getEnvio().material.add("Cobre");
        getEnvio().saludoDirector = "Luz Helena envia saludos";

    }


    @Override
    public String toString() {
        return "Industrial: "+ getAsignaturas();
    }

}
