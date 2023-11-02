/*
Leccion 4: 
Tipos primitivos flotantes
Tipos numericos

Leccion 5:
Como cambiar el fondo a modo oscuro:
Tools--Options--Fonts&Colors--Background--Seleccion color fondo
Como cambiar la apariencia de Netbeans
Tools--Options--Appearance--Look and Feel--Seleccion apariencia de Netbeans

 */
package tiposprimitivosflotantes;

/**
 *
 * @author Adriana
 */
public class TiposPrimitivosFlotantes {

    public static void main(String[] args) {
        /*
        CLASE ANTERIOR
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
        */
        
        //Tipo flotante
        //float numFloat = 10.0; //da error, por default el decimal indica que es tipo double
        //float numFloat = 10.0F; //solucionamos con F mayuscula para que no haya confusion
        //otra forma de solucionar
        //float numFloat = (float)10.0;
        //float numFloat = 10.0F;
        //float numFloat = 3.4028236E38F; //da error porque superamos el nro maximo
        //float numFloat = (float)3.4028236E38; //el compilador lo mostrara invalido
        float numFloat = 3.4028235E38F; //estaria correcto
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del float: "+ Float.MIN_VALUE);
        System.out.println("Valor maximo del float: "+ Float.MAX_VALUE);
        
        //Tipo double
        //double numDouble = 10;  
        double numDouble = 1.7976931348623157E308; //no hace falta poner la D mayuscula
        System.out.println("numDouble = " + numDouble); //le asigna decimal
        System.out.println("Valor minimo del double: "+ Double.MIN_VALUE);
        System.out.println("Valor maximo del double: "+ Double.MAX_VALUE); //E308 significa 308 numeros + hacia la derecha
    }
    
}
