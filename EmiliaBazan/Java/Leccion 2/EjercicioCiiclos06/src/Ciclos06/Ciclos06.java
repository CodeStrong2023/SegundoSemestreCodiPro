/* Pedir nros hasta que se tecclee un cero, mostrar la suma de los nros introducidos
*/
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        int nro, suma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        nro = Integer.parseInt(entrada.nextLine());
        while (nro != 0){
            suma += nro;
            System.out.println("Ingrese un nro: ");
            nro = Integer.parseInt(entrada.nextLine()); 
        }
        System.out.println("Cerrado por nulo");
        System.out.println("la suma de numeros es: " + suma);
    }
}
