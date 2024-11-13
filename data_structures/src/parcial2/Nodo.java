package parcial2;

// Clase Nodo que representa cada pelota en el tubo
public class Nodo {
    int pelota; // Valor de la pelota
    Nodo siguiente; // Referencia al siguiente nodo en la pila

    public Nodo(int pelota) {
        this.pelota = pelota;
        this.siguiente = null; // Inicialmente, el siguiente nodo es null
    }
}