
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //variables locales
        int b = 7;  //Memoria stack
        miMetodo(); //Llamamos un método nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=3;
        aritmetica1.b=7;
        aritmetica1.sumaNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos: "+resultado);
        
        System.out.println("aritmetica1 a = "+aritmetica1.a);
        System.out.println("aritmetica1 b = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = null; Nunca utilizar esto, no se debe hacer
        //System.gc(); Método para limpiar residuos, es pesado, no utilizar
        Persona persona = new Persona("Ariel", "Betancud");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona apellido: "+persona.apellido);
    }
    
    public static void miMetodo(){
        //int a = 10; Variable limitada
        System.out.println("Aquí hay otro método");
    }
}
class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ //Constructor 
        super(); //Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+this);
    }
}

class Imprimir {
    public Imprimir() {
        super(); //El constructor de la clase padre para reservar la memoria
}
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresión del objeto actual this: "+this);
    }
}