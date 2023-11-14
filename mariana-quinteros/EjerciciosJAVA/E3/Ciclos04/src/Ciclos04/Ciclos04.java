/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y
mostrar cuantos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego con la clase JOptionPane
*/
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("ESTE PROGRAMA FUNCIONARÁ HASTA QUE INGRESE UN NÚMERO NEGATIVO");
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while (numero >= 0){
            System.out.println("EL número "+numero+" es positivo");
            conteo++;
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El conteo de números positivos es: "+conteo);
    }
    
}
