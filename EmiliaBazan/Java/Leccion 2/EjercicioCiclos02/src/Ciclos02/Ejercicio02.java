/*
Ejercicio2: Leer un nro e indicar si es positivo o negativo hasta que se introduzca un cero
 */
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var nro = Integer.parseInt(entrada.nextLine());   
        while (nro != 0){
            if (nro > 0){
                System.out.println("El número "+nro+" es positivo.");}
            else{
                System.out.println("El número "+nro+" es negativo");}
            System.out.println("Digite un número: ");
            nro = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Finaizado por nulo");
        
    }  
}
