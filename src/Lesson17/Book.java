package Lesson17;
public class Book {
    String title;
    String author;
    int pageCount;

    public static void main(String[] args) {
        Book book1 = new Book();

        book1.title = "Harry Potter";
        book1.author = "J.K. Rowling";
        book1.pageCount = 320;

        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Page Count: " + book1.pageCount);
    }
}