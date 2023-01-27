package main;

import modelo.Administracion;
import modelo.Estudiante;
import modelo.Industrial;
import modelo.Informatica;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel", "Programacion, Arquitectura, Base de datos"),
                new Administracion("Monica", "Negocios, Administracion I, Historia de la Administracion"),
                new Industrial("Liliana", "Procesos, Analitica de datos, Gestion de Calidad")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        //EnvioMaterial material = new EnvioMaterial();
        //material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
            //open closed-------------------------------
            /*if (estudiante.getCarrera().equals("Informatica")) {
                System.out.println("Programacion, Arquitectura, Base de datos");
            }
            if (estudiante.getCarrera().equals("Administracion")) {
                System.out.println("Negocios, Administracion I, Historia de la Administracion");
            }
            if (estudiante.getCarrera().equals("Industrial")) {
                System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
            }*/
        }
    }
}
