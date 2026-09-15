package Lesson35.Task1;

public class SuperMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        System.out.println("Ad: " + dog.name);
        dog.makeSound();
    }
}
