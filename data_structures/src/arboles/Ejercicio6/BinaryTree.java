package arboles.Ejercicio6;

class BinaryTree {
    private Node root;
    private int totalNodes;

    public BinaryTree() {
        root = null;
        totalNodes = 0;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node();
            root.insertValue(value);
            totalNodes++;
            return;
        }
        insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (!node.isFull()) {
            node.insertValue(value);
            return null;
        }

        if (value < node.getMinValue()) {
            if (node.left == null) {
                node.left = new Node();
                totalNodes++;
            }
            Node newNode = insertRec(node.left, value);
            if (newNode != null) {
                Node temp = node.left;
                node.left = newNode;
                newNode.left = temp;
            }
        } else if (value > node.getMaxValue()) {
            if (node.right == null) {
                node.right = new Node();
                totalNodes++;
            }
            Node newNode = insertRec(node.right, value);
            if (newNode != null) {
                Node temp = node.right;
                node.right = newNode;
                newNode.right = temp;
            }
        } else {
            Node newNode = new Node();
            newNode.insertValue(value);
            totalNodes++;
            return newNode;
        }

        return null;
    }

    public void printTree() {
        System.out.println("\nEstructura del Árbol:");
        printTreeRec(root, "", "Raíz: ");
    }

    private void printTreeRec(Node node, String indent, String prefix) {
        if (node != null) {
            System.out.print(indent + prefix + "[ ");
            for (int i = 0; i < node.getCount(); i++) {
                System.out.print(node.getValues()[i] + " ");
            }
            System.out.println("]");

            printTreeRec(node.left, indent + "  ", "Izq: ");
            printTreeRec(node.right, indent + "  ", "Der: ");
        }
    }

    public int getTotalNodes() {
        return totalNodes;
    }
}
