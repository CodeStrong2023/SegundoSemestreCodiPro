/*
 * Ejercicio 1: leer 5 numeros, guardarlos en un arrego y
mostrarlos en el mismo orden introducido
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Arreglos_Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float arreglos[] = new float[5];

        System.out.println("Leer y guardar los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". Digite un numero: ");
            arreglos[i] = entrada.nextFloat();  // nextFloat: no necesitamos tipo de conversion
        }
        System.out.println("\nMostrar los elementos del arreglo");
        for (float i : arreglos) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

}
