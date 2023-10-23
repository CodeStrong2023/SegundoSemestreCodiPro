/*
 Pedir un nro y hacer su factroial con clase JOPtionPane
 */
package ciclos12;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        long factorial =1;
    
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro: "));
        
        for (int i =1; i <= nro; i++){
            factorial *= i;
        }
        System.out.println("El factorial de "+ nro + " es: "+factorial);
      
    }
}
