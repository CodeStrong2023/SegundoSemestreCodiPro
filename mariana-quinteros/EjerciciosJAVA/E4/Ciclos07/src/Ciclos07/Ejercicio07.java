/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo y
calcular la media.
*/
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        while (numero>=0){ //Mientras el numero no sea negativo
            suma = suma + numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        if (conteo == 0){
            JOptionPane.showMessageDialog(null, "\nError la división entre cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "\nEl promedio es: "+promedio); // \n salto de línea.
        }
    }
}
