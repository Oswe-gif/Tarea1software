package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;


public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel", "Programacion, Arquitectura, Base de datos", new Envio(),new EmailOutlook()),
                new Administracion("Monica", "Negocios, Administracion I, Historia de la Administracion", new Envio(),new EmailOutlook()),
                new Industrial("Liliana", "Procesos, Analitica de datos, Gestion de Calidad", new Envio(), new EmailOutlook())
        };
        verMateriasEstudiantes(listadoEstudiantes);//done
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(listadoEstudiantes[2]);//casi done xd
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());

        }
    }
}
