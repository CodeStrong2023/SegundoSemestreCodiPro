
package pago;

import java.util.Scanner;

/**
 *
 * @author yami
 */
public class Pago{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         validarTarjetaDebito();
    }
    


public static void validarTarjetaDebito() {
        Scanner scanner = new Scanner(System.in);
        double precioe = 100.0;  // Supongamos un valor para precioe
        double preciop = 50.0;   // Supongamos un valor para preciop

        System.out.println("Recuerde que solo puede pagar con tarjeta de débito");
        double precioFinal = precioe + preciop;
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
