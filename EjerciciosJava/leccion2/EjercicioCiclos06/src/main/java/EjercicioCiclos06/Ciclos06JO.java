/*
Ejercicio 06: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos
los numeros introducidos
JOptionPane
*/
package EjercicioCiclos06;

import javax.swing.JOptionPane;

public class Ciclos06JO {
    public static void main(String[] args) {
        int numero, suma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
            
        }while (numero != 0);
        JOptionPane.showConfirmDialog(null, "La suma de los numeros ingresados es de: "+suma);
    }
}
