package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;


public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel", "Programacion, Arquitectura, Base de datos", new Envio()),
                new Administracion("Monica", "Negocios, Administracion I, Historia de la Administracion", new Envio()),
                new Industrial("Liliana", "Procesos, Analitica de datos, Gestion de Calidad", new Envio())
        };
        verMateriasEstudiantes(listadoEstudiantes);//done
        EnvioMaterial material = new EnvioMaterial(new EmailOutlook());
        material.enviarMaterialEstudiante(listadoEstudiantes[0]);//casi done xd
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());

        }
    }
}
