package Lesson32;

public class ModifiersDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Ali");
        Person p2 = new Person(15);
        Person p3 = new Person(85.5);
        p1.publicMethod();
        p1.protectedMethod();
        p1.defaultMethod();
        p1.finalParam(100);
        System.out.println("Static say: " + Person.say);
    }
}

class Person {
    public String name = "Ali";
    private int age = 15;
    protected double grade = 85.5;
    String school = "Lisey";

    public void publicMethod() {
        System.out.println("Public metod");
    }

    private void privateMethod() {
        System.out.println("Private metod");
    }

    protected void protectedMethod() {
        System.out.println("Protected metod");
    }

    void defaultMethod() {
        System.out.println("Default metod");
    }

    public Person(String name) {
        this.name = name;
    }

    protected Person(int age) {
        this.age = age;
    }

    Person(double grade) {
        this.grade = grade;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void finalParam(final int number) {
        System.out.println("Number: " + number);
    }

    static int say = 0;
}