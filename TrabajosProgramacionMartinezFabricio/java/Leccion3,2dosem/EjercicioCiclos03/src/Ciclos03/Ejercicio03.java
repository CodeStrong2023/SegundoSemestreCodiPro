/*
Ejercicio 3: Leer un número hasta que se introduzca un cero
para cada uno indicar si es par o impar.
Primero lo haremos con la clase scanner
Después con la c lase JOptionPane
 */
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        while (numero != 0){
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número "+numero+" es PAR");
        }
            else{
                JOptionPane.showMessageDialog(null, "El número "+numero+" es IMPAR");
                
                }    
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            
                }
        JOptionPane.showMessageDialog(null, "El número ingresado "+numero+" finaliza el programa");
    }
}
