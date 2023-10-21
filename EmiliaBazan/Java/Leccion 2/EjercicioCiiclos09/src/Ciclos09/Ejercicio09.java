/*
 Ejercicio): Peedir el día, mes y año de una fecha e indicar si la
fecha es correcta suponiendo que todos los meses son de 30 días.
usando JOption
 */
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año: "));
        if ((dia !=0)&&(dia <= 30)){
            if ((mes !=0)&&(mes <= 12)){
                if ((anio !=0)&&(anio <= 2023)){
                }else {
                System.out.println("Fecha incorrecta, año incorrecto");}
            }else {
                System.out.println("Fecha incorrecta, mes incorecto");}
        }else {
                System.out.println("Fecha incorrecta, año incorecto");}
        System.out.println("El año ingresado es: "+dia+"/"+mes+"/"+anio);
    } 
    }
}
