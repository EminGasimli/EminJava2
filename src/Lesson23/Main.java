package Lesson23;
class Student {
    String name;
    int age;
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Emin";
        s1.age = 20;
        System.out.println("Ad: " + s1.name);
        System.out.println("Yaş: " + s1.age);
    }
}
