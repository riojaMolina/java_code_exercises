import java.util.Date;

public class OrdenCompra {
    private static Integer identificador = 0;
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.id = ++identificador;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }
    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public int granTotal() {
        int total = 0;
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] != null) {
                total += this.productos[i].getPrecio();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        String res = "Orden de compra " + this.getId();
        res += "\n\tDescripcion: " + this.getDescripcion() + "\t\t\tFecha: " + this.getFecha();
        res += "\n\tCliente: " + this.getCliente();
        for (int i = 0; i < this.getProductos().length; i++) {
            if (this.getProductos()[i] != null) {
                res += "\n\tProducto " + (i + 1) + " => " + this.getProductos()[i];
            }
        }
        res += "\n\tTotal: " + this.granTotal();
        return res;
    }
}
