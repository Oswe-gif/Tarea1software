package modelo;

public class Estudiante {

    private String nombre;

    private String asignaturas;

    public Estudiante(String nombre, String asignaturas) {
        this.nombre = nombre;
        this.asignaturas =asignaturas;
    }
    //unica responsabilidad
    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }
}
