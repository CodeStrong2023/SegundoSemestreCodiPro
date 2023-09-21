package Clases;

import Juanki.Clase;
import Juanki.Console;
import Juanki.Ejercicio;
import Ejercicios.Clase1.*;

public class Clase1 implements Clase {

    public String titulo = "Clase 1 - Bucles";
    public String name = "[Sin nombre]";
    public String fecha = "[Sin fecha]";

    public void help() {

        Console.box("Clase 1 - Ciclo While");

    }

    public void ejecutar() {

        Ejercicio ejercicio1 = new Ejercicio1();
        ejercicio1.help();
        ejercicio1.ejecutar();

    }

}
