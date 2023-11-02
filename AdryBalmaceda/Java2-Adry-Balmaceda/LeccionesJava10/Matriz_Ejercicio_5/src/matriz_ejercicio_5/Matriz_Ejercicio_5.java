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
        int mC = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de columnas para llenar la matriz"));
        int posF;
        int posC;
        int sumaF;
        int sumaC;

        int matriz[][] = new int[nF][mC];
        // Para llenar la matriz
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < mC; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de posiciones para filas y columnas: [" + (i + 1) + "," + (j + 1) + "]"));

            }
        }
        // Imprimir matriz
        String resultado = " ";
        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < mC; j++) {
                resultado += matriz[i][j];
                resultado += " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

        // Sumar fila
        int filas[] = new int[nF];
        int columnas[] = new int[mC];
        posF = 0;
        for (int i = 0; i < nF; i++) {
            sumaF = 0;
            for (int j = 0; j < mC; j++) {
                sumaF += matriz[i][j];
            }
            filas[posF] = sumaF;
            posF++;
        }
        
        // Sumar columnas
        posC = 0;
        for (int i = 0; i < nF; i++) {
            sumaC=0;
            for (int j = 0; j < mC; j++) {
                sumaC += matriz[i][j];
            }
            columnas[posC]= sumaC;
            posC++;
        }
        System.out.println("\nSuma Filas");
        for (int i = 0; i < nF; i++) {
            System.out.println(filas[i]+"-");
            
        }
        
        
        System.out.println("\nSuma Columnas");
        for (int j = 0; j < mC; j++) {
            System.out.println(columnas[j]+"-");
            
        }
    }
}
