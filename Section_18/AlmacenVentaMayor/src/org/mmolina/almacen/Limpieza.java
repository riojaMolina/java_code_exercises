package org.mmolina.almacen;

public class Limpieza extends Producto {
    private double litros;

    public Limpieza(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
         return super.toString() + " , litros: " + litros;
    }
}
