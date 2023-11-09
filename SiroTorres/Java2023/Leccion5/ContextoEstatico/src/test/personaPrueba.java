
package test;

import domain.Persona;

public class personaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Siro");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Sol");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        //this.contador = 10; //No se puede referenciar desde un contexto estatico
        personaPrueba personaP1 = new personaPrueba();
        System.out.println(personaP1.getContador());
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
