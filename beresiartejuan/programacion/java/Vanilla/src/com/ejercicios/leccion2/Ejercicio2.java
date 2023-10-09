package com.ejercicios.leccion2;

import com.juanki.ConsoleHandler;
import com.ejercicios.Ejercicio;

public class Ejercicio2 implements Ejercicio {

    public final String NAME = "Ciclo Do While(Lección 2)";
    public final String DESCRIPTION = "Ejercicio para entender el bucle do while";

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

        do {
            console.log("Valor actual del contador: " + contador);
            contador++;
        } while (contador <= limite);

        console.info("El contador termina valiendo: " + contador);

    }

}