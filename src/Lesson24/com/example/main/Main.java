package Lesson24.com.example.main;

import Lesson24.com.example.model.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Emin";
        s.age = 20;
        System.out.println("Ad: " + s.name);
        System.out.println("Yaş: " + s.age);
    }
}