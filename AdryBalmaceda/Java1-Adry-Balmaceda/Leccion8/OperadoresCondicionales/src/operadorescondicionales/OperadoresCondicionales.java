/*
 * Operadores condicionales
 */
package operadorescondicionales;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class OperadoresCondicionales {

    public static void main(String[] args) {

        var valorA = 7;
        var valorMinimo = 0; // rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10; // guardamos en respuesta un valor de tipo booleano

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) { // operador condicional or
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asistir al juego de su hijo");
        }
    }

}
