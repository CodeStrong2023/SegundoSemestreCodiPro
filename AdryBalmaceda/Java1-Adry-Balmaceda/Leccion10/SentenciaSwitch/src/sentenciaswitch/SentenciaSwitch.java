/*
 * Sentencia Switch, no es de tipo booleana, es tipo numerica
 * Se expresan como casos
 * palabra reservada: break
 */
package sentenciaswitch;

import java.util.Scanner;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class SentenciaSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // usamos la clase scanner para pedir los datos al usuario
        System.out.println("Digite un numero del 1 al 4: "); // pedimos al usuario que digite un numero para convertir a texto
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break; // si probamos a comentar break del 1 y el 2 ejecuta el numero tres
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }

}
