/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y 
mostrarlo en el orden inverso al introducidos.
*/
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglos = new int[5];
        
        System.out.println("Guardando los datos en el arreglo: ");
        for (int i = 0; i <5; i++) {
            System.out.println((i+1)+". Ingrese un número: ");
            arreglos[i] = entrada.nextInt();
        }
        System.out.println("\nImprimimos los elementos del arreglo: ");
        for (int i = 4; i >= 0;i--) { //Para mostrar el arreglo de forma inversa
            System.out.println(" "+arreglos[i]);
        }
        System.out.println("\n");
    }
}
