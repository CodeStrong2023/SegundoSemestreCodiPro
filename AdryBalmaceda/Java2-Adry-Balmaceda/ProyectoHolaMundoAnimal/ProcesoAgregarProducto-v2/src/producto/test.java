/*
 * Test Subprocesos: 
agregarProducto
precio_del_producto 
mostrarProducto
 */
package producto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class test {

    public static void main(String[] args) {
        //1.Llenar matriz de productos
        String[][] matrizProductos = new String[1][6];

        matrizProductos[0][0] = "1. Kit descanso perro chico $3000";
        matrizProductos[0][1] = "2. Kit descanso perro grande $3500";
        matrizProductos[0][2] = "3. Kit baño perro chico $4000";
        matrizProductos[0][3] = "4. Kit baño perro grande $4500";
        matrizProductos[0][4] = "5. Kit paseo perro chico $5000";
        matrizProductos[0][5] = "6. Kit paseo perro grande $5500";

        int producto = agregarProducto(matrizProductos);

        if (producto > 0) {

            System.out.println("El precio del producto es de $" + producto);
        } else {
            System.out.println("No se puede calcular el precio del producto. \nComuníquese con Atención al cliente.");
        }

    }

    public static int agregarProducto(String[][] matrizProductos) {
        Scanner scanner = new Scanner(System.in);
        int precio = 0;
        boolean codigop = false;
        int preciop;
        String nombre;

        // 2.Inicializar matrizP
        StringBuilder matrizP = new StringBuilder();
        for (int i = 0; i < matrizProductos.length; i++) {
            for (int j = 0; j < matrizProductos[i].length; j++) {
                matrizP.append(matrizProductos[i][j]).append("\n ");
            }
            matrizP.append("\n");
        }

        //3.Mostrar la matriz. 
        //Usar JOptionPane para visualizar los productos disponibles y su precio
        JOptionPane.showMessageDialog(null, "Gracias por visitar HOLA MUNDO ANIMAL \nSeleccione el CÓDIGO del producto que desea: \n" + matrizP.toString());

        //4.Ciclo While para solicitar el producto y asignar el precio correspondiente
        while (!codigop) {
            System.out.print("Digite el CÓDIGO del producto que desea: ");
            int producto = scanner.nextInt();

            int precio_del_producto = -1;

            switch (producto) {
                case 1 -> {
                    precio_del_producto = 3000;
                    System.out.println("Kit: Cama chica, manta chica, ropa");
                }
                case 2 -> {
                    precio_del_producto = 3500;
                    System.out.println("Kit: Cama grande, manta grande, ropa");
                }
                case 3 -> {
                    precio_del_producto = 4000;
                    System.out.println("Kit: Shampoo, cepillo, toalla chica");
                }
                case 4 -> {
                    precio_del_producto = 4500;
                    System.out.println("Kit: Shampoo, cepillo, toalla grande");
                }
                case 5 -> {
                    precio_del_producto = 5000;
                    System.out.println("kit: correa, pretal chico, porta bolsa para juntar heces");
                }
                case 6 -> {
                    precio_del_producto = 5500;
                    System.out.println("kit: correa, pretal chico, porta bolsa para juntar heces");
                }
            }

            if (precio_del_producto >= 0) {
                System.out.println("El PRECIO del producto es de $" + precio_del_producto);
                precio = precio_del_producto;
                codigop = true;
            } else {
                System.out.print("Producto no registrado, ingrese otro CÓDIGO");
                System.out.print("\nDigite (S/N) para continuar con la compra del producto: ");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("S")) {
                    System.out.println("Comuníquese con Atención al cliente o reingrese nuevamente el CÓDIGO del producto");
                    break;
                }
            }
        }
        System.out.println(" ");
        if (codigop) {
            System.out.println("A continuación ingrese sus DATOS para confirmar la compra del producto");
            System.out.print("Digite su NOMBRE y APELLIDO: ");
            scanner.nextLine();
            nombre = scanner.nextLine();
            JOptionPane.showMessageDialog(null, "DATOS ingresados:\n " + nombre);
            System.out.print("Confirme los DATOS ingresados: " + nombre + "\n¿Es correcto? S/N: \nSi NO es correcto ingrese sus datos nuevamente, \nSino presione ENTER: ");
            nombre = scanner.nextLine();
            JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS " + nombre + "\nLe invitamos a continuar el proceso de PAGO");
        }
        return precio;
    }
}
