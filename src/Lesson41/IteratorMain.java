package Lesson41;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();

            System.out.println(number);

            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Qalan elementler:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}