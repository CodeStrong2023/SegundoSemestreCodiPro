/*
 * boton derecho-Run file
marcamos un punto de ruptura y el boton derecho-Debug file
Seleccion+boton derecho-New watch
boton F8 para avanzar
detener con shift+5
crtl+shift+n: para hacer new Project

 * ciclo while y do while: mientras que y repetir hasta que
son similares cambia el orden en que se ejecuta las lineas de codigo
 * do while: ejecuta primero el codigo y luego revisa la condicion y
al menos una vez se ejecuta su codigo y
si la condicion es verdadera vuelve a repetir hasta que sea falsa y
sale del ciclo
 * while: primero esta la condicion, sino se cumple, jamas se accede al codigo 
del ciclo
la condicion se ejecuta mientras sea verdadera va a volver a ejecutarla hasta 
la condicion sea falsa y termina la repeticion del ciclo

 * ciclo for: maneja un n° determinado de iteraciones
diferencia con ciclo while y do while: que manejan un n°indeterminado de 
iteraciones
condicion que se debe revisar: si es verdadera se ejecuta dentro del ciclo y
si es falsa no se ejecuta nada dentro del ciclo
cuando la condicion se cumple comienza un incremento o decremento hasta que la 
condicion no sea falsa y salga del ciclo
for( ; ; ){  // 3 lugares: 
1- contador o iterador, se declara-crea la variable
se puede usar inferencia de tipos
se puede ver asi: int i = 0 / var contando = 0
2- condicion a cumplir
se puede poner: contando < 7
3-es para el incremento o decremento del contador, iterador o variable que 
estemos usando
con ciclo for: se puede recorrer arreglos, matrices incrementando o 
decrementando siempre y cuando se cumpla la condicion
 */

/*        
 * @Adry-Balmaceda
 */
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[]args){
        var conteo = 0; // Inferencia de Tipos          
        while (conteo < 3){  // <=3 para que muestre 3
            System.out.println("conteo = " + conteo);
            conteo++; // Aumentamos en 1 la variable
        }
        var contador = 0; // Pasos para hacer un ciclo do while
        do{
            System.out.println("contador = " + contador); // Si la condición es verdadera vuelve a ejecutarse
            contador++;
        }while(contador <= 7);  // Todo esto es el ciclo do while
        
        //Comparacion con el ciclo for
        for(var contando = 0; contando <= 7; contando++){  // <7 muestra hasta 6
            System.out.println("contando = " + contando);            
        }
    }
}
