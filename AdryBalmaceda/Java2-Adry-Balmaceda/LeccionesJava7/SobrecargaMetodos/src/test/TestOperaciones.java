/*
 * el metodo busca segun la jerarquia de clases el que sea compatible
 */
package test;

import operaciones.Operaciones;

/*
 * @Adrybalmaceda
 */
public class TestOperaciones {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(5.0, 7);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(8, 6L); // busca el metodo double porque es mas grande y compatible y que acepte el tipo long
        System.out.println("resultado3 = " + resultado3);
    }

}
