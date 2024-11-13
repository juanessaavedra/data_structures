package arboles.Ejercicio2;

import java.util.Scanner;

/**
 * Clase principal que implementa un sistema de gestión de organigrama empresarial.
 * Proporciona una interfaz de usuario mediante menú de consola para administrar
 * la estructura organizacional de una empresa usando un árbol binario.
 * @Autor Ana Lucelly Lizcano, Juan Esteban Saavedra, Esteban Salazar Mejía, Diego Alejandro Ramírez
 * Fecha: 11 de noviembre del 2024
 * Licencia: GNU GPE
 */
public class OrganizacionEmpresa {
    /**
     * Método principal que ejecuta el programa de gestión de organigrama.
     * Presenta un menú interactivo con opciones para manipular y consultar
     * la información de los cargos en la empresa.
     *
     * @param args Argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // Inicialización del scanner para entrada de usuario
        Scanner scanner = new Scanner(System.in);
        // Creación del árbol binario para almacenar la estructura organizacional
        ArbolBinario arbol = new ArbolBinario();

        // Bucle principal del programa
        while (true) {
            // Mostrar menú de opciones
            System.out.println("\nMenú de Organización Empresarial:");
            System.out.println("1. Insertar información de cargo");
            System.out.println("2. Calcular salario promedio");
            System.out.println("3. Calcular experiencia promedio");
            System.out.println("4. Encontrar cargo con menor salario");
            System.out.println("5. Encontrar cargo con mayor salario");
            System.out.println("6. Contar total de cargos");
            System.out.println("7. Contar niveles del organigrama");
            System.out.println("8. Contar nodos en profundidad");
            System.out.println("9. Contar hojas");
            System.out.println("0. Salir");

            // Lectura de la opción del usuario
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea pendiente

            // Procesamiento de la opción seleccionada
            switch (opcion) {
                case 1: // Inserción de nuevo cargo
                    System.out.print("Ingrese nombre del cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Ingrese salario: ");
                    double salario = scanner.nextDouble();
                    System.out.print("Ingrese años de experiencia: ");
                    int experiencia = scanner.nextInt();
                    // Insertar el nuevo cargo en el árbol
                    arbol.insertar(cargo, salario, experiencia);
                    System.out.println("¡Cargo agregado exitosamente!");
                    break;

                case 2: // Cálculo de salario promedio
                    System.out.printf("Salario promedio: $%.2f%n", arbol.salarioPromedio());
                    break;

                case 3: // Cálculo de experiencia promedio
                    System.out.printf("Experiencia promedio: %.1f años%n", arbol.experienciaPromedio());
                    break;

                case 4: // Búsqueda del cargo con menor salario
                    System.out.println("Cargo con menor salario: " + arbol.cargoMenorSalario());
                    break;

                case 5: // Búsqueda del cargo con mayor salario
                    System.out.println("Cargo con mayor salario: " + arbol.cargoMayorSalario());
                    break;

                case 6: // Conteo total de cargos
                    System.out.println("Total de cargos: " + arbol.contarCargos());
                    break;

                case 7: // Conteo de niveles del organigrama
                    System.out.println("Niveles del organigrama: " + arbol.nivelesOrganigrama());
                    break;

                case 8: // Análisis de profundidad
                    System.out.println("Nodos en profundidad: " + arbol.nodosEnProfundidad());
                    break;

                case 9: // Conteo de hojas del árbol
                    System.out.println("Número de hojas: " + arbol.contarHojas());
                    break;

                case 0: // Salida del programa
                    System.out.println("Saliendo del programa...");
                    scanner.close(); // Cerrar el scanner antes de salir
                    return;

                default: // Manejo de opciones inválidas
                    System.out.println("¡Opción inválida! Por favor intente nuevamente.");
            }
        }
    }
}
