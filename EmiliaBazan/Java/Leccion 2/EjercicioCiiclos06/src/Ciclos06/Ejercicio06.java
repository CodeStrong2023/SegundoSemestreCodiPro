/* Pedir nros hasta que se tecclee un cero, mostrar la suma de los nros
introducidos, usando JOptionPane
*/
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
        int nro, suma = 0;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Introduce un  nro: "));
        while (nro != 0){
            suma += nro;
            System.out.println("Ingrese un nro: ");
            nro = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro  nro: "));
        }
        System.out.println("Cerrado por nulo");
        System.out.println("la suma de numeros es: " + suma);

    }
}    
    
