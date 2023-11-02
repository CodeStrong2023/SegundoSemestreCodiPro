/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros 
se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;

public class Ciclos04 {
    public static void main(String[] args) {
        
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0) {
            System.out.println("El numero "+numero+" es POSITIVO");
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showConfirmDialog(null, "A ingresado "+conteo+" numeros que no son NEGATIVOS");
    }
}
