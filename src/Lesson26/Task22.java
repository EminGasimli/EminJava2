package Lesson26;

public class Task22 {
    static void salam() {
        System.out.println("Salam!");
    }

    static void salam(String ad) {
        System.out.println("Salam, " + ad + "!");
    }

    static void salam(String ad, String dil) {
        if (dil.equals("az")) {
            System.out.println("Salam, " + ad + "!");
        }
        else if (dil.equals("en")) {
            System.out.println("Hello, " + ad + "!");
        }
        else {
            System.out.println("Dil tapılmadı.");
        }
    }

    public static void main(String[] args) {
        salam();
        salam("Əli");
        salam("John", "en");
    }
}