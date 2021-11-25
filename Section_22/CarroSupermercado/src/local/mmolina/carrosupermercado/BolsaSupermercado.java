package local.mmolina.carrosupermercado;

import java.util.*;

public class BolsaSupermercado<T> implements Iterable<T> {

    private List<T> objetos;
    private int max = 5;

    public BolsaSupermercado() {
        this.objetos = new ArrayList<>();
    }

    public BolsaSupermercado<T> add(T objeto) {
        if (this.objetos.size() < max) {
            this.objetos.add(objeto);
            return this;
        }
        else {
            throw new RuntimeException("no hay mas espacio.");
        }
    }

    public List<T> getProductos() {
        return this.getProductos();
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
