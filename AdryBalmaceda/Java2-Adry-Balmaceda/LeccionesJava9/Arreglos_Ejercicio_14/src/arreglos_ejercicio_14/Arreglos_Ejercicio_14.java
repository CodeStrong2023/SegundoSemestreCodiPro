/*
 * Ejercicio 14: Leer dos series de 10 enteros, que estaran 
ordenados crecientemente
Copiar (fusionar) las dos tablas en una tercera, de forma que 
sigan ordenados
 */
package arreglos_ejercicio_14;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Arreglos_Ejercicio_14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;

        System.out.println("Llenar el primer arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println(".Digite un numero: ");
                a[i] = entrada.nextInt();
            }
            //Recorrer el arreglo para ver si está ordenado
            for (int i = 0; i < 9; i++) {
                if (a[i] < a[i + 1]) {  //creciente 1-2-3
                    creciente = true;
                }
                if (a[i] > a[i + 1]) {  //decreciente 3-2-1
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
            }
        } while (creciente == false);

        System.out.println("Llenar el segundo arreglo: ");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ".Digite un numero: ");
                b[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (b[i] < b[i + 1]) {
                    creciente = true;

                }
                if (b[i] > b[i + 1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
            }
        } while (creciente == false);

        int i = 0;  //iterador i para el arreglo a
        int j = 0;  //iterador j para el arreglo a
        int k = 0;  //iterador k para el arreglo a

        while (i < 10 && j < 10) {  //si elemento a es menor que b
            if (a[i] < b[j]) {  //copiar el elemento de a
                i++;  //avanzar una posicion mas en a
            } else {
                c[k] = b[j]; //copiar el elemento de b
                j++;  //avanzar una posicion mas en b
            }
            k++;  //avanzar una posicion mas en c
        }

        //Cuando salimos del while es porque un arreglo (a o b) se ha copiado completamente
        if (i == 10) {  //significa que ya copiamos todo el arreglo a, falta el b
            while (j < 10) {  //mientras el iterado sea menor a 10
                c[k] = b[j];  //copiar el elemento de b en c
                j++;  //avanzar una posicion en b
                k++;  //avanzar una poscion en c
            }
        } else {  //significa que ya copiamos todo el arreglo b, falta el a
            while (i < 10) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("\nEl arreglo c completo es: ");
        for (k = 0; k < 20; k++) {
            System.out.println(" - ");
        }
        System.out.println();
    }
}
