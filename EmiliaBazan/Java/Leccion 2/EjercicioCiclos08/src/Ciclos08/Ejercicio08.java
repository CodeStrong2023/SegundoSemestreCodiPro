/*
Ejercicio8: Pedir un nro n y mostrar todos los nros del 1 al n.
Usando JOption
 */
package Ciclos08;

import javax.management.JMException;
import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato: "));
        int i = 1;
        while(i<=nro){
            System.out.println(i);
            i++;
        }
    }
}
