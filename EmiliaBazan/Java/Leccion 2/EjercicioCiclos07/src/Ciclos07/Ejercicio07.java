/*
 Pedir un nro hasta que se introduzca uno negativo y calcular la media, usando
JOPtion
 */
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {

        int nro, conteo = 0, suma = 0;
        float media=0;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Introduce un  nro: "));
        while (nro >=0){  
            nro = Integer.parseInt(JOptionPane.showInputDialog("Introduce un  nro: "));
            suma += nro;
            conteo++;
        }
        media = (float)suma/conteo;
        System.out.println("Cerrado por negativo.");
        System.out.println("La media de los numeros ingresados es: "+media);

    }
}