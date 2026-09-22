package Lesson37;

public class NullExceptionMain {
    static class Person {
        void salam() {
            System.out.println("Salam!");
        }
    }
    public static void main(String[] args) {
        Person person = null;
        try {
            person.salam();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException baş verdi.");
        }
    }
}
