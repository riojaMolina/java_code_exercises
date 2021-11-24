package org.mmolina.almacen;

public class NoPerecedero extends Alimenticio {
    private int cantidad;

    public NoPerecedero(String nombre, double precio, int calorias, int cantidad) {
        super(nombre, precio, calorias);
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return super.toString() + " , cantidad: " + cantidad;
    }

}
