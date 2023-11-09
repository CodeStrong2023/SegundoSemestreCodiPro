/*
 * Ejercicio 10: pedir 10 numeros y escribir la suma total
hacerlo con la clase Scanner y JOptionPane
 */
package ciclos10;

import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;

        }
        JOptionPane.showMessageDialog(null, "\nLa suma de todos los numeros es: " + suma);
    }

}
