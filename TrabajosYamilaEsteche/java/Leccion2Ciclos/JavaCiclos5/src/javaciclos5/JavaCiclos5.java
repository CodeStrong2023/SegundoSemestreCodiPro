/*
 *Realizar un juego para adivinar un numero, para ello generar un numero aleatorio entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o 
"es menor" segun sea mayor o menos con respecto a N. El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos
 */
package javaciclos5;

import java.util.Scanner;


/**
 *
 * @author yami
 */
public class JavaCiclos5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); //(va a generar numeros al azar de forma aleatoria)
        do {
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Digite un numero mayor");
            }
            else if(numero > aleatorio){
                System.out.println("Digite un numero menor");
            }
            else{
                System.out.println("Felicidades, Adivinaste el numero");
            }
            conteo++;
        } while(numero != aleatorio);
        System.out.println("Adivinaste el numero el: "+conteo+" intentos");
        
        
        //podemos hacerlo con metodo importando la clase javax.swing.JOptionPane;
        
          /*      
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(numero < aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero mayor");
            }
            else if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero menor");
            }
            else{
                JOptionPane.showMessageDialog(null,"Felicidades, Adivinaste el numero");
            }
            conteo++;
        } while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste el numero el: "+conteo+" intentos"); */
    }
    
}
