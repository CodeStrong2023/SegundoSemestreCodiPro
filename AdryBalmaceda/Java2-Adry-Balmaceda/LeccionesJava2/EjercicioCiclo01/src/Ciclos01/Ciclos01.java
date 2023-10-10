/*
 * Ejercicio 1:
 * leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
   introduzca un numero negativo
 * Operador de asignacion: =

 * comandos utiles:
 * zoom: Alt+ruedita mouse
   main:psvm+tab
   autocompletado: Ctrl+tecla espacio
   imprimir,pedir al usuario: sout+tab
 */
package Ciclos01; // nuestra carpeta

import java.util.Scanner;
/*
 * @AdryBalmaceda
 */
public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Digite un numero: ");  // pedir al usuario los elementos
        numero = Integer.parseInt(entrada.nextLine());  // conversion
        while(numero >= 0){  // Mientras numero sea mayor o igual a 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es : "+cuadrado);
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());            
        }
        System.out.println("El programa ha finalizado por numero negativo");
    }    
}
