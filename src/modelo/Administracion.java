package modelo;

import service.EmailOutlook;

import java.util.ArrayList;


public class Administracion extends Estudiante{

    public Administracion(String nombre, String asignaturas,Envio envio) {
        super(nombre, asignaturas,envio);

    }

    @Override
    public void envioGeneral() {
        getEnvio().material = new ArrayList<>();
        getEnvio().material.add("Libro");
        getEnvio().material.add("Empresa");
        getEnvio().saludoDirector = "Carolina envia saludos";

    }


    @Override
    public String toString() {
        return "Administración: "+ getAsignaturas();
    }

}
