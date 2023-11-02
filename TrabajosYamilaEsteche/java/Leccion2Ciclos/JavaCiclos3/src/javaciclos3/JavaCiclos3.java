/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos3;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class JavaCiclos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer numeros hasta que se introduzca un cero. Para cada uno indicar si es par o impar.
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero ingresado "+numero+ " es par");
            }
            else{
                System.out.println("El numero ingresado "+numero+" es impar");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero ingresado es "+numero+" finaliza el programa");
    }
    
}
