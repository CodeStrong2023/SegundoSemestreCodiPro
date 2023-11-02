/*
 * ctrl+clic izquierdo: nos lleva desde la sintaxis hacia donde viene
 */
package test;

// import ar.com.codesystem  // (1)
import ar.com.codesystem.Utileria;  // sintaxis (1)
//import static ar.com.codesystem.Utileria.imprimir;  // (2)solo para aplicaciones de metodos estaticos


/*
 * @Adrybalmaceda
 */
public class TestUtileria {

    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los profesores de la UTN");  // sintaxis (1)
        // imprimir("Terminamos en unos minutos"); // sintaxis (2)
        // ar.com.codesystem.Utileria.imprimir("Ahora si estamos terminando");  // (3)no es recomendable, lo recomendable es importar de manera normal o estatica
    }
}
