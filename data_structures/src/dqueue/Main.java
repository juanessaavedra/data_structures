package dqueue;


import tablas_hash.Book;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Elaborar programa que de respuesta al ejemplo de colas presentado en el ejercicio 3 –
tablero de Stickers.  */
public class Main {
    public static void main(String[] args) {
        Queue<Persona> fila = new LinkedList<>();

        String option = "1";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al banco, ¿Qué desea hacer?");
            System.out.println(("1. Tomar turno \n 2. Verificar turno \n 3. Listar turnos \n 4. Exit"));
            option = scanner.next();

            switch (option) {
                case "1":
                    System.out.println("Add or update book");
                    System.out.println("Enter the name:");
                    String name = scanner.next();
                    System.out.println("Enter the author:");
                    String author = scanner.next();
                    System.out.println("Enter the sales:");
                    int sales = scanner.nextInt();
                    System.out.println("Enter the critic:");
                    int critic = scanner.nextInt();
                    System.out.println("Enter the specialization:");
                    String specialty = scanner.next();
                    System.out.println("Enter the comments:");
                    String comments = scanner.next();
                    Book book = new Book(name, author, sales, critic, specialty, comments);
                    // systemBook.addOrModifyBook(book);
                    break;
                case "2":
                    System.out.println("Secure purchase");
                    System.out.println("Enter the name of the author of the book: ");
                    String authorBook = scanner.next();
                   // systemBook.securePurchase(authorBook);
                    break;
                case "3":


                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(!option.equals("4"));


    }
}
