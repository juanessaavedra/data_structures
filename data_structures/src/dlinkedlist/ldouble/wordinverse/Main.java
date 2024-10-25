package dlinkedlist.ldouble.wordinverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDBEword lista = new ListaDBEword();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una oración:");
        String oracion = scanner.nextLine();
        lista.insertarOracion(oracion);

        while (true) {
            System.out.println("\n1. Imprimir oración en orden inverso");
            System.out.println("2. Borrar una palabra");
            System.out.println("3. Imprimir palabra anterior y siguiente");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    lista.imprimirOrdenInverso();
                    break;
                case 2:
                    System.out.print("Ingrese la palabra a borrar: ");
                    lista.borrarNodo(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Ingrese la palabra: ");
                    lista.imprimirPalabraAnteriorYSiguiente(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
