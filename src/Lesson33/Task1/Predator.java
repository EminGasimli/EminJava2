package Lesson33.Task1;

public class Predator extends Animal implements Feedable {
    public Predator(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ət ilə qidalanır.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " yırtıcı kimi səs çıxarır: " + getSound());
    }
}