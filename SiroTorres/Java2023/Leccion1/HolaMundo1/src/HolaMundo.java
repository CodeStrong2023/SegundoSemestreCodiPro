
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola mundo desde java");
        
        int miVariable = 10; 
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */
        //Var - Inferencia de datos en Java.
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Para ejecutar shift + f6
        //Reglas para definiri una variable en java.
        //El primer caracter puede tener una letra pero no numeros, y puede 
        // comenzar con un guion bajo, puede comenzar con el signo $, tildes.

        var usuario = "Osvaldo";
        var titulo = "Igeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        //Ejercicio: Caracteres especiales con java
        var nombre = "Natalia";
        System.out.println("Nueva linea: \n" + nombre); //Diagonal inversa y letra N
        System.out.println("Tabulador: \t" + nombre); //Tabulador = un espacio para centrar
        System.out.println("\t . :Menu: . ");
        System.out.println("Retroceso: \b"+ nombre ); //Caracter de retroceso. Elimina el espacio que hay antes del \b
        System.out.println("Comillas simples: \'"+ nombre+ "\'");
        System.out.println("Comillas dobles: \""+nombre+"\"");*/

        //Clase Scanner
        /*Scanner entrada = new Scanner (System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+ titulo2+" "+usuario2);*/
 /*byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte "+  Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte "+  Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short " +  Short.MIN_VALUE);
        System.out.println("Valor maximo del Short " +  Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int " +   Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int " +   Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long " +   Long.MIN_VALUE);
        System.out.println("Valor maximo del Long " +   Long.MAX_VALUE);
        
        /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de Float es: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de Float es: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double es: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de Double es: " + Double.MAX_VALUE);*/
        //Inferencia de tipos var y tipos primitivos.
        /*var numEntero = 20; //las literales sin punto son automaticamente de tipo INT
        System.out.println("numEntero = " + numEntero);
      var numFloat = 10.0F; //Automaticamente con el punto decimal se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
      var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        //Tipos primitivo char
        /*char miVariable = 'a';
        System.out.println("miVariable = " + miVariable);
        char varCaracter = '\u0024'; //Indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Un caracter especial podemos copiar y pegar desde UNICODE
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        System.out.println("");
      
        var varCaracter1 = '\u0024'; //Indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; //Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //Un caracter especial podemos copiar y pegar desde UNICODE
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        System.out.println("");
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        //Tipos primitivos booleanos
        /*boolean varBool = false;
        System.out.println("varBool = " + varBool);
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        System.out.println(""); //Salto de linea, por que me da toc
       //Algoritmo: es mayor de edad?
       var edad = 18; //Literal tener presente la inferencia de tipos
       //var adulto = edad >= 18; //Esta es una expresion booleana
       if(edad >=18){
           System.out.println("Eres mayor de edad");
       }
       else{
           System.out.println("Eres menor de edad");
         */
        //Conversion de tipos primitivos.
//      var edad =Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        System.out.println("");
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //Pedir un valor.
//var entrada = new Scanner(System.in);
////        System.out.println("Digite su edad:");
////        edad = Integer.parseInt (entrada.nextLine());
////        System.out.println("edad = " + edad);
////        
////      //Conversion de tipos primitivos en java parte 2
////      var edadTexto = String.valueOf(10);
////        System.out.println("edadTexto = " + edadTexto);
//        
//      var fraseChar = "Programadores".charAt(12);
//        System.out.println("fraseChar = " + fraseChar);
//        System.out.println("");
//        System.out.println("Digite un caracter: ");
//      fraseChar = entrada.nextLine().charAt(3);
//        System.out.println("fraseChar = " + fraseChar);
//   
/*
     int num1 = 5, num2 =4;
     var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
     solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
     
     solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
      
     solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
     var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la divison = " + solucion2);
     
     solucion = num1 % num2; //Guarda el residuo entero de la division
        System.out.println("solucion2 = " + solucion);
        
       if (num1 %2 == 0)
            System.out.println("Es un numero par");
       else
            System.out.println("Es un numero impar");*/
 /*int varNum1 = 1, varNum2 =4;
int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; // varNum1 = varNum1 + 1 (reducido)
        System.out.println("varNum1 = " + varNum1);
        varNum2 -= 2;
        System.out.println("varNum1 (resta) = " + varNum2);
        
        varNum1 *= 5;
        System.out.println("varNum1 (mutplicacion)= " + varNum1);
        
        varNum3 /= 4;
        System.out.println("varNum1 (division)= " + varNum3);
        
        varNum1 %= 6;
        System.out.println("varNum1 (residuo) = " + varNum1);*/

 /*//Operadores unarios: Cambio de signo
     var varA = 7;
     var varB = - varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        System.out.println(""); 
        
        
//Operador de negacion 
    var varC = true;
    var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        System.out.println("");
       
//Operadores Unarios de incremento: Preincremento
    var varE = 9; //Se va a modificar su valor.
    var varF = ++varE; //Simbolo antes de la variable
    //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); //Va a sumar uno 
        System.out.println("");
        
//Postincremento (el simbolo va despues de la variable)
    var varG = 3;
    var varH = varG++; //Primero vemos el valor de la variable y despues el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        System.out.println("");
//Operadores unarios de Decremento. Predecremento
    var varI = 4;
    var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        System.out.println("");

//Postdecremento
    var varK = 8;
    var varL = varK--;//Primero el valor de la variable, despues queda el decremento
        System.out.println("varK = " + varK); //Aca va el decremento en 1
        System.out.println("varL = " + varL);*/
//Operadores de igualdad y relacionales
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        System.out.println("");

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        System.out.println("");

        var cadenaA = "Hello";
        var cadenaB = "Bye bye";
        var cadenaC = cadenaA == cadenaB; //Comparacion de referencia de objetos
        System.out.println("cadenaC = " + cadenaC);
        System.out.println("");
        var fVar = cadenaA.equals(cadenaB); //Comprobamos si el contenido de las cadenas son iguales
        System.out.println("fVar = " + fVar);
        System.out.println("");

        var gVar = aNum >= bNum;
        System.out.println("gVar = " + gVar);
        System.out.println("");
        if (aNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        System.out.println("");*/
        //Operador condicional an && (solo es verdadero si ambos son verdaderos)
        /*var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }
        //Operador condicional or (solo es verdadero si uno es verdadero y otro es falso, solo es falso si ambos son falsos)
        var diaLibre = false;
        var vacaciones = false;
        if (vacaciones || diaLibre) {
            System.out.println("Papa puede asisitir al juego");
        } else {
            System.out.println("Papa no puede asistir al juego");
        }*/
        //Operador ternario
        /*var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Par" : "Impar";
        System.out.println("resultadoT = " + resultadoT);*/
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("");
        
        var solucionAritmetica = 4 + 5 * 6 / 3; //
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        var solucionArimetica = (4 + 5) * 6 / 3; // Prioriza los parentesis, por eso cambia el resultado
        System.out.println("solucionArimetica = " + solucionArimetica);
        
        
    }
}

