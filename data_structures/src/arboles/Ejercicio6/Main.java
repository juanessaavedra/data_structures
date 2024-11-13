package arboles.Ejercicio6;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static BinaryTree tree = new BinaryTree();

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Si falla la limpieza de pantalla, simplemente imprimimos líneas en blanco
            for (int i = 0; i < 50; ++i) System.out.println();
        }
    }

    public static void showMenu() {
        System.out.println("\n=== ÁRBOL BINARIO CON MÚLTIPLES VALORES ===");
        System.out.println("1. Insertar valor");
        System.out.println("2. Mostrar árbol");
        System.out.println("3. Mostrar cantidad total de nodos");
        System.out.println("4. Cargar datos de prueba");
        System.out.println("5. Salir");
        System.out.println("=========================================");
    }

    public static void loadTestData() {
        int[] testValues = {50, 30, 70, 20, 40, 60, 80, 15, 25, 35, 45};
        for (int value : testValues) {
            tree.insert(value);
        }
        System.out.println("\nDatos de prueba cargados exitosamente.");
        System.out.println("Valores insertados: 50, 30, 70, 20, 40, 60, 80, 15, 25, 35, 45");
    }

    public static void insertValue() {
        try {
            System.out.print("\nIngrese el valor a insertar: ");
            int value = scanner.nextInt();
            tree.insert(value);
            System.out.println("\nValor " + value + " insertado exitosamente.");
        } catch (Exception e) {
            System.out.println("\nError: Por favor ingrese un valor numérico válido.");
            scanner.nextLine(); // Limpiar el buffer
        }
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            System.out.print("\nSeleccione una opción: ");

            try {
                int option = scanner.nextInt();
                clearScreen();

                switch (option) {
                    case 1:
                        insertValue();
                        break;
                    case 2:
                        if (tree.getTotalNodes() == 0) {
                            System.out.println("\nEl árbol está vacío.");
                        } else {
                            tree.printTree();
                        }
                        break;
                    case 3:
                        System.out.println("\nCantidad total de nodos: " + tree.getTotalNodes());
                        break;
                    case 4:
                        loadTestData();
                        break;
                    case 5:
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
                System.out.println("\nError: Por favor ingrese una opción válida.");
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("\nPresione Enter para continuar...");
                scanner.nextLine();
                clearScreen();
            }
        }
    }
}

