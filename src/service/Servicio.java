package service;

public class Servicio {
    private GuadarDB interfaz;
    private EstablecerConexiServer conectar;

    public Servicio(GuadarDB interfaz, EstablecerConexiServer conectar) {
        this.interfaz = interfaz;
        this.conectar=conectar;
    }
    public void guardarEstudianteNuevo() {
        interfaz.guadarEstudiante();
    }
    public void establecerConexion()
    {
        conectar.establecerConexion();
    }

}
