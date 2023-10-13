/*
 * Operaciones aritmeticas
    argumentos
    operador this
 */
package Operaciones;

/*
 * @Adrybalmaceda
 */
public class Aritmetica {

    // Atributos de la clase
    int a;
    int b;

    // Metodo
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // int resultado = a + b;  return resultado; // lo mismo con mas codigo
        return this.a + this.b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;  // el argumentos a se asigna al atributo this.a
        this.b = arg2;
        // return a + b;
        return this.sumarConRetorno();
    }

}
