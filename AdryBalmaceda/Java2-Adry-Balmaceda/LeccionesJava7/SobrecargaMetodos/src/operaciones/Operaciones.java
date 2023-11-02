/*
 * 
 */
package operaciones;

/*
 * @Adrybalmaceda
 */
public class Operaciones {

    public static int sumar(int a, int b) {
        System.out.println("Metodo para sumar enteros");
        return a + b;
    }

    // tipo de retorno puede variar
    public static double sumar(double a, double b) {  // si el 1ro es public el siguiente tambien
        System.out.println("Metodo para sumar double");
        return a + b;
    }
}
