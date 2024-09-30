package tablas_hash;
/*
* La librería Universal decide crear un sistema automático que aconseje sobre libros a sus
clientes. Para ello ha decidido crear una estructura de datos de libros a partir las cifras de
venta y las críticas especializadas. La información que quiere guardar sobre cada libro es la
siguiente: título, autor, ventas (un entero), nota de la crítica (otro entero), especialidad y
comentarios.
Las operaciones que pretende desarrollar, además de la consabida operación de “crear”,
son: “modificar” (que dada la estructura de datos y un libro, si el libro no está en la
estructura lo incluye y en otro caso cambia la antigua información por la nueva), “compra
segura” (que dada la estructura de datos y un autor devuelve el libro con mejor crítica de
ese autor), “listado” (que dada la estructura y una especialidad devuelve la lista de todos los
libros de esa especialidad por orden de ventas).
*  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SystemBook systemBook = new SystemBook();

        String option = "1";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println(("1. Add book/Update Book \n 2. Secure purchase \n 3. List books \n 4. Exit"));
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
                    systemBook.addOrModifyBook(book);
                    break;
                case "2":
                    System.out.println("Secure purchase");
                    System.out.println("Enter the name of the author of the book: ");
                    String authorBook = scanner.next();
                    systemBook.securePurchase(authorBook);
                    break;
                case "3":
                    System.out.println("List books");
                    System.out.println("Enter the specialty:");
                    String specialtyBook = scanner.next();
                    systemBook.listBySpecialty(specialtyBook);
                case "4":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(!option.equals("4"));
    }
}