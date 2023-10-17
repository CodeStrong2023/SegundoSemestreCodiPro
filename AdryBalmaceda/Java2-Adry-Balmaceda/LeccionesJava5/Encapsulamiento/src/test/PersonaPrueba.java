/*
 *Metodo de trabajo
 * Formato para trabajar e ir testeando todo el codigo que
vamos a cargar en nuestra hoja de trabajo
Como tenemos que hacer las pruebas segun el codigo que nos
han requerido
Es para testear todo el trabajo que tenemos que presentar
Es la forma de trabajo para un programador

 *Atributos, objeto, constructor, metodos
 */
package test;

// importar clase persona que está en otro paquete
import dominio.Persona;  // con .*: importamos todas las clases de dominio, sino se utilizan no se cargan en memoria, solo estan a la mano para hacer uso

/*
 * @Adrybalmaceda
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Profe Osvaldo", 57000, false);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        // Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        // persona1.nombre = "Juan Ignacio"; // ya no se puede utilizar
        // System.out.println("Nombre es: "+persona1.nombre); // Error
        System.out.println("persona1 con su nombre modificado es: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        
        // Tarea: crear otro objeto tipo Persona, asignar valores de manera inicial
        // imprimir, luego modificar sus valores y volver a imprimir
        Persona persona2 = new Persona("Junior Adriana", 36000, true);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        persona2.setNombre("Junior Adry");
        System.out.println("persona2 con su nombre modificado es: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano " + persona2.isEliminado());
    }

}
