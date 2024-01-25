package com.mycompany.peluqueriacanina.logica;
import com.mycompany.peluqueriacanina.persistence.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String numClient, String nombreMasco, String nombreRaza, String color,
                        String observaciones, String nombreDuenio, String cel, String alergico, String atencionEspecial) {
        //creo dueño y asigno valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(cel);
        //creo la mascota y asigno los valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(nombreRaza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencionEspecial);
        masco.setObservaciones(observaciones);
        masco.setunDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
        
    }
    
}
