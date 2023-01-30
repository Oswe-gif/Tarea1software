package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;
import service.MySQL;
import service.Servicio;


public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel", "Programacion, Arquitectura, Base de datos", new Envio()),
                new Administracion("Monica", "Negocios, Administracion I, Historia de la Administracion", new Envio()),
                new Industrial("Liliana", "Procesos, Analitica de datos, Gestion de Calidad", new Envio())
        };

        Servicio servi=new Servicio(new MySQL(), new EmailOutlook());//crear objeto servicio para poder usar la BD y la conexión


        verMateriasEstudiantes(listadoEstudiantes);//done
        EnvioMaterial material = new EnvioMaterial(new EmailOutlook());
        servi.establecerConexion();//establecer conexion con el server
        material.enviarMaterialEstudiante(listadoEstudiantes[0]);
        servi.guardarEstudianteNuevo();//guardar en la BD


    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());

        }
    }
}
