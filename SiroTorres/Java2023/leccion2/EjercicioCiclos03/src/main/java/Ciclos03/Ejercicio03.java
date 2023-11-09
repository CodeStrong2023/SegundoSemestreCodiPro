/*
Ejercicio 3: Leer numeros hasta que se introduza un 0
para cada uno indicar si es par o impar.
Primero lo haremos con la clase escanner
luego con JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
       
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+ " es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+ " es IMPAR");
            }
            System.out.println("Digite otro numeroL: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showConfirmDialog(null, "El numero ingresado "+numero+ " Finaliza el programa");
    }
}
