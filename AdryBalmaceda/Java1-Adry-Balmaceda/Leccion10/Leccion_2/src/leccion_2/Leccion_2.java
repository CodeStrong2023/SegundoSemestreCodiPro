/*
 * Sentencia de Control If else
 */
package leccion_2;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class Leccion_2 {

    public static void main(String[] args) {

        var condicion = false; // variable tipo booleana, usando la inferencia de tipo
        if (condicion) {
            System.out.println("Condicion verdadera"); // Condicional simple
        } else {
            System.out.println("Condicion falsa"); // Condicional doble porque estamos usando los dos bloques If else
        }
        var numero = 2; //con la inferencia de tipos comenzamos poniendo el numero dos en codigo duro y probamos otros numeros
        var numeroTexto = "Numero desconocido"; //inicializamos con una cadena
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) { 
// con este tipo de estructura no ingresan los demas, asi el compilador trabaja menos y es más eficaz nuestro codigo
            numeroTexto = "Numero dos";

        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado"; //podemos probar comentar el else y ejecutaria como numero desconocido
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
