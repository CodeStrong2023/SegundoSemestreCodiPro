/*
 Pedir un nro hasta que se introduzca uno negativo y calcular la media
 */
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        int nro, conteo = 0, suma = 0;
        float media=0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        nro = Integer.parseInt(entrada.nextLine());
        while (nro >=0){  
        System.out.println("Ingrese un numero: ");
        nro = Integer.parseInt(entrada.nextLine());
        suma += nro;
        conteo++;
        }
        media = (float)suma/conteo;
        System.out.println("Cerrado por negativo.");
        System.out.println("La media de los numeros ingresados es: "+media);
    }
}

