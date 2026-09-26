package Lesson38;

public class Book {
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    static void checkBook(Book book) throws BookException {
        if (book == null) {
            throw new BookException("Book obyekti null-dır.");
        }
        if (book.price < 0) {
            throw new BookException("Book qiyməti mənfi ola bilməz.");
        }
        if (book.name == null || book.name.isEmpty()) {
            throw new BookException("Book adı boş ola bilməz.");
        }
        System.out.println("Book düzgündür.");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java", "Ali", 25);
        Book book2 = new Book("", "Vali", 20);
        Book book3 = new Book("Python", "Aysel", -10);
        try {
            checkBook(book1);
            checkBook(book2);
            checkBook(book3);
        }
        catch (BookException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
