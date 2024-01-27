package com.mycompany.peluqueriacanina.logica;
import com.mycompany.peluqueriacanina.persistence.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar( String nombreMasco, String nombreRaza, String color,
                        String observaciones, String nombreDuenio, String celDuenio, String alergico, String atenEsp) {
        //creo dueño y asigno valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        //creo la mascota y asigno los valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(nombreRaza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
        
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }
    
}
