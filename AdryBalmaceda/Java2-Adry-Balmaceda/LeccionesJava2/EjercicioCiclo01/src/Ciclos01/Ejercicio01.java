/*
 * Ejercicio 1: (otro metodo de entrada y salida
 * leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
introduzca un numero negativo
 *overview java: API
Scanner: es una clase
JOptionPane: es una clase
ofrece una ventana emergente donde digitamos numero y muestra resultado
 */
package Ciclos01;

import javax.swing.JOptionPane;

/*
 * @AdryBalmaceda
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int numero, cuadrado;
       
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0) {  // Mientras numero sea mayor o igual a 0 o positivo
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es : " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("El programa ha finalizado por numero negativo");
    }

}
