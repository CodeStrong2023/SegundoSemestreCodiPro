/*
Ejercicio1: Introducir un numero y mostrar su cuadrado hasta que se introduzca un neo negativo
 */

package Ciclos01;
import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args){
        int nro, cuadrado;
        
        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro: "));
        while (nro >= 0){
        cuadrado = (int) Math.pow(nro, 2);
        System.out.println("El cuadrado de "+ nro + "es:  "+ cuadrado+ ".");
        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite otro nro: "));
        }
        System.out.println("Finalizado por nro negativo");
    }
}
