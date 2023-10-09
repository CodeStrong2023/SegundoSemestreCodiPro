/*
Lección 6: Conversión de Tipos Primitivos
 */
package conversiontipoprimitivo;

import java.util.Scanner;

/*
******* @author Adriana ******
 */
public class ConversionTipoPrimitivo {

    public static void main(String[] args) {
        //Caso de inferencia de tipos
        var edad = Integer.parseInt("20");
        /*para convertir un dato de tipo 
        string a un dato de tipo entero*/
        //recibe el valor de una cadena para convertirlo en tipo entero
        //se regresa y se asigna a la variable de tipo entero
        //si quitamos las comillas dará error
        System.out.println("edad = " + edad);
        System.out.println("edad = " + (edad + 1));
        /*la inferencia de tipos 
        será sobre un tipo entero y no sobre un tipo string*/

        //Caso de concatenación
        var edad1 = "20";
        System.out.println("edad = " + (edad1 + 1));
        /*concatenación 20 con 1,
        la literal pasa a ser parte de esa cadena*/

        //Clase double inferencia de tipos
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        /*utilizar punto de ruptura en linea 27 y ejecutamos paso a paso con
        debug file*/
        //con F8 vamos avanzando y lo vemos en la ejecución

        //Pedir un valor al usuario 
        var edad2 = 0;
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad2 = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad2);
        
        
    }

}
