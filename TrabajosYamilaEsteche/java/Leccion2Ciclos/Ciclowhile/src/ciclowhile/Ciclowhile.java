
package ciclowhile;

/**
 *
 * @author yami
 */
public class Ciclowhile {

    public static void main(String[] args) {
        var conteo = 0; 
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++;  // Vamos aumentando en uno la variable 
        }
        
        var contador = 0; 
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);
 
        

        for(var contando = 0 ; contando < 7; contando++){
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break;
            }            
        }
        
        for(var contando = 0 ; contando < 7; contando++){
            if(contando % 2 != 0){
               continue;  //Uso de las palabras break y continue junto a las etiquetas labels
            }  
            System.out.println("contando = " + contando);
        }
    }
    
}
