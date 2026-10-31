package Lesson48.Singleton;

public class SchoolBellDemo {
    public static void main(String[] args) {
        SchoolBell bell1 = SchoolBell.getInstance();
        SchoolBell bell2 = SchoolBell.getInstance();

        bell1.ring();

        System.out.println(bell1 == bell2);
    }
}