/*
 * Paso por valor: es una copia que se toma lo mismo que en funciones
y los metodos es lo mismo que en funciones
copia el dato que esta recibiendo en la variable local var valorX
estaria enviando el numero 20, ese es el parametro por valor
no esta haciendo una manipulacion del espacio de memoria en el stack
donde esta nuestra variable local
stack: espacio de memoria que se le asigna a una variable local
entonces en el metodo se esta copiando ese valor y se muestra
que en nuestro ejemplo el metodo no devuelve nada lo unico que
hace es mostrar ese valor
eso es el parametro por valor que no tiene el poder de introducir
o retornar un valor dentro del espacio de memoria en la variable local
 */
package PasoPorValor;

/*
 * @Adrybalmaceda
 */
public class PasoPorValor {

    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX);  // llamamos al metodo, solo le enviamos una copia
        System.out.println("valorX = " + valorX);
    }

    // Crear metodo
    public static void cambioValor(int arg1) {  // copia el valor lo mete dentro del metodo
        System.out.println("arg1 = " + arg1);  // muestra el valor
        arg1 = 15;  // no pasa nada porque solo estamos utilizando la variable local
    }
}
