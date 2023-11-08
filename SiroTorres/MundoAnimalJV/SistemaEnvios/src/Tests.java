//Seccion en la que pruebo distintas formas de abordar el codigo para luego agregarlo al codigo final.
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tests{

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        matriz[0][0] = 5515;
        matriz[0][1] = 5521;
        matriz[0][2] = 5501;
        matriz[1][0] = 5500;
        matriz[1][1] = 5539;
        matriz[1][2] = 5507;
        matriz[2][0] = 5600;
        matriz[2][1] = 5613;
        matriz[2][2] = 5620;
        
        int costo = elegirCodigoPostal(matriz);
        
        if (costo > 0) {
            System.out.println("El costo de envío es de $" + costo);
        } else {
            System.out.println("No se pudo calcular el costo de envío. Revise el código postal ingresado.");
        }
    }

    public static int elegirCodigoPostal(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int costoDeEnvio = 0;
        boolean postal = false;
        String direc;

        StringBuilder matrizTexto = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTexto.append(matriz[i][j]).append(" ");
            }
            matrizTexto.append("\n");
        }

        JOptionPane.showMessageDialog(null, "A continuación verá las opciones de entrega a domicilio que tenemos para ofrecer dentro de Mendoza\nPedidos a domicilio solo a las siguientes zonas:\n" + matrizTexto.toString());

        while (!postal) {
            System.out.print("Digite el código postal al que quiere recibir su pedido: ");
            int codigo = scanner.nextInt();

            int nuevoCosto = -1;

            switch (codigo) {
                case 5515 -> {
                    nuevoCosto = 1000;
                }
                case 5521 -> {
                    nuevoCosto = 1200;
                }
                case 5501 -> {
                    nuevoCosto = 1300;
                }
                case 5500 -> {
                    nuevoCosto = 1400;
                }
                case 5539 -> {
                    nuevoCosto = 1550;
                }
                case 5507 -> {
                    nuevoCosto = 1700;
                }
                case 5600, 5613, 5620 -> {
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
                    System.out.println("Lo invitamos a visitar la sucursal de forma presencial o reingresar su código postal");
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

        return costoDeEnvio;
    }
}


