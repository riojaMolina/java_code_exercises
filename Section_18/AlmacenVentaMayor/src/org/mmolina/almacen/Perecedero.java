package org.mmolina.almacen;

public class Perecedero extends Alimenticio {
    private String fechaVencimiento;

    public Perecedero(String nombre, double precio, int calorias, String fechaVencimiento) {
        super(nombre, precio, calorias);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " , fechaVenc: " + fechaVencimiento;
    }
}
