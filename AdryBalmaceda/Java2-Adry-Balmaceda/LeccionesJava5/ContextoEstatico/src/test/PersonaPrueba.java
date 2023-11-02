/*
 *static: para no crear objeto y poder acceder al metodo poniendo el nombre
de la clase
 *main: el compilador no crea un objeto de la clase para ejecutar la prueba
no se puede trabajar con this porque estamos dentro de un 
contexto estatico
 */
package test;

import domain.Persona;

/*
 * @Adrybalmaceda
 */
public class PersonaPrueba {  // no tenemos atributos

    private int contador;  // y si ponemos atributos creamos un metodo

    // contexto estatico
    public static void main(String[] args) {
        Persona persona1 = new Persona("Adry");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Adriana");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //  this.contador = 10;  // no se puede referenciar desde un contexto estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

    // contexto dinamico: puede entrar al contexto estatico
    public int getContador() {  //se crea un objeto a traves del metod getContador
        imprimir(new Persona("Juliana"));
        return this.contador;
    }

}
