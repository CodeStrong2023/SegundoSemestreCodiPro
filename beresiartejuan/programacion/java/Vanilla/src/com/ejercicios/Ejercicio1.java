package com.ejercicios;

import com.juanki.ConsoleHandler;

public class Ejercicio1 implements Ejercicio {

    public final String NAME = "Ejercicio #1";
    public final String DESCRIPTION = "Este es el primer ejercicio";

    public String obtenerNombre() {
        return this.NAME;
    }

    public String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    public void ejercutar(ConsoleHandler console) {

        console.log("Estas ejecutando el ejercicio 1...");
        console.error("Esto se supone que es un mensaje de error");

    }

}
