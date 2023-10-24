
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ariel", 57000.0);
        System.out.println("empleado1 = " + empleado1);
        //Al no pasar argumentos utiliza el de la clase padre
        //Por eso empleado esta vacio y hereda de la clase persona
        //Acudiendo al ToString de la clase padre persona
        
//        Cliente cliente1 = new Cliente(new Date(),true, "Bety", 'F' , 32,"9 de julio 1413");
//        System.out.println("cliente1 = " + cliente1);
//        //Mediante el date toma registro exacto de la fecha y hora actual
//        //Necesita ser importada la clase DATE
//        
//        Persona persona1 = new Persona();
      }
}
