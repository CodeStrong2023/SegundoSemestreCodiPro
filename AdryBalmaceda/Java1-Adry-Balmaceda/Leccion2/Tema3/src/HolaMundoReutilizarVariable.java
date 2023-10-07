//Comentarios de una sola linea
/*
Esto es un comentario extensivo-multiples lineas
Tema: Como reutilizar variables
La variable es de tipo entera, no volvemos a instanciarla (int)
La variable esta definida dentro de un metodo (main)
No se puede reutilizar fuera del metodo main
******* @author AdrianaBalmaceda ******
*/
public class HolaMundoReutilizarVariable {
   public static void main(String args[]){ //clase main
       System.out.println("Hola Mundo desde Java");
       
              int miVariable = 10; //ya esta instanciada
              System.out.println(miVariable);
              miVariable = 5; //reutilizamos y no volvemos a utilizar int 
              System.out.println(miVariable);
   } 
}
