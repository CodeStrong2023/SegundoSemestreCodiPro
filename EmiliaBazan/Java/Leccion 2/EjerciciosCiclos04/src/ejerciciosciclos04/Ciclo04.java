/*
 Pedir nros hasta que se teclee uno negativo, mostrar cuantos nros se
introdujeron usando JOPtionPane
 */
package ejerciciosciclos04;

import javax.swing.JOptionPane;

public class Ciclo04 {
    public static void main(String[] args) {
        int nro, conteo =0;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro: "));
        while (nro > 0){
            System.out.println("El "+ nro + " es positivo.");
            conteo++;
            System.out.println("Ingrese un nro: ");
            nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro nro: ")); 
        }
        System.out.println("Cerrado por negativo");
        System.out.println("Se introdujeron " + conteo + " nros positivos");
    }
}
