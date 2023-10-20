/*
 Ejercicio2: Leer un nro e indicar si es positivo o negativo hasta que se 
introduzca un cero con clase JOption
 */
package Ciclos02;

import javax.swing.JOptionPane;


public class Ciclo02 {
    public static void main(String[] args) {
        int nro;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));  
        while (nro != 0){
            if (nro > 0){
                System.out.println("El número "+nro+" es positivo.");}
            else{
                System.out.println("El número "+nro+" es negativo");}
            nro = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));    
        }
        System.out.println("Finaizado por nulo");
    }    
}
