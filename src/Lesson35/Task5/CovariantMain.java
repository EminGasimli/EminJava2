package Lesson35.Task5;

public class CovariantMain {
    public static void main(String[] args) {
        TechCompany tech = new TechCompany();
        Manager m = tech.hire();
        System.out.println("Manager yaradıldı.");
    }
}
