/*
 * Operaciones aritmeticas
    argumentos
    operador this
 *new: palabra reservada para llamar al constructor y 
lo asigna al objeto
 *null: forma de limpieza que no es necesario poner en el codigo
porque automaticamente ya lo hace el compilador
 *System.gc(); recolector de basura, no es necesario por lo mismo 
y ademas es muy pesado
Por eso se desaconseja
 *
 *clase publica: solo puede haber una sola
 *crear clase dentro de una clase, hablamos de modularidad, si 
queremos crear una clase fuera de la clase que tenemos ya no puede
ser publica, las demas no y el
 *tipo de modificador de acceso: se lo conoce como default o package y
no lo va a mostrar
 *pull strings: conjunto de cadenas que Java va a administrar, el
objetivo es ocupar la menor cantidad de memoria
 */
package Operaciones;

/*
 * @Adrybalmaceda
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        var a = 10;  // variables locales
        int b = 7;  // Memoria stack (local)
        miMetodo();  // llamamos el metodo nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        // Para almacenar un objeto o los atributos se utiliza la Memoria Heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        // aritmetica1 = null; nunca utilizar esto, no se debe hacer
        // System.gc(); metodo para limpiar residuos, es pesado, no utilizar

        // creamos un objeto persona, trabajamos con la memoria Heap
        Persona persona = new Persona("Adry", "Balmaceda");  // no hay que importar nada porque trabajamos dentro de la misma plantilla
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona nombre: " + persona.apellido);
    }
    // Modularidad creamos un nuevo metodo

    public static void miMetodo() {
        //int a = 10; // una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }

}
// Creamos una nueva clase dentro de una misma plantilla

class Persona {  // no se pone el modificador de acceso, no es necesario escribirlo

    String nombre;
    String apellido;

    // metodo constructor
    Persona(String nombre, String apellido) {  // Constructor, tampoco necesita modificador de acceso
        this.nombre = nombre;  // constructores que apuntan a los atributos de una misma clase
        this.apellido = apellido;
    }

}
