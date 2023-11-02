/*
 * Ejercicio 11: diseñar un programa que muestre el producto
de los 10 primeros numeros impares
hacerlo con JOptionPane
 */
package ciclos11;

import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class Ciclos11 {

    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i <= 9; i += 2) {  // el aumento apunta a solo ir por los impares
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los numero impares es: " + producto);
    }

}
