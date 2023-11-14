
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        //this.contador = 10; No se puede referenciar dentro de un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.contador);
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContadcr(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
