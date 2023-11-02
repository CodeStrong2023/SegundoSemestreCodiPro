/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con la clase Scanner y JOptionPane.
*/
package ciclos12;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        int numero;
        long factorial = 1;
        //System.out.println("Ingrese un número: ");
        //numero = Integer.parseInt(entrada.nextLine());
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        for (int i =1; i<=numero;i++){
            factorial *= i;
        }
        
        //System.out.println("\nEl factorial del número ingresado es: "+factorial);   
        JOptionPane.showMessageDialog(null,"El factorial del número ingresado es: "+factorial);
    }
            
}
