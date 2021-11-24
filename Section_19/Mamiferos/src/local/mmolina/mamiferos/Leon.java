package local.mmolina.mamiferos;

public class Leon extends Felino {

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El Leon caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }
    @Override
    public String dormir() {
        return "El Leon duerme en su " + habitat + " tranquilo";
    }
    @Override
    public String correr() {
        return "El Leon corre a una valocidad de " + velocidad + "km/h";
    }
    @Override
    public String comunicarse() {
        return "El Leon se comunica a una potencia de "+ potenciaRugidoDecibel + " decibeles";
    }
}
