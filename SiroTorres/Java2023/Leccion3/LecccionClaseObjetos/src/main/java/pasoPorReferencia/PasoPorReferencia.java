
package pasoPorReferencia;

import Clases.Persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+ persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        //Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: "+persona2.nombre);
    }
    
    public static void cambiarValor(Persona persona){ //Paso por referencia
        persona.nombre = "Maria";
        
    }
    
    public static Persona cambiarElValor(Persona persona){
        if (persona == null){
            System.out.println("El valor de persona es invalido : Null");
            return null;
        }
        else{
          persona.nombre = "Monica";
        return persona; //Return apunta a la finalizacion de un proceso
        //Se puede usar varias veces  
        }
        
        
    }
}
