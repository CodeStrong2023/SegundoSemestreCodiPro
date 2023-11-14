/*
 * Tendremos 2 main: TestArreglos y TestArreglosObject
podemos configurar cual elegir para trabajar desde
carpeta Arreglos+clic der+properties+run y elegimos el main
arreglos: se definen en plural, porque tiene varios elementos
 */
package test;

import domain.Persona;

/*
 * @Adrybalmaceda
 */
public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Adry");
        personas[1] = new Persona("Miriam");
        System.out.println("personas 0 = " + personas[0]);  // muestran direccion de memoria del objeto
        System.out.println("personas 1 = " + personas[1]);

        // como Iterar arreglos tipo object
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + "=" + personas[i]);
        }
        // trabajamos con arreglos en la sintaxis resumida
        String frutas[] = {"Banana","Pera","Durazno"};
        for (int i = 0; i < frutas.length; i++){
            System.out.println("frutas "+i+" =" + frutas[i]);
        }
    }

}
