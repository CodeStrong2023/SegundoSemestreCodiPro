
package caja;


public class pruebaCaja {
    public static void main(String[] args) {
        //Variables locales:
        int medidaAncho = 3;
        int medidaAlto = 2; 
        var medidaProfundidad = 6;
        
        proyectoCaja caja1 = new proyectoCaja(); //Instanciamos el objeto
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProfundidad;
        
        int resultado = caja1.calcularVolumen();
        
        System.out.println("Resultado volumen caja1: " + resultado);
        
        proyectoCaja caja2 = new proyectoCaja(2,4,6);
        
        System.out.println("Resultado volumen caja2: "+ caja2.calcularVolumen());
    }
}
