package dlinkedlist.circular.carrusel;

public class ListaCarrusel {
    private NodoCaballo cab; //Primer caballo de la lista
    private NodoCaballo fin; // Ultimo caballo
    private int cn; //Contador para llevar el control de cuantos caballos hay en el carrusel

    public ListaCarrusel() {
        cab = null;
        fin = null;
        cn = 0;
        // Despues de inicializar las variables, se llama al método inicializarCarrusel() para crear un carrusel con 12 caballos vacíos
        inicializarCarrusel();
    }


    /* Agrega 12 nodos con el dato "Vacio" */
    private void inicializarCarrusel() {
        for (int i = 0; i < 12; i++) {
            insertarNodoFinal("vacío");
        }
    }
/* Cuando se agrega un nodo al final, se asegura que el puntero sig del nuevo nodo apunte al nodo de inicio (cab). Esto es crucial para mantener la propiedad circular de la lista.
Si la lista estaba vacía, el nuevo nodo se convierte tanto en el nodo de inicio (cab) como en el nodo final (fin), asegurando que el puntero sig del nuevo nodo se apunte a sí mismo.
*  */
    public void insertarNodoFinal(String valor) {
        NodoCaballo nuevo = new NodoCaballo(valor);
        if (cab == null) { //Si la lista esta vacia, se establece cab y fin al nuevo nodo
            cab = nuevo;
            fin = nuevo;
            nuevo.sig = cab; // Apunta a si mismo
        } else { //Si la lista no esta vacia, se establece el nuevo nodo al final de la lista
            fin.sig = nuevo;
            nuevo.sig = cab; // Apunta al inicio
            fin = nuevo; // Se actualiza el fin para que apunte al nuevo nodo
        }
        cn++; // Se incrementa el contador de caballos
    }


    /*  Permite asignar un niño a un asiento en la posicion 1 a la 12 */
    public void insertarNombreNiño(String nombre, int pos) {
        if (pos < 1 || pos > 12) {
            System.out.println("Posición inválida.");
            return;
        }

        NodoCaballo actual = cab; // Se crea un nodo actual que apunta al primer caballo
        for (int i = 1; i < pos; i++) { // Se recorre la lista hasta llegar a la posicion deseada, empieza en 1 representando la cabeza
            actual = actual.sig;  // Al final apuntara al nodo en la posicion especificada (por eso es i < pos, la siguiente posicion sera apuntada por el nodo actual)
        }

        if (!actual.nombreNiño.equals("vacío")) { // Si el puesto no esta vacio, no se permite asignar un niño
            System.out.println("El puesto no está vacío.");
        } else {
            actual.nombreNiño = nombre; // Se asigna el nombre del niño al nodo actual
        }
    }

    /* Realiza la logica similar a insertarNombreNiño, solo que lo asigna vacio */
    public void borrarNodo(int pos) {
        if (pos < 1 || pos > 12) {
            System.out.println("Posición inválida.");
            return;
        }

        NodoCaballo actual = cab;
        for (int i = 1; i < pos; i++) {
            actual = actual.sig;
        }

        actual.nombreNiño = "vacío";
    }

    public void imprimirLista() {
        if (cab == null) {
            System.out.println("Lista vacía.");
            return;
        }

        NodoCaballo actual = cab; // Apunta al primer caballo
        do {
            System.out.print(actual.nombreNiño + " "); // Se imprimire el nombre del niño en el caballo actual
            actual = actual.sig; // Se avanza al siguiente caballo
        } while (actual != cab); // Se repite hasta que se llegue al inicio
        System.out.println(); // Se imprime un salto de linea
    }


    /* Se encarga de vaciar la lista */
    public void destruirLista() {
        cab = null;
        fin = null;
        cn = 0;
    }
}