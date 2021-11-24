package org.mmolina.compania;

public class PersonasCompaniaEjemplo {
    public static void main(String[] args) {
        Persona g = new Gerente("Martin", "Molina", "1223334444", "Local 1", 100.0, 1, 1000.0);
        Persona e = new Empleado("Ana", "Molina", "4444333221", "Local 2", 50.0, 2);
        Persona c = new Cliente("Adriana", "Conci", "1234567890", "Street 1", 2);
        System.out.println(g);
        System.out.println();
        System.out.println(e);
        System.out.println();
        System.out.println(c);
    }
}
