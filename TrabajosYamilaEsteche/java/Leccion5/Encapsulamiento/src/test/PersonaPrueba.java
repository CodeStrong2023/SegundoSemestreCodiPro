
package test;

// importar clase
import dominio.Persona;  

/*
 * @Yami
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Profe Osvaldo", 57000, false);
        System.out.println("persona1 = " + persona1);  // metodo toString
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
       
        persona1.setNombre("juan");
       
        System.out.println("persona1 con su nombre modificado es: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());

      
        Persona persona2 = new Persona("yamila",45000 , true);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        persona2.setNombre("yamila");
        System.out.println("persona2 con su nombre modificado es: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano " + persona2.isEliminado());


        System.out.println("persona1: " + persona1);
    }

}
