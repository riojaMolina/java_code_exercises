package local.mmolina.carrosupermercado;

public abstract class Producto {
    protected String nombre;
    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : nombre= " + nombre + " , precio= " + precio + " , ";
    }
}
