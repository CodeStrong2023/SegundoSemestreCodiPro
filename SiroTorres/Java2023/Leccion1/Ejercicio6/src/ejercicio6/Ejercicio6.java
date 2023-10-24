
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float guillermo, luis, juan, total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());
        
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = guillermo + luis + juan;
        System.out.println("\n El dinero de luis es : $" + luis);
        System.out.println("El dinero de juan es : $" + juan);
        System.out.println(" El total de dinero entre los tres es de : $" + total);
        
       
    }
    
}
