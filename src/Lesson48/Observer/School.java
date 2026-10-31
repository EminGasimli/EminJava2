package Lesson48.Observer;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void announce(String message) {
        System.out.println("Məktəb elanı: " + message);

        for (Student student : students) {
            student.receiveAnnouncement(message);
        }
    }
}