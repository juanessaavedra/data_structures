package arboles.Ejercicio3;

/**
 * Clase que implementa un visualizador gráfico de árboles binarios.
 * Extiende JPanel para proporcionar una representación visual del árbol.
 *
 * @author Ana Lucelly Lizcano
 * @author Juan Esteban Saavedra
 * @author Esteban Salazar Mejía
 * @author Diego Alejandro Ramírez
 * @version 1.0
 * @date 11 de noviembre del 2024
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BinaryTreeVisualizer extends JPanel {
    private TreeNode root;        // Nodo raíz del árbol
    private boolean isValid;      // Indica si el árbol es válido

    /**
     * Constructor del visualizador de árbol binario.
     *
     * @param root Nodo raíz del árbol a visualizar
     * @param isValid Booleano que indica si el árbol es válido
     */
    public BinaryTreeVisualizer(TreeNode root, boolean isValid) {
        this.root = root;
        this.isValid = isValid;
        setPreferredSize(new Dimension(800, 600));
    }

    /**
     * Actualiza el árbol con un nuevo nodo raíz y estado de validez.
     *
     * @param newRoot Nuevo nodo raíz del árbol
     * @param isValid Nuevo estado de validez del árbol
     */
    public void updateTree(TreeNode newRoot, boolean isValid) {
        this.root = newRoot;
        this.isValid = isValid;
        repaint();
    }

    /**
     * Sobrescribe el método paintComponent para dibujar el árbol.
     *
     * @param g Objeto Graphics para dibujar
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (root != null) {
            drawTree(g, root, getWidth() / 2, 50, getWidth() / 4, isValid);
        }
    }

    /**
     * Método recursivo para dibujar el árbol.
     * Dibuja cada nodo y sus conexiones con los hijos.
     *
     * @param g Objeto Graphics para dibujar
     * @param node Nodo actual a dibujar
     * @param x Posición x del nodo
     * @param y Posición y del nodo
     * @param offset Desplazamiento horizontal para los hijos
     * @param isValid Estado de validez del árbol
     */
    private void drawTree(Graphics g, TreeNode node, int x, int y, int offset, boolean isValid) {
        if (node == null) return;

        // Dibuja el nodo (círculo) con color según validez
        g.setColor(isValid ? Color.GREEN : Color.RED);
        g.fillOval(x - 15, y - 15, 30, 30);

        // Dibuja el valor del nodo
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(node.val), x - 5, y + 5);

        // Dibuja las conexiones y los subárboles
        if (node.left != null) {
            g.drawLine(x, y, x - offset, y + 50);
            drawTree(g, node.left, x - offset, y + 50, offset / 2, isValid);
        }
        if (node.right != null) {
            g.drawLine(x, y, x + offset, y + 50);
            drawTree(g, node.right, x + offset, y + 50, offset / 2, isValid);
        }
    }

    /**
     * Método estático para mostrar el árbol en una ventana.
     *
     * @param root Nodo raíz del árbol a mostrar
     */
    public static void showTree(TreeNode root) {
        BinaryTreeValidator validator = new BinaryTreeValidator();
        boolean isValid = validator.isRootValid(root);

        JFrame frame = new JFrame("Binary Tree Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BinaryTreeVisualizer visualizer = new BinaryTreeVisualizer(root, isValid);
        frame.add(visualizer);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    /**
     * Método principal que implementa el menú interactivo.
     *
     * @param args Argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = null;
        BinaryTreeValidator validator = new BinaryTreeValidator();

        while (true) {
            System.out.println("\n=== VISUALIZADOR DE ÁRBOL BINARIO ===");
            System.out.println("1. Ingresar nodos");
            System.out.println("2. Mostrar el árbol");
            System.out.println("3. Salir");
            System.out.println("=====================================");
            System.out.print("Seleccione una opción: ");

            try {
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        root = enterTreeData(scanner);
                        break;
                    case 2:
                        if (root != null) {
                            showTree(root);
                        } else {
                            System.out.println("\nEl árbol está vacío. Ingrese nodos primero.");
                        }
                        break;
                    case 3:
                        System.out.println("\nSaliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nOpción no válida. Intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("\nError: Entrada no válida.");
                scanner.nextLine(); // Limpiar buffer
            }
        }
    }

    /**
     * Método para ingresar datos del árbol de manera interactiva.
     *
     * @param scanner Scanner para leer entrada del usuario
     * @return TreeNode raíz del árbol creado
     */
    public static TreeNode enterTreeData(Scanner scanner) {
        System.out.print("\nIngrese el valor de la raíz: ");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);

        System.out.print("¿Cuántos niveles desea ingresar? ");
        int levels = scanner.nextInt();
        System.out.println("\nIngrese los nodos nivel por nivel (use -1 para indicar un nodo vacío):");

        addChildren(scanner, root, levels - 1);

        return root;
    }

    /**
     * Método recursivo para agregar hijos a un nodo.
     *
     * @param scanner Scanner para leer entrada del usuario
     * @param node Nodo actual al que se agregarán hijos
     * @param levelsLeft Niveles restantes por agregar
     */
    public static void addChildren(Scanner scanner, TreeNode node, int levelsLeft) {
        if (levelsLeft == 0) return;

        System.out.print("Ingrese el valor del hijo izquierdo de " + node.val + " (o -1 si no tiene): ");
        int leftValue = scanner.nextInt();
        if (leftValue != -1) {
            node.left = new TreeNode(leftValue);
            addChildren(scanner, node.left, levelsLeft - 1);
        }

        System.out.print("Ingrese el valor del hijo derecho de " + node.val + " (o -1 si no tiene): ");
        int rightValue = scanner.nextInt();
        if (rightValue != -1) {
            node.right = new TreeNode(rightValue);
            addChildren(scanner, node.right, levelsLeft - 1);
        }
    }
}