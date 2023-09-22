import java.util.InputMismatchException;
import java.util.Scanner;

import com.ejercicios.Ejercicio;
import com.juanki.*;

public class App {

    // Descomenta la linea de abajo si no quieres usar la librería Jansi
    // public ConsoleHandler console = new NormalConsole();

    // Comenta la linea de abajo sí no tienes instalada la librería de Jansi
    public ConsoleHandler console = new ColorConsole();

    public AppState state = AppState.INIT;

    public String os;

    public Ejercicio[] ejercicios_registrados;

    public App() {
        this.ejercicios_registrados = this.obtenerEjercicios();
        this.os = System.getProperty("os.name");
    }

    public int mostrarMenu() {

        int seleccionado = -1;

        do {
            break;
        } while (seleccionado < 0 || seleccionado > this.ejercicios_registrados.length);

        return 0;
    }

    public static void main(String[] args) {

        App app = new App();
        Scanner input = new Scanner(System.in);

        app.console.clear();

        if (app.ejercicios_registrados.length <= 0) {
            app.console.error("No hay ejercicios cargados!");
            return;
        }

        app.console.log("--- Ejercicios ---");
        app.console.log("");

        for (int index = 0; index < app.ejercicios_registrados.length; index++) {
            app.console.log("- " + index + " " + app.ejercicios_registrados[index].obtenerNombre());
        }

        app.console.info("Se pudo!");

        // for (Ejercicio ejercicio : ejercicios) {

        // App.console.box(ejercicio.obtenerNombre());
        // App.console.info(ejercicio.obtenerDescripcion());

        // App.console.log("Ejecución...");

        // ejercicio.ejercutar(App.console);

        // }

    }

    public Ejercicio[] obtenerEjercicios() {

        Ejercicio[] ejercicios = new Ejercicio[] {
                new com.ejercicios.leccion2.Ejercicio1(),
                new com.ejercicios.leccion2.Ejercicio2(),
                new com.ejercicios.leccion2.Ejercicio3(),
                new com.ejercicios.leccion2.Ejercicio4()
        };

        return ejercicios;

    }

}
