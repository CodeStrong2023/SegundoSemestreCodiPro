/*
 * clic+boton derecho+insert code: Getter and Setter y
seleccionar todos los atributos para generar metodos
 *main, hoja de prueba: es para ir probando el codigo que vamos
armando
 */
package dominio;

/*
 * @Adrybalmaceda
 */
public class Persona {

    // Atributos encapsulados
    private String nombre;  //primer atributo
    private double sueldo;  //segundo atributo
    private boolean eliminado; //tercero

    // Constructor de clase Persona tipo public, mismo nombre que la clase
    public Persona(String nombre, double sueldo, boolean eliminado) {  // definir variables para modificar los atributos
        this.nombre = nombre; //diferencia variable y atributo
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // Metodos Getter and Setter para acceder a modificar o establecer nuevos valores apuntando hacia el objeto que necesitamos instanciar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {  // no se utiliza Get porque es como una pregunta 
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

}
