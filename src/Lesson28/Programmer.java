package Lesson28;

public class Programmer {
    String name;
    String surname;
    int age;
    double salary;
    Programmer(String name) {
        this.name = name;
    }
    Programmer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    Programmer(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    void show() {
        System.out.println(name + " " + surname + " " + age + " " + salary);
    }
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ali");
        Programmer p2 = new Programmer("Veli", "Memmedov");
        Programmer p3 = new Programmer("Emin", "Qasimli", 16, 2500);
        p1.show();
        p2.show();
        p3.show();
    }
}