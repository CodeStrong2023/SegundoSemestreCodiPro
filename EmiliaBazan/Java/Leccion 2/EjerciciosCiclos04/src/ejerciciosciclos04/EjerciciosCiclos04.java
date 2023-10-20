/*
 Pedir nros hasta que se teclee uno negativo, mostrar cuantos nros se
introdujeron
 */
package ejerciciosciclos04;

import java.util.Scanner;

public class EjerciciosCiclos04 {
        public static void main(String[] args) {
        int nro, conteo = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        nro = Integer.parseInt(entrada.nextLine());
        while (nro > 0){
            System.out.println("El "+ nro + " es positivo.");
            conteo++;
            System.out.println("Ingrese un nro: ");
            nro = Integer.parseInt(entrada.nextLine()); 
        }
        System.out.println("Cerrado por negativo");
        System.out.println("Se introdujeron " + conteo + " nros positivos");}
            
    
}
