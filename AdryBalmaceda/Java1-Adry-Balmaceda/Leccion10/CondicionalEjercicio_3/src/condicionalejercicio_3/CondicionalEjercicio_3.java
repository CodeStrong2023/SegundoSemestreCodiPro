/*
 * Leccion 10, ejercicio calificaciones, condicional
 */
package condicionalejercicio_3;

import java.util.Scanner;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class CondicionalEjercicio_3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero entre 0 y 10: ");
        var calificacion = Integer.parseInt(entrada.nextLine());
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {  // si lo quitamos no mostrará ningun mensaje
            System.out.println("Fuera de rango");
        }
    }

}
