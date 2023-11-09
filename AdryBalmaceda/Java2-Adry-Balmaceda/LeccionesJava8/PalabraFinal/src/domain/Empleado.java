/*
 * si la clase es constante no se puede conectar la
clase Empleado con la clase Persona
 *con objetos
 */
package domain;

/*
 * @Adrybalmaceda
 */
public class Empleado extends Persona {

    @Override  // indica que el metodo esta en la clase padre y modificamos el comportamiento 
    public void imprimir() {
        System.out.println("Metodo imprimir desde la clase hija");
    }
}
