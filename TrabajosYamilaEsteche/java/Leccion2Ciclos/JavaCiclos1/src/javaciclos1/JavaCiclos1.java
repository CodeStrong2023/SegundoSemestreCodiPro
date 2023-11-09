/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaciclos1;

import java.util.Scanner;
//import javax.swing.JOptionPane;  se usa en el metodo dos

/**
 *
 * @author yami
 */
public class JavaCiclos1 {

    public static void main(String[] args) {
        //Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, cuadrado;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){ 
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: "+cuadrado );
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa ha finalizado por numero negativo");  
        
      
        
        //leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
        //otro metodo
        
      /*  numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){ 
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: "+cuadrado );
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("El programa ha finalizado por numero negativo"); */
       
    }
    
    
    
    
}
    

