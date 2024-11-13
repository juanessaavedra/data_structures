package arboles.Ejercicio3;

/**
 * Clase que implementa la validación de un árbol binario de búsqueda (BST).
 * Un árbol binario de búsqueda es válido si para cada nodo:
 * - Todos los nodos en el subárbol izquierdo tienen valores menores que el nodo actual
 * - Todos los nodos en el subárbol derecho tienen valores mayores que el nodo actual
 *
 * @author Ana Lucelly Lizcano
 * @author Juan Esteban Saavedra
 * @author Esteban Salazar Mejía
 * @author Diego Alejandro Ramírez
 * @version 1.0
 * @date 11 de noviembre del 2024
 */
public class BinaryTreeValidator {

    /**
     * Método público que inicia la validación del árbol.
     * Verifica si el árbol cumple con las propiedades de un BST.
     *
     * @param root nodo raíz del árbol a validar
     * @return boolean true si el árbol es un BST válido, false en caso contrario
     */
    public boolean isRootValid(TreeNode root) {
        // Si el árbol está vacío, se considera no válido
        if (root == null) {
            return false;
        }
        // Inicia la validación recursiva con límites iniciales null
        return isValidBST(root, null, null);
    }

    /**
     * Método privado recursivo que valida si un árbol es un BST válido.
     * Verifica que cada nodo esté dentro de los límites permitidos y que sus
     * subárboles también sean válidos.
     *
     * @param node nodo actual siendo validado
     * @param min límite inferior para el valor del nodo (puede ser null)
     * @param max límite superior para el valor del nodo (puede ser null)
     * @return boolean true si el subárbol desde este nodo es válido, false en caso contrario
     *
     * Casos de validación:
     * 1. Si el nodo es null, es válido (caso base)
     * 2. Si el valor del nodo es menor o igual al mínimo permitido, no es válido
     * 3. Si el valor del nodo es mayor o igual al máximo permitido, no es válido
     * 4. Los subárboles izquierdo y derecho deben ser válidos recursivamente
     */
    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        // Caso base: un árbol vacío es válido
        if (node == null) {
            return true;
        }

        // Verifica que el valor del nodo esté dentro de los límites
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Valida recursivamente los subárboles:
        // - Para el subárbol izquierdo: el valor máximo es el valor del nodo actual
        // - Para el subárbol derecho: el valor mínimo es el valor del nodo actual
        return isValidBST(node.left, min, node.val) &&
                isValidBST(node.right, node.val, max);
    }
}
