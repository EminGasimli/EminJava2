package Lesson38;

public class DatabaseConnection implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Database connection closed");
    }
}
