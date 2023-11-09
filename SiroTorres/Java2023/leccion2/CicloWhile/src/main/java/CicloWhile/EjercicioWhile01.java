
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; //Usamos inferencia de tipos
        while (conteo <= 7){
            System.out.println("conteo = " + conteo);
            conteo++;// Vamos aumentando en uno la variable 
        }
        
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);
        //Uso de las palabras break y continue junto a las etiquetas labels
        
        for (var contado = 0 ; contado <  7 ;contado++){
            if (contado % 2 == 0){
                System.out.println("contado = " + contado);
                break;
            }
        }
        inicio:
        for (var contado = 0 ; contado <  7 ;contado++){
            if (contado % 2 != 0){
                continue inicio; //Vamos a la siguiente iteracion, de esta forma pasa al soutv solo con los numeros pares
            }
            System.out.println("contado = " + contado);
        
            
        }
        //Etiqueta labels
        for (var contado = 0 ; contado <  7 ;contado++){
            if (contado % 2 == 0){
                System.out.println("contado = " + contado);
                
            }
        }
    }
    
}
