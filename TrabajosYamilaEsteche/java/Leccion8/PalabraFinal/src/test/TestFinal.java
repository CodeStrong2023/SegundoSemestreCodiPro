
package test;

import domain.Persona;

/*
 * @Yami
 */
public class TestFinal {

    public static void main(String[] args) {
        final int miDni = 38137777;
        System.out.println("miDni = " + miDni);
        
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
   
        persona1.setNombre("Yamila Esteche");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("yami");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
}
