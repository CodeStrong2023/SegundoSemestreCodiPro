/*
Clase 5: Tipos primitivos char
Tabla unicode
 */
package primitivoschar;

/**
 *
 * @author Adriana
 */
public class PrimitivosChar {


    public static void main(String[] args) {
        //char: puede almacenar un caracter, entre comillas simples
        //almacena 16 bits
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Asignamos con codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        
        char varCaracterDecimal = 36;  //Valor decimal de la tabla unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        
        char varCaracterSimbolo = '$'; //UN caracter especial, copiar desde la tabla unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        //Inferencia de tipos
        var varCaracter1 = '\u0024'; //Asignamos con codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        
        var varCaracterDecimal1 = (char)36;  
        //En inferencia lo toma como Valor entero y le asigna un tipo int, así mostramos un tipo (char)
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        
        var varCaracterSimbolo1 = '$'; //UN caracter especial, copiar desde la tabla unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        //Un tipo char se puede convertir a un tipo entero
        //Un char se puede asignar a un tipo entero
        //Tipo entero int es 32 bits y el tipo char es de 16 bits
        int varEnteroChar = '$'; //asignamos un caracter a un entero
        System.out.println("varEnteroChar = " + varEnteroChar); //nos muestra el valor decimal
        int caracterChar = 'b'; //mayúsculas y minúsculas no tienen el mismo valor decimal
        System.out.println("caracterChar = " + caracterChar); //nos muestra el valor decimal
    }
    
}
