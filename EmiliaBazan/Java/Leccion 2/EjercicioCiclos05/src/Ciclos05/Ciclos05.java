/*
 *Ejercicio 5: Hacer un juego para adivinar un número entre 0-100 y luego ir 
pidiendo nros indicando "Es mayor", "Es menor" según sea mayor o menor con N, 
el juego termina cuándo el usuario acierta y mostramos la cantidad de intentos
hechos. 
*/
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        int nro, aleatorio, conteo=0;
        aleatorio = (int) (Math.random()*100);
        Scanner entrada = new Scanner(System.in);
        
        
        do {
            System.out.println("Ingrese un número: ");
            nro = Integer.parseInt(entrada.nextLine());
            if (nro < aleatorio){
                System.out.println("El numero es mayor");} 
            else if (nro > aleatorio){
            System.out.println("El numero es menor");}
            else {
                    System.out.println("Acertaste!");}
            conteo++;                
        }while(nro != aleatorio);
        System.out.println("Encontraste el nro: "+nro+ " en "+conteo+ " intentos.");        
    }
}
