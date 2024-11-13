package arboles.Ejercicio4;

/**
 * Clase que implementa un árbol binario para búsqueda de niveles de nodos.
 * Estructura base del árbol con un nodo raíz.
 *
 * @author Ana Lucelly Lizcano
 * @author Juan Esteban Saavedra
 * @author Esteban Salazar Mejía
 * @author Diego Alejandro Ramírez
 * @version 1.0
 * @date 11 de noviembre del 2024
 */

class BinaryTree {
    private Node root;

    /**
     * Constructor que crea un árbol binario fijo de 5 niveles.
     * La estructura del árbol se distribuye de la siguiente manera:
     * - Nivel 0: Nodo raíz con valor 50
     * - Nivel 1: 2 nodos (valores 30 y 70)
     * - Nivel 2: 4 nodos (valores 20, 40, 60, 80)
     * - Nivel 3: 8 nodos (valores 10, 25, 35, 45, 55, 65, 75, 85)
     * - Nivel 4: 16 nodos (valores 5, 15, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67, 72, 77, 82, 87)
     */
    public BinaryTree() {
        // Nivel 0 (Raíz)
        root = new Node(50);

        // Nivel 1
        root.left = new Node(30);           // Hijo izquierdo de 50
        root.right = new Node(70);          // Hijo derecho de 50

        // Nivel 2
        root.left.left = new Node(20);      // Hijo izquierdo de 30
        root.left.right = new Node(40);     // Hijo derecho de 30
        root.right.left = new Node(60);     // Hijo izquierdo de 70
        root.right.right = new Node(80);    // Hijo derecho de 70

        // Nivel 3
        root.left.left.left = new Node(10);    // Hijo izquierdo de 20
        root.left.left.right = new Node(25);   // Hijo derecho de 20
        root.left.right.left = new Node(35);   // Hijo izquierdo de 40
        root.left.right.right = new Node(45);  // Hijo derecho de 40
        root.right.left.left = new Node(55);   // Hijo izquierdo de 60
        root.right.left.right = new Node(65);  // Hijo derecho de 60
        root.right.right.left = new Node(75);  // Hijo izquierdo de 80
        root.right.right.right = new Node(85); // Hijo derecho de 80

        // Nivel 4
        root.left.left.left.left = new Node(5);     // Hijo izquierdo de 10
        root.left.left.left.right = new Node(15);   // Hijo derecho de 10
        root.left.left.right.left = new Node(22);   // Hijo izquierdo de 25
        root.left.left.right.right = new Node(27);  // Hijo derecho de 25
        root.left.right.left.left = new Node(32);   // Hijo izquierdo de 35
        root.left.right.left.right = new Node(37);  // Hijo derecho de 35
        root.left.right.right.left = new Node(42);  // Hijo izquierdo de 45
        root.left.right.right.right = new Node(47); // Hijo derecho de 45
        root.right.left.left.left = new Node(52);   // Hijo izquierdo de 55
        root.right.left.left.right = new Node(57);  // Hijo derecho de 55
        root.right.left.right.left = new Node(62);  // Hijo izquierdo de 65
        root.right.left.right.right = new Node(67); // Hijo derecho de 65
        root.right.right.left.left = new Node(72);  // Hijo izquierdo de 75
        root.right.right.left.right = new Node(77); // Hijo derecho de 75
        root.right.right.right.left = new Node(82); // Hijo izquierdo de 85
        root.right.right.right.right = new Node(87);// Hijo derecho de 85
    }

    /**
     * Método público que inicia la búsqueda del nivel de un nodo.
     * Actúa como interfaz para el método recursivo privado.
     *
     * @param valor entero que representa el valor del nodo a buscar
     * @return entero que representa el nivel del nodo (-1 si no se encuentra)
     */
    public int getNodeLevel(int valor) {
        return getNodeLevelRec(root, valor, 0);
    }

    /**
     * Método recursivo privado que busca el nivel de un nodo específico.
     * Recorre el árbol usando búsqueda en profundidad (DFS).
     *
     * @param node  Node actual en el recorrido
     * @param valor entero valor del nodo a buscar
     * @param level entero nivel actual en el recorrido
     * @return entero nivel del nodo (-1 si no se encuentra)
     */
    private int getNodeLevelRec(Node node, int valor, int level) {
        // Caso base: si el nodo es null, retorna -1 (no encontrado)
        if (node == null)
            return -1;

        // Si encuentra el valor, retorna el nivel actual
        if (node.valor == valor)
            return level;

        // Busca en el subárbol izquierdo
        int downlevel = getNodeLevelRec(node.left, valor, level + 1);
        if (downlevel != -1)
            return downlevel;

        // Si no está en el izquierdo, busca en el derecho
        downlevel = getNodeLevelRec(node.right, valor, level + 1);
        return downlevel;
    }

    /**
     * Método público que inicia la impresión visual del árbol.
     * Muestra la estructura completa del árbol con niveles.
     */
    public void printTree() {
        System.out.println("\nEstructura del árbol (5 niveles):");
        printTreeRec(root, "", "Raíz: ", 0);
    }

    /**
     * Método recursivo privado que imprime el árbol de forma visual.
     * Utiliza sangría y prefijos para mostrar la jerarquía.
     *
     * @param node   Node nodo actual a imprimir
     * @param indent String sangría actual para la visualización
     * @param prefix String prefijo que indica la posición del nodo
     * @param level  entero nivel actual del nodo
     */
    private void printTreeRec(Node node, String indent, String prefix, int level) {
        if (node != null) {
            // Imprime el nodo actual con su nivel
            System.out.println(indent + prefix + node.valor + " (Nivel " + level + ")");
            // Recursivamente imprime subárboles izquierdo y derecho
            printTreeRec(node.left, indent + "  ", "Izq: ", level + 1);
            printTreeRec(node.right, indent + "  ", "Der: ", level + 1);
        }
    }
}