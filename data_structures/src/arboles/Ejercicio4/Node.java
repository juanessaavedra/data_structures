package arboles.Ejercicio4;

/**
 * Clase que implementa un árbol binario fijo de 5 niveles y encuentra el nivel de un nodo específico.
 *
 * @author Ana Lucelly Lizcano
 * @author Juan Esteban Saavedra
 * @author Esteban Salazar Mejía
 * @author Diego Alejandro Ramírez
 * @version 1.0
 * @date 11 de noviembre del 2024
 * @license GNU GPL
 */

class Node {
    int valor;
    Node left;
    Node right;

    public Node(int valor) {
        this.valor = valor;
        this.left = null;
        this.right = null;
    }
}
