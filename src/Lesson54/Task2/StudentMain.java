package Lesson54.Task2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Ali", LocalDateTime.now().minusDays(5));
        Student s2 = new Student("Veli", LocalDateTime.now().plusDays(2));
        Student s3 = new Student("Aysel", LocalDateTime.now().minusDays(3));
        Student s4 = new Student("Murad", LocalDateTime.now().plusDays(1));
        Student s5 = new Student("Leyla", LocalDateTime.now().minusDays(1));

        s1.addGrade(80);
        s1.addGrade(90);

        s2.addGrade(50);
        s2.addGrade(70);

        s3.addGrade(40);
        s3.addGrade(60);

        s4.addGrade(90);
        s4.addGrade(100);

        s5.addGrade(75);
        s5.addGrade(85);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("All Students:");

        for (Student student : students) {
            System.out.println(student);
        }

        List<Student> previousExamStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getExamDate().isBefore(LocalDateTime.now())) {
                previousExamStudents.add(student);
            }
        }

        System.out.println("\nStudents with previous exam dates:");

        for (Student student : previousExamStudents) {
            System.out.println(student.getName());
        }
    }
}