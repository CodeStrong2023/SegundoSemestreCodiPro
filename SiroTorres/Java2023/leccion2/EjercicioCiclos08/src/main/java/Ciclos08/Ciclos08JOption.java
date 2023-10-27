/*
Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N.
*/
package Ciclos08;

import javax.swing.JOptionPane;

public class Ciclos08JOption {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int i = 1;
        while( i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
    }
}
