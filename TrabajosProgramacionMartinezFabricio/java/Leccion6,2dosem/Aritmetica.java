
package Operaciones;


public class Aritmetica { //Pascal case para la clase
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public Aritmetica(){ //Constructor 1 vacío
        System.out.println("Se está ejecutando este constructor N°1");
    }
    
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a,int b){ //Constructor 2
        this.a= a;
        this.b= b;
        System.out.println("Se está ejecutando el constructor N°2");
    }
    
    //Metodo
    public void sumaNumeros(){ //Camel case para metodos y atributos
        int resultado = a+b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a+b;
        return a+b;
    }
    public int sumarConArgumentos(int a, int b){
    this.a = a; //El argumento a se asigna al atributo this.a
    this.b = b;
    //return a+b;
    return this.sumarConRetorno();
}
}
