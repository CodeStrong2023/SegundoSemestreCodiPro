/* 
Ejercicio): Peedir el día, mes y año de una fecha e indicar si la
fecha es correcta suponiendo que todos los meses son de 30 días.
*/
package Ciclos09;

import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dia: ");
        int dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite año: ");
        int anio = Integer.parseInt(entrada.nextLine());
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
