/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos4;

import javax.swing.JOptionPane;

/**
 *
 * @author yami
 */
public class ciclosEje4 {
        public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado " + conteo + " que no son negativo");
    }
    
}
