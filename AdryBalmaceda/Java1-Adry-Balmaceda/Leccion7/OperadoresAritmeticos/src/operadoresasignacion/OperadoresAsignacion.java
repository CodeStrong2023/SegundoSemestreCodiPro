/*
 * Clase 7
 */
package operadoresasignacion;

/**
 ******* @author AdrianaBalmaceda ******
 */
public class OperadoresAsignacion {

    public static void main(String[] args) {
        int varNum1 = 1, varNum2 = 4;
        /*el resultado de la expresion se asigna en varNum3
         *las igualaciones del compilador van de der a izq
         *hace el calculo que lo asigna a la varNum3
         *el calculo suma y resta son de la misma prioridad por lo tanto lo hara
          de izq de der
         *signo = es operador de asignacion
         */
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        //operador de composicion para sumarle el valor a la misma variable
        //+=
        varNum1 += 1; // es lo mismo que varNum1 = varNum1 +1;
        System.out.println("Test suma: varNum1 = " + varNum1);
        
        // -=
        varNum2 -= 2;
        System.out.println("Test resta: varNum2 = " + varNum2);

        // *=
        varNum1 *= 5;
        System.out.println("Test multiplicacion: varNum1 = " + varNum1);
        
        // /=
        varNum3 /= 4;
        System.out.println("Test division: varNum3 = " + varNum3);
        
        // %=
        varNum1 %= 6;
        System.out.println("Test modulo: varNum1 = " + varNum1);
    }

}
