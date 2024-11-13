package arboles.Ejercicio3;

/**
 * Clase que representa un nodo en un árbol binario.
 * Cada nodo contiene un valor entero y referencias a sus hijos izquierdo y derecho.
 *
 * @author Ana Lucelly Lizcano
 * @author Juan Esteban Saavedra
 * @author Esteban Salazar Mejía
 * @author Diego Alejandro Ramírez
 * @version 1.0
 * @date 11 de noviembre del 2024
 */

public class TreeNode {
    int val;           // Valor almacenado en el nodo
    TreeNode left;     // Referencia al hijo izquierdo
    TreeNode right;    // Referencia al hijo derecho

    /**
     * Constructor para crear un nuevo nodo del árbol
     *
     * @param val valor entero a almacenar en el nodo
     */
    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}