/*
Proyecto caja: 
Ejercicio 1: Crear un proyecto según las especificaciones
mostradas a continuación.
La fórmula es: volumen = ancho * alto * profundidad
*/
package caja;


public class PruebaCaja {
    public static void main(String[] args) {
        
        Caja caja1 = new Caja(); //Constructor vacio
        caja1.ancho = 3; //Le pasamos los valores
        caja1.alto = 4;
        caja1.prof = 6;
        int resultado = caja1.calcularVolumen();
        //Primer resultado
        System.out.println("Resultado caja1 = "+resultado);
        
        Caja caja2 = new Caja(2,4,6); //Llamamos al constructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al método para un nuevo cálculo
        System.out.println("Resultado caja2 = "+caja2.calcularVolumen());
        
        
    }
    
    
}
