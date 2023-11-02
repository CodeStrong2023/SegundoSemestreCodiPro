import java.util.Scanner;
//Comentarios de una sola linea
/*
Esto es un comentario extensivo-multiples lineas
Tema: Caracteres especiales en Java
Ctrl + espacio: para autocompletar
******* @author AdrianaBalmaceda ******
 */
public class ClaseScanner {

    public static void main(String args[]) { //clase main
        /* System.out.println("Hola Mundo desde Java");
       
              int miVariable = 10; //ya esta instanciada
              System.out.println(miVariable);
              miVariable = 5; //reutilizamos y no volvemos a utilizar int 
              System.out.println(miVariable);
              //Variable tipo String (privilegios "no" usa new como en objetos)
              String miVariableCadena = "Bienvenidos";
              System.out.println(miVariableCadena);
              //Se pueden reutilizar las variables cadena
              miVariableCadena = "Sigamos creciendo en programacion";
              System.out.println(miVariableCadena);
              //Ctrl + clic muestra donde fue instanciada miVariableCadena
         */
        //Var: interferencia de tipos en Java
        /*
      var miVariableEntera2 = 10;
      var miVariableCadena2 = "Seguimos estudiando";
      System.out.println("miVariableEntera2 = " + miVariableEntera2);
      System.out.println("miVariableCadena2 = " + miVariableCadena2);
         */
        //sout + tab: para imprimir
        //shift + F6: para ejecutar
        /*
      Reglas:
      Usar cualquier letra del alfabeto y comenzar con minuscula
      No usar numeros como primer caracter
      Tipo camelCase (recomendado)
      No usar caracteres especiales 
      Excepciones: iniciar con guion bajo _ y el signo dolar $
      Uso de acentos (no recomendable) puede generar problemas
      No usar numeral # (ilegal)
         */
 /*
        var usuario = "Adriana";
        var titulo = "Arquitecta";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //Concatenacion
        //clic derecho-format: y se ordena el codigo
        var a = 8; //no recomendado nombres cortos
        var b = 4; //no usar palabras reservadas para nombrar variables
        System.out.println(usuario + (a + b));
        //con parentesis (a+b) cambiamos la prioridad, suma y segundo concatena
        //Caracteres especiales
        var nombre = "Veronica";
        System.out.println("\nNueva linea: \n" + nombre); // \n :salto de linea
        System.out.println("Tabulador: \t" + nombre); // \t :espacio tabulador
        System.out.println("\t\t.:MENU:.");
        System.out.println("Sin espacio: \b\b" + nombre);
        // \b Caracter de retroceso quita los espacios
        System.out.println("Comillas simples: \'" + nombre + "\'");
        // \' para colocar comillas simples
        System.out.println("Comillas Dobles: \"" + nombre + "\"");
        //Cuidado con las comillas que abren y las que cierran
        // \"" :para colocar comillas dobles
         */
 
        //Clase Scanner parte1
        
        //Variable entrada: que inicializamos desde la clase Scanner
        //Líneas comentadas para desarrollar parte2   
        Scanner entrada = new Scanner(System.in); //paso anterior
        //System.out.println("Digite su nombre: ");
        var usuario2 = "Marcelo"; //a esta forma la llamamos codigo duro
        //var usuario2 = entrada.nextLine(); 
        /*metodo nexLine: para detener la ejecucion, para esperar que el usuario 
        entre la informacion hasta dar enter*/
        //estamos pidiendo que nos ingrese un valor
        System.out.println("usuario2 = " + usuario2);
        //System.out.println("Escriba el título: ");
        //var titulo2 = entrada.nextLine();
        //System.out.println("Resultado: " + titulo2 +" " + usuario2);
    }
}
