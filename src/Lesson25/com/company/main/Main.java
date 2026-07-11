package Lesson25.com.company.main;

import Lesson25.com.company.model.Student;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Emin";
        s.age = 20;

        System.out.println(s.getInfo());
    }
}
