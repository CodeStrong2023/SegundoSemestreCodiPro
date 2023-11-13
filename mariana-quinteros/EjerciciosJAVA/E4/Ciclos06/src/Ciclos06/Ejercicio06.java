/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar la suma
de todos los números introducidos. Scanner y JOptionPane.
*/
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
        int numero, suma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma=suma+numero;
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null, "La suma de los números introducidos es: "+suma);
    }
}
