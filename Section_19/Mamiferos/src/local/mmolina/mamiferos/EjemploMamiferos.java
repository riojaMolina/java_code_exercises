package local.mmolina.mamiferos;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];
        mamiferos[0] = new Leon("Africa", 2, 2, 40, "Lion", 10, 40, 6, 5.5);
        mamiferos[1] = new Tigre("Sur Africa", 1, 2, 45, "Tiger", 20, 45, "Blanco");
        mamiferos[2] = new Guepardo("Sudamerica", 1.5, 3, 50, "Guepar", 15, 50);
        mamiferos[3] = new Lobo("America", 1, 1, 30, "Wolf", "Gris", 20, 5, "Americano");
        mamiferos[4] = new Perro("Mundial", 1,2,4.5, "Dogi", "Multicolor", 30, 25);

        for (Mamifero m: mamiferos) {
            System.out.println(m.comer());
            System.out.println(m.dormir());
            System.out.println(m.correr());
            System.out.println(m.comunicarse());
            System.out.println();
        }
    }
}
