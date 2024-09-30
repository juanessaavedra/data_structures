package tablas_hash;

import java.util.Hashtable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hashtable<String, Integer> students = new Hashtable<>();

        Scanner scanner = new Scanner(System.in);
        String option = "1";

        do {
            System.out.println("1. Add student \n 2. Agregar falla \n 3. Consultar faltas estudiante \n 4. Promedio fallas total \n 5. Exit");
            option = scanner.next();
            switch (option){
                case "1":
                    System.out.println("Add student:");
                    System.out.println("Enter the name");
                    String name = scanner.next().trim().toLowerCase();
                    if(students.containsKey(name)){
                        System.out.println("The student already exist");
                    }
                    students.put(name, 0);
                    break;
                case "2":
                    System.out.println("Agregar falta:");
                    System.out.println("Enter the name of the student:");
                    String name1 = scanner.next().trim().toLowerCase();
                    students.put(name1, students.get(name1) + 1);
                    break;
                case "3":
                    System.out.println("Consultar fallas estudiante");
                    System.out.println("Enter the name:");
                    String name2 = scanner.next();
                    if(!students.containsKey(name2)){
                        System.out.println("El estudiante no existe");
                    }
                    System.out.println("El total de fallas del"+ name2 + "es:" + students.get(name2));
                    break;
                case "4":
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

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(!option.equals("0"));


    }



}
