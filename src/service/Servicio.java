package service;

public class Servicio {
    private GuadarDB interfaz;

    public Servicio(GuadarDB interfaz) {
        this.interfaz = interfaz;
    }
    public void guardarEstudianteNuevo() {
        interfaz.guadarEstudiante();
    }
}
