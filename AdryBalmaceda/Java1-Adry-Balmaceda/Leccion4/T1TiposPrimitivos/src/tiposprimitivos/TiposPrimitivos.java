/*
Leccion4: Tipos Primitivos en Java
Tipos numericos
 */
package tiposprimitivos;

/**
 *
 * @author Adriana
 */
public class TiposPrimitivos {


    public static void main(String[] args) {
        //Byte almacena hasta 127 bits
        //byte numEnteroByte = 10;
        //byte numEnteroByte = 129; //para que no muestre error se hace lo siguiente
        //byte numEnteroByte =(byte)129; //esto se llama conversion de tipos
        //Habra perdida de precision al convertir los tipos   
        //El compilador avisara que hemos superado el rango porque hemos ocupado los 129 numeros positivos
        byte numEnteroByte = 127; //este es el numero que corresponde para no pasarnos
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        //Ejecutar: shift + F6
        
        //Short almacena hasta 10 bits
        //short numEnteroShort = 10; 
        //short numEnteroShort = 32768; //da error, podemos hacer conversion de tipos
        //short numEnteroShort = (short)32768; //habra perdida de precision y nos mostrara el numero en negativo
        short numEnteroShort = 32767; //no hace falta hacer conversion de tipo porque no nos pasamos
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE); //Short en mayuscula indica que lo estamos utilizando como clase idem con Byte
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
        
        //Debido a las limitaciones de byte y short se recomienda pasar a tipo int
        //int almacena hasta 32 bits
        //int numEnteroInt = 10;  
        //int numEnteroInt = 2147483648; //Si ponemos uno mas del limite daria error
        //int numEnteroInt = (int)2147483648; //igual nos dice que hay error y que no se puede reparar
        //Para solucionar esto usamos long con L mayuscula para que no haya confusiones 
        //Long almacena hasta 64 bits
        //int numEnteroInt = (int)2147483648L; //Encontraremos perdida de precision
        //Por defecto la literal maxima es de tipo int al superarla sigue marcando error
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE); //Clase Integer
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);
        
        //long almacena hasta 64 bits
        //long numEnteroLong = 10;
        long numEnteroLong = 9223372036854775807L; //da error sino le ponemos L mayuscula
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: "+ Long.MIN_VALUE);
        System.out.println("Valor maximo del long: "+ Long.MAX_VALUE);
    }
    
}
