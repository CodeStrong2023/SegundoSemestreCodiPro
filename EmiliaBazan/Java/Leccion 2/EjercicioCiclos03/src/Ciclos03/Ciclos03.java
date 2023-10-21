/*
 Leer nros hasta que se introduzca un 0; para cada caso indicar si es par o
impar.
 */
package Ciclos03;

import java.util.Scanner;


public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        var nro = Integer.parseInt(entrada.nextLine());  
        while (nro != 0){
            if (nro % 2 == 0){
            System.out.println("El número " + nro + " es par.");}
            else {
            System.out.println("El número " + nro + " es ímpar.");}
            System.out.println("Ingrese un nro: ");
            nro = Integer.parseInt(entrada.nextLine());
        } 
        System.out.println("Detenido por nulo");
    }
        
}
