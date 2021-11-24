package local.mmolina.mamiferos;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, colmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro tiene que comer balanceado pero tiene mordida de " + fuerzaMordida + " psi";
    }
    @Override
    public String dormir() {
        return "El Perro duerme bien en su habitat " + habitat;
    }
    @Override
    public String correr() {
        return "El Perro corre en el patio de su casa";
    }
    @Override
    public String comunicarse() {
        return "El Perro se comunica con ladridos";
    }
}
