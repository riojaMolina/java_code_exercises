package org.mmolina.verduleria;

import org.mmolina.almacen.Producto;

public class VerduleriaEjemplo {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Lacteo("Leche", 100.0, 2, 50);
        productos[1] = new Lacteo("Queso", 250.0, 1, 200);
        productos[2] = new Fruta("Banana", 50, 1.5, "Amarillo");
        productos[3] = new Fruta("Pera", 70, 1.0, "Verde");
        productos[4] = new Limpieza("Desodorante", 60.5, "Aroma tulipan", 1.5);
        productos[5] = new Limpieza("Jabon", 105, "Floral", 1.0);
        productos[6] = new NoPerecible("Arroz", 65.5, 60, 150);
        productos[7] = new NoPerecible("Fideo", 70, 80, 340);

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto #" + (i+1) + " " + productos[i]);
        }
    }
}
