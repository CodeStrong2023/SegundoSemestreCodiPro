/*
Ejercicio 05: Realizar un juego para adivinar un numero, para ello generar
un numero aleatorio entre 0 - 100, y luego ir pidiendo numeros indicando
"es mayor" o "es menor" segun sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acerta y mostramos el numero de 
intentos hechos.
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ciclos05JO {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); //Esto genera un numero aleatorio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if (numero < aleatorio){
                JOptionPane.showConfirmDialog(null, "Digite un numero mayor");
            }
            else if (numero > aleatorio){
                JOptionPane.showConfirmDialog(null, "Digite un numero menor.");
            }
            else{
                JOptionPane.showConfirmDialog(null, "Felicidades, has acertado el numero.");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showConfirmDialog(null, "Has acertado al numero, con un total de "+conteo+" intentos.");
    }   
        
}
