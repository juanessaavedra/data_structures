package arboles.Ejercicio2;

/**
 * Clase que implementa un árbol binario para representar la estructura organizacional de una empresa.
 * Permite almacenar y gestionar información sobre cargos, salarios y experiencia laboral.
 * @Autor Ana Lucelly Lizcano, Juan Esteban Saavedra, Esteban Salazar Mejía, Diego Alejandro Ramírez
 * Fecha: 11 de noviembre del 2024
 * Licencia: GNU GPE
 */
public class ArbolBinario {
    private Nodo raiz; // Nodo raíz del árbol

    /**
     * Constructor que inicializa un árbol binario vacío
     */
    public ArbolBinario() {
        raiz = null;
    }

    /**
     * Inserta un nuevo cargo en el árbol binario
     * @param cargo Nombre del cargo a insertar
     * @param salario Salario asociado al cargo
     * @param experiencia Años de experiencia requeridos
     */
    public void insertar(String cargo, double salario, int experiencia) {
        raiz = insertarRecursivo(raiz, cargo, salario, experiencia);
    }

    /**
     * Método recursivo auxiliar para insertar un nuevo nodo en el árbol
     * La inserción se realiza comparando lexicográficamente los nombres de los cargos
     */
    private Nodo insertarRecursivo(Nodo raiz, String cargo, double salario, int experiencia) {
        // Si el nodo actual es nulo, creamos un nuevo nodo
        if (raiz == null) {
            return new Nodo(cargo, salario, experiencia);
        }

        // Ordenamiento lexicográfico de los cargos
        if (cargo.compareTo(raiz.cargo) < 0) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, cargo, salario, experiencia);
        } else if (cargo.compareTo(raiz.cargo) > 0) {
            raiz.derecho = insertarRecursivo(raiz.derecho, cargo, salario, experiencia);
        }

        return raiz;
    }

    /**
     * Calcula el salario promedio de todos los cargos en la empresa
     * @return Promedio de salarios, 0 si el árbol está vacío
     */
    public double salarioPromedio() {
        double[] suma = {0};
        int[] contador = {0};
        calcularSumaSalarios(raiz, suma, contador);
        return contador[0] == 0 ? 0 : suma[0] / contador[0];
    }

    /**
     * Método recursivo auxiliar para sumar todos los salarios
     * Recorre el árbol en preorden sumando los salarios y contando los nodos
     */
    private void calcularSumaSalarios(Nodo nodo, double[] suma, int[] contador) {
        if (nodo != null) {
            suma[0] += nodo.salario;
            contador[0]++;
            calcularSumaSalarios(nodo.izquierdo, suma, contador);
            calcularSumaSalarios(nodo.derecho, suma, contador);
        }
    }

    /**
     * Calcula el promedio de años de experiencia de todos los cargos
     * @return Promedio de años de experiencia, 0 si el árbol está vacío
     */
    public double experienciaPromedio() {
        double[] suma = {0};
        int[] contador = {0};
        calcularSumaExperiencia(raiz, suma, contador);
        return contador[0] == 0 ? 0 : suma[0] / contador[0];
    }

    /**
     * Método recursivo auxiliar para sumar todos los años de experiencia
     * Recorre el árbol en preorden sumando la experiencia y contando los nodos
     */
    private void calcularSumaExperiencia(Nodo nodo, double[] suma, int[] contador) {
        if (nodo != null) {
            suma[0] += nodo.experiencia;
            contador[0]++;
            calcularSumaExperiencia(nodo.izquierdo, suma, contador);
            calcularSumaExperiencia(nodo.derecho, suma, contador);
        }
    }

    /**
     * Encuentra el cargo con el salario más bajo en la empresa
     * @return Nombre del cargo con menor salario, mensaje si el árbol está vacío
     */
    public String cargoMenorSalario() {
        if (raiz == null) return "No hay cargos registrados";
        double[] salarioMinimo = {Double.MAX_VALUE};
        String[] cargo = {""};
        encontrarSalarioMinimo(raiz, salarioMinimo, cargo);
        return cargo[0];
    }

    /**
     * Método recursivo auxiliar para encontrar el salario mínimo
     * Recorre todo el árbol comparando salarios
     */
    private void encontrarSalarioMinimo(Nodo nodo, double[] salarioMinimo, String[] cargo) {
        if (nodo != null) {
            if (nodo.salario < salarioMinimo[0]) {
                salarioMinimo[0] = nodo.salario;
                cargo[0] = nodo.cargo;
            }
            encontrarSalarioMinimo(nodo.izquierdo, salarioMinimo, cargo);
            encontrarSalarioMinimo(nodo.derecho, salarioMinimo, cargo);
        }
    }

    /**
     * Encuentra el cargo con el salario más alto en la empresa
     * @return Nombre del cargo con mayor salario, mensaje si el árbol está vacío
     */
    public String cargoMayorSalario() {
        if (raiz == null) return "No hay cargos registrados";
        double[] salarioMaximo = {Double.MIN_VALUE};
        String[] cargo = {""};
        encontrarSalarioMaximo(raiz, salarioMaximo, cargo);
        return cargo[0];
    }

    /**
     * Método recursivo auxiliar para encontrar el salario máximo
     * Recorre todo el árbol comparando salarios
     */
    private void encontrarSalarioMaximo(Nodo nodo, double[] salarioMaximo, String[] cargo) {
        if (nodo != null) {
            if (nodo.salario > salarioMaximo[0]) {
                salarioMaximo[0] = nodo.salario;
                cargo[0] = nodo.cargo;
            }
            encontrarSalarioMaximo(nodo.izquierdo, salarioMaximo, cargo);
            encontrarSalarioMaximo(nodo.derecho, salarioMaximo, cargo);
        }
    }

    /**
     * Cuenta el número total de cargos en la empresa
     * @return Número total de nodos en el árbol
     */
    public int contarCargos() {
        return contarNodos(raiz);
    }

    /**
     * Método recursivo auxiliar para contar todos los nodos del árbol
     */
    private int contarNodos(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
    }

    /**
     * Calcula el número de niveles en el organigrama
     * @return Altura del árbol binario
     */
    public int nivelesOrganigrama() {
        return obtenerAltura(raiz);
    }

    /**
     * Método recursivo auxiliar para calcular la altura del árbol
     * La altura es el camino más largo desde la raíz hasta una hoja
     */
    private int obtenerAltura(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(obtenerAltura(nodo.izquierdo), obtenerAltura(nodo.derecho));
    }

    /**
     * Calcula el número de nodos en profundidad
     * @return Número de niveles del árbol
     */
    public int nodosEnProfundidad() {
        return nivelesOrganigrama();
    }

    /**
     * Cuenta el número de hojas en el árbol
     * Una hoja es un nodo que no tiene hijos
     * @return Número total de hojas
     */
    public int contarHojas() {
        return contarNodosHoja(raiz);
    }

    /**
     * Método recursivo auxiliar para contar las hojas del árbol
     * Una hoja es un nodo que no tiene hijos (ni izquierdo ni derecho)
     */
    private int contarNodosHoja(Nodo nodo) {
        if (nodo == null) return 0;
        if (nodo.izquierdo == null && nodo.derecho == null) return 1;
        return contarNodosHoja(nodo.izquierdo) + contarNodosHoja(nodo.derecho);
    }
}
