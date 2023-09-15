/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectovehiculos;

import java.util.Calendar;
import javax.swing.JOptionPane;


/*HERE!!! te recomiento usar esa librería para capturar la fecha y hora actual 
  // para el momento del alquiler que debe usar f y h actuales, consulta como obtener valores con esta librería en 
  // http://puntocomnoesunlenguaje.blogspot.com/2013/11/obtener-fecha-actual-en-java.html 
/**
 *
 * @author Usuario
 */
public class EmpresaAlquiler {

    private String cif;
    private String pagina;
    private String nombre;
    private Cclientes[] clientes;
    private int totalcliente;
    private Cvehiculo[] vehiculos;
    private int totalvehiculo;
    private Calquiler[] alquileres;
    private int totalalquileres;

    public EmpresaAlquiler() {

        this.clientes = new Cclientes[50];
        this.totalcliente = 0;
        this.vehiculos = new Cvehiculo[50];
        this.totalvehiculo = 0;
        this.alquileres = new Calquiler[100];
        this.totalalquileres = 0;

    }

    public Cclientes getClientes(String nif) {
        for (int i = 0; i < this.getTotalcliente(); i++) {
            if (this.clientes[i].getNif().equals(nif)) {
                return clientes[i];
            }

        }
        return null;

    }

    public void setClientes(Cclientes[] cliente) {
        this.clientes = cliente;
    }

    public int getTotalcliente() {
        return totalcliente;
    }

    public void setTotalcliente(int totalcliente) {
        this.totalcliente = totalcliente;
    }

    public Cvehiculo getVehiculos(String matricula) {
        for (int i = 0; i < this.getTotalvehiculo(); i++) {
            if (this.vehiculos[i].getMatricula().equals(matricula)) {
                return vehiculos[i];

            }

        }

        return null;

    }

    public void setVehiculos(Cvehiculo vehiculo) {
        this.vehiculos[this.totalvehiculo] = vehiculo;
        this.totalvehiculo++;

    }

    public int getTotalvehiculo() {
        return totalvehiculo;
    }

    public void setTotalvehiculo(int totalvehiculo) {
        this.totalvehiculo = totalvehiculo;
    }

    public Calquiler[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Calquiler alquileres) {
        this.alquileres[this.totalalquileres] = alquileres;
        this.totalalquileres++;
    }

    public int getTotalalquileres() {
        return totalalquileres;
    }

    public void setTotalalquileres(int totalalquileres) {
        this.totalalquileres = totalalquileres;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarCliente(Cclientes cliente) {
        this.clientes[this.totalcliente] = cliente;
        this.totalcliente++;
    }

    /*public void registrarVehiculo(Cvehiculo vehiculo) {
        this.vehiculo[this.totalvehiculo] = vehiculo;
        this.totalvehiculo++;
    }*/
    public String mostrarCliente() {
        String list = "";
        for (int i = 0; i < this.getTotalcliente(); i++) {
            list += "Nif Cliente: " + this.clientes[i].getNif() + " \n"
                    + "Nombre del Cliente: " + this.clientes[i].getNombre() + "\n"
                    + "Apellidos del cliente: " + this.clientes[i].getApellido() + "\n";

        }
        return list;
    }

    public String mostrarVehiculos() {
        String list = "";
        for (int i = 0; i < this.getTotalvehiculo(); i++) {
            list += "Matricula del vehiculo; " + this.vehiculos[i].getMatricula() + "\n"
                    + "Modelo del vehiculo" + this.vehiculos[i].getModelo() + "\n"
                    + "Tarifa del Vehiculo" + this.vehiculos[i].getTarifa() + "\n"
                    + "Disponobilidad del Vehiculo:" + this.vehiculos[i].getDisponible() + "\n";
        }
        return list;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {

        Calendar fecha = Calendar.getInstance();
        int DiaHoy = fecha.get(Calendar.DAY_OF_MONTH);
        int MesHoy = fecha.get(Calendar.MONTH);
        int AñoHoy = fecha.get(Calendar.YEAR);

        Cclientes cliente = this.buscarcli(nif);
        Cvehiculo vehiculo = this.buscarvehiculo(matricula);

        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);

            /* alquileres[this.totalalquileres] = new Calquiler (clie, veh, dias); /* ---- Estás enviando los argumentos clie, veh y dias 
                que la clase Calquiles no tiene. Debes declarar los parámetros en dicha clase para que cuando envíes estos argumentos
                no te salte ese error. Debo resaltar que  cuando tú le envías argumentos a tráves de un constructor que recibe parámetros
                ya no es necesario inicializarlos en 0, null o "" para los string, ¿por qué? bueno porque algunos de sus atributos como en este caso
                el cliente y el vehículo YA EXISTEN, por lo tanto, al crear una instancia de esa clase, esos atributos ya NO DEBERÁN INICIAR EN O o vac+io
                te recuerdo que esa clase necesita instancias de veh+iculo y cliente que ya deben existir, Exitos, no te rindas!!
             */
 /*this.totalalquileres++;*/
            this.alquileres[this.totalalquileres] = new Calquiler(cliente, vehiculo, dias, MesHoy, AñoHoy, DiaHoy);
            this.totalalquileres++;

        }

    }

    public String mostrarAlquiler() {
        String lis = "";
        for (int i = 0; i < this.getTotalalquileres(); i++) {
            lis += "Cliente de alquiler:" + this.alquileres[i].getCliente().nombre + "\n"
                    + "Vehiculo alquilado:" + this.alquileres[i].getVehiculo().matricula + "\n"
                    + "Dias alquilado:" + this.alquileres[i].getTotalDiasalquilado() + " \n"
                    + "Dia del alquiler: " + this.alquileres[i].getDiaAlquiler() + "/" + this.alquileres[i].getMesAlquiler()
                    + "/" + this.alquileres[i].getAñoAlquiler();

        }

        return lis;
    }

    public Cclientes buscarcli(String nif) {
        Cclientes encontrar = null;
        for (int i = 0; i < this.totalcliente; i++) {
            if (this.clientes[i].getNif().equals(nif)) {
                encontrar = this.clientes[i];
            } else {
                return null;
            }

        }
        return encontrar;
    }

    public Cvehiculo buscarvehiculo(String matricula) {
        Cvehiculo vehiculo = null;
        for (int i = 0; i < this.totalvehiculo; i++) {
            if (this.vehiculos[i].getMatricula().equals(matricula)) {
                vehiculo = this.vehiculos[i];
            } else {
                return null;
            }
        }
        return vehiculo;

    }

    public void recibirvehiculo(String matricula) {
        Cvehiculo vehiculo = this.getVehiculos(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }
    }
}
