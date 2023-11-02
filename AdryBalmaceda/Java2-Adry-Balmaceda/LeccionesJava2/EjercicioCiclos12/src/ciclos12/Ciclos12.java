/*
 *Ejercicio 12: pedir un numero y calcular su factorial
Hacerlo con las dos clases Scanner y JOptionPane
 *Opcion con clase Scanner: esta comentada para ver la opcion JOptionPane
 */
package ciclos12;

// import java.util.Scanner;
import javax.swing.JOptionPane;


/*
 * @Adrybalmaceda
 */
public class Ciclos12 {

    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        // System.out.println("Digite un numero: ");
        // int numero = Integer.parseInt(entrada.nextLine());
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        // System.out.println("\nEl factorial del numero es: " + factorial);
        JOptionPane.showMessageDialog(null, "El factorial del numero es: " + factorial);
    }

}
