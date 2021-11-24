package org.mmolina.almacen;

public class AlmacenEjemplo {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new Perecedero("Leche", 100.0, 50, "25-12-2021");
        productos[1] = new NoPerecedero("Fideo", 155, 200, 200);
        productos[2] = new Limpieza("Jabon", 200, 3.5);

        Persona[] personas = new Persona[3];
        personas[0] = new Cliente("Martin", "Molina", productos);
        personas[1] = new Empleado("Ana", "Perez", 1);
        personas[2] = new Empleado("Julian", "Gomez", 2);

        for (Persona p: personas) {
            System.out.println(p);
        }

    }
}
