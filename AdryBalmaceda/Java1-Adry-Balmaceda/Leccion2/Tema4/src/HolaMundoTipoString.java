//Comentarios de una sola linea
/*
Esto es un comentario extensivo-multiples lineas
Tipo String (es una clase y empieza con mayuscula)
Ctrl + espacio: para autocompletar
******* @author AdrianaBalmaceda ******
*/
public class HolaMundoTipoString {
   public static void main(String args[]){ //clase main
       System.out.println("Hola Mundo desde Java");
       
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
              
   } 
}
