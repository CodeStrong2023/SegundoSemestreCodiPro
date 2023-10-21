/*
  Leer nros hasta que se introduzca un 0; para cada caso indicar si es par o
impar, usando JOptionPane
 */
package Ciclos03;

import javax.swing.JOptionPane;


public class EjercicioCiclos03 {
    public static void main(String[] args) {
        int nro;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro: "));
        while (nro != 0){
            if (nro % 2 == 0){
            System.out.println("El número " + nro + " es par.");}
            else {
            System.out.println("El número " + nro + " es ímpar.");}
            nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro: "));
        }
        System.out.println("Detenido por nulo");
    }
}       
