package modelo;

public class Informatica extends Estudiante{
    public Informatica(String nombre, String asignaturas) {
        super(nombre, asignaturas);
    }
    @Override
    public String toString() {
        return "Informatica: "+ getAsignaturas();
    }
}
