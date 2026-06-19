package Lesson18;

public class Task1 {
     static void main() {
        String text = "  Java Programming  ";
        System.out.println(text.isBlank());
        System.out.println(text.isEmpty());
        System.out.println(text.startsWith("Java"));
        System.out.println(text.endsWith("ing"));
        System.out.println(text.indexOf("Pro"));
        System.out.println(text.matches("[A-Za-z ]+"));
    }
}