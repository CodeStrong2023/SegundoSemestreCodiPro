
package clases.objetos;

/**
 *
 * @author yami
 */
public class PruebaPersona {
    public static void main(String[] args) {
    Persona persona1;
    persona1 = new Persona(); //Llamamos al constructor
    persona1.nombre = "Yamila"; 
    persona1.apellido = "Esteche";
    persona1.obtenerInformacion();

    Persona persona2 = new Persona();
    System.out.println("persona2 = " + persona2);
    System.out.println("persona1 = " + persona1);
    persona2.nombre = "Eli";
    persona2.apellido = "E";
    persona2.obtenerInformacion();
    }

    
}
