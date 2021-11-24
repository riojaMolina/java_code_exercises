package local.mmolina.mamiferos;

public class Tigre extends Felino {

    private String especie;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El Tigre de suele cazar solo o en manada";
    }
    @Override
    public String dormir() {
        return "El Tigre duerme en su " + habitat + " tranquilo";
    }
    @Override
    public String correr() {
        return "El Tigre corre a una valocidad de " + velocidad + "km/h";
    }
    @Override
    public String comunicarse() {
        return "El Tigre se comunica bien con su misma especie " + especie;
    }
}
