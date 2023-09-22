import com.ejercicios.Ejercicio;
import com.juanki.*;

public class App {

    // Descomenta la linea de abajo si no quieres usar la librería Jansi
    // public static ConsoleHandler console = new NormalConsole();

    // Comenta la linea de abajo sí no tienes instalada la librería de Jansi
    public static ConsoleHandler console = new ColorConsole();

    public static void main(String[] args) {

        Ejercicio[] ejercicios = App.obtenerEjercicios();

        if (ejercicios.length <= 0) {
            App.console.error("No hay ejercicios cargados!");
            return;
        }

        App.console.log("--- Ejercicios ---");
        App.console.log("");

        for (int index = 0; index < ejercicios.length; index++) {
            App.console.log("#" + index + " " + ejercicios[index].obtenerNombre());
        }

        // for (Ejercicio ejercicio : ejercicios) {

        // App.console.box(ejercicio.obtenerNombre());
        // App.console.info(ejercicio.obtenerDescripcion());

        // App.console.log("Ejecución...");

        // ejercicio.ejercutar(App.console);

        // }

    }

    public static Ejercicio[] obtenerEjercicios() {

        Ejercicio[] ejercicios = new Ejercicio[] {
                new com.ejercicios.leccion2.Ejercicio1()
        };

        return ejercicios;

    }

}
