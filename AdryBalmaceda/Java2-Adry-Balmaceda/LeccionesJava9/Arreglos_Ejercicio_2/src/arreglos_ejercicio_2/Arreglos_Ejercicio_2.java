/*
 * Ejercicio 2: leer 5 numeros, guardarlos en un arreglo y
mostrarlos en el orden inverso al introducido
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Arreglos_Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("Leer y guardar los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". Digite un numero: ");
            numeros[i] = entrada.nextFloat();  // nextFloat: no necesitamos tipo de conversion
        }
        System.out.println("\nMostrar los elementos del arreglo");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println("\n");
    }

}
