package arboles.Ejercicio6;

/**
 * Implementación de árbol binario con múltiples valores por nodo y menú interactivo
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
    private int[] values;
    private int count;
    private final int MAX = 4;
    Node left, right;

    public Node() {
        values = new int[MAX];
        count = 0;
        left = right = null;
    }

    public boolean isFull() {
        return count >= MAX;
    }

    public boolean insertValue(int value) {
        if (isFull()) {
            return false;
        }
        int i;
        for (i = count - 1; i >= 0 && values[i] > value; i--) {
            values[i + 1] = values[i];
        }
        values[i + 1] = value;
        count++;
        return true;
    }

    public int getMinValue() {
        return values[0];
    }

    public int getMaxValue() {
        return values[count - 1];
    }

    public int[] getValues() {
        return values;
    }

    public int getCount() {
        return count;
    }
}
