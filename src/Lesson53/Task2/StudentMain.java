package Lesson53.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Telebe melumatlarini daxil edin:");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Grade: ");
            double grade = sc.nextDouble();
            students.add(new Student(id, name, age, grade));
        }

        System.out.println("\nButun telebeler:");

        for (Student s : students) {
            s.showInfo();
        }

        Student max = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > max.getGrade()) {
                max = s;
            }
        }

        System.out.println("\nEn yuksek grade:");
        max.showInfo();
        System.out.println("\nAge > 20:");

        for (Student s : students) {
            if (s.getAge() > 20) {
                s.showInfo();
            }
        }

        sc.close();
    }
}