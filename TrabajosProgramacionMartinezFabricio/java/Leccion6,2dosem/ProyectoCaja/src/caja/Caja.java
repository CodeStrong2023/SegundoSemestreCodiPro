
package caja;


public class Caja {
       //Atributos
       int ancho;
       int alto;
       int prof;
       //Métodos y constructores
       public Caja(){ //Constructor 1 vacío
           System.out.println("Constructor vacío");
       }
       public Caja(int ancho,int alto, int prof){
           this.ancho = ancho;
           this.alto = alto;
           this.prof = prof;
       }
       public int calcularVolumen(){
           return ancho * alto * prof;
       }
       
    
    
}
