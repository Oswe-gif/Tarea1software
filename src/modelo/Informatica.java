package modelo;

import service.EmailOutlook;

import java.util.ArrayList;
import java.util.List;

public class Informatica extends Estudiante{

    public Informatica(String nombre, String asignaturas,Envio envio) {
        super(nombre, asignaturas,envio);

    }

    @Override
    public void envioGeneral() {
        getEnvio().material = new ArrayList<>();
        getEnvio().material.add("Computador");
        getEnvio().material.add("Mouse");
        getEnvio().saludoDirector = "Jenny envia saludos";

    }


    @Override
    public String toString() {
        return "Informatica: "+ getAsignaturas();
    }

}
