package com.ejercicios.leccion2;

import com.juanki.ConsoleHandler;
import com.ejercicios.Ejercicio;

public class Ejercicio3 implements Ejercicio {

    public final String NAME = "Ciclo For(Lección 2)";
    public final String DESCRIPTION = "Ejercicio para entender el bucle for";

    public String obtenerNombre() {
        return this.NAME;
    }

    public String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    public void ejercutar(ConsoleHandler console) {

        int limite = 7;
        int inicio = 0;

        console.info("El contador inicia en " + inicio + " y debe llegar hasta " + limite);

        for (int contador = inicio; contador <= limite; contador++) {
            console.log("Valor actual del contador: " + contador);
        }

    }

}