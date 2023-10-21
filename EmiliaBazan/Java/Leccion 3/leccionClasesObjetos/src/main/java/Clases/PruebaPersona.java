package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();//Llamamos al contructor
        persona1.nombre = "Emilia";
        persona1.apellido = "Bazàn";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("Persona2 = " + persona2);
        System.out.println("Persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordadnini";
        persona2.obtenerInformacion();
        
    }
}