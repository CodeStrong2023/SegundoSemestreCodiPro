
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;// memoria stack
        miMetodo(); //Llamamos al método nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b =7;
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos: " + resultado);
        
        System.out.println("Aritmetica a:"+aritmetica1.a);
        System.out.println("Aritmetica a:"+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a= " + aritmetica2.a);
        System.out.println("aritmetica2 b= " + aritmetica2.b);
        
        Persona persona = new Persona("Emilia", "Bazán");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+ persona.nombre);
        System.out.println("Persona apellido: "+ persona.apellido);
    }    
    
    public static void miMetodo() {
        // a =10; //Esta variable no puede trascender del método main
        System.out.println("Aquí hay otro método");
    }
}

class Persona{ 
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        super(); // LLamada al constructor de la clase padre Object 
        new Imprimir().Imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
       
        System.out.println("Objeto persona usando this: "+ this); 
    }
}

class Imprimir{
    public Imprimir(){
    super();
    }
    
    public void Imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+ persona);
        System.out.println("Persona desde el objeto actual (this): "+this);
    }
}

