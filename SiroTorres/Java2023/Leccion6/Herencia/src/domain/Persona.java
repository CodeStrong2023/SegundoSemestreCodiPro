
package domain;

public class Persona {
    //Atributos de herencia (protected se usa para la herencia)
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio: esto es para crear objetos sin necesidad de inicializar
    //los atributos de la clase
    public Persona(){ //Constructor 1
        
    }
    
    public Persona(String nombre){ //Constructor 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { //Constructor 3 
        // (generado con insert code)
        //Constructor completo
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

  
    //To String con Insert Code. 
    //To String viene de la clase PADRE OBJECT
    //Con StringBuilder es mas efectivo

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        //Mediante esto vemos que espacio de memoria utiliza
        sb.append('}');
        return sb.toString();
    }
}
