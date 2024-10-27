package dstack;

import tablas_hash.Book;

import java.util.Scanner;
import java.util.Stack;

/*
    * Programa que simula una pila de libros
*  */
public class Main {
    public static void main(String[] args) {
        Stack<Libro> pilaLibros = new Stack<>();
        String option = "1";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido ¿Qué desea hacer?"); //Menu
            System.out.println(("1. Agregar libro a la pila \n 2. Eliminar libro de la pila \n 3. Ver pila de libros  \n 4. Ver el ultimo elemento de la pila  \n 5. Exit"));
            option = scanner.next();

            switch (option) {
                case "1": //Agregar libro
                    System.out.println("Agregar libro");
                    System.out.println("Ingrese el nombre del libro:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el autor:");
                    String autor = scanner.next();
                    System.out.println("Libro agregado a la pila");
                    Libro libro = new Libro(nombre, autor);
                    pilaLibros.push(libro);
                    break;
                case "2": // Eliminar libro de la pila
                    String libroEliminado = pilaLibros.pop().getNombre();
                    System.out.println("Libro: " + libroEliminado + " eliminado de la pila");
                    break;
                case "3": //Ver pila de libros
                    System.out.println("Pila de libros:" + pilaLibros);
                    break;
                case "4": //Ver el ultimo elemento de la pila
                    System.out.println("Ultimo libro de la pila: " + pilaLibros.peek());
                    break;

                default: //Opcion invalida
                    System.out.println("Invalid option");
                    break;
            }
        } while(!option.equals("5"));
    }
}
