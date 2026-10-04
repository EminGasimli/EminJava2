package Lesson40;

import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);
        numbers.add(70);
        numbers.add(30);

        System.out.println("Elementlər:");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        System.out.println("first(): " + numbers.first());
        System.out.println("last(): " + numbers.last());
        System.out.println("higher(40): " + numbers.higher(40));
        System.out.println("lower(40): " + numbers.lower(40));
        System.out.println("ceiling(45): " + numbers.ceiling(45));
        System.out.println("floor(45): " + numbers.floor(45));

        System.out.println();

        System.out.println("50-dən kiçik elementlər: " + numbers.headSet(50));
        System.out.println("50-dən böyük və ya bərabər elementlər: " + numbers.tailSet(50));
        System.out.println("20-70 arası elementlər: " + numbers.subSet(20, 70));

        System.out.println();

        System.out.println("TreeSet: " + numbers);
    }
}