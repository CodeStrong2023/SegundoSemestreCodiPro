/*
 *Clase 7: Operadores
 */
package operadoresaritmeticos;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int num1 = 5, num2 = 4;
// no se puede hacer con inferencia de tipos porque hay 2 lineas
/* inferencia seria var num1= 5;  var num2 = 4; las variables tienen que estar 
por separado para hacer inferencia
         */
        // suma
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);

        // resta
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        // multiplicacion
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);

        // division
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);

        // debido a que el dato es tipo flotante hacemos inferencia
        // tipo flotante no es lo mismo que tipo float
        // flotante significa que es un numero con decimal
        // float o double son tipos en Java, no son lo mismo
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);

        // modulo: guarda el residuo entero de la division
        solucion = num1 % num2;
        System.out.println("solucion = " + solucion); // 5/4

        // par o impar
        // no usamos llaves porque hacemos una sola linea de codigo en if y else
        // si hago mas lineas hay que usar llaves {}
        if (num1 % 2 == 0) {
            System.out.println("num1 es un numero Par");
        } else {
            System.out.println("num1 es un numero Impar");
        }

        if (num2 % 2 == 0) {
            System.out.println("num2 es un numero Par");
        } else {
            System.out.println("num2 es un numero Impar");
        }

        // Operador asignacion
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;
        // Operacion, calculo de izq a der, compilador evalua el dato que esta a la der
        //signo igual es un operador de asignacion, pero hay otros
        System.out.println("varNum3 = " + varNum3);

        //operador de composicion
        varNum1 += 1; // es igual a varNum1 = varNum1 +1;
        System.out.println("varNum1 = " + varNum1);

        // -=   *=  /=  %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);

    }

}
