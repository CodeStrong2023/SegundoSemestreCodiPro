/* Pedir 10 numeros y escribir la suma total
 */
package javaciclos10;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class JavaCiclos10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Digite diez numeros");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero; 
        }
        System.out.println(" \n La suma de todos los numeros es: " + suma);
    }
    
}
