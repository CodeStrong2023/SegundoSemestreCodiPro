import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Nombre del paquete donde se encuentran los ejercicios
        String packageName = "com.ejercicios";

        // Obtener una lista de todas las clases en el paquete
        List<Class<?>> exercises = findClassesInPackage(packageName);

        if (exercises.isEmpty()) {
            System.out.println("No se encontraron ejercicios en el paquete " + packageName);
            return;
        }

        // Listar los ejercicios disponibles
        System.out.println("Ejercicios disponibles:");
        for (int i = 0; i < exercises.size(); i++) {
            System.out.println((i + 1) + ". " + exercises.get(i).getSimpleName());
        }

        // Ejecutar un ejercicio específico (cambiar el índice según sea necesario)
        int exerciseIndex = 0; // Cambiar este índice según el ejercicio que quieras ejecutar
        if (exerciseIndex >= 0 && exerciseIndex < exercises.size()) {
            Class<?> exerciseClass = exercises.get(exerciseIndex);
            try {
                // Invocar el método "main" del ejercicio
                Method mainMethod = exerciseClass.getDeclaredMethod("main", String[].class);
                mainMethod.invoke(null, (Object) new String[] {});
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Índice de ejercicio no válido.");
        }
    }

    private static List<Class<?>> findClassesInPackage(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            java.net.URL resource = classLoader.getResource(path);
            assert resource != null;
            java.io.File directory = new java.io.File(resource.toURI());
            if (directory.exists()) {
                java.io.File[] files = directory.listFiles();
                assert files != null;
                for (java.io.File file : files) {
                    if (file.getName().endsWith(".class")) {
                        String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                        Class<?> clazz = Class.forName(className);
                        classes.add(clazz);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }
}

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Nombre del paquete donde se encuentran los ejercicios
        String packageName = "com.ejercicios";

        // Obtener una lista de todas las clases en el paquete
        List<Class<?>> exercises = findClassesInPackage(packageName);

        if (exercises.isEmpty()) {
            System.out.println("No se encontraron clases en el paquete " + packageName);
            return;
        }

        // Ejecutar el método "pepe" en todas las clases del paquete
        for (Class<?> exerciseClass : exercises) {
            try {
                // Invocar el método "pepe" en la clase
                Method pepeMethod = exerciseClass.getDeclaredMethod("pepe");
                pepeMethod.invoke(exerciseClass.getDeclaredConstructor().newInstance());
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<Class<?>> findClassesInPackage(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            java.net.URL resource = classLoader.getResource(path);
            assert resource != null;
            java.io.File directory = new java.io.File(resource.toURI());
            if (directory.exists()) {
                java.io.File[] files = directory.listFiles();
                assert files != null;
                for (java.io.File file : files) {
                    if (file.getName().endsWith(".class")) {
                        String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                        Class<?> clazz = Class.forName(className);
                        classes.add(clazz);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }
}

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Nombre del paquete donde se encuentran los ejercicios
        String packageName = "com.ejercicios";

        // Obtener una lista de todas las clases en el paquete
        List<Class<?>> exercises = findClassesInPackage(packageName);

        if (exercises.isEmpty()) {
            System.out.println("No se encontraron clases en el paquete " + packageName);
            return;
        }

        // Ejecutar el método "pepe" en todas las clases del paquete
        for (Class<?> exerciseClass : exercises) {
            try {
                // Invocar el método "pepe" en la clase
                Method pepeMethod = exerciseClass.getDeclaredMethod("pepe");
                pepeMethod.invoke(exerciseClass.getDeclaredConstructor().newInstance());
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<Class<?>> findClassesInPackage(String packageName) {
        List<Class<?>> classes = new ArrayList<>();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            java.net.URL resource = classLoader.getResource(path);
            assert resource != null;
            java.io.File directory = new java.io.File(resource.toURI());
            if (directory.exists()) {
                java.io.File[] files = directory.listFiles();
                assert files != null;
                for (java.io.File file : files) {
                    if (file.getName().endsWith(".class")) {
                        String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                        Class<?> clazz = Class.forName(className);
                        classes.add(clazz);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Nombre del paquete donde se encuentran los ejercicios
        String packageName = "com.ejercicios";

        // Obtener una lista de todas las clases en el paquete que implementan la
        // interfaz Ejercicio
        List<Ejercicio> exercises = findAndInstantiateExerciseClasses(packageName);

        if (exercises.isEmpty()) {
            System.out.println("No se encontraron clases de ejercicio en el paquete " + packageName);
            return;
        }

        // Ejecutar todos los ejercicios
        for (Ejercicio exercise : exercises) {
            System.out.println("Ejecutando el ejercicio: " + exercise.getNombre());
            exercise.ejecutar();
            System.out.println("------------------------------");
        }
    }

    private static List<Ejercicio> findAndInstantiateExerciseClasses(String packageName) {
        List<Ejercicio> exercises = new ArrayList<>();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            java.net.URL resource = classLoader.getResource(path);
            assert resource != null;
            java.io.File directory = new java.io.File(resource.toURI());
            if (directory.exists()) {
                java.io.File[] files = directory.listFiles();
                assert files != null;
                for (java.io.File file : files) {
                    if (file.getName().endsWith(".class")) {
                        String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                        Class<?> clazz = Class.forName(className);

                        // Verificar si la clase implementa la interfaz Ejercicio
                        if (Ejercicio.class.isAssignableFrom(clazz)) {
                            exercises.add((Ejercicio) clazz.getDeclaredConstructor().newInstance());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exercises;
    }
}
