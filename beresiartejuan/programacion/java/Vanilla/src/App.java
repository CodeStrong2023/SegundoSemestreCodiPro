import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.juanki.Ejercicio;
import com.ejercicios.*;

public class App {

    public static final String EXERCISES_PACKAGE = "com.ejercicios";

    public List<Ejercicio> ejercicios = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void resgiter() {

        // Aquí se registran todos los ejercicios

        this.ejercicios.add(new Ejercicio1());
        this.ejercicios.add(new Ejercicio2());

    }

}
