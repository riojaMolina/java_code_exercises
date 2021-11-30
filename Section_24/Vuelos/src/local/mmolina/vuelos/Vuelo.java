package local.mmolina.vuelos;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fecha;
    private int cantPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fecha, int cantPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.cantPasajeros = cantPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo " + nombre + " , origen: " + origen + " , destino: " + destino + " , fecha: " + fecha + " , cantPasajeros: " + cantPasajeros;
    }
}
