/*
Lección 6: Conversión de Tipos Primitivos 2
 */
package conversiontipoprimitivo;

import java.util.Scanner;

/**
 ******* @author AdrianaBalmaceda ******
 */
public class ConversionTipoPrimitivo2 {
    public static void main(String[] args) {
        //Conversion a String
        var edadTexto = String.valueOf(10); //para el compilador es una cadena
        System.out.println("edadTexto = " + edadTexto);

        //Metodo charAt conversion a tipo char
        //En parentesis ponemos el indice a mostrar posiciones en la cadena
        //Ejecutar paso a paso con Debug File y F8 para paso
        var fraseChar = "programadores".charAt(12); //el 0 muestra p y 12 muestra s
        System.out.println("fraseChar = " + fraseChar);

        var entrada = new Scanner(System.in);
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        //Metodo nexLine recupera cadenas
        //Si digito una cadena mostrara el caracter del indice
        //Si digito un numero lo muestra como caracter no como entero
        System.out.println("fraseChar = " + fraseChar);

    }
}
