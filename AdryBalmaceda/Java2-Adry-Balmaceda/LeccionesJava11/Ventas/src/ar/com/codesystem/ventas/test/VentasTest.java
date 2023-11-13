/*
 * Test
 */
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;  //asterisco para importar todas

/*
 * @Adrybalmaceda
 */
public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 20500.00);
        Producto producto2 = new Producto("Campera", 50900.00);
        Producto producto3 = new Producto("Camiseta", 10900.00);
        Producto producto4 = new Producto("Bolso", 30900.00);
        Producto producto5 = new Producto("Bufanda", 10900.00);
        Producto producto6 = new Producto("Pullover", 40500.00);
        Producto producto7 = new Producto("Gorra", 15900.00);
        Producto producto8 = new Producto("Falda", 19900.00);
        Producto producto9 = new Producto("Blusa", 25500.00);
        Producto producto10 = new Producto("Camisa", 20900.00);

        Orden orden1 = new Orden();
        //Agregar productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        

        //Mostrar orden
        orden1.mostrarOrden();

        //Tarea:
        //Crear mas objetos de tipo Producto
        //Crear mas objetosd de tipo Orden
    }
}
