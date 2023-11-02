/*
 * Sintaxis Java: package "va en minuscula"
 */
package caja;  // Package

/*
 * @Adrybalmaceda
 */
public class Caja {  // Clase publica caja
    // Atributos(caracteristicas)

    int ancho;
    int alto;
    int profund;

    // Metodos y constructores(son las acciones)
    public Caja() {  // Constructor 1 = vacio

    }

    // Constructor con parametros (para recibir argumentos)
    public Caja(int ancho, int alto, int profund) {  // Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profund = profund;

    }

    public int calcularVolumen() {  // Metodo para calcular
        return ancho * alto * profund;
    }

}
