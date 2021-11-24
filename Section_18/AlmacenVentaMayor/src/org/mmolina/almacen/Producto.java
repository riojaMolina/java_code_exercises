package org.mmolina.almacen;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + nombre + " , precio: " + precio;
    }
}
