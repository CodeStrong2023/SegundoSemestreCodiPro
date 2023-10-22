/*
 * Clase hija Empleado: sera herencia de clase Persona
se indica con la palabra extends y el nombre de la clase padre Persona
 * Clase Persona: hereda automaticamente de clase padre Object
 *HERENCIA SIMPLE: solo se usa una sola jerarquia en Java, no tenemos 
herencia multiple

 *operador this: para encapsular los campos (insert code)
 *metodo toString(): con insert code y tildar use StringBuilder
-metodo append: se puede modificar, pone los atributos
-signo suma: es mas lento para concatenar cadenas, los objetos no
se pueden modificar
 */
package domain;

/*
 * @Adrybalmaceda
 */
public class Empleado extends Persona { 
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;  // es para incrementar
    
    // Constructores
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }
    // Metodos
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado= ").append(idEmpleado);
        sb.append(", sueldo= ").append(sueldo);
        sb.append(",  ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
