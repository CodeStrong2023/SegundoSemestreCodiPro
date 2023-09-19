
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
    var conteo = 0; //Inferencia de tipos
        while(conteo <= 7){
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en uno la variable "conteo"
            }
        
    var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while (contador <7);
        
        //Uso de las palabras break y continue junto a las etiquetas "Labels"
        for(var contando = 0; contando < 7; contando++){ //1er parte: Crear una variable 2da: Condición 3ra: Incr/Decr
            if (contando % 2 == 0){
            System.out.println("contando = " + contando);
            break;
             }
            }
        inicio:
            for(var contando = 0; contando < 7; contando++){ //1er parte: Crear una variable 2da: Condición 3ra: Incr/Decr
            if (contando % 2 != 0){
            continue; //Vamos a la siguiente iteración
             }
            System.out.println("contando = " + contando);
        }
        }
    }
    
