/*
 * 
 */
package ar.com.codesystem.ventas;  //nombre DEL DOMINIO EN reverso

/*
 * @Adrybalmaceda
 */
public class Producto {

    //Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor vacio
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    //Constructor que llama al constructor vacio
    public Producto (String nombre, double precio){
        this(); //llamamos al constructor vacio para el aumento de idProducto
        this.nombre=nombre;
        this.precio=precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

//no necesitamos setIdeProducto porque trabajaremos a traves de los otros 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
