
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;


public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Emilia", 57000.00);  // constructor
        System.out.println("empleado1 = " + empleado1);

        //Date fecha1 = new Date();
        //Cliente cliente1 = new Cliente(fecha1, true, "Bety", 'F', 32, "9 de Julio 1413");
        //System.out.println("cliente1 = " + cliente1);
        //Persona persona1 = new Persona();
    }

}
