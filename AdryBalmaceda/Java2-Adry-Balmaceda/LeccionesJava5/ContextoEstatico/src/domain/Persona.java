/*
 *Atributos estaticos y no estaticos

 *@Override: sobreescribir metodo toString()en la herencia desde
la clase Object se hereda este metodo toString (viene por herencia y
lo estamos sobreescribiendo)
 */
package domain;

/*
 * @Adrybalmaceda
 */
public class Persona {

    // cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    // Constructor: no va vacio
    public Persona(String nombre) {
        this.nombre = nombre;
        // incrementar el contador por cada objeto nuevo
        // atributo estatico: no se usa operador this, referencia a traves de la clase
        Persona.contadorPersona++;
        // vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
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
