
package domain;

/*
 * @Yami
 */
public class Persona {

    public final static int CONSTANTE_AQUI = 2; 
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
