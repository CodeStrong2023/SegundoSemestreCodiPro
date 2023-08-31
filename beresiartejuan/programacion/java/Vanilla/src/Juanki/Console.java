package Juanki;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;

public class Console {

    private static void top_of_box(int longitud, String decorador, int espaciado) {

        String tapa = decorador.repeat(longitud + ((decorador.length() + espaciado) * 2));

        System.out.println(Ansi.ansi().fg(Color.GREEN).a(tapa).reset());

    }

    private static void content_of_box(String mensaje, String decorador, int espaciado) {

        String mensaje_final = decorador + " ".repeat(espaciado) + mensaje + " ".repeat(espaciado) + decorador;

        System.out.println(Ansi.ansi().fg(Color.GREEN).a(mensaje_final).reset());

    }

    public static void box(String mensaje) {

        final int ESPACIADO = 2;

        System.out.println();
        Console.top_of_box(mensaje.length(), "=", ESPACIADO);
        Console.content_of_box(mensaje, "*", ESPACIADO);
        Console.top_of_box(mensaje.length(), "=", ESPACIADO);
        System.out.println();

    }

    public static void info(String mensaje) {
        System.out.println();
        System.out.println(Ansi.ansi().fg(Color.BLUE).a(mensaje).reset());
        System.out.println();
    }

    public static void error(String mensaje) {
        System.out.println();
        System.out.println(Ansi.ansi().fg(Color.RED).a(mensaje).reset());
        System.out.println();
    }

    public static void log(String mensaje) {
        System.out.println(mensaje);
    }

}
