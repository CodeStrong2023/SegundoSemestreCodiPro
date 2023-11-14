/*
 * Test
 */

/**
 *
 * @Adrybalmaceda
 */
public class Test_Ejercicio_7 {

    public static void main(String[] args) {
        // Declarar una matriz 5x5
        int[][] matriz = new int[5][5];

        // Inicializar cada elemento de la matriz con 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    matriz[i][j] = 1;
                } else if (j == 0 || j == 4) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

            // Imprimir la matriz en la consola
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }    
        }
    }
