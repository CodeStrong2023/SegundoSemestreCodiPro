/*
Leccion 5: Inferencia de tipos var y tipos primitivos
 */
package inferencia;

/**
 *
 * @author Adriana
 */
public class Inferencia {

    public static void main(String[] args) {
        // Inferencia de tipos var
        //ponemos un punto de ruptura, corta la ejecucion
        var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        //seleccionamos ejecucion paso a paso :Debug file
        //con F8 vamos pasando las filas paso a paso para ver la inferencia
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //con el punto se transforma en tipo double
        // ponemos la F para que no sea float
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
    }
    
}
