/*
Ejercicio 9: Pedir 10 numeros y hacer la suma total con clase Scanner.
 */
package ciclos09;

import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro, suma = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Ingrese un numero: ");
            nro = Integer.parseInt(entrada.nextLine());
            suma += nro;
        }
        System.out.println("La suma de los nros es: " +suma);
    
    }
    
}
