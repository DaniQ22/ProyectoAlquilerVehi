/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectovehiculos;

/**
 *
 * @author Usuario
 */
public class Calquiler {
   private Cclientes cliente;
   private Cvehiculo vehiculo;
   private int diaAlquiler;
   private int mesAlquiler;
   private int añoAlquiler;
   private int totalDiasalquilado;
   
   
   public Calquiler(){                    /*    Debes recibir por parámetros aquí    */
       this.cliente = new Cclientes();
       this.vehiculo = new Cvehiculo();   /* Cuando recibes un valor pro parámetro a través del constructor significa que ya esos valores están definidos antes
       de crear la instancia de la clase en cuestión entonces no es necesario incializar en 0, null o "" */
       this.añoAlquiler = 0;
       this.diaAlquiler = 0;
       this.totalDiasalquilado = 0;
   }

    public Cclientes getCliente() {
        return cliente;
    }

    public void setCliente(Cclientes cliente) {
        this.cliente = cliente;
    }

    public Cvehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Cvehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAñoAlquiler() {
        return añoAlquiler;
    }

    public void setAñoAlquiler(int añoAlquiler) {
        this.añoAlquiler = añoAlquiler;
    }

    public int getTotalDiasalquilado() {
        return totalDiasalquilado;
    }

    public void setTotalDiasalquilado(int totalDiasalquilado) {
        this.totalDiasalquilado = totalDiasalquilado;
    }
   
   
   
   

    
    
}
