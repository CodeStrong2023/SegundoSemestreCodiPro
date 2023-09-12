package Ejercicios.Clase1;

import Juanki.*;

public class Ejercicio1 implements Ejercicio {

    final String titulo = "Ejercicio 1 (Clase 1)";
    final String descripcion = "En este ejercicio se usa un bucle while común para aumentar un contador.";

    public void help() {

        Console.info(this.titulo);

        Console.info("Descripción: " + this.descripcion);

    }

    public void ejecutar() {

        Console.log("El contandor comienza en 0");

        int contador = 0;

        while (contador <= 10) {
            Console.log("El contador esta en " + contador);
            contador++;
        }

    }

}
