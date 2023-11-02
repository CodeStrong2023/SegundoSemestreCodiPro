//Comentarios de una sola linea
/*
Esto es un comentario extensivo-multiples lineas
Tema: Inferencia de tipos en Java
Ctrl + espacio: para autocompletar
******* @author AdrianaBalmaceda ******
*/
public class Inferencia {
   public static void main(String args[]){ //clase main
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
      //Var: inferencia de tipos en Java
      var miVariableEntera2 = 10;
      var miVariableCadena2 = "Seguimos estudiando";
      System.out.println("miVariableEntera2 = " + miVariableEntera2);
      System.out.println("miVariableCadena2 = " + miVariableCadena2);
      //sout + tab para imprimir
      //shift + F6 para ejecutar
   } 
}
