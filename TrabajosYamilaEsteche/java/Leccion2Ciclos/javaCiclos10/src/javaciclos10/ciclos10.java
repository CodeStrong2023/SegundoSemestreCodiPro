/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos10;

import javax.swing.JOptionPane;

/**
 *
 * @author yami
 */
public class ciclos10 {
     public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite diez numeros"));
            suma += numero; 
        }
        JOptionPane.showMessageDialog(null, "\n La suma de todos los numeros es: "+suma);
    }
    
}
