package service;
import modelo.*;

import java.util.ArrayList;

public class EnvioMaterial {


    //Liskov
    public void enviarMaterialEstudiante(Estudiante estudiante) {
        //open closed and Liskov o tal vez dependencia, unica tarea
        if (estudiante instanceof Informatica) {
            //inversión dependencia
            Envio envio = new Envio();
            envio.material = new ArrayList<>();
            envio.material.add("Computador");
            envio.material.add("Mouse");
            envio.saludoDirector = "Jenny envia saludos";
            EmailOutlook email = new EmailOutlook();
            email.enviarEmail(envio);
        }
        if (estudiante instanceof Administracion) {
            //lo mismo de arriba pero con otra informacion
        }
        if (estudiante instanceof Industrial) {
            //
        }
    }
}
