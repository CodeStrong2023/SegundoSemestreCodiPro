/*
Instrucciones:
1.New project (sin main): Ejercicio_1
2.New java package: Ejercicio1
3.New java class: Ejercicio1
4.Crear main: psvm + tab
5.Crear clase Scanner: importar java.util.Scanner
6.Ejercicio Tienda de libros
 */
package Ejercicio1;

import java.util.Scanner;

/**
 ******* @author AdrianaBalmaceda ******
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        //Lo pedimos por consola al usuario
        //El nombre es una cadena tipo String
        //Tipo de escritura camelCase
        //Usamos el objeto de Scanner para llamar al metodo nexLine
        //Así obtenemos el dato ingresado por el usuario
        String nombreLibro = entrada.nextLine();
        
        //Pedimos al usuario el id: es un numero
        //Se ingresa un numero entero 
        //Tipo de escritura camelCase
        //Metodo nextLine: guarda cadenas
        //Se requiere hacer conversion al tipo de dato necesario
        //Metodo parseInt: guarda en la variable idLibro un tipo entero
        //ingresado por el usuario
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        
        //Solicitamos al usuario ingresar precio del libro
        System.out.println("Digite el precio del libro: ");
        //Numeros usados en dinero son tipo double o float
        //Usamos tipo double
        double precioLibro = Double.parseDouble(entrada.nextLine());
        
        //Preguntamos al usuario si el envio es gratuito
        System.out.println("Confirme si el envio es gratuito TRUE o FALSE: ");
        //Tipo logico boolean: para guardar el dato TRUE o FALSE
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        //El dato que se ingrese como cadena se convierte a tipo booleano
        //El dato se guarda en la variable envioGratuito
        
        //Mostrar en pantalla los resultados
        System.out.println(nombreLibro+" # "+idLibro);
        System.out.println("Precio del libro: $"+ precioLibro);
        System.out.println("El envio del libro gratuito es: "+ envioGratuito);
    }
}
