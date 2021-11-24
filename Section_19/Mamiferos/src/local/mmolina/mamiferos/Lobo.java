package local.mmolina.mamiferos;

public class Lobo extends Canino {

    private int numCamada;
    private String especie;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos, int numCamada, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, color, colmillos);
        this.numCamada = numCamada;
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El Lobo caza con su camada de " + numCamada + "lobos";
    }
    @Override
    public String dormir() {
        return "El Lobo " + especie + " duerme bien solo";
    }
    @Override
    public String correr() {
        return "El Lobo corre bien en su habitat " + habitat;
    }
    @Override
    public String comunicarse() {
        return "El Lobo se comunica solo con su especie " + especie;
    }
}
