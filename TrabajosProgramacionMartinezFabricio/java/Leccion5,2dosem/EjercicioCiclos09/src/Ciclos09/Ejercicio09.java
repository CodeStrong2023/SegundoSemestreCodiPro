/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar
si la fecha es correcta. Suponiendo que todos los meses son de 30 días.
*/
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int dia,mes,anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if ((dia!=0)&&(dia<=30)){
            if ((mes!=0)&&(mes<=12)){
                if ((anio!=0)&&(anio<=2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecto, año incorrecto ");
                } 
            }
            else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");
        }
    }
    }

