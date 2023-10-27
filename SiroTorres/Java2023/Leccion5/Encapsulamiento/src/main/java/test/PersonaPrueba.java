
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificamos a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("Nombre es "+persona1.nombre); //Error
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        System.out.println("persona1 el resultado para sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        //Tarea: crear otro objeto de tipo Persona, asignar valores de manera inicial
        // y imprimir, luego modificar sus valores y volver a imprimir
        Persona arma2 = new Persona("Mosint Nagant", 7.62, false);
        System.out.println("arma2 su nombre es: "+arma2.getNombre());
        //Modifico a traves del metodo
        arma2.setNombre("Kark 98k");
        arma2.setEliminado(true);
        
        System.out.println("arma2 su nombre es: "+arma2.getNombre());
        System.out.println("arma2 su tipo de municion es: "+arma2.getSueldo());
        System.out.println("arma2 tiene mira optica? "+arma2.isEliminado());
        
        System.out.println("persona1 = " + persona1);
        //Gracias al toString llama a persona1 en forma de cadena
        
    }
}
                                                        