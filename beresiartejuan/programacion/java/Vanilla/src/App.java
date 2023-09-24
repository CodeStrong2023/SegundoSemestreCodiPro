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
        Scanner input = new Scanner(System.in);

        do {

            this.console.clear();
            this.console.box("Ejercicios");

            for (int index = 0; index < this.ejercicios_registrados.length; index++) {
                this.console.log("- " + index + " " + this.ejercicios_registrados[index].obtenerNombre());
            }

            if (this.state == AppState.ERROR) {
                this.console.error("El ejercicio #" + seleccionado + " no esta disponible!");
            }

            try {

                System.out.print("Ingresa el numero del ejercicio: ");
                seleccionado = input.nextInt();

                if (seleccionado < 0)
                    throw new Exception("Haz seleccionado un indice negativo");

                if (seleccionado > this.ejercicios_registrados.length)
                    throw new Exception("El ejercicio seleccionado no existe");

            } catch (InputMismatchException e) {

                input.close();
                throw e;

            } catch (Exception e) {

                this.state = AppState.ERROR;

                continue;

            }

        } while (seleccionado < 0 || seleccionado > this.ejercicios_registrados.length);

        input.close();

        return seleccionado;
    }

    public static void main(String[] args) {

        App app = new App();

        app.console.clear();

        if (app.ejercicios_registrados.length <= 0) {
            app.console.error("No hay ejercicios cargados!");
            return;
        }

        int indice = app.mostrarMenu();
        Ejercicio ejercicio = app.ejercicios_registrados[indice];

        app.console.clear();
        app.console.box(ejercicio.obtenerNombre());
        app.console.info(ejercicio.obtenerDescripcion());

        ejercicio.ejercutar(app.console);

    }

    public Ejercicio[] obtenerEjercicios() {

        Ejercicio[] ejercicios = new Ejercicio[] {
                new com.ejercicios.leccion2.Ejercicio1(),
                new com.ejercicios.leccion2.Ejercicio2(),
                new com.ejercicios.leccion2.Ejercicio3(),
                new com.ejercicios.leccion2.Ejercicio4(),
                new com.ejercicios.leccion2.Ejercicio5()
        };

        return ejercicios;

    }

}
