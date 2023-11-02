/*
pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
 */
package javaciclos6;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class JavaCiclos6 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero, suma = 0;
      do{
          System.out.println("Digite un numero: ");
          numero = Integer.parseInt(entrada.nextLine());
      
        } while (numero != 0);
      
      System.out.println("\nLa suma de todos los numeros ingresados es: " + suma);
    }
    
    
    //Utilizando JOptionPane
    
    /*  
     int numero, suma = 0;
      do{
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
          suma+= numero;
        } while (numero != 0);
      JOptionPane.showInternalMessageDialog(null, "\nLa suma de todos los numeros ingresados es: " + suma); 
    */
}
