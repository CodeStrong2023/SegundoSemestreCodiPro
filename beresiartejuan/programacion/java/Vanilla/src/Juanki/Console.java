package Juanki;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;

/**
 * La clase Console proporciona métodos para mostrar mensajes con formato en la
 * consola,
 * incluyendo la capacidad de dibujar cuadros alrededor de los mensajes y
 * aplicar colores.
 * Utiliza la biblioteca Jansi para controlar los estilos y colores de la
 * consola.
 */

public class Console {

    /**
     * Imprime la parte superior de un cuadro decorativo en la consola.
     *
     * @param longitud  La longitud deseada para la línea de la parte superior.
     * @param decorador El carácter utilizado como decorador en el cuadro.
     * @param espaciado El número de espacios entre el decorador y el contenido del
     *                  cuadro.
     */

    private static void top_of_box(int longitud, String decorador, int espaciado) {

        String tapa = decorador.repeat(longitud + ((decorador.length() + espaciado) * 2));

        System.out.println(Ansi.ansi().fg(Color.GREEN).a(tapa).reset());

    }

    /**
     * Imprime el contenido de un cuadro decorativo en la consola.
     *
     * @param mensaje   El mensaje que se mostrará dentro del cuadro.
     * @param decorador El carácter utilizado como decorador en el cuadro.
     * @param espaciado El número de espacios entre el decorador y el mensaje.
     */

    private static void content_of_box(String mensaje, String decorador, int espaciado) {

        String mensaje_final = decorador + " ".repeat(espaciado) + mensaje + " ".repeat(espaciado) + decorador;

        System.out.println(Ansi.ansi().fg(Color.GREEN).a(mensaje_final).reset());

    }

    /**
     * Muestra un cuadro decorativo alrededor del mensaje en la consola.
     *
     * @param mensaje El mensaje que se mostrará dentro del cuadro.
     */

    public static void box(String mensaje) {

        final int ESPACIADO = 2;

        System.out.println();
        Console.top_of_box(mensaje.length(), "=", ESPACIADO);
        Console.content_of_box(mensaje, "*", ESPACIADO);
        Console.top_of_box(mensaje.length(), "=", ESPACIADO);
        System.out.println();

    }

    /**
     * Muestra un mensaje informativo en la consola con color azul.
     *
     * @param mensaje El mensaje informativo que se mostrará en la consola.
     */

    public static void info(String mensaje) {
        System.out.println();
        System.out.println(Ansi.ansi().fg(Color.BLUE).a(mensaje).reset());
        System.out.println();
    }

    /**
     * Muestra un mensaje de error en la consola con color rojo.
     *
     * @param mensaje El mensaje de error que se mostrará en la consola.
     */

    public static void error(String mensaje) {
        System.out.println();
        System.out.println(Ansi.ansi().fg(Color.RED).a(mensaje).reset());
        System.out.println();
    }

    /**
     * Muestra un mensaje en la consola sin aplicar ningún estilo especial.
     *
     * @param mensaje El mensaje que se mostrará en la consola.
     */

    public static void log(String mensaje) {
        System.out.println(mensaje);
    }

}