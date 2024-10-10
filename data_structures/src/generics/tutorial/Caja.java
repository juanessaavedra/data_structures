package generics.tutorial;

public class Caja <T> {
    private T contenido;

    public void ponerAlgo (T contenido) {
        this.contenido = contenido;
    }

    public T sacarAlgo() {
        return contenido;
    }
}
