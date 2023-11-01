/* pedir un numero y calcular su factorial */
package javaciclos12;

import javax.swing.JOptionPane;

/**
 *
 * @author yami
 */
public class JavaCiclos12 {
    public static void main(String[] args) {
        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial del numero es " + factorial);   
    }
    
    
    /* con Scanner
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite un numero");
      int numero = Integer.parseInt(entrada.nextLine());
      factorial *= numero;
      System.out.println("\n El factorial del numero es" +factorial);
    */
    
}
