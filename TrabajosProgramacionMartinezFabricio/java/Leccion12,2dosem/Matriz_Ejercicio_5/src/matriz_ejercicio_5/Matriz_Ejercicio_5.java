/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
de cada fila y de cada columna.
*/
package matriz_ejercicio_5;

import java.util.Scanner;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        int posFila, posCol;
        
        System.out.println("Ingrese un número de filas: ");
        nFilas = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese un número de columnas: ");
        nCol = Integer.parseInt(entrada.nextLine());
        
        matriz = new int[nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int [nCol];
        
        System.out.println("Rellenando la matriz: ");
        for (int i = 0; i <nFilas; i++) {
            for (int j = 0; j <nCol; j++) {
                System.out.println("Matriz: ["+i+"]["+j+"]");
                matriz[i][j] = entrada.nextInt();
            }            
        }
        System.out.println("\nMostramos la matriz: ");
        for (int i = 0; i <nFilas; i++) {
            for (int j = 0; j <nCol; j++) {
                System.out.println(matriz[i][j]+" ");               
            }
            System.out.println("");
        }
        System.out.println("");  
        
        //Sumamos las filas
        posFila = 0;
        for (int i = 0; i <nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j <nCol; j++) {
                sumaFilas += matriz [i][j];                
            }
            filas[posFila] = sumaFilas;
            posFila ++;
        }
        
        //Sumamos las columnas
        posCol = 0;
        for (int j = 0; j <nCol; j++) {
            sumaCol = 0;
            for (int i = 0; i <nFilas; i++) {
                sumaCol += matriz [i][j];                
            }
            columnas[posCol] = sumaCol;
            posCol ++;
        }
        
        System.out.println("\nLa suma de filas es: ");
        for (int i = 0; i <nFilas; i++) {
            System.out.println(filas[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("\nLa suma de columnas es: ");
        for (int i = 0; i <nCol; i++) {
            System.out.println(columnas[i]+" - ");
        }
        System.out.println("");
    }
}
