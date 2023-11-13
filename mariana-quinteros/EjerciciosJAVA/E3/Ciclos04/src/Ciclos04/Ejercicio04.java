/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y
mostrar cuantos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego con la clase JOptionPane
*/
package Ciclos04;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        JOptionPane.showMessageDialog(null, "ESTE PROGRAMA FUNCIONARÁ HASTA QUE INGRESE UN NÚMERO NEGATIVO");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        while (numero >= 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            
        }
        JOptionPane.showMessageDialog(null, "El conteo de los números positivos es: "+conteo);
    }
}
