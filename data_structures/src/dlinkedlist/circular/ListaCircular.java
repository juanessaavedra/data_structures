package dlinkedlist.circular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaCircular {
    private NodoC cab;
    private NodoC fin;
    private int cn;

    public ListaCircular() {
        cab = null;
        fin = null;
        cn = 0;
    }

    public void insertarNodoInicio(int valor) {
        NodoC nuevo = new NodoC(valor);
        if (cab == null) {
            cab = nuevo;
            nuevo.sig = nuevo;
            fin = nuevo;
        } else {
            nuevo.sig = cab;
            cab = nuevo;
            fin.sig = cab;
        }
        cn++;
    }

    public void borrarNodo(int pos) {
        if (cab == null || pos < 1 || pos > cn) {
            System.out.println("Posición inválida o lista vacía.");
            return;
        }

        NodoC actual = cab;
        if (pos == 1) { // Eliminar el primer nodo
            if (cn == 1) { // Si solo hay un nodo
                cab = fin = null;
            } else {
                cab = cab.sig;
                fin.sig = cab;
            }
        } else {
            for (int i = 1; i < pos - 1; i++) {
                actual = actual.sig;
            }
            NodoC nodoAEliminar = actual.sig;
            actual.sig = nodoAEliminar.sig;
            if (nodoAEliminar == fin) {
                fin = actual;
            }
        }
        cn--;
    }

    public void imprimirLista() {
        if (cab == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoC actual = cab;
        for (int i = 0; i < cn; i++) {
            System.out.print(actual.dato + " ");
            actual = actual.sig;
        }
        System.out.println();
    }

    public void destruirLista() {
        cab = fin = null;
        cn = 0;
    }
}
