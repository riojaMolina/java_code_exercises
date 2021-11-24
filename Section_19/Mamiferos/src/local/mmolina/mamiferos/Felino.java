package local.mmolina.mamiferos;

public abstract class Felino extends  Mamifero {

    protected double garras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double garras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.garras = garras;
        this.velocidad = velocidad;
    }

    public double getGarras() {
        return garras;
    }
    public int getVelocidad() {
        return velocidad;
    }
}
