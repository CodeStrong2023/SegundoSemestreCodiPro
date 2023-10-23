/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde
se aplique:

 *variables: evita cambiar el valor que almacena la variable
 
 *metodos: evita que se modifique la definicion o el comportamiento
de un metodo desde una subclase (hija)

 *clases: evita que se creen clase hijas

Otra caracteristica es que normalmente,
cuando trabajamos con variables se combina con el
modificador de acceso estatico para convertir una
variable en una constante, es decir que no se puede
modificar su valor, 
el ejemplo de esto es la clase
Math en la cual todos sus atributos son de tipo
static y fina, es por esto que la variable pi* se
conoce como una constante.

 */
package test;

import domain.Persona;

/*
 * @Adrybalmaceda
 */
public class TestFinal {

    public static void main(String[] args) {
        final int miDni = 39955278;
        System.out.println("miDni = " + miDni);
        // miDni = 20312321;  // no se puede modificar o reasignar esta variable
        // Persona CONSTANTE_AQUI = 9;  // no se modifica
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
        // persona1 = new Persona(); // no se puede asignar una nueva referencia
        persona1.setNombre("Adrybalmaceda");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Adriana");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
}
