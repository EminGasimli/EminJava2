package Lesson24;

public class Student {
    String name;
    int age;
    public Student() {
        name = "Unknown";
        age = 0;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.showInfo();
    }
}