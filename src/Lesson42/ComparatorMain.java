package Lesson42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Ali", 85.5));
        students.add(new Student(1, "Aysel", 95.0));
        students.add(new Student(4, "Murad", 75.5));
        students.add(new Student(2, "Nigar", 90.0));

        Collections.sort(students);

        System.out.println("Qiymete gore siralama:");

        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new StudentComparator());

        System.out.println("\nAda gore siralama:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}