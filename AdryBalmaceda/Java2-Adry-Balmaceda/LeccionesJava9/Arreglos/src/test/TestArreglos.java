/*
 * Arreglos: se utiliza la palabra reservada new porque los
arreglos son un tipo object, o sea que hereda de la clase object
 * Uso de corchetes: se pueden escribir adelante de la variables
y tambien de forma separada ejemplo:
int [] edades
int edades []
int edades[] = esta seria la forma mas comun
 * Declaracion de variable: va en el lado izq
 * Instanciar un arreglo: va en el lado der (un objeto tipo object)
 */
package test;

/*
 * @Adrybalmaceda
 */
public class TestArreglos { 
    public static void main(String[] args) {
        int edades[] = new int[3];  // no se puede cambiar cantidad de elementos de manera dinamica
        System.out.println("edades = " + edades);  // mostramos el espacio de memoria
        
        // Modificar elementos del arrego, 1 o varios, la cantidad de elementos no se puede modificar
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        // Tarea
        edades[1] = 4;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 71;
        System.out.println("edades 2 = " + edades[2]);
        
        // elemento fuera de la cantidad
        //edades[3] = 7;  //no se vera error de compilacion pero dara error en tiempo de ejecucion
        
        // Iteracion con for
        for(int i = 0; i < edades.length; i++){  // el arreglo hereda de clase object propiedades como length
            System.out.println("edades y sus elementos "+i+": "+edades[i]);
        }
    }
}
