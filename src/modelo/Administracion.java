package modelo;

public class Administracion extends Estudiante{
    public Administracion(String nombre, String asignaturas) {
        super(nombre,asignaturas);
    }
    @Override
    public String toString() {
        return "Administración: "+ getAsignaturas();
    }
}
