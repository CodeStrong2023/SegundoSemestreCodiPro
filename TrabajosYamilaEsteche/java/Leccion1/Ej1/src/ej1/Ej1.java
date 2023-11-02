/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class Ej1 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: "); //salida por consola

        String Libro = entrada.nextLine();        //en esta linea podemos ingresar datos a la consola
        
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());   //en esta linea podemos ingresar datos a la consola
        
        System.out.println("Digite el precio del libro: ");

        double precioLibro = Double.parseDouble(entrada.nextLine());  //en esta linea podemos ingresar datos a la consola
        
        System.out.println("Confirme si el envio es gratuito TRUE o FALSE: ");
    
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());   //en esta linea podemos ingresar datos a la consola

       
        System.out.println(Libro+" # "+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio del libro gratuito es: "+ envioGratuito);  
    }
    
}
