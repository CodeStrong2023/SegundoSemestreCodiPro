/*
Pedir un nro y hacer su factroial con clase Scanner 
 */
package ciclos12;

import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        int nro;
        long factorial =1;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un nro: ");
        nro = Integer.parseInt(entrada.nextLine());
        
        for (int i =1; i <= nro; i++){
            factorial *= i;
        }
        System.out.println("El factorial de "+ nro + " es: "+factorial);
    }
    
}
