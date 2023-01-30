package modelo;
import java.util.ArrayList;
import java.util.List;

public abstract class Estudiante {

    private String nombre;
    private String asignaturas;
    private Envio envio;


    public Estudiante(String nombre, String asignaturas, Envio envio) {
        this.nombre = nombre;
        this.asignaturas =asignaturas;
        this.envio=envio;

    }
    public abstract void envioGeneral();




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

    public Envio getEnvio() {
        return envio;
    }
}
