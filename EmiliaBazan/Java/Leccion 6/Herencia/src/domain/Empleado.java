package domain;

public class Empleado extends Persona { 
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;  // es para incrementar
    
 
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    public Empleado(String nombre, double sueldo) { 
        //super Nombre
        this();  //LLamar a un constructor interno
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
 
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
