/*
 * Test: da errores
 */
package testhma;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @Adrybalmaceda
 */
public class TestIntegrador3 {
    //Inicio de sistema de envio

    public static void main(String[] args) {

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"
                + "%%%%%%%%%%%%%%%%%%%%%%%%%% BIENVENIDOS AL SISTEMA DE PAGO DE LA PAGINA %%%%%%%%%%%%%%%%%%%%%%%%%%"
                + "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% HOLA MUNDO ANIMAL %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"
                + "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

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
        int costoDeEnvio = scanner.hashCode();
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

        //Con el ciclo While solicitamos el CP y asignamos el precio correspondente a cada uno
        while (!postal) {
            String codigoStr = JOptionPane.showInputDialog("Digite el código postal al que quiere recibir su pedido: \n" + matrizTexto.toString());
            int nuevoCosto = -1;
            //Si se presiona cancelar en el cuadro de diálogo
            if (codigoStr == null) {
                mostrarMensajeDespedida();
            }

            int codigo = Integer.parseInt(codigoStr);

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
                    System.out.println("El codigo postal ingresado corresponde a Mendoza");
                }
                case 5539 -> {
                    nuevoCosto = 1550;
                    System.out.println("El codigo postal ingresado corresponde a Las Heras");
                }
                case 5507 -> {
                    nuevoCosto = 1700;
                    System.out.println("El codigo postal ingresado corresponde a Lujan De Cuyo");
                }
                case 5600, 5613, 5620 -> {
                    nuevoCosto = 0;
                    System.out.println("Las zonas de San Rafael, Malargue y General Alvear no tienen costo agregado de entrega :) ");
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

                }
            }
        }
        if (postal) {
            System.out.println("Perfecto, digite su calle, dirección y el envío llega en las primeras 24 horas desde que usted realiza el pago");
            System.out.print("Digite su dirección: ");
            direc = scanner.nextLine();
            System.out.println("Usted ingresó la siguiente dirección: " + direc);
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
        int precio_del_producto = producto;
        validarTarjetaDebito(costoDeEnvio, precio_del_producto);

        if (producto > 0) {

            System.out.println("El costo del producto es de $ " + producto + " Ingrese otro CÓDIGO de la LISTA");
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
        for (String[] matrizProducto : matrizProductos) {
            for (String matrizProducto1 : matrizProducto) {
                matrizP.append(matrizProducto1).append("\n ");
            }
            matrizP.append("\n");

        }

        //4.Ciclo While para solicitar el producto y asignar el precio correspondiente
        while (!codigop) {

            String productoStr = JOptionPane.showInputDialog("Digite el CÓDIGO del producto que desea: \n" + matrizP.toString());
            int precio_del_producto = 0;
            //Si se presiona cancelar en el cuadro de diálogo
            if (productoStr == null) {
                mostrarMensajeDespedida();
            }

            int producto = Integer.parseInt(productoStr);

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
            //scanner.nextLine();
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
        int mes, anio;

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

        do {
            System.out.println("Ingrese el mes de vencimiento de su tarjeta(MM): ");
            mes = scanner.nextInt();
            System.out.println("Ingrese el año de vencimiento de su tarjeta en formato(AA): ");
            anio = scanner.nextInt();
            if (mes >= 1 && mes <= 12 && anio >= 24 && anio <= 99) {
                System.out.println("La fecha de vencimiento es válida");
                break;
            } else {
                System.out.println("La fecha de vencimiento NO es válida, intente nuevamente");
                System.out.println("Ingrese el mes de vencimiento de su tarjeta(MM): ");
                mes = scanner.nextInt();
                System.out.println("Ingrese el año de vencimiento de su tarjeta en formato (AA): ");
                anio = scanner.nextInt();
                System.out.println("Ahora sí, es correcto");
                break;
            }
        } while (mes >= 1 && mes <= 12 && anio >= 24 && anio <= 99);
        System.out.println("Finalizado, pago realizado exitosamente ¡Gracias por su compra!");
    }

    private static void mostrarMensajeDespedida() {
        JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el sistema! ¡Hasta luego!");
    }
}
