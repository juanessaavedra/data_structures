package dlinkedlist.ldouble.wordinverse;

public class ListaDBEword {

        // Nodo que representa el inicio de la lista
        private NodoWord cabeza;
        // Nodo que representa el final de la lista
        private NodoWord cola;


        public void insertarOracion(String oracion) {
            // Divide la oración en palabras usando espacios como separadores
            String[] palabras = oracion.split("\\s+");
            // Inserta cada palabra al final de la lista
            for (String palabra : palabras) {
                insertarAlFinal(palabra);
            }
        }

        private void insertarAlFinal(String palabra) {
            // Crea un nuevo nodo con la palabra
            NodoWord nuevoNodo = new NodoWord(palabra);
            if (cabeza == null) {
                // Si la lista está vacía, el nuevo nodo es tanto la cabeza como la cola
                cabeza = cola = nuevoNodo;
            } else {
                // Si no está vacía, añade el nuevo nodo al final
                cola.siguiente = nuevoNodo;
                nuevoNodo.anterior = cola;
                cola = nuevoNodo;
            }
        }

        public void imprimirOrdenInverso() {
            NodoWord actual = cola;
            while (actual != null) {
                // Imprime cada palabra con su longitud entre paréntesis
                System.out.print(actual.palabra + "(" + actual.longitud + ") ");
                actual = actual.anterior;
            }
            System.out.println();
        }


        public void borrarNodo(String palabra) {
            NodoWord actual = cabeza;
            while (actual != null) {
                if (actual.palabra.equals(palabra)) {
                    // Si encuentra la palabra, ajusta los enlaces para remover el nodo
                    if (actual.anterior != null) {
                        actual.anterior.siguiente = actual.siguiente;
                    } else {
                        // Si es el primer nodo, actualiza la cabeza
                        cabeza = actual.siguiente;
                    }
                    if (actual.siguiente != null) {
                        actual.siguiente.anterior = actual.anterior;
                    } else {
                        // Si es el último nodo, actualiza la cola
                        cola = actual.anterior;
                    }
                    return;
                }
                actual = actual.siguiente;
            }
            System.out.println("Palabra no encontrada.");
        }

        public void imprimirPalabraAnteriorYSiguiente(String palabra) {
            NodoWord actual = cabeza;
            while (actual != null) {
                if (actual.palabra.equals(palabra)) {
                    // Si encuentra la palabra, imprime la anterior y la siguiente
                    System.out.print("Anterior: " + (actual.anterior != null ? actual.anterior.palabra : "No hay") + ", ");
                    System.out.println("Siguiente: " + (actual.siguiente != null ? actual.siguiente.palabra : "No hay"));
                    return;
                }
                actual = actual.siguiente;
            }
            System.out.println("Palabra no encontrada.");
        }
    }


