package modelo;

import java.util.List;

public class Industrial extends Estudiante{


    public Industrial(String nombre, String asignaturas) {
        super(nombre, asignaturas);
    }



    @Override
    public String toString() {
        return "Industrial: "+ getAsignaturas();
    }
}
