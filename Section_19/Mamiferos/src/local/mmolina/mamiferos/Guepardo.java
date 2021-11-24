package local.mmolina.mamiferos;

public class Guepardo extends Felino {

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo de suele cazar solo";
    }
    @Override
    public String dormir() {
        return "El Guepardo duerme en su " + habitat + " tranquilo";
    }
    @Override
    public String correr() {
        return "El Guepardo corre a una valocidad de " + velocidad + "km/h";
    }
    @Override
    public String comunicarse() {
        return "El Guepardo se comunica bien a rugidos";
    }
}
