package local.mmolina.mamiferos;

public abstract class Canino extends Mamifero{

    protected String color;
    protected double colmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.colmillos = colmillos;
    }

    public String getColor() {
        return color;
    }
    public double getColmillos() {
        return colmillos;
    }
}
