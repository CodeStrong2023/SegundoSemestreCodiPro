/*
Operadores unarios
 */
package operadoresunarios;

/*
 ******* @author AdrianaBalmaceda ******
 */
public class OperadoresUnarios {

    public static void main(String[] args) {
        var varA = 7; // uso de inferencia de tipos
        var varB = -varA; // cambio de signo
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        //Operador de negacion, aplica para variables tipo boolean
        var varC = true; // Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operadores unarios de incremento: preincremento
        var varE = 9; // se va a modificar su valor
        var varF = ++varE; // simbolo de incremento va antes de la variable
        // primero se incrementa la variable y despues se usa
        System.out.println("varE = " + varE); // se incrementa en la unidad
        System.out.println("varF = " + varF);  // va a sumar uno

        //Postincremento, el simbolo va despues de la variable
        var varG = 3;
        var varH = varG++; //primero lee el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores unarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); // la variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        //Postdecremento
        var varK = 8;
        var varL = varK--; // primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); // aqui va a decrementar en 1
        System.out.println("varL = " + varL);

        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum); // en la inferencia de tipos comprueba y regresa un true o false y se guarda en cNum
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum; // puede ir con parentesis
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB); // hace una comparacion interna del contenido de los objetos tipo string
        System.out.println("fVar = " + fVar);

        // Operadores relacionales: indican si un valor es igual o menor otro y si es igual o mayor
        // para cada comprobacion hay operadores diferentes:
        // >=   <   <=  ==  >   !=
        //var gVar = aNum >= bNum; 
        var gVar = aNum <= bNum;
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) { // usar llaves: boton der + format 
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
