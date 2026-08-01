package Lesson30;

public class Student {
    String name;
    int age;
    double grade;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Qiymət: " + grade);
    }
    public boolean isPassed() {
        return grade >= 51;
    }
    public void increaseGrade(double amount) {
        grade += amount;
    }
}