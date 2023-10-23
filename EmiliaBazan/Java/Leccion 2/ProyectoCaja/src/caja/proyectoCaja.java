/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;


public class proyectoCaja {
    int ancho;
    int alto; 
    int profundidad;
    
    //Constructor vacío:
    public proyectoCaja(){
    }
    
    //Constructor con argumentos:
    public proyectoCaja(int ancho, int alto, int profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    //Método para calcular volumen: 
    public int calcularVolumen(){
    return ancho*alto*profundidad;
    }
}
            