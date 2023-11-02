
package domain;

/*
 * @Yami
 */
public class Empleado extends Persona {

    @Override  
    public void imprimir() {
        System.out.println("imprimir desde la clase hija");
    }
}
