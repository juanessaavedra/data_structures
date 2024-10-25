package tablas_hash.parcial;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una tabla Hash para almacenar los estudiantes
        Hashtable<String, Student> students = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("Bienvenido al sistema de estudiantes ¿Qué desea hacer? \n 1. Agregar estudiante \n 2. Ver estudiantes \n 3. Acceder a un estudiante \n 4. Salir");
            option = scanner.next();

            switch (option) {
                case "1":
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String name = scanner.next();
                    System.out.println("Ingrese el id del estudiante: ");
                    String id = scanner.next();
                    System.out.println("Ingrese el codigo de acceso al estudiante: ");
                    String codigo = scanner.next();
                    addStudents(students, name, id, codigo);
                    break;

                case "2":
                    printStudents(students);
                    break;

                case "3":
                    System.out.println("Ingrese el codigo del estudiante: ");
                    String codigoAcceso = scanner.next();
                    showStudent(students, codigoAcceso);
                    break;

                case "4":
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (!option.equals("4"));
    }


    /* Agrega un nuevo estudiante a la tabla Hash */
    public static void addStudents(Hashtable<String, Student> students, String name, String id, String codigo) {
        Student student = new Student(name, id);
        students.put(codigo, student);
    }

    /* Imprime los estudiantes en la tabla Hash */
    public static void printStudents(Hashtable<String, Student> students) {
        System.out.println("Estudiantes: ");
        for (Student student : students.values()) {
            System.out.println("Nombre: " + student.getName() + ", ID: " + student.getId());
        }
    }

    /* Muestra un estudiante de la tabla Hash */
    public static void showStudent(Hashtable<String, Student> students, String codigo) {
        Student student = students.get(codigo);
        if (student != null) {
            System.out.println("Nombre: " + student.getName());
            System.out.println("ID: " + student.getId());
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }
}