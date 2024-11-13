package arboles.Ejercicio4;

import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static BinaryTree tree = new BinaryTree();

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showMenu() {
        System.out.println("\n=== BUSCADOR DE NIVEL EN ÁRBOL BINARIO ===");
        System.out.println("1. Mostrar árbol completo");
        System.out.println("2. Buscar nivel de un nodo");
        System.out.println("3. Salir");
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        // Mostrar el árbol inicial
        System.out.println("=== ÁRBOL BINARIO DE 5 NIVELES ===");
        tree.printTree();
        System.out.println("\nValores disponibles por nivel:");
        System.out.println("Nivel 0: 50");
        System.out.println("Nivel 1: 30, 70");
        System.out.println("Nivel 2: 20, 40, 60, 80");
        System.out.println("Nivel 3: 10, 25, 35, 45, 55, 65, 75, 85");
        System.out.println("Nivel 4: 5, 15, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67, 72, 77, 82, 87");

        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine();
        clearScreen();

        while (true) {
            showMenu();
            System.out.print("\nSeleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                clearScreen();

                switch (opcion) {
                    case 1:
                        tree.printTree();
                        break;
                    case 2:
                        System.out.print("\nIngrese el valor del nodo a buscar: ");
                        int valor = scanner.nextInt();
                        int nivel = tree.getNodeLevel(valor);

                        if (nivel != -1) {
                            System.out.println("\nResultado de la búsqueda:");
                            System.out.println("------------------------");
                            System.out.println("Valor buscado: " + valor);
                            System.out.println("Nivel encontrado: " + nivel);
                            if (nivel == 0) {
                                System.out.println("Posición: Raíz del árbol");
                            } else {
                                System.out.println("Posición: Nivel " + nivel + " del árbol");
                            }
                        } else {
                            System.out.println("\nEl valor " + valor + " no se encuentra en el árbol");
                        }
                        break;
                    case 3:
                        System.out.println("\n¡Gracias por usar el programa!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
                }

                System.out.print("\nPresione Enter para continuar...");
                scanner.nextLine(); // Consumir el newline
                scanner.nextLine(); // Esperar Enter
                clearScreen();

            } catch (Exception e) {
                System.out.println("\nError: Por favor ingrese un valor válido");
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("\nPresione Enter para continuar...");
                scanner.nextLine();
                clearScreen();
            }
        }
    }

}
