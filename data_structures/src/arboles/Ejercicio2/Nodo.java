package arboles.Ejercicio2;

/**
        * Clase que representa un nodo en el árbol binario.
        * Cada nodo almacena información sobre un cargo en la empresa.
        * @Autor Ana Lucelly Lizcano, Juan Esteban Saavedra, Esteban Salazar Mejía, Diego Alejandro Ramírez
        * Fecha: 11 de noviembre del 2024
        * Licencia: GNU GPE
        */
public class Nodo {
    /** Nombre del cargo en la empresa */
    String cargo;

    /** Salario asignado al cargo */
    double salario;

    /** Años de experiencia requeridos para el cargo */
    int experiencia;

    /** Referencia al hijo izquierdo del nodo */
    Nodo izquierdo;

    /** Referencia al hijo derecho del nodo */
    Nodo derecho;

    /**
     * Constructor que inicializa un nuevo nodo con la información del cargo
     * @param cargo Nombre del cargo
     * @param salario Salario asignado al cargo
     * @param experiencia Años de experiencia requeridos
     */
    public Nodo(String cargo, double salario, int experiencia) {
        this.cargo = cargo;
        this.salario = salario;
        this.experiencia = experiencia;
        // Inicialmente, un nuevo nodo no tiene hijos
        this.izquierdo = null;
        this.derecho = null;
    }
}

