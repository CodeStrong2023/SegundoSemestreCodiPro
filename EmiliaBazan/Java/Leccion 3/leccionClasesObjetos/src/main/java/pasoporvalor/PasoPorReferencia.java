package pasoporvalor;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos es:  = " + persona1.nombre );
        persona1= cambiarElValor(persona1);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("Ek nuevo valor del objeto es: " +persona2.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "María";
       
    }
     public static Persona cambiarElValor(Persona persona){
        if (persona == null){
            System.out.println("Valor de persona invàlido: Null");
        } 
        else{
             persona.nombre = "Monica";
            return persona;
        }
     
    }
}     
