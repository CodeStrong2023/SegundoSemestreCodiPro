/*
 * EJERCICIO REVISADO
 */
package arreglos_ejercicio_13;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Arreglos_Revision_Ejercicio_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0, contImpares = 0;

        // Leer 10 enteros en una tabla
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero:");
            arr[i] = scanner.nextInt();

            // Guardar en otra tabla los elementos pares de la primera
            if (arr[i] % 2 == 0) {
                pares[contPares] = arr[i];
                contPares++;
            } // A continuación los elementos impares
            else {
                impares[contImpares] = arr[i];
                contImpares++;
            }
        }

        // Imprimir los arreglos pares e impares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros impares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
