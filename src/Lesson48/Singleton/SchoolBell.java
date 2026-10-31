package Lesson48.Singleton;

public class SchoolBell {
    private static final SchoolBell instance = new SchoolBell();

    private SchoolBell() {
    }

    public static SchoolBell getInstance() {
        return instance;
    }

    public void ring() {
        System.out.println("Zəng çalındı");
    }
}