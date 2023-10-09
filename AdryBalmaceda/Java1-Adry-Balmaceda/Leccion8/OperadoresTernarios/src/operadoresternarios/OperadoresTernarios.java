/*
 * Operadores ternarios
 */
package operadoresternarios;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class OperadoresTernarios {

    public static void main(String[] args) {

        // se recomienda hacer con expresiones sencillas
        // muy eficaz para simplificar un algoritmo
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        // evalua la parte derecho, con la inferencia de tipos asigna el tipo que corresponda
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 4; //con la inferencia de tipos creamos una variable numeroT, le asignamos el valor de 7, va a ser de tipo int
        // reutilizamos la variable inicializada anteriormente
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);
    }

}
