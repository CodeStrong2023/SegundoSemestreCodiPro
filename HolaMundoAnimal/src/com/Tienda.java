package com;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    String nombre;
    String banner;
    List<IProducto> productos = new ArrayList<>();

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.setBanner(nombre);
    }

    public void setBanner(String nombre) {

        int maxima_longitud = 80;

        String mensaje = "¡Bienvenido a " + nombre + "!";

        int lados = maxima_longitud - mensaje.length() - 1;

        this.banner = "%".repeat(maxima_longitud) + "\n";
        this.banner += "%".repeat(((int) lados / 2));
        this.banner += " " + mensaje + " ";
        this.banner += "%".repeat(((int) lados / 2)) + "\n";
        this.banner += "%".repeat(maxima_longitud);

    }

    public void showBanner() {
        System.out.println(this.banner);
    }

    public void mostrarProductos() {

        for (int index = 0; index < this.productos.size(); index++) {
            IProducto producto = this.productos.get(index);
            System.out.println(index + ". " + producto.obtenerNombre() + " ($" + producto.obtenerPrecio() + ")");
        }

    }

    public void registrar_productos(IProducto[] productos) {
        for (IProducto producto : productos) {
            this.productos.add(producto);
        }
    }

}
