
package test;

import operaciones.Operaciones;

/*
 * @Yami
 */
public class TestOperaciones {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(17, 19);
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(5.5, 9);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(4, 6L); 
        System.out.println("resultado3 = " + resultado3);
    }

}
