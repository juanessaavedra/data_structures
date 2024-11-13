package parcial2;

import java.util.Scanner;

// Clase Main que contiene el menú y la lógica principal de la aplicación
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para leer la entrada del usuario
        JugadorTenis jugador = new JugadorTenis(); // Crear un nuevo jugador de tenis
        int opcion; // Variable para almacenar la opción del usuario

        do {

            System.out.println("1. Llenar los 3 tubos de pelotas");
            System.out.println("2. Sacar y usar una pelota");
            System.out.println("3. Mostrar estado actual de cada tubo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    jugador.llenarTubos(); // Llenar los tubos de pelotas
                    System.out.println("Tubos llenados.");
                    break;
                case 2:
                    System.out.println(jugador.usarPelota()); // Usar una pelota y mostrar el mensaje
                    break;
                case 3:
                    System.out.println(jugador.estadoActual()); // Mostrar el estado actual de los tubos
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}