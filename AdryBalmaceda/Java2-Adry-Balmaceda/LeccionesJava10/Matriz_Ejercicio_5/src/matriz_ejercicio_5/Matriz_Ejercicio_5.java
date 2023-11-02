/*
 * Ejercicio 5: crear y cargar una matriz de tamaño nxm, mostrar
la suma de cada fila y de cada columna
 */
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class Matriz_Ejercicio_5 {

    public static void main(String[] args) {
        int nF = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de filas para llenar la matriz"));
        int nC = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de columnas para llenar la matriz"));
        int posF;
        int posC;
        int sumaF;
        int sumaC;

        int matriz[][] = new int[nF][nC];
        // Para llenar la matriz
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de posiciones para filas y columnas: [" + (i + 1) + "," + (j + 1) + "]"));

            }
        }
        // Imprimir matriz
        String resultado = " ";
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                resultado += matriz[i][j];
                resultado += " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

        // Sumar fila
        int filas[] = new int[nF];
        int columnas[] = new int[nC];
        posF = 0;
        for (int i = 0; i < nF; i++) {
            sumaF = 0;
            for (int j = 0; j < nC; j++) {
                sumaF += matriz[i][j];
            }
            filas[posF] = sumaF;
            posF++;
        }
        JOptionPane.showInternalMessageDialog(null, posF);
        // Sumar columnas
    }
}
