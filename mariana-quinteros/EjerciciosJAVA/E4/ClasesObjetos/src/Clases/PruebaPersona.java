
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        //La clase persona es nuestra plantilla, en ella definimos nuestros atributos y métodos
        Persona persona1 = new Persona(); //Llamamos al constructor, instancias
        persona1.nombre = "Ariel"; //El valor hexadecimal normalmente comienza con 0x
        persona1.apellido = "Betancud";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion(); //No muestra nada de la persona 1 (ningun valor), solo los atributos
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
    }
}
