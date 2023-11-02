/*
 * Clase: es una plantilla donde vamos a trabajar y donde vamos a crear objetos
vamos a necesitar crear un objeto/s a partir de la clase
*objeto: le asignamos valores, nombre, apellido, edad...
*clase: vamos a definir atributos y metodos de manera gral y será el molde para 
crear 1 o mas objetos
*objeto: se definen caracteristicas, es una instancia de la clase
*paquete: carpeta donde se clasifican las clases
*palabras reservadas: package, public, class
*ctrl+z: volver atras
*definicion de la clase: debe ser publica para acceder de otros archivos
*escritura pascalcase: PersonaBaja
 */
package Clases;

/*
 * @Adrybalmaceda
 */
public class Persona {

    // Atributos de la clase: especificar que son publicos para acceder desde otro paquete
    public String nombre; 
    public String apellido;

    // Metodos de la clase (Acciones)
    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

}
