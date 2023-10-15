/*
 * Operaciones aritmeticas
    argumentos
    operador this
 *constructor: es un metodo especial
objetivos: construye un objeto, reserva un espacio de memoria e 
inicializa los atributos de la clase
pasos: poner modificador de acceso tipo public, no se usa de tipo void ni entero
constructor con el nombre de la clase, por eso va en mayuscula, parametros
entre () inicializan los atributos, operador this apunta al atributo, 
el constructor sabe la diferencia entre el parametro que recibe como 
una variable y el atributo
 *la sobrecarga: agrega uno o mas constructores a la clase 
asignando valores u omitiendo valores

 */
package Operaciones;

/*
 * @Adrybalmaceda
 */
public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // El constructor es un metodo especial 
    // En este caso este constructor no haria falta ponerlo 
    // porque ya estaria por defecto pero si tenemos otro constructor mas
    //si haria falta porque no se estaria creando por defecto
    public Aritmetica() {  // constructor 1, omitimos valores
        System.out.println("Se esta ejecutando este constructor numero 1");
    }

    // sobrecarga de constructores y operador this
    public Aritmetica(int a, int b) {  // constructor 2, asignamos valores, inicializa atributos
        this.a = a;  
        this.b = b;
        System.out.println("Se esta ejecutando el constructor numero 2");
    }

    // Metodo
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // int resultado = a + b;  return resultado; // lo mismo con mas codigo
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;  // el argumentos a se asigna al atributo this.a
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
    }

}
