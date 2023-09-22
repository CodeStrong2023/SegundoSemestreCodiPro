# Ejercicios de Java

## Contenido 📖

- 📌 **Juanki**
  - 📍 Console
    - Métodos y Funcionalidades 🛠️
    - Ejemplos de uso 🚀

## Juanki

Juanki es un paquete en el que guardo codigo que me ayuda a la hora de programar.

## Juanki.Console 💡🎨

La clase Console te permite mejorar la presentación de tus mensajes en la consola con la magia de los colores y los cuadros decorativos. Aquí encontrarás una descripción detallada de los métodos disponibles para embellecer y dar vida a tus mensajes en la consola utilizando la potente biblioteca Jansi.

### Métodos y Funcionalidades 🛠️

#### `top_of_box(int longitud, String decorador, int espaciado)`

Este método dibuja la parte superior de un cuadro decorativo en la consola. Puedes personalizar la longitud, el decorador y el espaciado entre el contenido y el borde del cuadro.

- `longitud`: La longitud deseada para la línea superior.
- `decorador`: El carácter utilizado como borde del cuadro.

#### `content_of_box(String mensaje, String decorador, int espaciado)`

Imprime el contenido en un cuadro decorativo en la consola. Puedes resaltar mensajes importantes con un diseño llamativo.

- `mensaje`: El contenido que se mostrará en el cuadro.
- `decorador`: El carácter utilizado como borde del cuadro.

#### `box(String mensaje)`

Crea un cuadro alrededor de tu mensaje. ¡Dale a tus mensajes un toque especial!

- `mensaje`: El mensaje que se mostrará en el cuadro.

#### `info(String mensaje)`

Muestra un mensaje informativo en la consola con un agradable color azul. Destaca información importante.

- `mensaje`: El mensaje informativo que se mostrará en la consola.

#### `error(String mensaje)`

Muestra un mensaje de error en la consola con un impactante color rojo. Resalta problemas críticos.

- `mensaje`: El mensaje de error que se mostrará en la consola.

#### `log(String mensaje)`

Imprime un mensaje en la consola sin aplicar ningún estilo especial. Útil para registros y seguimiento.

- `mensaje`: El mensaje que se mostrará en la consola.

### Ejemplos de uso 🚀

```java
// Crea un cuadro con mensaje
Console.box("¡Hola, mundo colorido!");

// Muestra un mensaje informativo
Console.info("Este es un mensaje informativo.");

// Muestra un mensaje de error
Console.error("Error: Algo salió mal.");

// Imprime un mensaje sin estilo especial
Console.log("Este es un mensaje de registro.");

// Dibuja un cuadro personalizado
Console.top_of_box(18, "*"); 
Console.content_of_box("Contenido especial", "#");
Console.top_of_box(18, "*");

/* Salida:
************************
#  Contenido especial  #
************************
*/
```
