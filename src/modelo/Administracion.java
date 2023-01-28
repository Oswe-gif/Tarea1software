package modelo;

import java.util.ArrayList;


public class Administracion extends Estudiante{

    public Administracion(String nombre, String asignaturas) {
        super(nombre, asignaturas);
    }

    @Override
    public void enviarMaterialEstudiante() {

    }

    @Override
    public String toString() {
        return "Administración: "+ getAsignaturas();
    }
}
