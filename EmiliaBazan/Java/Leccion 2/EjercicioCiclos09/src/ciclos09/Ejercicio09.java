
package ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int nro, suma = 0;
        for (int i = 1; i <= 10; i++){
            nro = Integer.parseInt(JOptionPane.showInputDialog("ingrese un número: "));
            suma += nro;
        }
        System.out.println("La suma de los nros es: " +suma);
    

    }
}
