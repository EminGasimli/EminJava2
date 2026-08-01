package Lesson30;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Emin", 16, 48);
        System.out.println("İlk məlumatlar:");
        student.displayInfo();
        student.increaseGrade(10);
        System.out.println("\nQiymət artırıldıqdan sonra:");
        student.displayInfo();
        System.out.println("\nKeçib? " + student.isPassed());
    }
}