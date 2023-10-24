/*
Ejercicio 2: Introducir un numero y mostrar si es positivo o negativo, el proceso
se repetira hasta que el programa lea un 0.

*/
package Ciclos02;
import javax.swing.JOptionPane;

public class Ejercicio02v1 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero "+numero+" es positivo");
            }
            else{
                System.out.println("El numero "+numero+" es negativo");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
           
        }
        System.out.println("El numero "+numero+" finaliza el programa");
    }
}
