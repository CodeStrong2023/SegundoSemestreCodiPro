/*
 * Ejercicio 5: realiza un juego para adivinar un numero
para ello generar un numero aleatorio entre 0-100, y
luego ir pidiendo numeros indicando "es mayor" o
"es menor" segun sea mayor o menor con respecto a N
el proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos
 */
package Ciclos05;

import javax.swing.JOptionPane;

/**
 *
 * @Adrybalmaceda
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random() * 100);  // esto genera un numero aleatorio de 0-100
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un numero mayor");
            } else if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un numero menor");
            } else {
                JOptionPane.showMessageDialog(null, "¡¡¡Felicidades!!! Has adivinado el numero");
            }
            conteo++;
        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "\tAdivinaste el numero en: " + conteo + " intentos");
    }
}
