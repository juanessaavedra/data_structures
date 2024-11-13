package parcial2;

// Clase TuboPelotas que representa un tubo de pelotas, implementado como una pila
public class TuboPelotas {
    private Nodo cima; // Referencia al nodo en la cima de la pila
    private int contador; // Contador de pelotas en el tubo

    // Constructor que inicializa el tubo vacío
    public TuboPelotas() {
        this.cima = null; // Inicialmente, la cima es null
        this.contador = 0; // Inicialmente, el contador es 0
    }

    // Método para llenar el tubo con 3 pelotas
    public void llenarTubo() {
        for (int i = 1; i <= 3; i++) {
            Nodo nuevo = new Nodo(i); // Crear un nuevo nodo con el valor de la pelota
            nuevo.siguiente = cima; // El siguiente nodo del nuevo nodo es la cima actual
            cima = nuevo; // La nueva cima es el nuevo nodo
            contador++; // Incrementar el contador de pelotas
        }
    }

    // Método para usar una pelota del tubo
    public int usarPelota() {
        if (cima == null) {
            return -1; // Indica que el tubo está vacío
        }
        int pelota = cima.pelota; // Obtener el valor de la pelota en la cima
        cima = cima.siguiente; // La nueva cima es el siguiente nodo
        contador--; // Decrementar el contador de pelotas
        return pelota; // Devolver el valor de la pelota usada
    }

    // Método para obtener el número de pelotas en el tubo
    public int getPelotas() {
        return contador; // Devolver el contador de pelotas
    }
}