package org.mmolina.almacen;

public class Alimenticio extends Producto {
    private int calorias;

    public Alimenticio(String nombre, double precio, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return super.toString() + " , calorias: " + calorias;
    }
}
