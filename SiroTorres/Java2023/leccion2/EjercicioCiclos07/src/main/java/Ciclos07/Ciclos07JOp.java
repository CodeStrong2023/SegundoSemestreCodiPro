/*
Ejercicio 07: Pedir numeros hasta que se introduzca un numero negativo y luego 
calcular el promedio
*/
package Ciclos07;

import javax.swing.JOptionPane;


public class Ciclos07JOp {
    public static void main(String[] args) {
        int numero, suma = 0, conteo = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if(conteo == 0){
            JOptionPane.showConfirmDialog(null, "Error, no existe la division entre 0");
        }
        else{
            promedio = (float)suma/conteo;
            JOptionPane.showConfirmDialog(null, "El promedio es: "+promedio);
        }
    }
}
