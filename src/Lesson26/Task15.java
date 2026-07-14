package Lesson26;

public class Task15 {
    static void salamVoid() {
        System.out.println("Salam");
    }

    static String salamReturn() {
        return "Salam";
    }

    public static void main(String[] args) {
        salamVoid();
        String soz = salamReturn();
        System.out.println(soz);
    }
}
