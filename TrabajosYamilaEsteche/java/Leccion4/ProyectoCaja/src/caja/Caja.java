
package caja;

/**
 *
 * @author yami
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    //(acciones)
    public Caja(){ //Constructor  = vacio
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundo){ 
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() { 
        return ancho * alto * profundo;
    }
    
}
