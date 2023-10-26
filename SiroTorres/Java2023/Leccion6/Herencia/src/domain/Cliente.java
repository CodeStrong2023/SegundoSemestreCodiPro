
package domain;

import java.util.Date;

public class Cliente extends Persona {
    //Atribuutos
    private int idCliente;
    private Date fechaRegistro; //Importar la clase Date
    private boolean vip; //Very important person
    private static int contadorCliente; //Tipo Estatico
    
    //Constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", =").append(super.toString());
        //Mediante el super.toString llamamos al ToString de la clase PADRE
        sb.append('}');
        return sb.toString();
    }
    
    
}
