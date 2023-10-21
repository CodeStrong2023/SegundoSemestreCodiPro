/*
Ejercicio8: Pedir un nro n y mostrar todos los nros del 1 al n.
 */
package Ciclos08;

import java.util.Scanner;


public class Ciclos08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un nro");
        int nro = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while(i<=nro){
            System.out.println(i);
            i++;
        }
    }
}
