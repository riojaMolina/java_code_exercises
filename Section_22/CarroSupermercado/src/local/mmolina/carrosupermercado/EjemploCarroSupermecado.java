package local.mmolina.carrosupermercado;


public class EjemploCarroSupermecado {
    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.add(new Lacteo("Leche", 100.0, 3, 200))
                .add(new Lacteo("Queso", 200.0, 1, 350))
                .add(new Lacteo("Yogur", 50.0, 2, 150))
                .add(new Lacteo("Manteca", 321.0, 1, 500))
                .add(new Lacteo("Queso crema", 250.0, 2, 300));

        bolsaLacteos.forEach(System.out::println);

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.add(new Fruta("Banana", 30.0, 5.5, "Amarillo"))
                .add(new Fruta("Melon", 120.0, 10.1, "Verde"))
                .add(new Fruta("Sandia", 100.1, 12.0, "Rojo"))
                .add(new Fruta("Manzana", 40.0, 6.0, "Verde"))
                .add(new Fruta("Naranja", 23.0, 3.0, "Naranja"));

        bolsaFrutas.forEach(System.out::println);

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.add(new Limpieza("Desodorande", 101.1, "Aroma tulipan", 2.0))
                .add(new Limpieza("Legia", 50.0, "Base nitrogenada", 1.0))
                .add(new Limpieza("Jabon", 200.2, "Aroma campestre", 3.0))
                .add(new Limpieza("Detergente", 40.0, "Jabon antigrasa", 0.5))
                .add(new Limpieza("Suavizante", 150.0, "Aroma floral", 3.0));

        bolsaLimpieza.forEach(System.out::println);

        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();
        bolsaNoPerecible.add(new NoPerecible("Fideo", 100.0, 1, 200))
                .add(new NoPerecible("Arroz", 50.5, 2, 100))
                .add(new NoPerecible("Yerba", 150.1, 1, 50))
                .add(new NoPerecible("Azucar", 45.4, 2, 300))
                .add(new NoPerecible("Sal", 35.1, 1, 100));

        bolsaNoPerecible.forEach(System.out::println);

    }
}
