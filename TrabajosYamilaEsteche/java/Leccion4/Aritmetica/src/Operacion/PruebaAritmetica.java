
package Operacion;

/**
 *
 * @author yami
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;  // variables locales
        int b = 7; 
        miMetodo();  // llamamos el metodo 
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
       
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
      
        Persona persona = new Persona("yami", "esteche"); 
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona Apellido: " + persona.apellido);
    }
 

    public static void miMetodo() { //creamos el nuevo metodo
        System.out.println("Aqui hay otro metodo");
    }

}
// Creamos una nueva clase 

class Persona { 

    String nombre;
    String apellido;

    // constructor
    Persona(String nombre, String apellido) { 

        super(); 

        new Imprimir().imprimir(this);  // trae la memoria de la clase persona
        this.nombre = nombre;  
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }

}

class Imprimir {

    public Imprimir() {
        super();  //con super podemos llamar constructores
    }

    public void imprimir(Persona persona) {
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }

}
