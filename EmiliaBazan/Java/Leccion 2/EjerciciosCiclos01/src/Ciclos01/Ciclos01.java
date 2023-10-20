/*
Ejercicio1: Introducir un numero y mostrar su cuadrado hasta que se introduzca un neo negativo
 */
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nro, cuadrado;
        System.out.println("Digite un nro: ");
        nro = Integer.parseInt(entrada.nextLine());
        while (nro >= 0){
        cuadrado = (int) Math.pow(nro, 2);
        System.out.println("El cuadrado de "+ nro + "es: "+ cuadrado+ ".");
        System.out.println("Digite otro número: ");
        nro = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Finalizado por nro negativo");
    }
    
   
}