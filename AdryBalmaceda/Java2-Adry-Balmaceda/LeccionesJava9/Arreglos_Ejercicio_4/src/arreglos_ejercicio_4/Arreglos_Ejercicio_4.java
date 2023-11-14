/*
 * Ejercicio 4: Leer 10 numeros enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden:
el primero, el ultimo, el segundo, el penultimo, el tercero,etc
 */
package arreglos_ejercicio_4;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Arreglos_Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ".Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i] + " ");  //1ro, 2do
            System.out.println(numeros[9 - i] + " ");  //ultimo, penultimo
        }
        System.out.println();  //salto de linea
    }
}
