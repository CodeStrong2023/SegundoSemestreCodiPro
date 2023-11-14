/*
 * Matrices:: arreglo de arreglo que tiene renglones y columnas
o filas y columnas, se pueden llenar con tipos primitivos o
tipo object
sintaxis: [fila][columna]

 *clic der+properties+run: seleccionar main TesMatrices para ejecutar
 *for+tab: y se genera la sintaxis
 */
package test;

import domain.Persona;

/*
 * @Adrybalmaceda
 */
public class TestMatrices {

    public static void main(String[] args) {
        // 1. Definicion e instanciado    
        int edades[][] = new int[3][2];  // lado izq: definicion de la matriz // lado der: instanciar le decimos cuantas [filas] [columnas]
        System.out.println("edades = " + edades);  //asi mostramos su espacio de memoria
        // 2. Modificar valores, llenado manual
        edades[0][0] = 5;
        edades[0][1] = 7;  // es diferente columna 
        edades[1][1] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;  // tarea
        edades[2][1] = 9;

        // Tarea: llenar los que faltan e imprimirlos
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);  // tarea
        System.out.println("edades 2-1 = " + edades[2][1]);
        // 3. Iterar elementos: for+tab
        System.out.println("Recorremos la matriz a traves del ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }
        }
        // 4. Tipos de Sintaxis
        // Sintaxis clasica
        // String frutas[][] = new String[3][2];

        // Sintaxis simplificada
//        String frutas[][] = {{"Limon", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
//        imprimir(frutas);
//        System.out.println("Ejemplo de matriz con sintaxis simplificada");
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j]);
//            }
//        }
        // 5. Matriz de objetos
        // Crear matriz
//        Persona personas[][] = new Persona[2][3];
//        // Asignar valores a la matriz
//        // Asignacion de forma manual, instanciar
//        personas[0][0] = new Persona("Axel");
//        personas[0][1] = new Persona("Olga");  // Tarea: completar los elementos de la matriz
//        personas[0][2] = new Persona("Patricia");  // tarea
//        personas[1][0] = new Persona("Miriam");
//        personas[1][1] = new Persona("Alberto");
//        personas[1][2] = new Persona("Juan");
//        imprimir(personas);  // llamamos al metodo tipo object
//    }
        // Crear un metodo: tipo object
//    public static void imprimir(Object matriz[][]) {  // Object matriz[][] es como definir la variable del lado izquierdo, apunta a la referencia del objeto matriz
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);
////            }
//        }
    }// LLamar a este metodo: para eso comentamos el ciclo for de matriz frutas para comprobar que funciona bien

}
