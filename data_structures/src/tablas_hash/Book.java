public class Book {
    private String name;
    private String author;
    private int sales;

    private int reviewerNote;

    private String specialty;

    private String comments;

    public Book(String name, String author, int sales, int reviewerNote, String specialty, String comments) {
        this.name = name;
        this.author = author;
        this.sales = sales;
        this.reviewerNote = reviewerNote;
        this.specialty = specialty;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }


    public int getSales() {
        return sales;
    }


    public int getReviewerNote() {
        return reviewerNote;
    }



    public String getSpecialty() {
        return specialty;
    }




    @Override
    public String toString() {
        return "Libro{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", sales=" + sales +
                ", reviewerNote=" + reviewerNote +
                ", specialty='" + specialty + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
