/*
 Ejercicio 3: Leer un número hasta que se introduzca un cero
para cada uno indicar si es par o impar.
Primero lo haremos con la clase scanner
Después con la c lase JOptionPane
 */
package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while (numero != 0){
            if (numero % 2 == 0){
                System.out.println("El número ingresado "+numero+" es PAR ");
        }
            else{
                System.out.println("El número ingresado "+numero+" es IMPAR");
                
                }    
            System.out.println("Ingrese otro número: ");
            numero= Integer.parseInt(entrada.nextLine());
                }
        System.out.println("El número ingresado "+numero+" finaliza el programa");
    }
 }
        
    

