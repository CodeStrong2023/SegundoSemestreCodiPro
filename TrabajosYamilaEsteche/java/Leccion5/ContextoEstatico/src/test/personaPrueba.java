/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dominio.Persona;
/**
 *
 * @author yami
 */
public class personaPrueba {
     private int contador;  

    public static void main(String[] args) {
        Persona persona1 = new Persona("yamila");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("eliana");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
   
        personaPrueba personaP1 = new personaPrueba();
        System.out.println(personaP1.getContador());
    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

    // contexto dinamico: puede entrar al contexto estatico
    public int getContador() {  
        imprimir(new Persona("Codipro"));
        return this.contador;
    }
    
}
