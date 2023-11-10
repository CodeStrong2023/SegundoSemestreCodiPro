/*
 * Ejercicio 12: leer por teclado una tabla de 10 elementos numericos
enteros y una posicion (entre 0 y 9)
Eliminar el elemento situado en la posicion dada sin dejar huecos
 */
package arreglos_ejercicio_12;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Arreglos_Ejercicio_12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion, j = 0;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(".Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println();
        do {
            System.out.println("Digite una posicion a eliminar entre 0 y 9: ");
            posicion = entrada.nextInt();

        } while (posicion < 0 || posicion > 9);

        //Eliminar elemento de la posicion indicada
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        
        System.out.println("\nMostrar arreglo: ");
        for(int i=0;i<9;i++){
            System.out.println(arreglo+" - ");
        }
        System.out.println();
    }
}
