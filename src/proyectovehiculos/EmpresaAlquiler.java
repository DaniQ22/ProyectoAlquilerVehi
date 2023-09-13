/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectovehiculos;

/**
 *
 * @author Usuario
 */
public class EmpresaAlquiler {

    private String cif;
    private String pagina;
    private String nombre;
    private Cclientes cliente[];
    private int totalcliente;
    private Cvehiculo vehiculo[];
    private int totalvehiculo;
    private Calquiler alquileres[];
    private int totalalquileres;

    public EmpresaAlquiler(String cif, String pagina, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.pagina = pagina;
        this.cliente = new Cclientes[50];
        this.totalcliente = 0;
        this.vehiculo = new Cvehiculo[50];
        this.totalvehiculo = 0;
        this.alquileres = new Calquiler[100];
        this.totalalquileres = 0;

    }

    public Cclientes[] getCliente(String nif) {
        for (int i = 0; i < this.totalcliente; i++) {
            if (this.cliente[i].getNif().equals(nif)) {
                return cliente;
            }
        }
        return null;
    }

    public void setCliente(Cclientes[] cliente) {
        this.cliente = cliente;
    }

    public int getTotalcliente() {
        return totalcliente;
    }

    public void setTotalcliente(int totalcliente) {
        this.totalcliente = totalcliente;
    }

    public Cvehiculo[] getVehiculo() {

        return vehiculo;

    }

    public void setVehiculo(Cvehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
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

    public void setAlquileres(Calquiler[] alquileres) {
        this.alquileres = alquileres;
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
        this.cliente[this.totalcliente] = cliente;
        this.totalcliente++;
    }

    public void registrarVehiculo(Cvehiculo vehiculo) {
        this.vehiculo[this.totalvehiculo] = vehiculo;
        this.totalvehiculo++;
    }

    public String mostrarCliente() {
        String list = "";
        for (int i = 0; this.totalcliente < 10; i++) {
            list = "Nif Cliente: " + this.cliente[i].getNif() + " \n"
                    + "Nombre del Cliente: " + this.cliente[i].getNombre() + "\n"
                    + "Apellidos del cliente: " + this.cliente[i].getApellido();

        }
        return list;
    }

    public String mostrarVehiculos() {
        String list = "";
        for (int i = 0; i < this.getTotalvehiculo(); i++) {
            list = "Matricula del vehiculo; " + this.vehiculo[i].getMatricula() + "\n"
                    + "Modelo del vehiculo" + this.vehiculo[i].getModelo() + "\n"
                    + "Tarifa del Vehiculo" + this.vehiculo[i].getTarifa() + "\n"
                    + "Disponobilidad del Vehiculo:" + this.vehiculo[i].getDisponible();
        }
        return list;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cclientes clie = this.buscarcli(nif);
        Cvehiculo veh = this.buscarvehiculo(matricula);
        dias = 0;
        for (int i = 0; i < this.totalvehiculo; i++) {
            if (veh.getDisponible()) {
                veh.setDisponible(false);
                
                alquileres[this.totalalquileres] = new Calquiler (clie, veh, dias);
                this.totalalquileres++;

            }

        }

    }

    public Cclientes buscarcli(String nif) {
        for (int i = 0; i < this.totalcliente; i++) {
            if (this.cliente[i].getNif().equals(nif)) {
                return this.cliente[i];
            }

        }
        return null;
    }

    public Cvehiculo buscarvehiculo(String matricula) {
        for (int i = 0; i < this.totalvehiculo; i++) {
            if (this.vehiculo[i].getMatricula().equals(matricula)) {
                return this.vehiculo[i];
            }
        }
        return null;

    }

}
