/*
 * Ejercicio 3: Crear y cargar una matriz de tamaño 3x3,
transponerla y mostrarla
 */
package matriz_ejercicio_3;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Matriz_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Cargar una matriz de 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();  // salto de linea

        System.out.println("Primera matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");  // para transponer la matriz invertir i,j
            }
            System.out.println();  // salto de linea
        }
        System.out.println();  // salto de linea
        // Transponer matriz
        System.out.println("Segunda matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");  // j,i matriz transpuesta
            }
            System.out.println("");  // salto de linea
        }
        System.out.println("");  // salto de linea
    }
}
