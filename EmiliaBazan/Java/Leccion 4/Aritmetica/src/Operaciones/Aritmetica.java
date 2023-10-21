package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
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
