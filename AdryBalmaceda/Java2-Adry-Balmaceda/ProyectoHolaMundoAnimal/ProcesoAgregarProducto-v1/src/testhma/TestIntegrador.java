/*
 *Test: con errores
 */
package testhma;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class TestIntegrador {
    //Inicio de sistema de envio
    public static void main(String[] args) {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%% BIENVENIDOS AL SISTEMA DE PAGO DE LA PAGINA %%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% HOLA MUNDO ANIMAL %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Proceso envío
        int[][] matriz = new int[3][3]; //Llenamos la matriz con los codigos postales de las localidades de Mendoza

        matriz[0][0] = 5515;
        matriz[0][1] = 5521;
        matriz[0][2] = 5501;
        matriz[1][0] = 5500;
        matriz[1][1] = 5539;
        matriz[1][2] = 5507;
        matriz[2][0] = 5600;
        matriz[2][1] = 5613;
        matriz[2][2] = 5620;
        int costoDeEnvio = elegirCodigoPostal(matriz);

        String[][] matrizProductos = new String[1][6];
        matrizProductos[0][0] = "1. Kit descanso perro chico $3000";
        matrizProductos[0][1] = "2. Kit descanso perro grande $3500";
        matrizProductos[0][2] = "3. Kit baño perro chico $4000";
        matrizProductos[0][3] = "4. Kit baño perro grande $4500";
        matrizProductos[0][4] = "5. Kit paseo perro chico $5000";
        matrizProductos[0][5] = "6. Kit paseo perro grande $5500";

        int precio_del_producto = agregarProducto(matrizProductos);

        validarTarjetaDebito(costoDeEnvio, precio_del_producto);
    }

    public static int elegirCodigoPostal(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int costoDeEnvio = 0;
        boolean postal = false;
        String direc;

        // Inicializamos la matriz
        StringBuilder matrizTexto = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTexto.append(matriz[i][j]).append(" ");
            }
            matrizTexto.append("\n");
        }
        //Mostramos la matriz con JOption Pane para que sea mas facil para el usuario encontrar su CP
        JOptionPane.showMessageDialog(null, "A continuación vera las opciones de entrega a domicilio que tenemos para ofrecer dentro de Mendoza\nPedidos a domicilio solo a las siguientes zonas:\n" + matrizTexto.toString());
        //Con el ciclo While solicitamos el CP y asignamos el precio correspondente a cada uno
        while (!postal) {
            System.out.print("Digite el código postal al que quiere recibir su pedido: ");
            int codigo = scanner.nextInt();

            int nuevoCosto = -1;

            switch (codigo) {
                case 5515 -> {
                    nuevoCosto = 1000;
                    System.out.println("El codigo postal ingresado corresponde a Maipu");
                }
                case 5521 -> {
                    nuevoCosto = 1200;
                    System.out.println("El codigo postal ingresado corresponde a Guaymallen");

                }
                case 5501 -> {
                    nuevoCosto = 1300;
                    System.out.println("El codigo postal ingresado corresponde a Godoy Cruz");
                }
                case 5500 -> {
                    nuevoCosto = 1400;
                    System.out.println("El codigo postal ingresado corresponde a Menddoza");
                }
                case 5539 -> {
                    nuevoCosto = 1550;
                    System.out.println("El codigo postal ingresado corresponde a Las Heras");
                }
                case 5507 -> {
                    nuevoCosto = 1700;
                    System.out.println("El codigo postal ingresado corresponde a Lujan De Cuyo");
                }
                case 5600,5613,5620 -> {
                    System.out.println("Las zonas de San Rafael, Malargue y General Alvear no tienen costo agregado de entrega :) ");
                    nuevoCosto = 0;
                }
            }

            if (nuevoCosto >= 0) {
                System.out.println("El costo de envío es de $" + nuevoCosto);
                costoDeEnvio = nuevoCosto;
                postal = true;
            } else {
                System.out.print("El código postal que indicó no está dentro de nuestras zonas de envíos a Domicilio");
                System.out.print("\n¿Desea volver a intentar? (S/N): ");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("S")) {
                    System.out.println("Lo invitamos a visitar la sucursal de forma presencial y ser atendido por nuestro personal.");
                    break;
                }
            }
        }
        if (postal) {
            System.out.println("Perfecto, digite su calle, dirección y el envío llega en las primeras 24 horas desde que usted realiza el pago");
            System.out.print("Digite su dirección: ");
            scanner.nextLine();
            direc = scanner.nextLine();
            System.out.println("Usted ingresó la siguiente dirección: " + direc);
            System.out.print("Confirme si la dirección ingresada es correcta o no: ");
            direc = scanner.nextLine();
            System.out.print("Sí ingresó mal la dirección, vuelva a ingresarla, de lo contrario presione ENTER: ");
            direc = scanner.nextLine();
        }

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

        return costoDeEnvio;
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

    public static void validarTarjetaDebito(int costoDeEnvio, int precio_del_producto) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Recuerde que solo puede pagar con tarjeta de débito");
        double precioFinal = costoDeEnvio + precio_del_producto;
        System.out.println("El monto total a pagar es: " + precioFinal);

        String numeroTarjeta;
        int longTarjeta;
        String codigoSeguridad;
        int longCodigo;

        do {
            System.out.println("Ingrese el número de su tarjeta de débito (deben ser 16 dígitos): ");
            numeroTarjeta = scanner.next();
            longTarjeta = numeroTarjeta.length();
            if (longTarjeta != 16) {
                System.out.println("El número de la tarjeta debe contener exactamente 16 dígitos. Intente nuevamente");
            }
        } while (longTarjeta != 16);
        System.out.println("El número de la tarjeta es válido");

        do {
            System.out.println("Ingrese el código de seguridad de su tarjeta (son los 3 dígitos que se encuentran en la parte posterior de su tarjeta):");
            codigoSeguridad = scanner.next();
            longCodigo = codigoSeguridad.length();
            if (longCodigo != 3) {
                System.out.println("El código de seguridad es incorrecto, ingréselo nuevamente: ");
            }
        } while (longCodigo != 3);
        System.out.println("El codigo ingresado es válido");
    }
}


