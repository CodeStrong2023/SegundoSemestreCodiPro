
package dominio;

/*
 * @yami
 */
public class Persona {

    // Atributos encapsulados
    private String nombre;  
    private double sueldo;  
    private boolean eliminado; 


    public Persona(String nombre, double sueldo, boolean eliminado) {  // definir variables para modificar los atributos
        this.nombre = nombre; 
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

   //metodo get es para obtener informacion, el set me permite guardar y modificar
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

    public boolean isEliminado() { 
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

   
    @Override
    public String toString() {  // debe retornar algo
        return "Persona [ nombre: " + this.nombre
                + ", sueldo: " + this.sueldo
                + ", eliminado: " + this.eliminado + " ]";
    }

}
