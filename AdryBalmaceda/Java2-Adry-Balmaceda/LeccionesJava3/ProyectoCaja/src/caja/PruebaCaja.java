/*
 * Ejercicio Proyecto Caja
Ejercicio 1: crear un proyecto segun las especificaciones mostradas
a continuacion.
La formula es: volumen=ancho*alto*profundidad
 */
package caja;

/*
 * @Adrybalmaceda
 */
public class PruebaCaja {

    public static void main(String[] args) { // Metodo main
        // Variables locales
        int dimAncho = 10;  // valores ingresados en codigo duro
        int dimAlto = 5;
        int dimProf = 5;

        Caja caja1 = new Caja();  // instanciamos el objeto, constructor vacio
        caja1.ancho = dimAncho;  // le pasamos los valores al objeto
        caja1.alto = dimAlto;
        caja1.profund = dimProf;
        int resultado = caja1.calcularVolumen();  // llamamos al metodo
        // Primer resultado
        System.out.println("Volumen Caja 1: " + resultado);

        Caja caja2 = new Caja(8, 4, 6);  // llamamos al Constructor 2 con argumentos
        // llamamos con el nuevo objeto al metodo para un nuevo calculo
        System.out.println("Volumen Caja 2: " + caja2.calcularVolumen());

    }

}
