package service;
import modelo.*;

import java.util.ArrayList;

public class EnvioMaterial {

    private EmailOutlook email;
    public EnvioMaterial(EmailOutlook email) {
        this.email=email;
    }

    public void enviarMaterialEstudiante(Estudiante estudiante) {

        estudiante.envioGeneral();
        this.email.enviarEmail(estudiante.getEnvio());
    }
}
