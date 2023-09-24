package com.juanki;

/**
 * Clase para el manejo de la consola que no agrega colores a los mensajes.
 * 
 * Esta clase esta como sustituto, en caso de no tener la librería de jansi
 */

public class NormalConsole implements ConsoleHandler {

    public final int ESPACIADO_DE_CAJA = 2;

    /**
     * Imprime la parte superior e inferior de un cuadro decorativo en la consola.
     *
     * @param longitud  La longitud del mensaje que contendrá el cuadro.
     * @param decorador El carácter utilizado como decorador en el cuadro.
     */

    private void top_of_box(int longitud, String decorador) {

        String tapa = decorador.repeat(longitud + ((decorador.length() + this.ESPACIADO_DE_CAJA) * 2));

        System.out.println(tapa);

    }

    /**
     * Imprime el contenido de un cuadro decorativo en la consola.
     *
     * @param mensaje   El mensaje que se mostrará dentro del cuadro.
     * @param decorador El carácter utilizado como decorador en el cuadro.
     */

    private void content_of_box(String mensaje, String decorador) {

        String mensaje_final = decorador + " ".repeat(this.ESPACIADO_DE_CAJA) + mensaje
                + " ".repeat(this.ESPACIADO_DE_CAJA) + decorador;

        System.out.println(mensaje_final);

    }

    /**
     * Muestra un cuadro decorativo alrededor del mensaje en la consola.
     *
     * @param message El mensaje que se mostrará dentro del cuadro.
     */

    public void box(String message) {
        System.out.println();
        this.top_of_box(message.length(), "=");
        this.content_of_box(message, "*");
        this.top_of_box(message.length(), "=");
        System.out.println();
    }

    /**
     * Muestra un mensaje informativo en la consola.
     *
     * @param message El mensaje informativo que se mostrará en la consola.
     */

    public void info(String message) {
        System.out.println();
        System.out.println("INFO: " + message);
        System.out.println();
    }

    /**
     * Muestra un mensaje de error en la consola.
     *
     * @param message El mensaje de error que se mostrará en la consola.
     */

    public void error(String message) {
        System.out.println();
        System.out.println("ERROR: " + message);
        System.out.println();
    }

    /**
     * Muestra un mensaje en la consola sin aplicar ningún estilo especial.
     *
     * @param mensaje El mensaje que se mostrará en la consola.
     */

    public void log(String mensaje) {
        System.out.println(mensaje);
    }

    public void clear() {

        final String os = System.getProperty("os.name");

        try {
            final ProcessBuilder process = new ProcessBuilder();

            if (os.contains("Windows")) {
                process.command("cls").inheritIO().start().waitFor();
            } else {
                process.command("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            this.error("No se pudo borrar la pantalla");
        }
    }

}
