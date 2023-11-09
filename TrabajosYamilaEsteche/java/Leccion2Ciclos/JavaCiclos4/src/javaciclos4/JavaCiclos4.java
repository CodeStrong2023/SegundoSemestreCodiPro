/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos4;

import java.util.Scanner;

/**
 *
 * @author yami esteche
 */
public class JavaCiclos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido
        
       Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El numero "+numero+" es positivos");
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
                
        System.out.println("Ha ingresado "+conteo+" que no son negativos");
    }
    
}
