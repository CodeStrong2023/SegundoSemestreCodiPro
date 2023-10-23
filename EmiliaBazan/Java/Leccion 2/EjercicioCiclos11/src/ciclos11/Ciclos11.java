
/*
Ejercicio11: Diseñar un programa que muestre el prodicto de los 10 primeros
numeros impares con JOPtionPane.
*/
package ciclos11;

import javax.swing.JOptionPane;


public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i<=20;i+=2){
        producto *= i;
        }
        JOptionPane.showMessageDialog(null, "Concatenamos la variable producto: " +producto);
    }
}
