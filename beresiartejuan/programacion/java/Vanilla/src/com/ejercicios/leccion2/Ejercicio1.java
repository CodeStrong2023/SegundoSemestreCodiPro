package com.ejercicios.leccion2;

import com.juanki.ConsoleHandler;
import com.ejercicios.Ejercicio;

public class Ejercicio1 implements Ejercicio {

    public final String NAME = "Ciclo While(Lección 2)";
    public final String DESCRIPTION = "Ejercicio para entender el bucle while";

    public String obtenerNombre() {
        return this.NAME;
    }

    public String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    public void ejercutar(ConsoleHandler console) {

        int contador = 0;
        int limite = 7;

        console.info("El contador inicia en " + contador + " y debe llegar hasta " + limite);

        while (contador <= limite) {
            console.log("Valor actual del contador: " + contador);
            contador++;
        }

        console.info("El contador termina valiendo: " + contador);

    }

}