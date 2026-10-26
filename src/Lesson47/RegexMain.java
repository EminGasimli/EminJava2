package Lesson47;

public class RegexMain {
    public static void main(String[] args) {
        String text = "Java123 is fun 456 and COOL789!";

        System.out.println(text.matches(".*\\d.*"));

        System.out.println(text.replaceAll("\\d", ""));

        System.out.println(text.replaceAll("\\s", ""));

        System.out.println(text.replaceAll("\\d", "#"));
    }
}
