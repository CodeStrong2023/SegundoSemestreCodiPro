package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500);
        Producto producto2 = new Producto("Campera", 29900);
        Producto producto3 = new Producto("Camisa", 10000);
        Producto producto4 = new Producto("Gorra", 5000);
        Producto producto5 = new Producto("Pantalón de gimnasia", 9000);
        Producto producto6 = new Producto("Short", 8000);
        Producto producto7 = new Producto("Pijama", 10500);
        Producto producto8 = new Producto("Lentes de sol", 2000);
        Producto producto9 = new Producto("Remera 3/4", 15000);
        Producto producto10 = new Producto("Blazer", 25000);
        
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        Orden orden3 = new Orden();        
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        
        //Tarea:
        //Crear más objetos de tipo Producto = 10
        //Crear más objetos de tipo Orden = 2
    }
}
