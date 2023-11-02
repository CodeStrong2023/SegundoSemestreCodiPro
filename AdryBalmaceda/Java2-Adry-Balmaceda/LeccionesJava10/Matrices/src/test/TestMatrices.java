/*
 * Matrices:: arreglo de arreglo que tiene renglones y columnas
o filas y columnas, se pueden llenar con tipos primitivos o
tipo object
sintaxis: [fila][columna]

 *clic der+properties+run: seleccionar main TesMatrices para ejecutar
 *for+tab: y se genera la sintaxis
 */
package test;

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

    }

}
