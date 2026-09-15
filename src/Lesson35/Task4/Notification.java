package Lesson35.Task4;

public interface Notification {
    void send(String msg);
    default void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}
