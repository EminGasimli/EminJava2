package Lesson42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Ilkin siyahi: " + numbers);

        Collections.sort(numbers);
        System.out.println("Artan siralama: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Tersine cevirme: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Qarisdirilmis siyahi: " + numbers);

        Collections.sort(numbers);
        System.out.println("Minimum element: " + Collections.min(numbers));
        System.out.println("Maksimum element: " + Collections.max(numbers));

        Collections.swap(numbers, 0, 2);
        System.out.println("Elementlerin yerini deyisme: " + numbers);

        Collections.replaceAll(numbers, 20, 100);
        System.out.println("Elementi evez etme: " + numbers);

        Collections.fill(numbers, 5);
        System.out.println("Butun elementleri evez etme: " + numbers);

        Collections.addAll(numbers, 10, 20, 30);
        System.out.println("Yeni elementler elave etme: " + numbers);

        System.out.println("10 elementinin sayi: " + Collections.frequency(numbers, 10));

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        System.out.println("Alt siyahi: " + Collections.indexOfSubList(numbers, list));
    }
}