
package domain;

public class Empleado extends Persona{
    //Mediante el EXTENDS indicamos que la clase empleado es herencia de la clase padre PERSONA
    // En caso de no poner extends, la clase empleado seria hija de la clase OBJECT la cual
    // se asigna por defecto como clase padre de todas las demas clase (por defecto)
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; //Es para incrementar
    
    //Constructores
    public Empleado (){ //Constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) { //Constructor 2
        //super(nombre);
        this(); //Estamos llamando desde aqui al constrcutor vacio (llamar a un constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
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
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
