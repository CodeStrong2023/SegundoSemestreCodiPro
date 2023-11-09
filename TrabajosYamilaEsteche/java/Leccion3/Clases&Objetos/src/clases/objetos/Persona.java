
package clases.objetos;

/**
 *
 * @author yami
 */
public class Persona {

    // Atributos: especificar que son publicos para acceder desde otro paquete y clases
    public String nombre; 
    public String apellido;

    // Metodos de la clase (son los comportamientos)
    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
}
}