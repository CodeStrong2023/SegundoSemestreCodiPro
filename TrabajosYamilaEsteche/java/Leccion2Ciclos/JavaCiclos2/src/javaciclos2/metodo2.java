/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos2;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class metodo2 {
   // con la clase JOptionpane 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero " +numero+" es positivo");
            }
                else{
                System.out.println("El numero " +numero+" es negativo");
                }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            }
            System.out.println("El numero " +numero+" finaliza el programa");
        }
    
}
