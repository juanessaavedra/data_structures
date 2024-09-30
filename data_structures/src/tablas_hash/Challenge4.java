package tablas_hash;

import java.util.Hashtable;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion;

        Hashtable<String, Integer> students = new Hashtable<>();

        do {
            System.out.println("Bienvenid@ \n 1. Agregar estudiante \n2. Consultar fallas \n3. Sacar promedio de fallas" +
                    " \n4. Agregar falla \n5. Salir");
            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    System.out.println("Ingresa el nombre del estudiante: ");
                    String nombreNuevo = scanner.next().trim().toLowerCase();
                    if(students.containsKey(nombreNuevo)){
                        System.out.println("El estudiante ya existe");
                    }
                    students.put(nombreNuevo, 0);
                    break;
                case "2":
                    System.out.println("Ingresa el nombre del estudiante:");
                    String nombre = scanner.next().trim().toLowerCase();
                    System.out.println(nombre + ": " + students.get(nombre) + " fallas");
                    break;
                case "3":
                    System.out.println("Promedio fallas total");
                    int sum = 0;
                    int totalStudents = students.size();

                    for(Integer fallas: students.values()){
                        sum += fallas;
                    }

                    if (totalStudents == 0) {
                        System.out.println("No hay estudiantes en la lista.");
                    }
                    System.out.println("El promedio de fallas es: " + (double) sum / totalStudents);
                    break;

                case "4":
                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombreFalla = scanner.next().trim().toLowerCase();

                    if (students.containsKey(nombreFalla)) {
                        int fallasActuales = students.get(nombreFalla);
                        students.put(nombreFalla, fallasActuales + 1);
                        System.out.println("Falla agregada al estudiante: " + nombreFalla + ". Este estudiante ahora tiene " +
                                students.get(nombreFalla) + " fallas.");
                    }

                    System.out.println("El estudiante no está registrado, intente otra vez.");
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Esa no es una opción válida.");
            }
        } while (!opcion.equals("5"));

        scanner.close();
    }
}
