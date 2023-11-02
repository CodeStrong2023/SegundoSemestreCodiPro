/*
 * Arreglos de tipo object
private: atributo encapsulado
constructor: es para inicializar el nombre con insert code
metodos: getter and setter con insert code

 *Matrices: Matriz de objetos
 */
package domain;

/*
 * @Adrybalmaceda
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+","+super.toString();  // herencia clase padre object y su metodo toString
    }
    
    
    
}
