package Lesson40;
import java.util.ArrayList;
import java.util.Collections;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Vali");
        names.add("Aysel");
        names.add("Murad");

        names.set(1, "Huseyn");
        System.out.println("get(): " + names.get(2));
        names.remove("Murad");
        System.out.println("size(): " + names.size());
        System.out.println("indexOf(): " + names.indexOf("Ali"));
        Collections.sort(names);
        System.out.println("String list: " + names);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);

        numbers.set(1, 30);
        System.out.println("get(): " + numbers.get(2));
        numbers.remove(Integer.valueOf(80));
        System.out.println("size(): " + numbers.size());
        System.out.println("indexOf(): " + numbers.indexOf(40));
        Collections.sort(numbers);
        System.out.println("Integer list: " + numbers);
    }
}