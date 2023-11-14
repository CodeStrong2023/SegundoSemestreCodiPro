/*
 *Ejercicio 7: Crear una matriz "marco" de tamaño 5x5:
todos sus elementos deben ser 0 salvo los de los bordes que 
deben ser 1. Mostrarla
 */
package matriz_ejercicio_7;

/*
 * @Adrybalmaceda
 */
public class Matriz_Ejercicio_7 {
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
    
//EJERCICIO DE CLASE
//    public static void main(String[] args) {
//        int matriz[][] = new int[5][5];
//        System.out.println("Rellenar la matriz: ");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0 || i == 4) {
//                    matriz[i][j] = 1;
//                } else if (j == 0 || j == 4) {
//                    matriz[i][j] = 1;
//                } else {
//                    matriz[i][j] = 0;  //no hace falta porque siempre empiezan en 0
//                }
//            }
//        }
//
//        System.out.println("Mostrar matriz: ");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(matriz[i][j] + "");
//            }
//            //System.out.println("");
//        }
//        //System.out.println("");
//    }
}
