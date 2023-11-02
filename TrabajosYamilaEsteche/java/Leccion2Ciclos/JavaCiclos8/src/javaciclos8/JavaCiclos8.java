/*
   Pedir un numero, y mostrar todos los numeros del 1 al numero elegido.
 */
package javaciclos8;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class JavaCiclos8 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite un numero: ");
      int numero = Integer.parseInt(entrada.nextLine());
      int i = 1;
      while( i <= numero){
      System.out.println(i);
      i++;}
    }
    
}
