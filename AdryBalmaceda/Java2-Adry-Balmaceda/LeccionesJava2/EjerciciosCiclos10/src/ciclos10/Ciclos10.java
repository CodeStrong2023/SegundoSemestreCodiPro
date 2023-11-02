/*
 *estructuras de control: if else, ciclos: while, do while o for
 *sintaxis: tipo de escritura CamelCase y para paquetes usar
el nombre todo en letras minusculas
 *Alt+ruidita mouse: para hacer zoom
 *Ejercicio 10: pedir 10 numeros y escribir la suma total
hacerlo con la clase Scanner y JOptionPane
 *palabra entrada: podemos usar otra palabra como identificador
 */
package ciclos10;

import java.util.Scanner;

/*
 * @Adrybalmaceda
 */
public class Ciclos10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;

        }
        System.out.println("\nLa suma de todos los numeros es: " + suma);
    }

}
