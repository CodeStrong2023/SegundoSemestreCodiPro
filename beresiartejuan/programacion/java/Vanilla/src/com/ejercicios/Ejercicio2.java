package com.ejercicios;

import com.juanki.Ejercicio;
import com.juanki.ConsoleHandler;

public class Ejercicio2 extends Ejercicio {

    public final String NAME = "Ejercicio #2";
    public final String DESCRIPTION = "Este es el ejercicio 2";

    String obtenerNombre() {
        return this.NAME;
    }

    String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    void ejercutar(ConsoleHandler console) {

        console.log("Estas ejecutando el ejercicio 2...");
        console.info("Esto se supone que es un mensaje de info");

    }

}
