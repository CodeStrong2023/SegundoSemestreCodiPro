/*
 *  Ejercicio 2: Leer un numero e indicar si es positivo o negativo
El proceso se repetira hasta que se introduzca un cero
Hacer el ejercicio con clase Scanner y luego nuevamente con la clas
JOptionPane
*usamos inferencia de tipos
 */
package Ciclos02;

import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class Ciclos02 {

    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showInputDialog(null, "El numero " + numero + " es POSITIVO");
            } else {
                JOptionPane.showInputDialog(null, "El numero " + numero + " es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showInputDialog(null, "El numero " + numero + " finaliza el programa");
    }

}
