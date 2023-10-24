
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un metodo especial
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando este constructor numero uno");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero dos");
    }
    
    //Metodo
    public void sumarNumeros(){
         int resultado = a + b;
         System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //EL argumento a se asigna al atributo this.a
        this.b = arg2; //This es un recurso que nos permite que sea mas legible nuestro codigo
        //This tambien no ayuda a diferenciar un arguumento de un atributo, incluso teniendo el mismo nombre
        //return a + b;
        return this.sumarConRetorno();
        
    }
    
}
