/*
 * Necesitamos importar la clase persona porque esta dentro de 
otro paquete
 *new: palabra reservada para acceder a los atributos que son
de tipo publico en la clase Persona todo eso vamos a acceder
a traves del objeto que hemos creado
 *clases en Java: heredan de la clase Object
 *clase Object: es la clase padre de todas las otras clases que
a traves de cada clase se puede crear o instanciar un objeto
 *persona1: es un objeto
 *operador de acceso punto: nos dice que no nombre no es de tipo
publico, por que no deja acceder si la clase Persona es de tipo 
publica: es porque hay que especificar en los atributos que son 
de tipo publico en el otro paquete
 *estamos trabajando con memoria Heap, no con memorias locales, 
estamos apuntando a los atributos a traves de los objetos
 *memoria Heap: es la memoria que se maneja dentro de los atributos y
los metodos
 *es el paso por referencia tal cual se hace en funciones en nuestro ejemplo
de metodo desde objetos y clases
 *metodo tipo void: siempre retorna algo, no hace falta que 
pongamos return porque el compilador lo crea automaticamente
 *Ctrl+Alt+espacio: es para autocompletar
 *return: podemos poner otros return que cumplan funciones 
diferentes dentro de una estructura
 */
package pasoporreferencia;

import Clases.Persona;  // importamos la clase Persona

/* 
 * @Adrybalmaceda
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es:  " + persona1.nombre);  // muestra la direccion de memoria Heap
        persona1 = cambiarElValor(persona1);  // hacemos otra modificacion
        // Persona persona2 = null;  // muestra un objeto vacio carente de valor
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: " + persona2.nombre);

    }

    // crear otro metodo debajo del main con modificador de acceso tipo static
    // mostramos el PasoPorReferencia
    public static void cambiarValor(Persona persona) {  // paso por referencia
        persona.nombre = "Maria";  // no es requerido return por ser metodo tipo void
    }

    // palabras return y null, usamos Paso por referencia para hacer otra modificacion
    // creamos otro metodo de tipo Object poniendo la clase Persona
    public static Persona cambiarElValor(Persona persona) {  // para retornar algo
        if (persona == null) {
            System.out.println("Valor de persona es invalido: Null");
            return null;  // esta invalida, vacia y sale del metodo
        } else {
            persona.nombre = "Monica";
            return persona;  // apunta a la finalizacion de un metodo y se puede incorporar varias veces
        }

    }

}
