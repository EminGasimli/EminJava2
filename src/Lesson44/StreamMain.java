package Lesson44;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 5, 8, 3, 20, 7, 14, 9);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println("Cüt ədədlər: " + evenNumbers);

        List<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Aysel");
        names.add("Murad");
        names.add("Leyla");

        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("Böyük hərflərlə adlar: " + upperCaseNames);
    }
}