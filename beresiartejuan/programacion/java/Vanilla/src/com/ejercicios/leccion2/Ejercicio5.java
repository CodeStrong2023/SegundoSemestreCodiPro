package com.ejercicios.leccion2;

import com.juanki.ConsoleHandler;
import com.ejercicios.Ejercicio;

public class Ejercicio5 implements Ejercicio {

    public final String NAME = "Labels (Lección 2)";
    public final String DESCRIPTION = "Ejercicio para entender los labels";

    public String obtenerNombre() {
        return this.NAME;
    }

    public String obtenerDescripcion() {
        return this.DESCRIPTION;
    }

    public void ejercutar(ConsoleHandler console) {

        int limite = 10;
        Boolean reset = false;

        console.info("Uso de la palabra reservada continue:");

        console.log("El siguiente contador debería llegar hasta " + limite);

        inicio: for (int contador = 1; contador <= limite; contador++) {
            if (contador % 2 != 0) {
                if (!reset) {
                    console.info("No te voy a decir el valor del contador actual y voy a volver a iniciar el ciclo");
                    continue inicio;
                }

                console.info("Ya se reinicio el bucle una vez, no se va a reiniciar más...");
                break;
            }

            console.log("El valor del contador es: " + contador);
        }

    }

}