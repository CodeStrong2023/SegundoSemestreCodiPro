package com.ejercicios;

import com.juanki.Ejercicio;
import com.juanki.ConsoleHandler;

public class Ejercicio1 extends Ejercicio {

    public final String NAME = "Ejercicio #1";
    public final String DESCRIPTION = "";

    String obtenerNombre() {
        return this.NAME;
    }

    String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    void ejercutar(ConsoleHandler console) {

        console.log("Estas ejecutando el ejercicio 1...");
        console.error("Esto se supone que es un mensaje de error");

    }

}
