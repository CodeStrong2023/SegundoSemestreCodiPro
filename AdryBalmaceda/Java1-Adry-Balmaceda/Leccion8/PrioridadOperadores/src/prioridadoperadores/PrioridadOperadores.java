/*
 * Prioridad operadores
 */
package prioridadoperadores;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class PrioridadOperadores {

    public static void main(String[] args) {
        
        var x = 5; // la asignacion de una variable, evalua la parte der primero, con la inferencia de tipos se le asigna un tipo int
        var y = 10;
        var z = ++x + y--; // las expresiones se evaluan de izq a der, NO la asignacion de una variable
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + (5  * 6) / 3 = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
    
}
