/*
 * clic+boton derecho+insert code: Getter and Setter y
seleccionar todos los atributos para generar metodos
 *main, hoja de prueba: es para ir probando el codigo que vamos
armando

 *atributo: modificador default o package(no se escribe) lo recibe
cuando no tiene modificador de acceso
public, private o protected

 *Metodo to string: operador.toString
permite imprimir el estado del objeto, los valores de cualquier
atributo que agreguemos al metodo
objetivo: cuando hagamos la impresion se vea toda la informacion

 *Contexto estatico: cuando se cargan Clases
Contexto dinamico: cuando se cargan Objetos (se necesitan las clases creadas)
contexto estatico no puede acceder al dinamico y el dinamico si
puede acceder al estatico
 *static: se asocia con la clase y no con los objetos
esta palabra si no esta se asocia con los objetos y no la clase
 *atributos: se pueden acceder desde cualquier objeto
lo que se modifica en la clase lo ven los objetos

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

    // Metodo toString: debe retornar algo
    public String toString() {  // convierte en una cadena cada atributo
        return "Persona [ nombre: " + this.nombre
                + ", sueldo: " + this.sueldo
                + ", eliminado: " + this.eliminado + " ]";
    }

}
