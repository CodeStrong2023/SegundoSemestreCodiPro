/* diseñar un programa que muestre el producto de los 10 primeros numeros impares
 */
package javaciclos11;

import javax.swing.JOptionPane;

/**
 *
 * @author yami
 */
public class JavaCiclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i <= 9; i += 2) {  
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los numero impares es " + producto);
    }
    
}
