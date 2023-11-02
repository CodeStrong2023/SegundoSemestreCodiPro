
package dominio;

/**
 *
 * @author yami
 */
public class Persona {
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
        Persona.contadorPersona++; // incrementa el contador por cada objeto 
        this.idPersona = Persona.contadorPersona; //se le asigna el valor de la variable
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

    
}
