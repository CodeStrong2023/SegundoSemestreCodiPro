/*
 * constante final
final: indica que las clases hijas no podran cambiar
el comportamiento
 *no se puede modificar la referencia pero si el
contenido del objeto

 */
package domain;

/*
 * @Adrybalmaceda
 */
public class Persona {

    public final static int CONSTANTE_AQUI = 15;  //atributo constante no se puede modificar
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void imprimir() {
        System.out.println("Metodo para imprimir");
    }
}
