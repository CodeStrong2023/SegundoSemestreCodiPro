/*
Uso de la plabra Final:
Esta palabra tiene diferentes significados dependiendo de donde se aplique
    Variable: Evita cambiar el valor de la variable donde se aplique
    Métodos: Evita que se modifique la definición o el comportamiento de un 
método desde una sublclase (hija)
    Clases: Evita que se cren claes hijas
Otra característica normalmente cuando trabajamos con variables se combina con 
el modificador de acceso estático para convertir una variable en un cte, es
decir que no se puede modificar su valor,el ejemplo de ésto es la clase Math en
la cual todos sus atributos son del tipo static y final, es por eso que la 
variable pi* se conoce como una cte.
*/

package test;

import domain.Persona;


public class testFinal {
    public static void main(String[] args) {
        final int miDni = 36313614;
        System.out.println("miDni = " + miDni);
        //miDni = 37176096;
        System.out.println("miDni = " + miDni);
        //Persona.CONSTANTE_AQUI= 9; no se modifica
        System.out.println("mi atributo constante es: " +Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); no se puede asignar una nueva referencia
        persona1.setNombre("Emilia Bazán");
        System.out.println("persona1 Nombre = " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 = Nombre = " + persona1.getNombre());
        
    }
    
}
