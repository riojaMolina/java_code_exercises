import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra compra1 = new OrdenCompra("Compra de articulos de baño");
        compra1.setCliente(new Cliente("Adriana", "Conci"));
        compra1.setFecha(new Date());
        compra1.addProducto(new Producto("Ayudin", "Lavandina", 100));
        compra1.addProducto(new Producto("Poet", "Desodorante", 90));
        compra1.addProducto(new Producto("Dove", "Jabon tocador", 50));
        compra1.addProducto(new Producto("Rexona", "Desodorante corporal", 75));

        OrdenCompra compra2 = new OrdenCompra("Compra de articulos de almacen");
        compra2.setCliente(new Cliente("Julieta", "Molina"));
        compra2.setFecha(new Date());
        compra2.addProducto(new Producto("Natura", "Aceite", 250));
        compra2.addProducto(new Producto("iLolay", "Leche", 101));
        compra2.addProducto(new Producto("Playadito", "Yerba", 300));
        compra2.addProducto(new Producto("Oreo", "Galletas", 130));

        OrdenCompra compra3 = new OrdenCompra("Compra de bebidas");
        compra3.setCliente(new Cliente("Martin", "Molina"));
        compra3.setFecha(new Date());
        compra3.addProducto(new Producto("Branca", "Fernet", 721));
        compra3.addProducto(new Producto("Coca-Cola", "2.25lts", 221));
        compra3.addProducto(new Producto("Paso de los Toros", "Pomelo", 200));
        compra3.addProducto(new Producto("Chandon", "Extra Brut", 800));

        System.out.println(compra1 + "\n");
        System.out.println(compra2 + "\n");
        System.out.println(compra3);

    }
}
