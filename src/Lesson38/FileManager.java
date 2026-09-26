package Lesson38;

public class FileManager implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("File manager closed");
    }
}
