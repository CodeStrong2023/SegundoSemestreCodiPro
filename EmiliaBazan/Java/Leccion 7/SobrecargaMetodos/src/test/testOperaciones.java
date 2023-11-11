package test;

import operaciones.Operaciones;

public class testOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7,9);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.4,4);
        System.out.println("resultado2 = " + resultado2);
        
        var resultad3 = Operaciones.sumar(8, 6L);
        System.out.println("resultad3 = " + resultad3);
    }
  
}
