package Lesson33.Task1;

public class Herbivore extends Animal implements Feedable {
    public Herbivore(String name, int age, String sound) {
        super(name, age, sound);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ot ilə qidalanır.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " ot yeyən heyvan kimi səs çıxarır: " + getSound());
    }
}
