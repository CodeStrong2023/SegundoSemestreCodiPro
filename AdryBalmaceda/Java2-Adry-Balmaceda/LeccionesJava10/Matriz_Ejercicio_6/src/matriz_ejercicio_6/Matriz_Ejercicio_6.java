/*
 * Ejercicio 6: utilizando dos matrices de tamaño 5x9 y 9x5,
cargar la primera y transponerla en la segunda.
 */
package matriz_ejercicio_6;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Matriz_Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];

        System.out.println("Digite la matriz");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("[" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz original es");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("[" + i + "][" + j + "]");
            }
        }

        //Transponer matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        System.out.println("\nLa matriz transpuesta es");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("[" + i + "][" + j + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
}
