/*
 * Proyecto Ventas
 */
package ar.com.codesystem.ventas;  //Dominio

/*
 * @Adrybalmaceda
 */
public class Orden {

    //Atributos
    private int idOrden;
    private Producto productos[];  //Declarar arreglo vacio
    private static int contadorOrdenes; //Variable estatica
    private int contadorProductos;  //NO es estatica
    private static final int MAX_PRODUCTOS = 10;  //Constante: final (MAYUSCULAS_)

    //Constructor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;  //Para dar un id diferente a cada orden
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; //Para no superar max. 10 productos
    }

    //Metodo que combina la clase Orden con la clase Producto
    public void agregarProducto(Producto producto) {  //Metodo con parametros
        //Comprobaciones con if
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {  //Validacion
            this.productos[contadorProductos++] = producto;  //Si cumple se asigna el producto
        } else {  //si no se cumple damos un mensaje, la lista no podrá superar los 10 productos
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    //Metodo donde vamos a iterar los elementos del arreglo de aquellos elementos cuyo valor no es nulo 
    //y ya han sido cargados y los lugares que estan vacios estan en null
    public double calcularTotal() {  //Este metodo necesita retornar si no daria error, con este recorremos el array
        //Crear variable
        double total = 0;  //inicializar en 0 es una variable temporal
        for (int i = 0; i < contadorProductos; i++) {
            //Producto producto =this.productos[i];  
            //total+=producto.getPrecio();
            total += this.productos[i].getPrecio();  //comentar las 2 lineas anteriores porque este las reemplaza en una linea
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Orden: " + idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es: ~$" + totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
