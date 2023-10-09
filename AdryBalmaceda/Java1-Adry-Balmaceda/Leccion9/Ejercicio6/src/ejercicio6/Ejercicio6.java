/*
 * Practica Leccion 9
 */
package ejercicio6;

import java.util.Scanner;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());

        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = luis + guillermo + juan;
        System.out.println("\nEl dinero de Juan es: U$S" + juan);
        System.out.println("\nEl dinero de Luis es: U$S" + luis);
        System.out.println("\nEl total de dinero entre los tres es: U$S" + total);
    }

}
