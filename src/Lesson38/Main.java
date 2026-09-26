package Lesson38;

public class Main {
    public static void main(String[] args) {
        try (DatabaseConnection db = new DatabaseConnection();
             FileManager file = new FileManager()) {
            System.out.println("Resources are being used.");
        }
    }
}
