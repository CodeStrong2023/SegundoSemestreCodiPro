import com.ejercicios.*;
import com.juanki.*;

public class App {

    // Descomenta la linea de abajo si no quieres usar la librería Jansi
    // public static ConsoleHandler console = new NormalConsole();

    // Comenta la linea de abajo sí no tienes instalada la librería de Jansi
    public static ConsoleHandler console = new ColorConsole();

    public static void main(String[] args) {

        Ejercicio[] ejercicios = App.obtenerEjercicios();

        for (Ejercicio ejercicio : ejercicios) {

            App.console.box(ejercicio.obtenerNombre());
            App.console.info(ejercicio.obtenerDescripcion());

            App.console.log("Ejecución...");

            ejercicio.ejercutar(App.console);

        }

    }

    public static Ejercicio[] obtenerEjercicios() {

        Ejercicio[] ejercicios = new Ejercicio[] {
                new Ejercicio1(),
                new Ejercicio2()
        };

        return ejercicios;

    }

}
