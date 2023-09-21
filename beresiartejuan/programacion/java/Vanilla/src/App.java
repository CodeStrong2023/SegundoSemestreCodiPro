import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.juanki.Ejercicio;

public class App {

    public final String EXERCISES_PACKAGE = "com.ejercicios";

    public static void main(String[] args) {

        // Se obtienen todos los ejercicios
        List<Class<Ejercicio>> ejercicios = App.obtenerEjercicios();

    }

    public static List<Class<Ejercicio>> obtenerEjercicios() {

        // Empiezo con un array vacio de clases
        List<Class<Ejercicio>> ejercicios = new ArrayList<>();

        // Aca es donde pueden aparecer errores :((

        try {

        } catch (Exception e) {

            // Sí hay un error se imprime en pantalla
            e.printStackTrace();

        }

        return ejercicios;

    }

}
