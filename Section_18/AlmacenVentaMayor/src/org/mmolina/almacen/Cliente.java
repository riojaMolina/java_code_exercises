package org.mmolina.almacen;

public class Cliente extends Persona {
    private Producto[] productos;

    public Cliente(String nombre, String apellido, Producto[] productos) {
        super(nombre, apellido);
        this.productos = productos;
    }

    @Override
    public String toString() {
        String res = super.toString() + "\n";
        if (productos != null && productos.length > 0) {
            double sum = 0.0;
            for (Producto p: productos) {
                res += "\t" + p.toString() + "\n";
                sum += p.getPrecio();
            }
            res += "\tTotal: " + sum;
        }
        return res;
    }
}
