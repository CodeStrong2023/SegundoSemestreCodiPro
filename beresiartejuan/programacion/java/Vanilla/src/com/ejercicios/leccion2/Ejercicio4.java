package com.ejercicios.leccion2;

import com.juanki.ConsoleHandler;
import com.ejercicios.Ejercicio;

public class Ejercicio4 implements Ejercicio {

    public final String NAME = "Bucles: Break y Continue(Lección 2)";
    public final String DESCRIPTION = "Ejercicio para entender \"break\" y \"continue\"";

    public String obtenerNombre() {
        return this.NAME;
    }

    public String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    public void ejercutar(ConsoleHandler console) {

        int limite = 10;

        console.info("Uso de la palabra reservada break:");

        console.log("El siguiente contador debería llegar hasta " + limite);

        for (int contador = 1; contador <= limite; contador++) {
            console.log("El valor del contador es: " + contador);

            if (contador % 2 == 0) {
                console.info("Ahora el bucle se va a frenar!");
                break;
            }
        }

        console.info("Uso de la palabra reservada continue:");

        console.log("El siguiente contador debería llegar hasta " + limite);

        for (int contador = 1; contador <= limite; contador++) {
            if (contador % 2 != 0) {
                console.info("No te voy a decir el valor del contador actual");
                continue;
            }

            console.log("El valor del contador es: " + contador);
        }

    }

}