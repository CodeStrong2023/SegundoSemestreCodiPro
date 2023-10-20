/*
 *Ejercicio 5: Hacer un juego para adivinar un número entre 0-100 y luego ir 
pidiendo nros indicando "Es mayor", "Es menor" según sea mayor o menor con N, 
el juego termina cuándo el usuario acierta y mostramos la cantidad de intentos
hechos. Usando JOPtion
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
    public static void main(String[] args) {
        int aleatorio, nro, conteo =0;
        aleatorio = (int) (Math.random()*100);
        
        do {
            nro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro: "));
            if (nro < aleatorio){
                System.out.println("Ingrese un nro mayor a: "+nro);} 
            else if (nro > aleatorio){
            System.out.println("Ingrese un numero menor a: "+nro);}
            else {
                    System.out.println("Acertaste!");}
            conteo++;                
        }while(nro != aleatorio);
        System.out.println("Encontraste el nro: "+nro+ " en "+conteo+ " intentos.");        
    }

}
