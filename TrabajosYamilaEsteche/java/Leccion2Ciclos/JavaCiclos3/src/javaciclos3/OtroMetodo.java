/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos3;

import javax.swing.JOptionPane;

/**
 *
 * @author yami
 */
public class OtroMetodo {
     public static void main(String[] args) {
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+ " es par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+ " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado es "+numero+" finaliza el programa");
    }
    
}
