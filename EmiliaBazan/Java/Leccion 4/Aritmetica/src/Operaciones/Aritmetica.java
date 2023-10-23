package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El contructor es un método especial
    public Aritmetica(){ //Constructor 1
        System.out.println("Se esta ejecutando el contructor nro1");
    }
    //Vemos lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor2
        this.a=a;
        this.b=b;
        
        System.out.println("Se esta ejecutando el contructor nro2");
    }
    //Método
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("El resultado es: "+resultado);
    }
    public int sumarConRetorno(){
    return a+b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El arg a se asigna al atributo this.a
        this.b = b;
        //return a + b;   
        return sumarConRetorno();
    }
}
