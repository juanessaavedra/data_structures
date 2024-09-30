import java.util.*;

public class SystemBook {
    private final Hashtable<String, Book> books;

    public SystemBook() {
        this.books = new Hashtable<>();
    }

    public boolean verifyBook(String name) {
        String formattedName = name.toLowerCase().trim();
        if (books.containsKey(formattedName)) {
            System.out.println("El libro '" + name + "' ya existe en el sistema.");
            return true;  // El libro existe
        }
        return false;  // El libro no existe
    }

    public void addOrModifyBook(Book book) {
        String name = book.getName();

        if (name == null || name.trim().isEmpty()) {
            System.out.println("El nombre del libro no puede ser nulo o vacío.");
            return;
        }

        String formattedName = name.toLowerCase().trim();

        // Verificar si el libro ya existe
        if (books.containsKey(formattedName)) {
            // Si el libro ya existe, lo modifica
            books.put(formattedName, book);
            System.out.println("Libro '" + name + "' modificado en el sistema.");
        } else {
            // Si el libro no existe, lo agrega
            books.put(formattedName, book);
            System.out.println("Libro '" + name + "' agregado al sistema.");
        }
    }

    public void securePurchase(String author) {

        // Filtrar solo los libros del autor
        List<Book> authorBooks = Collections.list(books.elements()).stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();

        // Verificar si el autor tiene libros
        if (authorBooks.isEmpty()) {
            System.out.println("No se encontraron libros de '" + author);
        }

        // Obtener el libro con la mejor crítica
        Book bestReviewedBook = authorBooks.stream()
                .max(Comparator.comparingInt(Book::getReviewerNote))
                .orElseThrow(() -> new IllegalStateException("Error al encontrar el libro con la mejor crítica."));

        System.out.println("El libro con la mejor crítica de " + author + " es: " + bestReviewedBook.getName());
    }



    public void listBySpecialty(String specialty){
        // Filtrar y ordenar los libros por especialidad y ventas
        List<Book> filteredBooks = Collections.list(books.elements()).stream()
                .filter(book -> book.getSpecialty().equalsIgnoreCase(specialty))
                .sorted(Comparator.comparingInt(Book::getSales).reversed()) // Ordenar por ventas de mayor a menor
                .toList();

        // Verificar si hay libros en esa especialidad
        if (filteredBooks.isEmpty()) {
            System.out.println("No se encontraron libros en la especialidad: " + specialty);
        } else {
            System.out.println("Libros en la especialidad '" + specialty + "' ordenados por ventas:");
            filteredBooks.forEach(book -> System.out.println(book.getName() + " - Ventas: " + book.getSales()));
        }
    }
    }

