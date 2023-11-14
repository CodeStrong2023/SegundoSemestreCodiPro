/*
 Ejercicio 5: Realizar un juego para adivinar un número, para ello
generar un número aleatorio entre 0-100, y luego ir pidiendo 
numeros indicando "es mayor" o "es menor" según sea mayor o menor
con respecto a N. El proceso termina cuando el usuario acierta y 
mostramos el numero de intentos hechos.
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); //Esto genera un número aleatorio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (numero < aleatorio){
                JOptionPane.showMessageDialog(null, "Ingrese un número mayor: ");
            }
            else if (numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Ingrese un número menor: ");
            }
            else{
                JOptionPane.showMessageDialog(null, "FELICIDADES!! HAS ADIVINADO EL NUMERO");
            }
            conteo++;
        }while(numero!=aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste el número en: "+conteo+" intentos");
    }
    
}
    
