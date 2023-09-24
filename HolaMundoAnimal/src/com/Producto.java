package com;

public class Producto implements IProducto {

    private String nombre;
    private String detalle;
    private int precio;

    public Producto definirNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Producto definirDetalle(String detalle) {
        this.detalle = detalle;
        return this;
    }

    public Producto definirPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerDetalle() {
        return this.detalle;
    }

    public int obtenerPrecio() {
        return this.precio;
    }
}
