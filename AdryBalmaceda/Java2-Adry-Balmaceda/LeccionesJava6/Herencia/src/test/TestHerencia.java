/*
 *Constructores: se heredan, es una caracteristica de Java

 *en Memoria la clase Padre y clase Hija son un solo objeto de
eso se trata la herencia, clase hija hereda automaticamente las
caracteristicas de clase padre

 *ctrl+barra espaciadora: para ver opciones que falta
 *Date: genera una fecha actual
 */
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

/*
 * @Adrybalmaceda
 */
public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Adry", 57000.00);  // constructor
        System.out.println("empleado1 = " + empleado1);

//        Date fecha1 = new Date();
//
//        Cliente cliente1 = new Cliente(fecha1, true, "Bety", 'F', 32, "9 de Julio 1413");
//        System.out.println("cliente1 = " + cliente1);
//        
//        // Al crear el objeto: tendremos a disposicion cualquiera de los constructores
//        Persona persona1 = new Persona();
    }

}
