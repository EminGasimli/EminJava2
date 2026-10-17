package Lesson44;
import java.util.ArrayList;
import java.util.List;

public class MethodReferenceMain {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("hello");
        words.add("world");
        words.add("programming");
        words.replaceAll(String::toUpperCase);
        words.forEach(System.out::println);
    }
}