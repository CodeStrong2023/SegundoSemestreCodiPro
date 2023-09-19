/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un número negativo.
*/
package Ciclos01;

import javax.swing.JOptionPane;
        
public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while(numero >= 0){ //Mientras el número sea igual a 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        System.out.println("El programa ha finalizado porque ingresó un número negativo");
    }
}
