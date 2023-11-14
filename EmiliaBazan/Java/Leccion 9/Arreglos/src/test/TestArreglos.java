package test;


public class TestArreglos {
    public static void main(String[] args) { //Lado derecho instanciamos un objeto tipo objet
        int edades [] = new int [3]; //lado izquierdo declaramos la variable
        System.out.println("edades = " + edades); 
        
        //Con arreglos no se puede trabajar de manera dinámica, no se pueden agregar
        //Valores al arreglo ya que está limitado a 3
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 22;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 18;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3]= 7;//Fuera de rango, error en tiempo de ejecución
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]);
        }
    }
}
