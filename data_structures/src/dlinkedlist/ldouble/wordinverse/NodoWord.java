package dlinkedlist.ldouble.wordinverse;

/**
 * Representa un nodo en una lista loblemente enlazada
 * Cada noto contiene una palabra y su longitud
 */
public class NodoWord {

    String palabra;

    int longitud;


    NodoWord anterior;


    NodoWord siguiente;


    NodoWord(String palabra) {
        this.palabra = palabra;
        this.longitud = palabra.length();
    }
}
