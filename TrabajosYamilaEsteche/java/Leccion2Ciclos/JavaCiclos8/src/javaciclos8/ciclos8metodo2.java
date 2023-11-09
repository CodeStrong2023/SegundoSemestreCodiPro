
package javaciclos8;

import javax.swing.JOptionPane;

/**
 *
 * @author yami
 */
public class ciclos8metodo2 {
         public static void main(String[] args) {
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int i = 1;
        while( i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;}
    }
    
    
}
