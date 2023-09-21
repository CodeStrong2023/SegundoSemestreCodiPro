package com.ejercicios;

import com.juanki.ConsoleHandler;

public class Ejercicio2 implements Ejercicio {

    public final String NAME = "Ejercicio #2";
    public final String DESCRIPTION = "Este es el ejercicio 2";

    public String obtenerNombre() {
        return this.NAME;
    }

    public String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    public void ejercutar(ConsoleHandler console) {

        console.log("Estas ejecutando el ejercicio 2...");
        console.info("Esto se supone que es un mensaje de info");

    }

}
