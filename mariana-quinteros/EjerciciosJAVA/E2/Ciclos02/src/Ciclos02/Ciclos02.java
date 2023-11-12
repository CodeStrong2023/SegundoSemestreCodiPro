/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso 
se repetirá hasta que se introduzca un 0.
*/
package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while(numero!=0){
            if (numero > 0){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es positivo");
                        }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
         }       
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
}
